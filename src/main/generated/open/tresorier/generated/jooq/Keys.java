/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq;


import open.tresorier.generated.jooq.tables.Account;
import open.tresorier.generated.jooq.tables.Allocation;
import open.tresorier.generated.jooq.tables.Budget;
import open.tresorier.generated.jooq.tables.Category;
import open.tresorier.generated.jooq.tables.FlywaySchemaHistory;
import open.tresorier.generated.jooq.tables.Operation;
import open.tresorier.generated.jooq.tables.Person;
import open.tresorier.generated.jooq.tables.records.AccountRecord;
import open.tresorier.generated.jooq.tables.records.AllocationRecord;
import open.tresorier.generated.jooq.tables.records.BudgetRecord;
import open.tresorier.generated.jooq.tables.records.CategoryRecord;
import open.tresorier.generated.jooq.tables.records.FlywaySchemaHistoryRecord;
import open.tresorier.generated.jooq.tables.records.OperationRecord;
import open.tresorier.generated.jooq.tables.records.PersonRecord;

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
    public static final UniqueKey<AllocationRecord> ALLOCATION_PKEY = UniqueKeys0.ALLOCATION_PKEY;
    public static final UniqueKey<AllocationRecord> ONLY_ONE_ALLOCATION_PER_MONTH_AND_BUDGET = UniqueKeys0.ONLY_ONE_ALLOCATION_PER_MONTH_AND_BUDGET;
    public static final UniqueKey<BudgetRecord> BUDGET_PKEY = UniqueKeys0.BUDGET_PKEY;
    public static final UniqueKey<CategoryRecord> CATEGORY_PKEY = UniqueKeys0.CATEGORY_PKEY;
    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<OperationRecord> OPERATION_PKEY = UniqueKeys0.OPERATION_PKEY;
    public static final UniqueKey<PersonRecord> PERSON_PKEY = UniqueKeys0.PERSON_PKEY;
    public static final UniqueKey<PersonRecord> PERSON_EMAIL_KEY = UniqueKeys0.PERSON_EMAIL_KEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AccountRecord, BudgetRecord> ACCOUNT__ACCOUNT_BUDGET_ID_FKEY = ForeignKeys0.ACCOUNT__ACCOUNT_BUDGET_ID_FKEY;
    public static final ForeignKey<AllocationRecord, CategoryRecord> ALLOCATION__ALLOCATION_CATEGORY_ID_FKEY = ForeignKeys0.ALLOCATION__ALLOCATION_CATEGORY_ID_FKEY;
    public static final ForeignKey<BudgetRecord, PersonRecord> BUDGET__BUDGET_PERSON_ID_FKEY = ForeignKeys0.BUDGET__BUDGET_PERSON_ID_FKEY;
    public static final ForeignKey<CategoryRecord, BudgetRecord> CATEGORY__CATEGORY_BUDGET_ID_FKEY = ForeignKeys0.CATEGORY__CATEGORY_BUDGET_ID_FKEY;
    public static final ForeignKey<OperationRecord, AccountRecord> OPERATION__OPERATION_ACCOUNT_ID_FKEY = ForeignKeys0.OPERATION__OPERATION_ACCOUNT_ID_FKEY;
    public static final ForeignKey<OperationRecord, CategoryRecord> OPERATION__OPERATION_CATEGORY_ID_FKEY = ForeignKeys0.OPERATION__OPERATION_CATEGORY_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<AccountRecord> ACCOUNT_PKEY = Internal.createUniqueKey(Account.ACCOUNT, "account_pkey", new TableField[] { Account.ACCOUNT.ID }, true);
        public static final UniqueKey<AllocationRecord> ALLOCATION_PKEY = Internal.createUniqueKey(Allocation.ALLOCATION, "allocation_pkey", new TableField[] { Allocation.ALLOCATION.ID }, true);
        public static final UniqueKey<AllocationRecord> ONLY_ONE_ALLOCATION_PER_MONTH_AND_BUDGET = Internal.createUniqueKey(Allocation.ALLOCATION, "only_one_allocation_per_month_and_budget", new TableField[] { Allocation.ALLOCATION.CATEGORY_ID, Allocation.ALLOCATION.ALLOCATION_MONTH }, true);
        public static final UniqueKey<BudgetRecord> BUDGET_PKEY = Internal.createUniqueKey(Budget.BUDGET, "budget_pkey", new TableField[] { Budget.BUDGET.ID }, true);
        public static final UniqueKey<CategoryRecord> CATEGORY_PKEY = Internal.createUniqueKey(Category.CATEGORY, "category_pkey", new TableField[] { Category.CATEGORY.ID }, true);
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
        public static final UniqueKey<OperationRecord> OPERATION_PKEY = Internal.createUniqueKey(Operation.OPERATION, "operation_pkey", new TableField[] { Operation.OPERATION.ID }, true);
        public static final UniqueKey<PersonRecord> PERSON_PKEY = Internal.createUniqueKey(Person.PERSON, "person_pkey", new TableField[] { Person.PERSON.ID }, true);
        public static final UniqueKey<PersonRecord> PERSON_EMAIL_KEY = Internal.createUniqueKey(Person.PERSON, "person_email_key", new TableField[] { Person.PERSON.EMAIL }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<AccountRecord, BudgetRecord> ACCOUNT__ACCOUNT_BUDGET_ID_FKEY = Internal.createForeignKey(Keys.BUDGET_PKEY, Account.ACCOUNT, "account_budget_id_fkey", new TableField[] { Account.ACCOUNT.BUDGET_ID }, true);
        public static final ForeignKey<AllocationRecord, CategoryRecord> ALLOCATION__ALLOCATION_CATEGORY_ID_FKEY = Internal.createForeignKey(Keys.CATEGORY_PKEY, Allocation.ALLOCATION, "allocation_category_id_fkey", new TableField[] { Allocation.ALLOCATION.CATEGORY_ID }, true);
        public static final ForeignKey<BudgetRecord, PersonRecord> BUDGET__BUDGET_PERSON_ID_FKEY = Internal.createForeignKey(Keys.PERSON_PKEY, Budget.BUDGET, "budget_person_id_fkey", new TableField[] { Budget.BUDGET.PERSON_ID }, true);
        public static final ForeignKey<CategoryRecord, BudgetRecord> CATEGORY__CATEGORY_BUDGET_ID_FKEY = Internal.createForeignKey(Keys.BUDGET_PKEY, Category.CATEGORY, "category_budget_id_fkey", new TableField[] { Category.CATEGORY.BUDGET_ID }, true);
        public static final ForeignKey<OperationRecord, AccountRecord> OPERATION__OPERATION_ACCOUNT_ID_FKEY = Internal.createForeignKey(Keys.ACCOUNT_PKEY, Operation.OPERATION, "operation_account_id_fkey", new TableField[] { Operation.OPERATION.ACCOUNT_ID }, true);
        public static final ForeignKey<OperationRecord, CategoryRecord> OPERATION__OPERATION_CATEGORY_ID_FKEY = Internal.createForeignKey(Keys.CATEGORY_PKEY, Operation.OPERATION, "operation_category_id_fkey", new TableField[] { Operation.OPERATION.CATEGORY_ID }, true);
    }
}
