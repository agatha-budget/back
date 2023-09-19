/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables;


import java.util.function.Function;

import open.tresorier.generated.jooq.main.Keys;
import open.tresorier.generated.jooq.main.Public;
import open.tresorier.generated.jooq.main.tables.records.UserActivityRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
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
public class UserActivity extends TableImpl<UserActivityRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.user_activity</code>
     */
    public static final UserActivity USER_ACTIVITY = new UserActivity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserActivityRecord> getRecordType() {
        return UserActivityRecord.class;
    }

    /**
     * The column <code>public.user_activity.id</code>.
     */
    public final TableField<UserActivityRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.user_activity.user_id</code>.
     */
    public final TableField<UserActivityRecord, String> USER_ID = createField(DSL.name("user_id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.user_activity.date</code>.
     */
    public final TableField<UserActivityRecord, Long> DATE = createField(DSL.name("date"), SQLDataType.BIGINT.defaultValue(DSL.field(DSL.raw("0"), SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.user_activity.action</code>.
     */
    public final TableField<UserActivityRecord, String> ACTION = createField(DSL.name("action"), SQLDataType.VARCHAR(36).nullable(false).defaultValue(DSL.field(DSL.raw("'ACTION_LOGIN'::character varying"), SQLDataType.VARCHAR)), this, "");

    private UserActivity(Name alias, Table<UserActivityRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserActivity(Name alias, Table<UserActivityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.user_activity</code> table reference
     */
    public UserActivity(String alias) {
        this(DSL.name(alias), USER_ACTIVITY);
    }

    /**
     * Create an aliased <code>public.user_activity</code> table reference
     */
    public UserActivity(Name alias) {
        this(alias, USER_ACTIVITY);
    }

    /**
     * Create a <code>public.user_activity</code> table reference
     */
    public UserActivity() {
        this(DSL.name("user_activity"), null);
    }

    public <O extends Record> UserActivity(Table<O> child, ForeignKey<O, UserActivityRecord> key) {
        super(child, key, USER_ACTIVITY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<UserActivityRecord> getPrimaryKey() {
        return Keys.USER_ACTIVITY_PKEY;
    }

    @Override
    public UserActivity as(String alias) {
        return new UserActivity(DSL.name(alias), this);
    }

    @Override
    public UserActivity as(Name alias) {
        return new UserActivity(alias, this);
    }

    @Override
    public UserActivity as(Table<?> alias) {
        return new UserActivity(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserActivity rename(String name) {
        return new UserActivity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserActivity rename(Name name) {
        return new UserActivity(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserActivity rename(Table<?> name) {
        return new UserActivity(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, Long, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super String, ? super Long, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super String, ? super Long, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
