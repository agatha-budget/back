/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables.records;


import java.math.BigDecimal;

import open.tresorier.generated.jooq.test.public_.tables.Allocation;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AllocationRecord extends UpdatableRecordImpl<AllocationRecord> implements Record4<String, String, Long, BigDecimal> {

    private static final long serialVersionUID = -237212362;

    /**
     * Setter for <code>PUBLIC.ALLOCATION.ID</code>.
     */
    public AllocationRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.ALLOCATION.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>PUBLIC.ALLOCATION.CATEGORY_ID</code>.
     */
    public AllocationRecord setCategoryId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.ALLOCATION.CATEGORY_ID</code>.
     */
    public String getCategoryId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.ALLOCATION.ALLOCATION_MONTH</code>.
     */
    public AllocationRecord setAllocationMonth(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.ALLOCATION.ALLOCATION_MONTH</code>.
     */
    public Long getAllocationMonth() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>PUBLIC.ALLOCATION.AMOUNT</code>.
     */
    public AllocationRecord setAmount(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.ALLOCATION.AMOUNT</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, Long, BigDecimal> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, Long, BigDecimal> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Allocation.ALLOCATION.ID;
    }

    @Override
    public Field<String> field2() {
        return Allocation.ALLOCATION.CATEGORY_ID;
    }

    @Override
    public Field<Long> field3() {
        return Allocation.ALLOCATION.ALLOCATION_MONTH;
    }

    @Override
    public Field<BigDecimal> field4() {
        return Allocation.ALLOCATION.AMOUNT;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCategoryId();
    }

    @Override
    public Long component3() {
        return getAllocationMonth();
    }

    @Override
    public BigDecimal component4() {
        return getAmount();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCategoryId();
    }

    @Override
    public Long value3() {
        return getAllocationMonth();
    }

    @Override
    public BigDecimal value4() {
        return getAmount();
    }

    @Override
    public AllocationRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public AllocationRecord value2(String value) {
        setCategoryId(value);
        return this;
    }

    @Override
    public AllocationRecord value3(Long value) {
        setAllocationMonth(value);
        return this;
    }

    @Override
    public AllocationRecord value4(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public AllocationRecord values(String value1, String value2, Long value3, BigDecimal value4) {
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
     * Create a detached AllocationRecord
     */
    public AllocationRecord() {
        super(Allocation.ALLOCATION);
    }

    /**
     * Create a detached, initialised AllocationRecord
     */
    public AllocationRecord(String id, String categoryId, Long allocationMonth, BigDecimal amount) {
        super(Allocation.ALLOCATION);

        set(0, id);
        set(1, categoryId);
        set(2, allocationMonth);
        set(3, amount);
    }
}
