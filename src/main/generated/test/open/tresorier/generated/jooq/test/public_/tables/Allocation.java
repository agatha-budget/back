/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import open.tresorier.generated.jooq.test.public_.Keys;
import open.tresorier.generated.jooq.test.public_.Public;
import open.tresorier.generated.jooq.test.public_.tables.Category.CategoryPath;
import open.tresorier.generated.jooq.test.public_.tables.records.AllocationRecord;

import org.jooq.Check;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
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
     * The reference instance of <code>PUBLIC.ALLOCATION</code>
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
     * The column <code>PUBLIC.ALLOCATION.CATEGORY_ID</code>.
     */
    public final TableField<AllocationRecord, String> CATEGORY_ID = createField(DSL.name("CATEGORY_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ALLOCATION.DATE_MONTH</code>.
     */
    public final TableField<AllocationRecord, Integer> DATE_MONTH = createField(DSL.name("DATE_MONTH"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.ALLOCATION.AMOUNT</code>.
     */
    public final TableField<AllocationRecord, Integer> AMOUNT = createField(DSL.name("AMOUNT"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    private Allocation(Name alias, Table<AllocationRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Allocation(Name alias, Table<AllocationRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>PUBLIC.ALLOCATION</code> table reference
     */
    public Allocation(String alias) {
        this(DSL.name(alias), ALLOCATION);
    }

    /**
     * Create an aliased <code>PUBLIC.ALLOCATION</code> table reference
     */
    public Allocation(Name alias) {
        this(alias, ALLOCATION);
    }

    /**
     * Create a <code>PUBLIC.ALLOCATION</code> table reference
     */
    public Allocation() {
        this(DSL.name("ALLOCATION"), null);
    }

    public <O extends Record> Allocation(Table<O> path, ForeignKey<O, AllocationRecord> childPath, InverseForeignKey<O, AllocationRecord> parentPath) {
        super(path, childPath, parentPath, ALLOCATION);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class AllocationPath extends Allocation implements Path<AllocationRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> AllocationPath(Table<O> path, ForeignKey<O, AllocationRecord> childPath, InverseForeignKey<O, AllocationRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private AllocationPath(Name alias, Table<AllocationRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public AllocationPath as(String alias) {
            return new AllocationPath(DSL.name(alias), this);
        }

        @Override
        public AllocationPath as(Name alias) {
            return new AllocationPath(alias, this);
        }

        @Override
        public AllocationPath as(Table<?> alias) {
            return new AllocationPath(alias.getQualifiedName(), this);
        }
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
        return Arrays.asList(Keys.CONSTRAINT_A);
    }

    private transient CategoryPath _category;

    /**
     * Get the implicit join path to the <code>PUBLIC.CATEGORY</code> table.
     */
    public CategoryPath category() {
        if (_category == null)
            _category = new CategoryPath(this, Keys.CONSTRAINT_A, null);

        return _category;
    }

    @Override
    public List<Check<AllocationRecord>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("NO_INVALID_MONTH_ALLOCATION"), "MOD(\"DATE_MONTH\", 100) < 13", true),
            Internal.createCheck(this, DSL.name("NO_NEGATIVE_MONTH_ALLOCATION"), "MOD(\"DATE_MONTH\", 100) > 0", true)
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

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Allocation where(Condition condition) {
        return new Allocation(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Allocation where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Allocation where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Allocation where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Allocation where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Allocation where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Allocation where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Allocation where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Allocation whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Allocation whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
