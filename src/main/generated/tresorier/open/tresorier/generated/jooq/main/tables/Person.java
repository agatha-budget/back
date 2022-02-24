/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables;


import java.util.Arrays;
import java.util.List;

import open.tresorier.generated.jooq.main.Keys;
import open.tresorier.generated.jooq.main.Public;
import open.tresorier.generated.jooq.main.tables.records.PersonRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Person extends TableImpl<PersonRecord> {

    private static final long serialVersionUID = 540122192;

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
    public final TableField<PersonRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.person.email</code>.
     */
    public final TableField<PersonRecord, String> EMAIL = createField(DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.person.name</code>.
     */
    public final TableField<PersonRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.person.password</code>.
     */
    public final TableField<PersonRecord, String> PASSWORD = createField(DSL.name("password"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.person.unlockingdate</code>.
     */
    public final TableField<PersonRecord, Long> UNLOCKINGDATE = createField(DSL.name("unlockingdate"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.person.loginattemptcount</code>.
     */
    public final TableField<PersonRecord, Integer> LOGINATTEMPTCOUNT = createField(DSL.name("loginattemptcount"), org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.person.deleted</code>.
     */
    public final TableField<PersonRecord, Boolean> DELETED = createField(DSL.name("deleted"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.person.billing_id</code>.
     */
    public final TableField<PersonRecord, String> BILLING_ID = createField(DSL.name("billing_id"), org.jooq.impl.SQLDataType.VARCHAR(36).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.person.billing_status</code>.
     */
    public final TableField<PersonRecord, Boolean> BILLING_STATUS = createField(DSL.name("billing_status"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>public.person.creation_date</code>.
     */
    public final TableField<PersonRecord, Long> CREATION_DATE = createField(DSL.name("creation_date"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("'1640995200000'::bigint", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>public.person</code> table reference
     */
    public Person() {
        this(DSL.name("person"), null);
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

    private Person(Name alias, Table<PersonRecord> aliased) {
        this(alias, aliased, null);
    }

    private Person(Name alias, Table<PersonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Person(Table<O> child, ForeignKey<O, PersonRecord> key) {
        super(child, key, PERSON);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<PersonRecord> getPrimaryKey() {
        return Keys.PERSON_PKEY;
    }

    @Override
    public List<UniqueKey<PersonRecord>> getKeys() {
        return Arrays.<UniqueKey<PersonRecord>>asList(Keys.PERSON_PKEY, Keys.PERSON_EMAIL_KEY, Keys.PERSON_BILLING_ID_KEY);
    }

    @Override
    public Person as(String alias) {
        return new Person(DSL.name(alias), this);
    }

    @Override
    public Person as(Name alias) {
        return new Person(alias, this);
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

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, String, String, Long, Integer, Boolean, String, Boolean, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
