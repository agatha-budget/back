/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables.records;


import open.tresorier.generated.jooq.test.public_.tables.Operation;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OperationRecord extends UpdatableRecordImpl<OperationRecord> implements Record8<String, String, Integer, Integer, String, String, Integer, Integer> {

    private static final long serialVersionUID = -2133796257;

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
     * Setter for <code>PUBLIC.OPERATION.MONTH</code>.
     */
    public OperationRecord setMonth(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.MONTH</code>.
     */
    public Integer getMonth() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>PUBLIC.OPERATION.DAY</code>.
     */
    public OperationRecord setDay(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.DAY</code>.
     */
    public Integer getDay() {
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
     * Setter for <code>PUBLIC.OPERATION.ORDERINDAY</code>.
     */
    public OperationRecord setOrderinday(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.OPERATION.ORDERINDAY</code>.
     */
    public Integer getOrderinday() {
        return (Integer) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, Integer, Integer, String, String, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, String, Integer, Integer, String, String, Integer, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Operation.OPERATION.ID;
    }

    @Override
    public Field<String> field2() {
        return Operation.OPERATION.ACCOUNT_ID;
    }

    @Override
    public Field<Integer> field3() {
        return Operation.OPERATION.MONTH;
    }

    @Override
    public Field<Integer> field4() {
        return Operation.OPERATION.DAY;
    }

    @Override
    public Field<String> field5() {
        return Operation.OPERATION.CATEGORY_ID;
    }

    @Override
    public Field<String> field6() {
        return Operation.OPERATION.MEMO;
    }

    @Override
    public Field<Integer> field7() {
        return Operation.OPERATION.AMOUNT;
    }

    @Override
    public Field<Integer> field8() {
        return Operation.OPERATION.ORDERINDAY;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getAccountId();
    }

    @Override
    public Integer component3() {
        return getMonth();
    }

    @Override
    public Integer component4() {
        return getDay();
    }

    @Override
    public String component5() {
        return getCategoryId();
    }

    @Override
    public String component6() {
        return getMemo();
    }

    @Override
    public Integer component7() {
        return getAmount();
    }

    @Override
    public Integer component8() {
        return getOrderinday();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getAccountId();
    }

    @Override
    public Integer value3() {
        return getMonth();
    }

    @Override
    public Integer value4() {
        return getDay();
    }

    @Override
    public String value5() {
        return getCategoryId();
    }

    @Override
    public String value6() {
        return getMemo();
    }

    @Override
    public Integer value7() {
        return getAmount();
    }

    @Override
    public Integer value8() {
        return getOrderinday();
    }

    @Override
    public OperationRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public OperationRecord value2(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public OperationRecord value3(Integer value) {
        setMonth(value);
        return this;
    }

    @Override
    public OperationRecord value4(Integer value) {
        setDay(value);
        return this;
    }

    @Override
    public OperationRecord value5(String value) {
        setCategoryId(value);
        return this;
    }

    @Override
    public OperationRecord value6(String value) {
        setMemo(value);
        return this;
    }

    @Override
    public OperationRecord value7(Integer value) {
        setAmount(value);
        return this;
    }

    @Override
    public OperationRecord value8(Integer value) {
        setOrderinday(value);
        return this;
    }

    @Override
    public OperationRecord values(String value1, String value2, Integer value3, Integer value4, String value5, String value6, Integer value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
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
    public OperationRecord(String id, String accountId, Integer month, Integer day, String categoryId, String memo, Integer amount, Integer orderinday) {
        super(Operation.OPERATION);

        set(0, id);
        set(1, accountId);
        set(2, month);
        set(3, day);
        set(4, categoryId);
        set(5, memo);
        set(6, amount);
        set(7, orderinday);
    }
}
