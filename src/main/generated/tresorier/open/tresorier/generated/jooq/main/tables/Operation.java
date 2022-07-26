/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables;


import java.util.Arrays;
import java.util.List;

import open.tresorier.generated.jooq.main.Keys;
import open.tresorier.generated.jooq.main.Public;
import open.tresorier.generated.jooq.main.tables.records.OperationRecord;

import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Operation extends TableImpl<OperationRecord> {

<<<<<<< HEAD
    private static final long serialVersionUID = 248844607;
=======
    private static final long serialVersionUID = 1636383545;
>>>>>>> multipleCategories

    /**
     * The reference instance of <code>public.operation</code>
     */
    public static final Operation OPERATION = new Operation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OperationRecord> getRecordType() {
        return OperationRecord.class;
    }

    /**
     * The column <code>public.operation.id</code>.
     */
    public final TableField<OperationRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.operation.account_id</code>.
     */
    public final TableField<OperationRecord, String> ACCOUNT_ID = createField(DSL.name("account_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.operation.month</code>.
     */
    public final TableField<OperationRecord, Integer> MONTH = createField(DSL.name("month"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.operation.day</code>.
     */
    public final TableField<OperationRecord, Integer> DAY = createField(DSL.name("day"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.operation.category_id</code>.
     */
    public final TableField<OperationRecord, String> CATEGORY_ID = createField(DSL.name("category_id"), org.jooq.impl.SQLDataType.VARCHAR(36).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.operation.memo</code>.
     */
    public final TableField<OperationRecord, String> MEMO = createField(DSL.name("memo"), org.jooq.impl.SQLDataType.VARCHAR(280).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.operation.amount</code>.
     */
    public final TableField<OperationRecord, Integer> AMOUNT = createField(DSL.name("amount"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.operation.order_in_day</code>.
     */
    public final TableField<OperationRecord, Long> ORDER_IN_DAY = createField(DSL.name("order_in_day"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.operation.pending</code>.
     */
    public final TableField<OperationRecord, Boolean> PENDING = createField(DSL.name("pending"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.operation.locked</code>.
     */
    public final TableField<OperationRecord, Boolean> LOCKED = createField(DSL.name("locked"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
<<<<<<< HEAD
     * The column <code>public.operation.import_identifier</code>.
     */
    public final TableField<OperationRecord, String> IMPORT_IDENTIFIER = createField(DSL.name("import_identifier"), org.jooq.impl.SQLDataType.VARCHAR(150).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");
=======
     * The column <code>public.operation.mother_operation_id</code>.
     */
    public final TableField<OperationRecord, String> MOTHER_OPERATION_ID = createField(DSL.name("mother_operation_id"), org.jooq.impl.SQLDataType.VARCHAR(36).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");
>>>>>>> multipleCategories

    /**
     * Create a <code>public.operation</code> table reference
     */
    public Operation() {
        this(DSL.name("operation"), null);
    }

    /**
     * Create an aliased <code>public.operation</code> table reference
     */
    public Operation(String alias) {
        this(DSL.name(alias), OPERATION);
    }

    /**
     * Create an aliased <code>public.operation</code> table reference
     */
    public Operation(Name alias) {
        this(alias, OPERATION);
    }

    private Operation(Name alias, Table<OperationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Operation(Name alias, Table<OperationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Operation(Table<O> child, ForeignKey<O, OperationRecord> key) {
        super(child, key, OPERATION);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<OperationRecord> getPrimaryKey() {
        return Keys.OPERATION_PKEY;
    }

    @Override
    public List<UniqueKey<OperationRecord>> getKeys() {
        return Arrays.<UniqueKey<OperationRecord>>asList(Keys.OPERATION_PKEY, Keys.OPERATION_IMPORT_IDENTIFIER_KEY);
    }

    @Override
    public List<ForeignKey<OperationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OperationRecord, ?>>asList(Keys.OPERATION__OPERATION_ACCOUNT_ID_FKEY, Keys.OPERATION__OPERATION_CATEGORY_ID_FKEY);
    }

    public Account account() {
        return new Account(this, Keys.OPERATION__OPERATION_ACCOUNT_ID_FKEY);
    }

    public Category category() {
        return new Category(this, Keys.OPERATION__OPERATION_CATEGORY_ID_FKEY);
    }

    @Override
    public List<Check<OperationRecord>> getChecks() {
        return Arrays.<Check<OperationRecord>>asList(
              Internal.createCheck(this, DSL.name("no_invalid_day_operation"), "((day < 32))", true)
            , Internal.createCheck(this, DSL.name("no_invalid_month_operation"), "(((month % 100) < 13))", true)
            , Internal.createCheck(this, DSL.name("no_negative_day_operation"), "((day > 0))", true)
            , Internal.createCheck(this, DSL.name("no_negative_month_operation"), "(((month % 100) > 0))", true)
        );
    }

    @Override
    public Operation as(String alias) {
        return new Operation(DSL.name(alias), this);
    }

    @Override
    public Operation as(Name alias) {
        return new Operation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Operation rename(String name) {
        return new Operation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Operation rename(Name name) {
        return new Operation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, Integer, Integer, String, String, Integer, Long, Boolean, Boolean, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
