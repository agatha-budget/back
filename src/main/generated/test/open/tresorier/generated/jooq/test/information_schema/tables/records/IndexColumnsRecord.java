/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.records;


import open.tresorier.generated.jooq.test.information_schema.tables.IndexColumns;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IndexColumnsRecord extends TableRecordImpl<IndexColumnsRecord> {

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
        resetChangedOnNotNull();
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
            resetChangedOnNotNull();
        }
    }
}
