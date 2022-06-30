/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_;


import open.tresorier.generated.jooq.test.public_.tables.Account;
import open.tresorier.generated.jooq.test.public_.tables.Allocation;
import open.tresorier.generated.jooq.test.public_.tables.BankAccount;
import open.tresorier.generated.jooq.test.public_.tables.BankAgreement;
import open.tresorier.generated.jooq.test.public_.tables.Budget;
import open.tresorier.generated.jooq.test.public_.tables.Category;
import open.tresorier.generated.jooq.test.public_.tables.FlywaySchemaHistory;
import open.tresorier.generated.jooq.test.public_.tables.MasterCategory;
import open.tresorier.generated.jooq.test.public_.tables.Operation;
import open.tresorier.generated.jooq.test.public_.tables.Person;
import open.tresorier.generated.jooq.test.public_.tables.UserActivity;
import open.tresorier.generated.jooq.test.public_.tables.records.AccountRecord;
import open.tresorier.generated.jooq.test.public_.tables.records.AllocationRecord;
import open.tresorier.generated.jooq.test.public_.tables.records.BankAccountRecord;
import open.tresorier.generated.jooq.test.public_.tables.records.BankAgreementRecord;
import open.tresorier.generated.jooq.test.public_.tables.records.BudgetRecord;
import open.tresorier.generated.jooq.test.public_.tables.records.CategoryRecord;
import open.tresorier.generated.jooq.test.public_.tables.records.FlywaySchemaHistoryRecord;
import open.tresorier.generated.jooq.test.public_.tables.records.MasterCategoryRecord;
import open.tresorier.generated.jooq.test.public_.tables.records.OperationRecord;
import open.tresorier.generated.jooq.test.public_.tables.records.PersonRecord;
import open.tresorier.generated.jooq.test.public_.tables.records.UserActivityRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>PUBLIC</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccountRecord> CONSTRAINT_E = UniqueKeys0.CONSTRAINT_E;
    public static final UniqueKey<AllocationRecord> COMPOSITE_ID = UniqueKeys0.COMPOSITE_ID;
    public static final UniqueKey<BankAccountRecord> CONSTRAINT_1 = UniqueKeys0.CONSTRAINT_1;
    public static final UniqueKey<BankAgreementRecord> CONSTRAINT_4 = UniqueKeys0.CONSTRAINT_4;
    public static final UniqueKey<BudgetRecord> CONSTRAINT_7 = UniqueKeys0.CONSTRAINT_7;
    public static final UniqueKey<CategoryRecord> CONSTRAINT_3 = UniqueKeys0.CONSTRAINT_3;
    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<MasterCategoryRecord> CONSTRAINT_D = UniqueKeys0.CONSTRAINT_D;
    public static final UniqueKey<OperationRecord> CONSTRAINT_9 = UniqueKeys0.CONSTRAINT_9;
    public static final UniqueKey<PersonRecord> CONSTRAINT_8 = UniqueKeys0.CONSTRAINT_8;
    public static final UniqueKey<PersonRecord> CONSTRAINT_8C = UniqueKeys0.CONSTRAINT_8C;
    public static final UniqueKey<PersonRecord> CONSTRAINT_8C7 = UniqueKeys0.CONSTRAINT_8C7;
    public static final UniqueKey<UserActivityRecord> CONSTRAINT_E2 = UniqueKeys0.CONSTRAINT_E2;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AccountRecord, BudgetRecord> CONSTRAINT_E4 = ForeignKeys0.CONSTRAINT_E4;
    public static final ForeignKey<AccountRecord, BankAccountRecord> CONSTRAINT_E49 = ForeignKeys0.CONSTRAINT_E49;
    public static final ForeignKey<AllocationRecord, CategoryRecord> CONSTRAINT_A = ForeignKeys0.CONSTRAINT_A;
    public static final ForeignKey<BankAccountRecord, BankAgreementRecord> CONSTRAINT_19 = ForeignKeys0.CONSTRAINT_19;
    public static final ForeignKey<BankAgreementRecord, PersonRecord> CONSTRAINT_49 = ForeignKeys0.CONSTRAINT_49;
    public static final ForeignKey<BudgetRecord, PersonRecord> CONSTRAINT_75 = ForeignKeys0.CONSTRAINT_75;
    public static final ForeignKey<CategoryRecord, MasterCategoryRecord> CONSTRAINT_31 = ForeignKeys0.CONSTRAINT_31;
    public static final ForeignKey<MasterCategoryRecord, BudgetRecord> CONSTRAINT_D3 = ForeignKeys0.CONSTRAINT_D3;
    public static final ForeignKey<OperationRecord, AccountRecord> CONSTRAINT_93 = ForeignKeys0.CONSTRAINT_93;
    public static final ForeignKey<OperationRecord, CategoryRecord> CONSTRAINT_932 = ForeignKeys0.CONSTRAINT_932;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<AccountRecord> CONSTRAINT_E = Internal.createUniqueKey(Account.ACCOUNT, "CONSTRAINT_E", new TableField[] { Account.ACCOUNT.ID }, true);
        public static final UniqueKey<AllocationRecord> COMPOSITE_ID = Internal.createUniqueKey(Allocation.ALLOCATION, "COMPOSITE_ID", new TableField[] { Allocation.ALLOCATION.CATEGORY_ID, Allocation.ALLOCATION.MONTH }, true);
        public static final UniqueKey<BankAccountRecord> CONSTRAINT_1 = Internal.createUniqueKey(BankAccount.BANK_ACCOUNT, "CONSTRAINT_1", new TableField[] { BankAccount.BANK_ACCOUNT.ID }, true);
        public static final UniqueKey<BankAgreementRecord> CONSTRAINT_4 = Internal.createUniqueKey(BankAgreement.BANK_AGREEMENT, "CONSTRAINT_4", new TableField[] { BankAgreement.BANK_AGREEMENT.ID }, true);
        public static final UniqueKey<BudgetRecord> CONSTRAINT_7 = Internal.createUniqueKey(Budget.BUDGET, "CONSTRAINT_7", new TableField[] { Budget.BUDGET.ID }, true);
        public static final UniqueKey<CategoryRecord> CONSTRAINT_3 = Internal.createUniqueKey(Category.CATEGORY, "CONSTRAINT_3", new TableField[] { Category.CATEGORY.ID }, true);
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
        public static final UniqueKey<MasterCategoryRecord> CONSTRAINT_D = Internal.createUniqueKey(MasterCategory.MASTER_CATEGORY, "CONSTRAINT_D", new TableField[] { MasterCategory.MASTER_CATEGORY.ID }, true);
        public static final UniqueKey<OperationRecord> CONSTRAINT_9 = Internal.createUniqueKey(Operation.OPERATION, "CONSTRAINT_9", new TableField[] { Operation.OPERATION.ID }, true);
        public static final UniqueKey<PersonRecord> CONSTRAINT_8 = Internal.createUniqueKey(Person.PERSON, "CONSTRAINT_8", new TableField[] { Person.PERSON.ID }, true);
        public static final UniqueKey<PersonRecord> CONSTRAINT_8C = Internal.createUniqueKey(Person.PERSON, "CONSTRAINT_8C", new TableField[] { Person.PERSON.EMAIL }, true);
        public static final UniqueKey<PersonRecord> CONSTRAINT_8C7 = Internal.createUniqueKey(Person.PERSON, "CONSTRAINT_8C7", new TableField[] { Person.PERSON.BILLING_ID }, true);
        public static final UniqueKey<UserActivityRecord> CONSTRAINT_E2 = Internal.createUniqueKey(UserActivity.USER_ACTIVITY, "CONSTRAINT_E2", new TableField[] { UserActivity.USER_ACTIVITY.ID }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<AccountRecord, BudgetRecord> CONSTRAINT_E4 = Internal.createForeignKey(Keys.CONSTRAINT_7, Account.ACCOUNT, "CONSTRAINT_E4", new TableField[] { Account.ACCOUNT.BUDGET_ID }, true);
        public static final ForeignKey<AccountRecord, BankAccountRecord> CONSTRAINT_E49 = Internal.createForeignKey(Keys.CONSTRAINT_1, Account.ACCOUNT, "CONSTRAINT_E49", new TableField[] { Account.ACCOUNT.BANK_ACCOUNT_ID }, true);
        public static final ForeignKey<AllocationRecord, CategoryRecord> CONSTRAINT_A = Internal.createForeignKey(Keys.CONSTRAINT_3, Allocation.ALLOCATION, "CONSTRAINT_A", new TableField[] { Allocation.ALLOCATION.CATEGORY_ID }, true);
        public static final ForeignKey<BankAccountRecord, BankAgreementRecord> CONSTRAINT_19 = Internal.createForeignKey(Keys.CONSTRAINT_4, BankAccount.BANK_ACCOUNT, "CONSTRAINT_19", new TableField[] { BankAccount.BANK_ACCOUNT.AGREEMENT_ID }, true);
        public static final ForeignKey<BankAgreementRecord, PersonRecord> CONSTRAINT_49 = Internal.createForeignKey(Keys.CONSTRAINT_8, BankAgreement.BANK_AGREEMENT, "CONSTRAINT_49", new TableField[] { BankAgreement.BANK_AGREEMENT.PERSON_ID }, true);
        public static final ForeignKey<BudgetRecord, PersonRecord> CONSTRAINT_75 = Internal.createForeignKey(Keys.CONSTRAINT_8, Budget.BUDGET, "CONSTRAINT_75", new TableField[] { Budget.BUDGET.PERSON_ID }, true);
        public static final ForeignKey<CategoryRecord, MasterCategoryRecord> CONSTRAINT_31 = Internal.createForeignKey(Keys.CONSTRAINT_D, Category.CATEGORY, "CONSTRAINT_31", new TableField[] { Category.CATEGORY.MASTER_CATEGORY_ID }, true);
        public static final ForeignKey<MasterCategoryRecord, BudgetRecord> CONSTRAINT_D3 = Internal.createForeignKey(Keys.CONSTRAINT_7, MasterCategory.MASTER_CATEGORY, "CONSTRAINT_D3", new TableField[] { MasterCategory.MASTER_CATEGORY.BUDGET_ID }, true);
        public static final ForeignKey<OperationRecord, AccountRecord> CONSTRAINT_93 = Internal.createForeignKey(Keys.CONSTRAINT_E, Operation.OPERATION, "CONSTRAINT_93", new TableField[] { Operation.OPERATION.ACCOUNT_ID }, true);
        public static final ForeignKey<OperationRecord, CategoryRecord> CONSTRAINT_932 = Internal.createForeignKey(Keys.CONSTRAINT_3, Operation.OPERATION, "CONSTRAINT_932", new TableField[] { Operation.OPERATION.CATEGORY_ID }, true);
    }
}
