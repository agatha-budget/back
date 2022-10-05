/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables.records;


import open.tresorier.generated.jooq.main.tables.MasterCategory;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MasterCategoryRecord extends UpdatableRecordImpl<MasterCategoryRecord> implements Record5<String, String, String, Boolean, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.master_category.id</code>.
     */
    public MasterCategoryRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.master_category.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.master_category.budget_id</code>.
     */
    public MasterCategoryRecord setBudgetId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.master_category.budget_id</code>.
     */
    public String getBudgetId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.master_category.name</code>.
     */
    public MasterCategoryRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.master_category.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.master_category.deleted</code>.
     */
    public MasterCategoryRecord setDeleted(Boolean value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.master_category.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>public.master_category.color</code>.
     */
    public MasterCategoryRecord setColor(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.master_category.color</code>.
     */
    public String getColor() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, Boolean, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, Boolean, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return MasterCategory.MASTER_CATEGORY.ID;
    }

    @Override
    public Field<String> field2() {
        return MasterCategory.MASTER_CATEGORY.BUDGET_ID;
    }

    @Override
    public Field<String> field3() {
        return MasterCategory.MASTER_CATEGORY.NAME;
    }

    @Override
    public Field<Boolean> field4() {
        return MasterCategory.MASTER_CATEGORY.DELETED;
    }

    @Override
    public Field<String> field5() {
        return MasterCategory.MASTER_CATEGORY.COLOR;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getBudgetId();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public Boolean component4() {
        return getDeleted();
    }

    @Override
    public String component5() {
        return getColor();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getBudgetId();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public Boolean value4() {
        return getDeleted();
    }

    @Override
    public String value5() {
        return getColor();
    }

    @Override
    public MasterCategoryRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public MasterCategoryRecord value2(String value) {
        setBudgetId(value);
        return this;
    }

    @Override
    public MasterCategoryRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public MasterCategoryRecord value4(Boolean value) {
        setDeleted(value);
        return this;
    }

    @Override
    public MasterCategoryRecord value5(String value) {
        setColor(value);
        return this;
    }

    @Override
    public MasterCategoryRecord values(String value1, String value2, String value3, Boolean value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MasterCategoryRecord
     */
    public MasterCategoryRecord() {
        super(MasterCategory.MASTER_CATEGORY);
    }

    /**
     * Create a detached, initialised MasterCategoryRecord
     */
    public MasterCategoryRecord(String id, String budgetId, String name, Boolean deleted, String color) {
        super(MasterCategory.MASTER_CATEGORY);

        setId(id);
        setBudgetId(budgetId);
        setName(name);
        setDeleted(deleted);
        setColor(color);
    }

    /**
     * Create a detached, initialised MasterCategoryRecord
     */
    public MasterCategoryRecord(open.tresorier.generated.jooq.main.tables.pojos.MasterCategory value) {
        super(MasterCategory.MASTER_CATEGORY);

        if (value != null) {
            setId(value.getId());
            setBudgetId(value.getBudgetId());
            setName(value.getName());
            setDeleted(value.getDeleted());
            setColor(value.getColor());
        }
    }
}
