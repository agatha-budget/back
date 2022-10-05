/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables;


import java.util.Arrays;
import java.util.List;

import open.tresorier.generated.jooq.main.Keys;
import open.tresorier.generated.jooq.main.Public;
import open.tresorier.generated.jooq.main.tables.records.MasterCategoryRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MasterCategory extends TableImpl<MasterCategoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.master_category</code>
     */
    public static final MasterCategory MASTER_CATEGORY = new MasterCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MasterCategoryRecord> getRecordType() {
        return MasterCategoryRecord.class;
    }

    /**
     * The column <code>public.master_category.id</code>.
     */
    public final TableField<MasterCategoryRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.master_category.budget_id</code>.
     */
    public final TableField<MasterCategoryRecord, String> BUDGET_ID = createField(DSL.name("budget_id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.master_category.name</code>.
     */
    public final TableField<MasterCategoryRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.master_category.deleted</code>.
     */
    public final TableField<MasterCategoryRecord, Boolean> DELETED = createField(DSL.name("deleted"), SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.master_category.color</code>.
     */
    public final TableField<MasterCategoryRecord, String> COLOR = createField(DSL.name("color"), SQLDataType.VARCHAR(36).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    private MasterCategory(Name alias, Table<MasterCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private MasterCategory(Name alias, Table<MasterCategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.master_category</code> table reference
     */
    public MasterCategory(String alias) {
        this(DSL.name(alias), MASTER_CATEGORY);
    }

    /**
     * Create an aliased <code>public.master_category</code> table reference
     */
    public MasterCategory(Name alias) {
        this(alias, MASTER_CATEGORY);
    }

    /**
     * Create a <code>public.master_category</code> table reference
     */
    public MasterCategory() {
        this(DSL.name("master_category"), null);
    }

    public <O extends Record> MasterCategory(Table<O> child, ForeignKey<O, MasterCategoryRecord> key) {
        super(child, key, MASTER_CATEGORY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<MasterCategoryRecord> getPrimaryKey() {
        return Keys.MASTER_CATEGORY_PKEY;
    }

    @Override
    public List<ForeignKey<MasterCategoryRecord, ?>> getReferences() {
        return Arrays.asList(Keys.MASTER_CATEGORY__MASTER_CATEGORY_BUDGET_ID_FKEY);
    }

    private transient Budget _budget;

    /**
     * Get the implicit join path to the <code>public.budget</code> table.
     */
    public Budget budget() {
        if (_budget == null)
            _budget = new Budget(this, Keys.MASTER_CATEGORY__MASTER_CATEGORY_BUDGET_ID_FKEY);

        return _budget;
    }

    @Override
    public MasterCategory as(String alias) {
        return new MasterCategory(DSL.name(alias), this);
    }

    @Override
    public MasterCategory as(Name alias) {
        return new MasterCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MasterCategory rename(String name) {
        return new MasterCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MasterCategory rename(Name name) {
        return new MasterCategory(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, Boolean, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
