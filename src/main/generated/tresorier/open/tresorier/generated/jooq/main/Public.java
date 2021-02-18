/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main;


import java.util.Arrays;
import java.util.List;

import open.tresorier.generated.jooq.main.tables.Account;
import open.tresorier.generated.jooq.main.tables.Allocation;
import open.tresorier.generated.jooq.main.tables.Budget;
import open.tresorier.generated.jooq.main.tables.Category;
import open.tresorier.generated.jooq.main.tables.FlywaySchemaHistory;
import open.tresorier.generated.jooq.main.tables.Operation;
import open.tresorier.generated.jooq.main.tables.Person;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -1775024420;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.account</code>.
     */
    public final Account ACCOUNT = Account.ACCOUNT;

    /**
     * The table <code>public.allocation</code>.
     */
    public final Allocation ALLOCATION = Allocation.ALLOCATION;

    /**
     * The table <code>public.budget</code>.
     */
    public final Budget BUDGET = Budget.BUDGET;

    /**
     * The table <code>public.category</code>.
     */
    public final Category CATEGORY = Category.CATEGORY;

    /**
     * The table <code>public.flyway_schema_history</code>.
     */
    public final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>public.operation</code>.
     */
    public final Operation OPERATION = Operation.OPERATION;

    /**
     * The table <code>public.person</code>.
     */
    public final Person PERSON = Person.PERSON;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Account.ACCOUNT,
            Allocation.ALLOCATION,
            Budget.BUDGET,
            Category.CATEGORY,
            FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
            Operation.OPERATION,
            Person.PERSON);
    }
}