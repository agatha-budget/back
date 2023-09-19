/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import open.tresorier.generated.jooq.main.Keys;
import open.tresorier.generated.jooq.main.Public;
import open.tresorier.generated.jooq.main.tables.records.AllocationRecord;

import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Allocation extends TableImpl<AllocationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.allocation</code>
     */
    public static final Allocation ALLOCATION = new Allocation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AllocationRecord> getRecordType() {
        return AllocationRecord.class;
    }

    /**
     * The column <code>public.allocation.category_id</code>.
     */
    public final TableField<AllocationRecord, String> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.allocation.month</code>.
     */
    public final TableField<AllocationRecord, Integer> MONTH = createField(DSL.name("month"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.allocation.amount</code>.
     */
    public final TableField<AllocationRecord, Integer> AMOUNT = createField(DSL.name("amount"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    private Allocation(Name alias, Table<AllocationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Allocation(Name alias, Table<AllocationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.allocation</code> table reference
     */
    public Allocation(String alias) {
        this(DSL.name(alias), ALLOCATION);
    }

    /**
     * Create an aliased <code>public.allocation</code> table reference
     */
    public Allocation(Name alias) {
        this(alias, ALLOCATION);
    }

    /**
     * Create a <code>public.allocation</code> table reference
     */
    public Allocation() {
        this(DSL.name("allocation"), null);
    }

    public <O extends Record> Allocation(Table<O> child, ForeignKey<O, AllocationRecord> key) {
        super(child, key, ALLOCATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<AllocationRecord> getPrimaryKey() {
        return Keys.COMPOSITE_ID;
    }

    @Override
    public List<ForeignKey<AllocationRecord, ?>> getReferences() {
        return Arrays.asList(Keys.ALLOCATION__ALLOCATION_CATEGORY_ID_FKEY);
    }

    private transient Category _category;

    /**
     * Get the implicit join path to the <code>public.category</code> table.
     */
    public Category category() {
        if (_category == null)
            _category = new Category(this, Keys.ALLOCATION__ALLOCATION_CATEGORY_ID_FKEY);

        return _category;
    }

    @Override
    public List<Check<AllocationRecord>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("no_invalid_month_allocation"), "(((month % 100) < 13))", true),
            Internal.createCheck(this, DSL.name("no_negative_month_allocation"), "(((month % 100) > 0))", true)
        );
    }

    @Override
    public Allocation as(String alias) {
        return new Allocation(DSL.name(alias), this);
    }

    @Override
    public Allocation as(Name alias) {
        return new Allocation(alias, this);
    }

    @Override
    public Allocation as(Table<?> alias) {
        return new Allocation(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Allocation rename(String name) {
        return new Allocation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Allocation rename(Name name) {
        return new Allocation(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Allocation rename(Table<?> name) {
        return new Allocation(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
