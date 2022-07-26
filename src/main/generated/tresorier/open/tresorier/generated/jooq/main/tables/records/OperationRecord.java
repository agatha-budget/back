/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables.records;


import open.tresorier.generated.jooq.main.tables.Operation;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OperationRecord extends UpdatableRecordImpl<OperationRecord> implements Record11<String, String, Integer, Integer, String, String, Integer, Long, Boolean, Boolean, String> {

<<<<<<< HEAD
    private static final long serialVersionUID = -994876024;
=======
    private static final long serialVersionUID = -1189271879;
>>>>>>> multipleCategories

    /**
     * Setter for <code>public.operation.id</code>.
     */
    public OperationRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.operation.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.operation.account_id</code>.
     */
    public OperationRecord setAccountId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.operation.account_id</code>.
     */
    public String getAccountId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.operation.month</code>.
     */
    public OperationRecord setMonth(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.operation.month</code>.
     */
    public Integer getMonth() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.operation.day</code>.
     */
    public OperationRecord setDay(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.operation.day</code>.
     */
    public Integer getDay() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.operation.category_id</code>.
     */
    public OperationRecord setCategoryId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.operation.category_id</code>.
     */
    public String getCategoryId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.operation.memo</code>.
     */
    public OperationRecord setMemo(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.operation.memo</code>.
     */
    public String getMemo() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.operation.amount</code>.
     */
    public OperationRecord setAmount(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.operation.amount</code>.
     */
    public Integer getAmount() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.operation.order_in_day</code>.
     */
    public OperationRecord setOrderInDay(Long value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.operation.order_in_day</code>.
     */
    public Long getOrderInDay() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>public.operation.pending</code>.
     */
    public OperationRecord setPending(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.operation.pending</code>.
     */
    public Boolean getPending() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>public.operation.locked</code>.
     */
    public OperationRecord setLocked(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.operation.locked</code>.
     */
    public Boolean getLocked() {
        return (Boolean) get(9);
    }

    /**
<<<<<<< HEAD
     * Setter for <code>public.operation.import_identifier</code>.
     */
    public OperationRecord setImportIdentifier(String value) {
=======
     * Setter for <code>public.operation.mother_operation_id</code>.
     */
    public OperationRecord setMotherOperationId(String value) {
>>>>>>> multipleCategories
        set(10, value);
        return this;
    }

    /**
<<<<<<< HEAD
     * Getter for <code>public.operation.import_identifier</code>.
     */
    public String getImportIdentifier() {
=======
     * Getter for <code>public.operation.mother_operation_id</code>.
     */
    public String getMotherOperationId() {
>>>>>>> multipleCategories
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, Integer, Integer, String, String, Integer, Long, Boolean, Boolean, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<String, String, Integer, Integer, String, String, Integer, Long, Boolean, Boolean, String> valuesRow() {
        return (Row11) super.valuesRow();
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
    public Field<Long> field8() {
        return Operation.OPERATION.ORDER_IN_DAY;
    }

    @Override
    public Field<Boolean> field9() {
        return Operation.OPERATION.PENDING;
    }

    @Override
    public Field<Boolean> field10() {
        return Operation.OPERATION.LOCKED;
    }

    @Override
    public Field<String> field11() {
<<<<<<< HEAD
        return Operation.OPERATION.IMPORT_IDENTIFIER;
=======
        return Operation.OPERATION.MOTHER_OPERATION_ID;
>>>>>>> multipleCategories
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
    public Long component8() {
        return getOrderInDay();
    }

    @Override
    public Boolean component9() {
        return getPending();
    }

    @Override
    public Boolean component10() {
        return getLocked();
    }

    @Override
    public String component11() {
<<<<<<< HEAD
        return getImportIdentifier();
=======
        return getMotherOperationId();
>>>>>>> multipleCategories
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
    public Long value8() {
        return getOrderInDay();
    }

    @Override
    public Boolean value9() {
        return getPending();
    }

    @Override
    public Boolean value10() {
        return getLocked();
    }

    @Override
    public String value11() {
<<<<<<< HEAD
        return getImportIdentifier();
=======
        return getMotherOperationId();
>>>>>>> multipleCategories
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
    public OperationRecord value8(Long value) {
        setOrderInDay(value);
        return this;
    }

    @Override
    public OperationRecord value9(Boolean value) {
        setPending(value);
        return this;
    }

    @Override
    public OperationRecord value10(Boolean value) {
        setLocked(value);
        return this;
    }

    @Override
    public OperationRecord value11(String value) {
<<<<<<< HEAD
        setImportIdentifier(value);
=======
        setMotherOperationId(value);
>>>>>>> multipleCategories
        return this;
    }

    @Override
    public OperationRecord values(String value1, String value2, Integer value3, Integer value4, String value5, String value6, Integer value7, Long value8, Boolean value9, Boolean value10, String value11) {
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
     * Create a detached OperationRecord
     */
    public OperationRecord() {
        super(Operation.OPERATION);
    }

    /**
     * Create a detached, initialised OperationRecord
     */
<<<<<<< HEAD
    public OperationRecord(String id, String accountId, Integer month, Integer day, String categoryId, String memo, Integer amount, Long orderInDay, Boolean pending, Boolean locked, String importIdentifier) {
=======
    public OperationRecord(String id, String accountId, Integer month, Integer day, String categoryId, String memo, Integer amount, Long orderInDay, Boolean pending, Boolean locked, String motherOperationId) {
>>>>>>> multipleCategories
        super(Operation.OPERATION);

        set(0, id);
        set(1, accountId);
        set(2, month);
        set(3, day);
        set(4, categoryId);
        set(5, memo);
        set(6, amount);
        set(7, orderInDay);
        set(8, pending);
        set(9, locked);
<<<<<<< HEAD
        set(10, importIdentifier);
=======
        set(10, motherOperationId);
>>>>>>> multipleCategories
    }
}
