/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables;


import open.tresorier.generated.jooq.test.information_schema.InformationSchema;
import open.tresorier.generated.jooq.test.information_schema.tables.records.SequencesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
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
public class Sequences extends TableImpl<SequencesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.SEQUENCES</code>
     */
    public static final Sequences SEQUENCES = new Sequences();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SequencesRecord> getRecordType() {
        return SequencesRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_CATALOG</code>.
     */
    public final TableField<SequencesRecord, String> SEQUENCE_CATALOG = createField(DSL.name("SEQUENCE_CATALOG"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_SCHEMA</code>.
     */
    public final TableField<SequencesRecord, String> SEQUENCE_SCHEMA = createField(DSL.name("SEQUENCE_SCHEMA"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_NAME</code>.
     */
    public final TableField<SequencesRecord, String> SEQUENCE_NAME = createField(DSL.name("SEQUENCE_NAME"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.DATA_TYPE</code>.
     */
    public final TableField<SequencesRecord, String> DATA_TYPE = createField(DSL.name("DATA_TYPE"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.NUMERIC_PRECISION</code>.
     */
    public final TableField<SequencesRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("NUMERIC_PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.SEQUENCES.NUMERIC_PRECISION_RADIX</code>.
     */
    public final TableField<SequencesRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("NUMERIC_PRECISION_RADIX"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.NUMERIC_SCALE</code>.
     */
    public final TableField<SequencesRecord, Integer> NUMERIC_SCALE = createField(DSL.name("NUMERIC_SCALE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.START_VALUE</code>.
     */
    public final TableField<SequencesRecord, Long> START_VALUE = createField(DSL.name("START_VALUE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.MINIMUM_VALUE</code>.
     */
    public final TableField<SequencesRecord, Long> MINIMUM_VALUE = createField(DSL.name("MINIMUM_VALUE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.MAXIMUM_VALUE</code>.
     */
    public final TableField<SequencesRecord, Long> MAXIMUM_VALUE = createField(DSL.name("MAXIMUM_VALUE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.INCREMENT</code>.
     */
    public final TableField<SequencesRecord, Long> INCREMENT = createField(DSL.name("INCREMENT"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.CYCLE_OPTION</code>.
     */
    public final TableField<SequencesRecord, String> CYCLE_OPTION = createField(DSL.name("CYCLE_OPTION"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.DECLARED_DATA_TYPE</code>.
     */
    public final TableField<SequencesRecord, String> DECLARED_DATA_TYPE = createField(DSL.name("DECLARED_DATA_TYPE"), SQLDataType.VARCHAR(1048576), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.SEQUENCES.DECLARED_NUMERIC_PRECISION</code>.
     */
    public final TableField<SequencesRecord, Integer> DECLARED_NUMERIC_PRECISION = createField(DSL.name("DECLARED_NUMERIC_PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.SEQUENCES.DECLARED_NUMERIC_SCALE</code>.
     */
    public final TableField<SequencesRecord, Integer> DECLARED_NUMERIC_SCALE = createField(DSL.name("DECLARED_NUMERIC_SCALE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.BASE_VALUE</code>.
     */
    public final TableField<SequencesRecord, Long> BASE_VALUE = createField(DSL.name("BASE_VALUE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.CACHE</code>.
     */
    public final TableField<SequencesRecord, Long> CACHE = createField(DSL.name("CACHE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.REMARKS</code>.
     */
    public final TableField<SequencesRecord, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(1048576), this, "");

    private Sequences(Name alias, Table<SequencesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sequences(Name alias, Table<SequencesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SEQUENCES</code> table
     * reference
     */
    public Sequences(String alias) {
        this(DSL.name(alias), SEQUENCES);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SEQUENCES</code> table
     * reference
     */
    public Sequences(Name alias) {
        this(alias, SEQUENCES);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.SEQUENCES</code> table reference
     */
    public Sequences() {
        this(DSL.name("SEQUENCES"), null);
    }

    public <O extends Record> Sequences(Table<O> child, ForeignKey<O, SequencesRecord> key) {
        super(child, key, SEQUENCES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Sequences as(String alias) {
        return new Sequences(DSL.name(alias), this);
    }

    @Override
    public Sequences as(Name alias) {
        return new Sequences(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sequences rename(String name) {
        return new Sequences(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sequences rename(Name name) {
        return new Sequences(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, String, String, Integer, Integer, Integer, Long, Long, Long, Long, String, String, Integer, Integer, Long, Long, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}
