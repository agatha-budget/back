/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.records;


import open.tresorier.generated.jooq.test.information_schema.tables.CheckConstraints;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CheckConstraintsRecord extends TableRecordImpl<CheckConstraintsRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public CheckConstraintsRecord setConstraintCatalog(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public CheckConstraintsRecord setConstraintSchema(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public CheckConstraintsRecord setConstraintName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CHECK_CLAUSE</code>.
     */
    public CheckConstraintsRecord setCheckClause(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CHECK_CLAUSE</code>.
     */
    public String getCheckClause() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return CheckConstraints.CHECK_CONSTRAINTS.CONSTRAINT_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return CheckConstraints.CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return CheckConstraints.CHECK_CONSTRAINTS.CONSTRAINT_NAME;
    }

    @Override
    public Field<String> field4() {
        return CheckConstraints.CHECK_CONSTRAINTS.CHECK_CLAUSE;
    }

    @Override
    public String component1() {
        return getConstraintCatalog();
    }

    @Override
    public String component2() {
        return getConstraintSchema();
    }

    @Override
    public String component3() {
        return getConstraintName();
    }

    @Override
    public String component4() {
        return getCheckClause();
    }

    @Override
    public String value1() {
        return getConstraintCatalog();
    }

    @Override
    public String value2() {
        return getConstraintSchema();
    }

    @Override
    public String value3() {
        return getConstraintName();
    }

    @Override
    public String value4() {
        return getCheckClause();
    }

    @Override
    public CheckConstraintsRecord value1(String value) {
        setConstraintCatalog(value);
        return this;
    }

    @Override
    public CheckConstraintsRecord value2(String value) {
        setConstraintSchema(value);
        return this;
    }

    @Override
    public CheckConstraintsRecord value3(String value) {
        setConstraintName(value);
        return this;
    }

    @Override
    public CheckConstraintsRecord value4(String value) {
        setCheckClause(value);
        return this;
    }

    @Override
    public CheckConstraintsRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CheckConstraintsRecord
     */
    public CheckConstraintsRecord() {
        super(CheckConstraints.CHECK_CONSTRAINTS);
    }

    /**
     * Create a detached, initialised CheckConstraintsRecord
     */
    public CheckConstraintsRecord(String constraintCatalog, String constraintSchema, String constraintName, String checkClause) {
        super(CheckConstraints.CHECK_CONSTRAINTS);

        setConstraintCatalog(constraintCatalog);
        setConstraintSchema(constraintSchema);
        setConstraintName(constraintName);
        setCheckClause(checkClause);
    }

    /**
     * Create a detached, initialised CheckConstraintsRecord
     */
    public CheckConstraintsRecord(open.tresorier.generated.jooq.test.information_schema.tables.pojos.CheckConstraints value) {
        super(CheckConstraints.CHECK_CONSTRAINTS);

        if (value != null) {
            setConstraintCatalog(value.getConstraintCatalog());
            setConstraintSchema(value.getConstraintSchema());
            setConstraintName(value.getConstraintName());
            setCheckClause(value.getCheckClause());
        }
    }
}
