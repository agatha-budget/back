/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables.records;


import open.tresorier.generated.jooq.test.public_.tables.Operation;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OperationRecord extends UpdatableRecordImpl<OperationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>PUBLIC.OPERATION.ID</code>.
     */
    public OperationRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>PUBLIC.OPERATION.ACCOUNT_ID</code>.
     */
    public OperationRecord setAccountId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.ACCOUNT_ID</code>.
     */
    public String getAccountId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.OPERATION.DATE_MONTH</code>.
     */
    public OperationRecord setDateMonth(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.DATE_MONTH</code>.
     */
    public Integer getDateMonth() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>PUBLIC.OPERATION.DATE_DAY</code>.
     */
    public OperationRecord setDateDay(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.DATE_DAY</code>.
     */
    public Integer getDateDay() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>PUBLIC.OPERATION.CATEGORY_ID</code>.
     */
    public OperationRecord setCategoryId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.CATEGORY_ID</code>.
     */
    public String getCategoryId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>PUBLIC.OPERATION.MEMO</code>.
     */
    public OperationRecord setMemo(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.MEMO</code>.
     */
    public String getMemo() {
        return (String) get(5);
    }

    /**
     * Setter for <code>PUBLIC.OPERATION.AMOUNT</code>.
     */
    public OperationRecord setAmount(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.AMOUNT</code>.
     */
    public Integer getAmount() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>PUBLIC.OPERATION.ORDER_IN_DAY</code>.
     */
    public OperationRecord setOrderInDay(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.ORDER_IN_DAY</code>.
     */
    public Long getOrderInDay() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>PUBLIC.OPERATION.PENDING</code>.
     */
    public OperationRecord setPending(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.PENDING</code>.
     */
    public Boolean getPending() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>PUBLIC.OPERATION.LOCKED</code>.
     */
    public OperationRecord setLocked(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.LOCKED</code>.
     */
    public Boolean getLocked() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>PUBLIC.OPERATION.MOTHER_OPERATION_ID</code>.
     */
    public OperationRecord setMotherOperationId(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.MOTHER_OPERATION_ID</code>.
     */
    public String getMotherOperationId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>PUBLIC.OPERATION.IMPORT_IDENTIFIER</code>.
     */
    public OperationRecord setImportIdentifier(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.IMPORT_IDENTIFIER</code>.
     */
    public String getImportIdentifier() {
        return (String) get(11);
    }

    /**
     * Setter for <code>PUBLIC.OPERATION.IMPORT_TIMESTAMP</code>.
     */
    public OperationRecord setImportTimestamp(Long value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.IMPORT_TIMESTAMP</code>.
     */
    public Long getImportTimestamp() {
        return (Long) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OperationRecord
     */
    public OperationRecord() {
        super(Operation.OPERATION);
    }

    /**
     * Create a detached, initialised OperationRecord
     */
    public OperationRecord(String id, String accountId, Integer dateMonth, Integer dateDay, String categoryId, String memo, Integer amount, Long orderInDay, Boolean pending, Boolean locked, String motherOperationId, String importIdentifier, Long importTimestamp) {
        super(Operation.OPERATION);

        setId(id);
        setAccountId(accountId);
        setDateMonth(dateMonth);
        setDateDay(dateDay);
        setCategoryId(categoryId);
        setMemo(memo);
        setAmount(amount);
        setOrderInDay(orderInDay);
        setPending(pending);
        setLocked(locked);
        setMotherOperationId(motherOperationId);
        setImportIdentifier(importIdentifier);
        setImportTimestamp(importTimestamp);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised OperationRecord
     */
    public OperationRecord(open.tresorier.generated.jooq.test.public_.tables.pojos.Operation value) {
        super(Operation.OPERATION);

        if (value != null) {
            setId(value.getId());
            setAccountId(value.getAccountId());
            setDateMonth(value.getDateMonth());
            setDateDay(value.getDateDay());
            setCategoryId(value.getCategoryId());
            setMemo(value.getMemo());
            setAmount(value.getAmount());
            setOrderInDay(value.getOrderInDay());
            setPending(value.getPending());
            setLocked(value.getLocked());
            setMotherOperationId(value.getMotherOperationId());
            setImportIdentifier(value.getImportIdentifier());
            setImportTimestamp(value.getImportTimestamp());
            resetChangedOnNotNull();
        }
    }
}