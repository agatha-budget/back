/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_;


import java.util.Arrays;
import java.util.List;

import open.tresorier.generated.jooq.test.DefaultCatalog;
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

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>PUBLIC</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>PUBLIC.ACCOUNT</code>.
     */
    public final Account ACCOUNT = Account.ACCOUNT;

    /**
     * The table <code>PUBLIC.ALLOCATION</code>.
     */
    public final Allocation ALLOCATION = Allocation.ALLOCATION;

    /**
     * The table <code>PUBLIC.BANK_ACCOUNT</code>.
     */
    public final BankAccount BANK_ACCOUNT = BankAccount.BANK_ACCOUNT;

    /**
     * The table <code>PUBLIC.BANK_AGREEMENT</code>.
     */
    public final BankAgreement BANK_AGREEMENT = BankAgreement.BANK_AGREEMENT;

    /**
     * The table <code>PUBLIC.BUDGET</code>.
     */
    public final Budget BUDGET = Budget.BUDGET;

    /**
     * The table <code>PUBLIC.CATEGORY</code>.
     */
    public final Category CATEGORY = Category.CATEGORY;

    /**
     * The table <code>PUBLIC.flyway_schema_history</code>.
     */
    public final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>PUBLIC.MASTER_CATEGORY</code>.
     */
    public final MasterCategory MASTER_CATEGORY = MasterCategory.MASTER_CATEGORY;

    /**
     * The table <code>PUBLIC.OPERATION</code>.
     */
    public final Operation OPERATION = Operation.OPERATION;

    /**
     * The table <code>PUBLIC.PERSON</code>.
     */
    public final Person PERSON = Person.PERSON;

    /**
     * The table <code>PUBLIC.USER_ACTIVITY</code>.
     */
    public final UserActivity USER_ACTIVITY = UserActivity.USER_ACTIVITY;

    /**
     * No further instances allowed
     */
    private Public() {
        super("PUBLIC", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Account.ACCOUNT,
            Allocation.ALLOCATION,
            BankAccount.BANK_ACCOUNT,
            BankAgreement.BANK_AGREEMENT,
            Budget.BUDGET,
            Category.CATEGORY,
            FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
            MasterCategory.MASTER_CATEGORY,
            Operation.OPERATION,
            Person.PERSON,
            UserActivity.USER_ACTIVITY
        );
    }
}
