/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables;


import java.util.Arrays;
import java.util.List;

import open.tresorier.generated.jooq.test.public_.Keys;
import open.tresorier.generated.jooq.test.public_.Public;
import open.tresorier.generated.jooq.test.public_.tables.records.OperationRecord;

import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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

    private static final long serialVersionUID = -1644123542;

    /**
     * The reference instance of <code>PUBLIC.OPERATION</code>
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
     * The column <code>PUBLIC.OPERATION.ID</code>.
     */
    public final TableField<OperationRecord, String> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.OPERATION.ACCOUNT_ID</code>.
     */
    public final TableField<OperationRecord, String> ACCOUNT_ID = createField(DSL.name("ACCOUNT_ID"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.OPERATION.MONTH</code>.
     */
    public final TableField<OperationRecord, Integer> MONTH = createField(DSL.name("MONTH"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>PUBLIC.OPERATION.DAY</code>.
     */
    public final TableField<OperationRecord, Integer> DAY = createField(DSL.name("DAY"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>PUBLIC.OPERATION.CATEGORY_ID</code>.
     */
    public final TableField<OperationRecord, String> CATEGORY_ID = createField(DSL.name("CATEGORY_ID"), org.jooq.impl.SQLDataType.VARCHAR(36).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>PUBLIC.OPERATION.MEMO</code>.
     */
    public final TableField<OperationRecord, String> MEMO = createField(DSL.name("MEMO"), org.jooq.impl.SQLDataType.VARCHAR(280).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>PUBLIC.OPERATION.AMOUNT</code>.
     */
    public final TableField<OperationRecord, Integer> AMOUNT = createField(DSL.name("AMOUNT"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>PUBLIC.OPERATION.ORDER_IN_DAY</code>.
     */
    public final TableField<OperationRecord, Long> ORDER_IN_DAY = createField(DSL.name("ORDER_IN_DAY"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>PUBLIC.OPERATION</code> table reference
     */
    public Operation() {
        this(DSL.name("OPERATION"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.OPERATION</code> table reference
     */
    public Operation(String alias) {
        this(DSL.name(alias), OPERATION);
    }

    /**
     * Create an aliased <code>PUBLIC.OPERATION</code> table reference
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
        return Keys.CONSTRAINT_9;
    }

    @Override
    public List<UniqueKey<OperationRecord>> getKeys() {
        return Arrays.<UniqueKey<OperationRecord>>asList(Keys.CONSTRAINT_9);
    }

    @Override
    public List<ForeignKey<OperationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OperationRecord, ?>>asList(Keys.CONSTRAINT_93, Keys.CONSTRAINT_932);
    }

    public Account account() {
        return new Account(this, Keys.CONSTRAINT_93);
    }

    public Category category() {
        return new Category(this, Keys.CONSTRAINT_932);
    }

    @Override
    public List<Check<OperationRecord>> getChecks() {
        return Arrays.<Check<OperationRecord>>asList(
              Internal.createCheck(this, DSL.name("NO_INVALID_DAY_OPERATION"), "(\"DAY\" < 32)", true)
            , Internal.createCheck(this, DSL.name("NO_INVALID_MONTH_OPERATION"), "((\"MONTH\" % 100) < 13)", true)
            , Internal.createCheck(this, DSL.name("NO_NEGATIVE_DAY_OPERATION"), "(\"DAY\" > 0)", true)
            , Internal.createCheck(this, DSL.name("NO_NEGATIVE_MONTH_OPERATION"), "((\"MONTH\" % 100) > 0)", true)
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
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, Integer, Integer, String, String, Integer, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
