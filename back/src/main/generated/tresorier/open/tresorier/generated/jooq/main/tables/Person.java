/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import open.tresorier.generated.jooq.main.Keys;
import open.tresorier.generated.jooq.main.Public;
import open.tresorier.generated.jooq.main.tables.Budget.BudgetPath;
import open.tresorier.generated.jooq.main.tables.records.PersonRecord;

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
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Person extends TableImpl<PersonRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.person</code>
     */
    public static final Person PERSON = new Person();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PersonRecord> getRecordType() {
        return PersonRecord.class;
    }

    /**
     * The column <code>public.person.id</code>.
     */
    public final TableField<PersonRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.person.email</code>.
     */
    public final TableField<PersonRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.person.name</code>.
     */
    public final TableField<PersonRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.person.password</code>.
     */
    public final TableField<PersonRecord, String> PASSWORD = createField(DSL.name("password"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.person.unlockingdate</code>.
     */
    public final TableField<PersonRecord, Long> UNLOCKINGDATE = createField(DSL.name("unlockingdate"), SQLDataType.BIGINT.defaultValue(DSL.field(DSL.raw("0"), SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.person.loginattemptcount</code>.
     */
    public final TableField<PersonRecord, Integer> LOGINATTEMPTCOUNT = createField(DSL.name("loginattemptcount"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.person.deleted</code>.
     */
    public final TableField<PersonRecord, Boolean> DELETED = createField(DSL.name("deleted"), SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.person.billing_id</code>.
     */
    public final TableField<PersonRecord, String> BILLING_ID = createField(DSL.name("billing_id"), SQLDataType.VARCHAR(36).defaultValue(DSL.field(DSL.raw("NULL::character varying"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.person.billing_status</code>.
     */
    public final TableField<PersonRecord, Boolean> BILLING_STATUS = createField(DSL.name("billing_status"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.person.creation_date</code>.
     */
    public final TableField<PersonRecord, Long> CREATION_DATE = createField(DSL.name("creation_date"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'1640995200000'::bigint"), SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.person.style</code>.
     */
    public final TableField<PersonRecord, String> STYLE = createField(DSL.name("style"), SQLDataType.VARCHAR(36).defaultValue(DSL.field(DSL.raw("NULL::character varying"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.person.dyslexia</code>.
     */
    public final TableField<PersonRecord, Boolean> DYSLEXIA = createField(DSL.name("dyslexia"), SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "");

    private Person(Name alias, Table<PersonRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Person(Name alias, Table<PersonRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.person</code> table reference
     */
    public Person(String alias) {
        this(DSL.name(alias), PERSON);
    }

    /**
     * Create an aliased <code>public.person</code> table reference
     */
    public Person(Name alias) {
        this(alias, PERSON);
    }

    /**
     * Create a <code>public.person</code> table reference
     */
    public Person() {
        this(DSL.name("person"), null);
    }

    public <O extends Record> Person(Table<O> path, ForeignKey<O, PersonRecord> childPath, InverseForeignKey<O, PersonRecord> parentPath) {
        super(path, childPath, parentPath, PERSON);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class PersonPath extends Person implements Path<PersonRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> PersonPath(Table<O> path, ForeignKey<O, PersonRecord> childPath, InverseForeignKey<O, PersonRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private PersonPath(Name alias, Table<PersonRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public PersonPath as(String alias) {
            return new PersonPath(DSL.name(alias), this);
        }

        @Override
        public PersonPath as(Name alias) {
            return new PersonPath(alias, this);
        }

        @Override
        public PersonPath as(Table<?> alias) {
            return new PersonPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<PersonRecord> getPrimaryKey() {
        return Keys.PERSON_PKEY;
    }

    @Override
    public List<UniqueKey<PersonRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PERSON_EMAIL_KEY, Keys.PERSON_BILLING_ID_KEY);
    }

    private transient BudgetPath _budget;

    /**
     * Get the implicit to-many join path to the <code>public.budget</code>
     * table
     */
    public BudgetPath budget() {
        if (_budget == null)
            _budget = new BudgetPath(this, null, Keys.BUDGET__BUDGET_PERSON_ID_FKEY.getInverseKey());

        return _budget;
    }

    @Override
    public Person as(String alias) {
        return new Person(DSL.name(alias), this);
    }

    @Override
    public Person as(Name alias) {
        return new Person(alias, this);
    }

    @Override
    public Person as(Table<?> alias) {
        return new Person(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Person rename(String name) {
        return new Person(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Person rename(Name name) {
        return new Person(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Person rename(Table<?> name) {
        return new Person(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Person where(Condition condition) {
        return new Person(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Person where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Person where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Person where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Person where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Person where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Person where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Person where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Person whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Person whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}