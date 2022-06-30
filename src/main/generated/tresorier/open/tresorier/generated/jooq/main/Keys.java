/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main;


import open.tresorier.generated.jooq.main.tables.Account;
import open.tresorier.generated.jooq.main.tables.Allocation;
import open.tresorier.generated.jooq.main.tables.Budget;
import open.tresorier.generated.jooq.main.tables.Category;
import open.tresorier.generated.jooq.main.tables.FlywaySchemaHistory;
import open.tresorier.generated.jooq.main.tables.MasterCategory;
import open.tresorier.generated.jooq.main.tables.Operation;
import open.tresorier.generated.jooq.main.tables.Person;
<<<<<<< HEAD
import open.tresorier.generated.jooq.main.tables.PostIt;
=======
import open.tresorier.generated.jooq.main.tables.UserActivity;
>>>>>>> develop
import open.tresorier.generated.jooq.main.tables.records.AccountRecord;
import open.tresorier.generated.jooq.main.tables.records.AllocationRecord;
import open.tresorier.generated.jooq.main.tables.records.BudgetRecord;
import open.tresorier.generated.jooq.main.tables.records.CategoryRecord;
import open.tresorier.generated.jooq.main.tables.records.FlywaySchemaHistoryRecord;
import open.tresorier.generated.jooq.main.tables.records.MasterCategoryRecord;
import open.tresorier.generated.jooq.main.tables.records.OperationRecord;
import open.tresorier.generated.jooq.main.tables.records.PersonRecord;
<<<<<<< HEAD
import open.tresorier.generated.jooq.main.tables.records.PostItRecord;
=======
import open.tresorier.generated.jooq.main.tables.records.UserActivityRecord;
>>>>>>> develop

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccountRecord> ACCOUNT_PKEY = UniqueKeys0.ACCOUNT_PKEY;
    public static final UniqueKey<AllocationRecord> COMPOSITE_ID = UniqueKeys0.COMPOSITE_ID;
    public static final UniqueKey<BudgetRecord> BUDGET_PKEY = UniqueKeys0.BUDGET_PKEY;
    public static final UniqueKey<CategoryRecord> CATEGORY_PKEY = UniqueKeys0.CATEGORY_PKEY;
    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<MasterCategoryRecord> MASTER_CATEGORY_PKEY = UniqueKeys0.MASTER_CATEGORY_PKEY;
    public static final UniqueKey<OperationRecord> OPERATION_PKEY = UniqueKeys0.OPERATION_PKEY;
    public static final UniqueKey<PersonRecord> PERSON_PKEY = UniqueKeys0.PERSON_PKEY;
    public static final UniqueKey<PersonRecord> PERSON_EMAIL_KEY = UniqueKeys0.PERSON_EMAIL_KEY;
    public static final UniqueKey<PersonRecord> PERSON_BILLING_ID_KEY = UniqueKeys0.PERSON_BILLING_ID_KEY;
<<<<<<< HEAD
    public static final UniqueKey<PostItRecord> DOUBLE_KEY = UniqueKeys0.DOUBLE_KEY;
=======
    public static final UniqueKey<UserActivityRecord> USER_ACTIVITY_PKEY = UniqueKeys0.USER_ACTIVITY_PKEY;
>>>>>>> develop

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AccountRecord, BudgetRecord> ACCOUNT__ACCOUNT_BUDGET_ID_FKEY = ForeignKeys0.ACCOUNT__ACCOUNT_BUDGET_ID_FKEY;
    public static final ForeignKey<AllocationRecord, CategoryRecord> ALLOCATION__ALLOCATION_CATEGORY_ID_FKEY = ForeignKeys0.ALLOCATION__ALLOCATION_CATEGORY_ID_FKEY;
    public static final ForeignKey<BudgetRecord, PersonRecord> BUDGET__BUDGET_PERSON_ID_FKEY = ForeignKeys0.BUDGET__BUDGET_PERSON_ID_FKEY;
    public static final ForeignKey<CategoryRecord, MasterCategoryRecord> CATEGORY__CATEGORY_MASTER_CATEGORY_ID_FKEY = ForeignKeys0.CATEGORY__CATEGORY_MASTER_CATEGORY_ID_FKEY;
    public static final ForeignKey<MasterCategoryRecord, BudgetRecord> MASTER_CATEGORY__MASTER_CATEGORY_BUDGET_ID_FKEY = ForeignKeys0.MASTER_CATEGORY__MASTER_CATEGORY_BUDGET_ID_FKEY;
    public static final ForeignKey<OperationRecord, AccountRecord> OPERATION__OPERATION_ACCOUNT_ID_FKEY = ForeignKeys0.OPERATION__OPERATION_ACCOUNT_ID_FKEY;
    public static final ForeignKey<OperationRecord, CategoryRecord> OPERATION__OPERATION_CATEGORY_ID_FKEY = ForeignKeys0.OPERATION__OPERATION_CATEGORY_ID_FKEY;
    public static final ForeignKey<PostItRecord, BudgetRecord> POST_IT__POST_IT_BUDGET_ID_FKEY = ForeignKeys0.POST_IT__POST_IT_BUDGET_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<AccountRecord> ACCOUNT_PKEY = Internal.createUniqueKey(Account.ACCOUNT, "account_pkey", new TableField[] { Account.ACCOUNT.ID }, true);
        public static final UniqueKey<AllocationRecord> COMPOSITE_ID = Internal.createUniqueKey(Allocation.ALLOCATION, "composite_id", new TableField[] { Allocation.ALLOCATION.CATEGORY_ID, Allocation.ALLOCATION.MONTH }, true);
        public static final UniqueKey<BudgetRecord> BUDGET_PKEY = Internal.createUniqueKey(Budget.BUDGET, "budget_pkey", new TableField[] { Budget.BUDGET.ID }, true);
        public static final UniqueKey<CategoryRecord> CATEGORY_PKEY = Internal.createUniqueKey(Category.CATEGORY, "category_pkey", new TableField[] { Category.CATEGORY.ID }, true);
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
        public static final UniqueKey<MasterCategoryRecord> MASTER_CATEGORY_PKEY = Internal.createUniqueKey(MasterCategory.MASTER_CATEGORY, "master_category_pkey", new TableField[] { MasterCategory.MASTER_CATEGORY.ID }, true);
        public static final UniqueKey<OperationRecord> OPERATION_PKEY = Internal.createUniqueKey(Operation.OPERATION, "operation_pkey", new TableField[] { Operation.OPERATION.ID }, true);
        public static final UniqueKey<PersonRecord> PERSON_PKEY = Internal.createUniqueKey(Person.PERSON, "person_pkey", new TableField[] { Person.PERSON.ID }, true);
        public static final UniqueKey<PersonRecord> PERSON_EMAIL_KEY = Internal.createUniqueKey(Person.PERSON, "person_email_key", new TableField[] { Person.PERSON.EMAIL }, true);
        public static final UniqueKey<PersonRecord> PERSON_BILLING_ID_KEY = Internal.createUniqueKey(Person.PERSON, "person_billing_id_key", new TableField[] { Person.PERSON.BILLING_ID }, true);
<<<<<<< HEAD
        public static final UniqueKey<PostItRecord> DOUBLE_KEY = Internal.createUniqueKey(PostIt.POST_IT, "double_key", new TableField[] { PostIt.POST_IT.BUDGET_ID, PostIt.POST_IT.MONTH }, true);
=======
        public static final UniqueKey<UserActivityRecord> USER_ACTIVITY_PKEY = Internal.createUniqueKey(UserActivity.USER_ACTIVITY, "user_activity_pkey", new TableField[] { UserActivity.USER_ACTIVITY.ID }, true);
>>>>>>> develop
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<AccountRecord, BudgetRecord> ACCOUNT__ACCOUNT_BUDGET_ID_FKEY = Internal.createForeignKey(Keys.BUDGET_PKEY, Account.ACCOUNT, "account_budget_id_fkey", new TableField[] { Account.ACCOUNT.BUDGET_ID }, true);
        public static final ForeignKey<AllocationRecord, CategoryRecord> ALLOCATION__ALLOCATION_CATEGORY_ID_FKEY = Internal.createForeignKey(Keys.CATEGORY_PKEY, Allocation.ALLOCATION, "allocation_category_id_fkey", new TableField[] { Allocation.ALLOCATION.CATEGORY_ID }, true);
        public static final ForeignKey<BudgetRecord, PersonRecord> BUDGET__BUDGET_PERSON_ID_FKEY = Internal.createForeignKey(Keys.PERSON_PKEY, Budget.BUDGET, "budget_person_id_fkey", new TableField[] { Budget.BUDGET.PERSON_ID }, true);
        public static final ForeignKey<CategoryRecord, MasterCategoryRecord> CATEGORY__CATEGORY_MASTER_CATEGORY_ID_FKEY = Internal.createForeignKey(Keys.MASTER_CATEGORY_PKEY, Category.CATEGORY, "category_master_category_id_fkey", new TableField[] { Category.CATEGORY.MASTER_CATEGORY_ID }, true);
        public static final ForeignKey<MasterCategoryRecord, BudgetRecord> MASTER_CATEGORY__MASTER_CATEGORY_BUDGET_ID_FKEY = Internal.createForeignKey(Keys.BUDGET_PKEY, MasterCategory.MASTER_CATEGORY, "master_category_budget_id_fkey", new TableField[] { MasterCategory.MASTER_CATEGORY.BUDGET_ID }, true);
        public static final ForeignKey<OperationRecord, AccountRecord> OPERATION__OPERATION_ACCOUNT_ID_FKEY = Internal.createForeignKey(Keys.ACCOUNT_PKEY, Operation.OPERATION, "operation_account_id_fkey", new TableField[] { Operation.OPERATION.ACCOUNT_ID }, true);
        public static final ForeignKey<OperationRecord, CategoryRecord> OPERATION__OPERATION_CATEGORY_ID_FKEY = Internal.createForeignKey(Keys.CATEGORY_PKEY, Operation.OPERATION, "operation_category_id_fkey", new TableField[] { Operation.OPERATION.CATEGORY_ID }, true);
        public static final ForeignKey<PostItRecord, BudgetRecord> POST_IT__POST_IT_BUDGET_ID_FKEY = Internal.createForeignKey(Keys.BUDGET_PKEY, PostIt.POST_IT, "post_it_budget_id_fkey", new TableField[] { PostIt.POST_IT.BUDGET_ID }, true);
    }
}
