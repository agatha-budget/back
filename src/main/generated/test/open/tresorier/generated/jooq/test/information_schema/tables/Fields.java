/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables;


import open.tresorier.generated.jooq.test.information_schema.InformationSchema;
import open.tresorier.generated.jooq.test.information_schema.tables.records.FieldsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Fields extends TableImpl<FieldsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.FIELDS</code>
     */
    public static final Fields FIELDS = new Fields();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FieldsRecord> getRecordType() {
        return FieldsRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.OBJECT_CATALOG</code>.
     */
    public final TableField<FieldsRecord, String> OBJECT_CATALOG = createField(DSL.name("OBJECT_CATALOG"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.OBJECT_SCHEMA</code>.
     */
    public final TableField<FieldsRecord, String> OBJECT_SCHEMA = createField(DSL.name("OBJECT_SCHEMA"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.OBJECT_NAME</code>.
     */
    public final TableField<FieldsRecord, String> OBJECT_NAME = createField(DSL.name("OBJECT_NAME"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.OBJECT_TYPE</code>.
     */
    public final TableField<FieldsRecord, String> OBJECT_TYPE = createField(DSL.name("OBJECT_TYPE"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.ROW_IDENTIFIER</code>.
     */
    public final TableField<FieldsRecord, String> ROW_IDENTIFIER = createField(DSL.name("ROW_IDENTIFIER"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.FIELD_NAME</code>.
     */
    public final TableField<FieldsRecord, String> FIELD_NAME = createField(DSL.name("FIELD_NAME"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.ORDINAL_POSITION</code>.
     */
    public final TableField<FieldsRecord, Integer> ORDINAL_POSITION = createField(DSL.name("ORDINAL_POSITION"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.DATA_TYPE</code>.
     */
    public final TableField<FieldsRecord, String> DATA_TYPE = createField(DSL.name("DATA_TYPE"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.FIELDS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public final TableField<FieldsRecord, Long> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("CHARACTER_MAXIMUM_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.CHARACTER_OCTET_LENGTH</code>.
     */
    public final TableField<FieldsRecord, Long> CHARACTER_OCTET_LENGTH = createField(DSL.name("CHARACTER_OCTET_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.CHARACTER_SET_CATALOG</code>.
     */
    public final TableField<FieldsRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("CHARACTER_SET_CATALOG"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.CHARACTER_SET_SCHEMA</code>.
     */
    public final TableField<FieldsRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("CHARACTER_SET_SCHEMA"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.CHARACTER_SET_NAME</code>.
     */
    public final TableField<FieldsRecord, String> CHARACTER_SET_NAME = createField(DSL.name("CHARACTER_SET_NAME"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.COLLATION_CATALOG</code>.
     */
    public final TableField<FieldsRecord, String> COLLATION_CATALOG = createField(DSL.name("COLLATION_CATALOG"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.COLLATION_SCHEMA</code>.
     */
    public final TableField<FieldsRecord, String> COLLATION_SCHEMA = createField(DSL.name("COLLATION_SCHEMA"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.COLLATION_NAME</code>.
     */
    public final TableField<FieldsRecord, String> COLLATION_NAME = createField(DSL.name("COLLATION_NAME"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.NUMERIC_PRECISION</code>.
     */
    public final TableField<FieldsRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("NUMERIC_PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.FIELDS.NUMERIC_PRECISION_RADIX</code>.
     */
    public final TableField<FieldsRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("NUMERIC_PRECISION_RADIX"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.NUMERIC_SCALE</code>.
     */
    public final TableField<FieldsRecord, Integer> NUMERIC_SCALE = createField(DSL.name("NUMERIC_SCALE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.DATETIME_PRECISION</code>.
     */
    public final TableField<FieldsRecord, Integer> DATETIME_PRECISION = createField(DSL.name("DATETIME_PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.INTERVAL_TYPE</code>.
     */
    public final TableField<FieldsRecord, String> INTERVAL_TYPE = createField(DSL.name("INTERVAL_TYPE"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.INTERVAL_PRECISION</code>.
     */
    public final TableField<FieldsRecord, Integer> INTERVAL_PRECISION = createField(DSL.name("INTERVAL_PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.MAXIMUM_CARDINALITY</code>.
     */
    public final TableField<FieldsRecord, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("MAXIMUM_CARDINALITY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.DTD_IDENTIFIER</code>.
     */
    public final TableField<FieldsRecord, String> DTD_IDENTIFIER = createField(DSL.name("DTD_IDENTIFIER"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.DECLARED_DATA_TYPE</code>.
     */
    public final TableField<FieldsRecord, String> DECLARED_DATA_TYPE = createField(DSL.name("DECLARED_DATA_TYPE"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.FIELDS.DECLARED_NUMERIC_PRECISION</code>.
     */
    public final TableField<FieldsRecord, Integer> DECLARED_NUMERIC_PRECISION = createField(DSL.name("DECLARED_NUMERIC_PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.DECLARED_NUMERIC_SCALE</code>.
     */
    public final TableField<FieldsRecord, Integer> DECLARED_NUMERIC_SCALE = createField(DSL.name("DECLARED_NUMERIC_SCALE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.GEOMETRY_TYPE</code>.
     */
    public final TableField<FieldsRecord, String> GEOMETRY_TYPE = createField(DSL.name("GEOMETRY_TYPE"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FIELDS.GEOMETRY_SRID</code>.
     */
    public final TableField<FieldsRecord, Integer> GEOMETRY_SRID = createField(DSL.name("GEOMETRY_SRID"), SQLDataType.INTEGER, this, "");

    private Fields(Name alias, Table<FieldsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Fields(Name alias, Table<FieldsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.FIELDS</code> table reference
     */
    public Fields(String alias) {
        this(DSL.name(alias), FIELDS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.FIELDS</code> table reference
     */
    public Fields(Name alias) {
        this(alias, FIELDS);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.FIELDS</code> table reference
     */
    public Fields() {
        this(DSL.name("FIELDS"), null);
    }

    public <O extends Record> Fields(Table<O> child, ForeignKey<O, FieldsRecord> key) {
        super(child, key, FIELDS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Fields as(String alias) {
        return new Fields(DSL.name(alias), this);
    }

    @Override
    public Fields as(Name alias) {
        return new Fields(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Fields rename(String name) {
        return new Fields(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Fields rename(Name name) {
        return new Fields(name, null);
    }
}
