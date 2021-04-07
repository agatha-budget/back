package open.tresorier.dao


import open.tresorier.dependenciesinjection.IIntegrationTest
import open.tresorier.exception.TresorierException
import open.tresorier.model.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.koin.core.component.inject

class OperationDaoIntTest : IIntegrationTest {

    val operationDao by inject<IOperationDao>()
    val personDao by inject<IPersonDao>()
    val budgetDao by inject<IBudgetDao>()
    val accountDao by inject<IAccountDao>()
    val masterCategoryDao by inject<IMasterCategoryDao>()
    val categoryDao by inject<ICategoryDao>()

    val nov_02_2020: Long = 1604275200
    val nov_03_2020: Long = 1604361600
    val feb_02_2021: Long = 1612224000
    val march_02_2021: Long = 1614643200

    @Test
    fun getOwner() {
        val operation = operationDao.getById("operation1")
        val expectedOwner = personDao.getById("person1")
        val owner = operationDao.getOwner(operation)
        Assertions.assertEquals(expectedOwner.email, owner.email)
    }

    @Test
    fun getOwnerForUnstored() {
        val operation = Operation(1225, "545", "56", -25.54, "achat")
        val exception = Assertions.assertThrows(TresorierException::class.java) {
            operationDao.getOwner(operation)
        }
        Assertions.assertEquals("the given object appears to have no owner", exception.message)
    }

    @Test
    fun cannotCreateWithAccountAndCategoryFromDistinctBudget() {
        val operation = Operation(1225, "account1", "category5", 8525.74)
        val exception = Assertions.assertThrows(TresorierException::class.java) {
            operationDao.insert(operation)
        }
        Assertions.assertEquals("could not insert operation : $operation", exception.message)
    }

    @Test
    fun getSpendingByMonthByCategoryForAllMonths() {
        val budget = Budget("wellAllocatedBudget", "person1")
        budgetDao.insert(budget)
        val masterCategory = MasterCategory("Fixed expense", budget.id)
        masterCategoryDao.insert(masterCategory)
        val category = Category("oftenAllocatedCategory", masterCategory.id)
        categoryDao.insert(category)
        val category2 = Category("lessoftenAllocatedCategory", masterCategory.id)
        categoryDao.insert(category2)
        val account = Account("my own account", budget.id)
        accountDao.insert(account)
        val operationList = listOf(
                Operation( nov_02_2020 ,account.id, category.id,40.00),
                Operation( nov_03_2020 ,account.id, category.id,20.00),
                Operation( feb_02_2021 ,account.id, category2.id,10.00),
                Operation( march_02_2021 ,account.id, category.id,30.00),

                )
        for (operation in operationList) {
            operationDao.insert(operation)
        }
        val result = operationDao.findTotalSpendingByMonth(budget)
        Assertions.assertEquals(3, result.size)
        Assertions.assertEquals(11, result[0].month.month)
        Assertions.assertEquals(2020, result[0].month.year)
        Assertions.assertEquals(category.id, result[0].categoryId)
        Assertions.assertEquals(60.00, result[0].amount)

        Assertions.assertEquals(2, result[1].month.month)
        Assertions.assertEquals(2021, result[1].month.year)
        Assertions.assertEquals(category2.id, result[1].categoryId)
        Assertions.assertEquals(10.00, result[1].amount)

        Assertions.assertEquals(3, result[2].month.month)
        Assertions.assertEquals(2021, result[2].month.year)
        Assertions.assertEquals(category.id, result[2].categoryId)
        Assertions.assertEquals(30.00, result[2].amount)
    }

    @Test
    fun getSpendingByMonthByCategoryUntilFebruary() {
        val budget = Budget("wellAllocatedBudget", "person1")
        budgetDao.insert(budget)
        val masterCategory = MasterCategory("Fixed expense", budget.id)
        masterCategoryDao.insert(masterCategory)
        val category = Category("oftenAllocatedCategory", masterCategory.id)
        categoryDao.insert(category)
        val category2 = Category("lessoftenAllocatedCategory", masterCategory.id)
        categoryDao.insert(category2)
        val account = Account("my own account", budget.id)
        accountDao.insert(account)
        val operationList = listOf(
                Operation( nov_02_2020 ,account.id, category.id,40.00),
                Operation( nov_03_2020 ,account.id, category.id,20.00),
                Operation( feb_02_2021 ,account.id, category2.id,10.00),
                Operation( march_02_2021 ,account.id, category.id,30.00),

                )
        for (operation in operationList) {
            operationDao.insert(operation)
        }
        val result = operationDao.findTotalSpendingByMonth(budget, Month(2,2021))
        Assertions.assertEquals(2, result.size)
        Assertions.assertEquals(11, result[0].month.month)
        Assertions.assertEquals(2020, result[0].month.year)
        Assertions.assertEquals(category.id, result[0].categoryId)
        Assertions.assertEquals(60.00, result[0].amount)

        Assertions.assertEquals(2, result[1].month.month)
        Assertions.assertEquals(2021, result[1].month.year)
        Assertions.assertEquals(category2.id, result[1].categoryId)
        Assertions.assertEquals(10.00, result[1].amount)
    }

    @Test
    fun getAllAllocationsOfNonExistingBudget() {
        val budget = Budget("wellAllocatedBudget", "person1")
        val result = operationDao.findTotalSpendingByMonth(budget)
        Assertions.assertEquals(0, result.size)
    }
}
