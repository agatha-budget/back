/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.records;


import open.tresorier.generated.jooq.test.information_schema.tables.IndexColumns;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IndexColumnsRecord extends TableRecordImpl<IndexColumnsRecord> implements Record11<String, String, String, String, String, String, String, Integer, String, String, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.INDEX_CATALOG</code>.
     */
    public IndexColumnsRecord setIndexCatalog(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.INDEX_CATALOG</code>.
     */
    public String getIndexCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.INDEX_SCHEMA</code>.
     */
    public IndexColumnsRecord setIndexSchema(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.INDEX_SCHEMA</code>.
     */
    public String getIndexSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.INDEX_NAME</code>.
     */
    public IndexColumnsRecord setIndexName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.INDEX_NAME</code>.
     */
    public String getIndexName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.TABLE_CATALOG</code>.
     */
    public IndexColumnsRecord setTableCatalog(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.TABLE_SCHEMA</code>.
     */
    public IndexColumnsRecord setTableSchema(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.TABLE_NAME</code>.
     */
    public IndexColumnsRecord setTableName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.COLUMN_NAME</code>.
     */
    public IndexColumnsRecord setColumnName(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.INDEX_COLUMNS.ORDINAL_POSITION</code>.
     */
    public IndexColumnsRecord setOrdinalPosition(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.INDEX_COLUMNS.ORDINAL_POSITION</code>.
     */
    public Integer getOrdinalPosition() {
        return (Integer) get(7);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.INDEX_COLUMNS.ORDERING_SPECIFICATION</code>.
     */
    public IndexColumnsRecord setOrderingSpecification(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.INDEX_COLUMNS.ORDERING_SPECIFICATION</code>.
     */
    public String getOrderingSpecification() {
        return (String) get(8);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.NULL_ORDERING</code>.
     */
    public IndexColumnsRecord setNullOrdering(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.NULL_ORDERING</code>.
     */
    public String getNullOrdering() {
        return (String) get(9);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.IS_UNIQUE</code>.
     */
    public IndexColumnsRecord setIsUnique(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEX_COLUMNS.IS_UNIQUE</code>.
     */
    public Boolean getIsUnique() {
        return (Boolean) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, String, String, String, String, Integer, String, String, Boolean> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<String, String, String, String, String, String, String, Integer, String, String, Boolean> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return IndexColumns.INDEX_COLUMNS.INDEX_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return IndexColumns.INDEX_COLUMNS.INDEX_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return IndexColumns.INDEX_COLUMNS.INDEX_NAME;
    }

    @Override
    public Field<String> field4() {
        return IndexColumns.INDEX_COLUMNS.TABLE_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return IndexColumns.INDEX_COLUMNS.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return IndexColumns.INDEX_COLUMNS.TABLE_NAME;
    }

    @Override
    public Field<String> field7() {
        return IndexColumns.INDEX_COLUMNS.COLUMN_NAME;
    }

    @Override
    public Field<Integer> field8() {
        return IndexColumns.INDEX_COLUMNS.ORDINAL_POSITION;
    }

    @Override
    public Field<String> field9() {
        return IndexColumns.INDEX_COLUMNS.ORDERING_SPECIFICATION;
    }

    @Override
    public Field<String> field10() {
        return IndexColumns.INDEX_COLUMNS.NULL_ORDERING;
    }

    @Override
    public Field<Boolean> field11() {
        return IndexColumns.INDEX_COLUMNS.IS_UNIQUE;
    }

    @Override
    public String component1() {
        return getIndexCatalog();
    }

    @Override
    public String component2() {
        return getIndexSchema();
    }

    @Override
    public String component3() {
        return getIndexName();
    }

    @Override
    public String component4() {
        return getTableCatalog();
    }

    @Override
    public String component5() {
        return getTableSchema();
    }

    @Override
    public String component6() {
        return getTableName();
    }

    @Override
    public String component7() {
        return getColumnName();
    }

    @Override
    public Integer component8() {
        return getOrdinalPosition();
    }

    @Override
    public String component9() {
        return getOrderingSpecification();
    }

    @Override
    public String component10() {
        return getNullOrdering();
    }

    @Override
    public Boolean component11() {
        return getIsUnique();
    }

    @Override
    public String value1() {
        return getIndexCatalog();
    }

    @Override
    public String value2() {
        return getIndexSchema();
    }

    @Override
    public String value3() {
        return getIndexName();
    }

    @Override
    public String value4() {
        return getTableCatalog();
    }

    @Override
    public String value5() {
        return getTableSchema();
    }

    @Override
    public String value6() {
        return getTableName();
    }

    @Override
    public String value7() {
        return getColumnName();
    }

    @Override
    public Integer value8() {
        return getOrdinalPosition();
    }

    @Override
    public String value9() {
        return getOrderingSpecification();
    }

    @Override
    public String value10() {
        return getNullOrdering();
    }

    @Override
    public Boolean value11() {
        return getIsUnique();
    }

    @Override
    public IndexColumnsRecord value1(String value) {
        setIndexCatalog(value);
        return this;
    }

    @Override
    public IndexColumnsRecord value2(String value) {
        setIndexSchema(value);
        return this;
    }

    @Override
    public IndexColumnsRecord value3(String value) {
        setIndexName(value);
        return this;
    }

    @Override
    public IndexColumnsRecord value4(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public IndexColumnsRecord value5(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public IndexColumnsRecord value6(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public IndexColumnsRecord value7(String value) {
        setColumnName(value);
        return this;
    }

    @Override
    public IndexColumnsRecord value8(Integer value) {
        setOrdinalPosition(value);
        return this;
    }

    @Override
    public IndexColumnsRecord value9(String value) {
        setOrderingSpecification(value);
        return this;
    }

    @Override
    public IndexColumnsRecord value10(String value) {
        setNullOrdering(value);
        return this;
    }

    @Override
    public IndexColumnsRecord value11(Boolean value) {
        setIsUnique(value);
        return this;
    }

    @Override
    public IndexColumnsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, Integer value8, String value9, String value10, Boolean value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IndexColumnsRecord
     */
    public IndexColumnsRecord() {
        super(IndexColumns.INDEX_COLUMNS);
    }

    /**
     * Create a detached, initialised IndexColumnsRecord
     */
    public IndexColumnsRecord(String indexCatalog, String indexSchema, String indexName, String tableCatalog, String tableSchema, String tableName, String columnName, Integer ordinalPosition, String orderingSpecification, String nullOrdering, Boolean isUnique) {
        super(IndexColumns.INDEX_COLUMNS);

        setIndexCatalog(indexCatalog);
        setIndexSchema(indexSchema);
        setIndexName(indexName);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        setOrdinalPosition(ordinalPosition);
        setOrderingSpecification(orderingSpecification);
        setNullOrdering(nullOrdering);
        setIsUnique(isUnique);
    }

    /**
     * Create a detached, initialised IndexColumnsRecord
     */
    public IndexColumnsRecord(open.tresorier.generated.jooq.test.information_schema.tables.pojos.IndexColumns value) {
        super(IndexColumns.INDEX_COLUMNS);

        if (value != null) {
            setIndexCatalog(value.getIndexCatalog());
            setIndexSchema(value.getIndexSchema());
            setIndexName(value.getIndexName());
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setColumnName(value.getColumnName());
            setOrdinalPosition(value.getOrdinalPosition());
            setOrderingSpecification(value.getOrderingSpecification());
            setNullOrdering(value.getNullOrdering());
            setIsUnique(value.getIsUnique());
        }
    }
}
