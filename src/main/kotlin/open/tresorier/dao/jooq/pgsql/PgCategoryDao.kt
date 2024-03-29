package open.tresorier.dao.jooq.pgsql

import open.tresorier.dao.ICategoryDao
import open.tresorier.exception.TresorierException
import open.tresorier.generated.jooq.main.Tables.*
import open.tresorier.generated.jooq.main.tables.daos.CategoryDao
import open.tresorier.generated.jooq.main.tables.records.CategoryRecord
import open.tresorier.generated.jooq.main.tables.records.PersonRecord
import open.tresorier.model.*
import org.jooq.Configuration
import org.jooq.impl.DSL
import open.tresorier.generated.jooq.main.tables.pojos.Category as JooqCategory


class PgCategoryDao(val configuration: Configuration) : ICategoryDao {

    private val generatedDao: CategoryDao = CategoryDao(configuration)
    private val query = DSL.using(configuration)

    override fun insert(category: Category): Category {
        val jooqCategory = this.toJooqCategory(category)
        try {
            this.generatedDao.insert(jooqCategory)
        } catch (e: Exception) {
            throw TresorierException("could not insert category : $category", e)
        }
        return category
    }

    override fun update(category: Category): Category {
        val jooqCategory = this.toJooqCategory(category)
        try {
            this.generatedDao.update(jooqCategory)
        } catch (e: Exception) {
            throw TresorierException("could not update category : $category", e)
        }
        return category
    }

    override fun getById(id: String): Category {
        val jooqCategory = this.generatedDao.fetchOneById(id)
        return this.toCategory(jooqCategory) ?: throw TresorierException("no category found for the following id : $id")
    }

    override fun findByMasterCategory(masterCategory: MasterCategory): List<Category> {
        val jooqCategoryList = this.generatedDao.fetchByMasterCategoryId(masterCategory.id)
        val categoryList: MutableList<Category> = mutableListOf()
        for (jooqCategory in jooqCategoryList) {
            val category = this.toCategory(jooqCategory)
            category?.let { categoryList.add(category) }
        }
        return categoryList
    }

    override fun findByBudget(budget: Budget): List<Category> {
        val query = this.query
            .select()
            .from(CATEGORY)
            .leftJoin(MASTER_CATEGORY).on(MASTER_CATEGORY.ID.eq(CATEGORY.MASTER_CATEGORY_ID))
            .where(MASTER_CATEGORY.BUDGET_ID.eq(budget.id))
            .or(CATEGORY.MASTER_CATEGORY_ID.isNull)

        val jooqCategoryList = query.fetch().into(CATEGORY)

        val categoryList: MutableList<Category> = mutableListOf()
        for (categoryRecord : CategoryRecord in jooqCategoryList) {
            val category = this.toCategory(categoryRecord)
            categoryList.add(category)
        }
        return categoryList
    }

    override fun getOwner(category: Category): Person? {
        val ownerRecord: PersonRecord? = this.query.select().from(PERSON)
            .join(MASTER_CATEGORY).on(MASTER_CATEGORY.ID.eq(category.masterCategoryId))
            .join(BUDGET).on(BUDGET.ID.eq(MASTER_CATEGORY.BUDGET_ID))
            .where(PERSON.ID.eq(BUDGET.PERSON_ID))
            .fetchAny()?.into(PERSON)
        if (ownerRecord == null) {
            throw TresorierException("the given category (${category}) appears to have no owner")
        } else {
            return PgPersonDao.toPerson(ownerRecord)
        }
    }

    override fun updateArchivedStatusByMasterCategory(masterCategory: MasterCategory, newArchivedStatus: Boolean) {
        this.query
            .update(CATEGORY)
            .set(CATEGORY.ARCHIVED, newArchivedStatus)
            .where(CATEGORY.MASTER_CATEGORY_ID.eq(masterCategory.id))
            .execute()
    }

    private fun toJooqCategory(category: Category): JooqCategory {
        return JooqCategory(
            category.id,
            category.masterCategoryId,
            category.name,
            category.archived,
            category.deleted
        )
    }

    private fun toCategory(jooqCategory: JooqCategory?): Category? {
        return if (jooqCategory == null)
            null
        else Category(
            jooqCategory.name,
            jooqCategory.masterCategoryId,
            jooqCategory.archived,
            jooqCategory.id,
            jooqCategory.deleted
        )
    }

    private fun toCategory(categoryRecord: CategoryRecord): Category {
        return Category(
            categoryRecord.name,
            categoryRecord.masterCategoryId,
            categoryRecord.archived,
            categoryRecord.id,
            categoryRecord.deleted
        )
    }
}
