/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables;


import java.util.Arrays;
import java.util.List;

import open.tresorier.generated.jooq.main.Keys;
import open.tresorier.generated.jooq.main.Public;
import open.tresorier.generated.jooq.main.tables.records.BankAgreementRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class BankAgreement extends TableImpl<BankAgreementRecord> {

    private static final long serialVersionUID = -1198259849;

    /**
     * The reference instance of <code>public.bank_agreement</code>
     */
    public static final BankAgreement BANK_AGREEMENT = new BankAgreement();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BankAgreementRecord> getRecordType() {
        return BankAgreementRecord.class;
    }

    /**
     * The column <code>public.bank_agreement.id</code>.
     */
    public final TableField<BankAgreementRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.bank_agreement.person_id</code>.
     */
    public final TableField<BankAgreementRecord, String> PERSON_ID = createField(DSL.name("person_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.bank_agreement.bank_id</code>.
     */
    public final TableField<BankAgreementRecord, String> BANK_ID = createField(DSL.name("bank_id"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.bank_agreement.valid_until</code>.
     */
    public final TableField<BankAgreementRecord, Long> VALID_UNTIL = createField(DSL.name("valid_until"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.bank_agreement.nordigen_requisition_id</code>.
     */
    public final TableField<BankAgreementRecord, String> NORDIGEN_REQUISITION_ID = createField(DSL.name("nordigen_requisition_id"), org.jooq.impl.SQLDataType.VARCHAR(36).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.bank_agreement.archived</code>.
     */
    public final TableField<BankAgreementRecord, Boolean> ARCHIVED = createField(DSL.name("archived"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.bank_agreement.deleted</code>.
     */
    public final TableField<BankAgreementRecord, Boolean> DELETED = createField(DSL.name("deleted"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>public.bank_agreement</code> table reference
     */
    public BankAgreement() {
        this(DSL.name("bank_agreement"), null);
    }

    /**
     * Create an aliased <code>public.bank_agreement</code> table reference
     */
    public BankAgreement(String alias) {
        this(DSL.name(alias), BANK_AGREEMENT);
    }

    /**
     * Create an aliased <code>public.bank_agreement</code> table reference
     */
    public BankAgreement(Name alias) {
        this(alias, BANK_AGREEMENT);
    }

    private BankAgreement(Name alias, Table<BankAgreementRecord> aliased) {
        this(alias, aliased, null);
    }

    private BankAgreement(Name alias, Table<BankAgreementRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> BankAgreement(Table<O> child, ForeignKey<O, BankAgreementRecord> key) {
        super(child, key, BANK_AGREEMENT);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<BankAgreementRecord> getPrimaryKey() {
        return Keys.BANK_AGREEMENT_PKEY;
    }

    @Override
    public List<UniqueKey<BankAgreementRecord>> getKeys() {
        return Arrays.<UniqueKey<BankAgreementRecord>>asList(Keys.BANK_AGREEMENT_PKEY);
    }

    @Override
    public List<ForeignKey<BankAgreementRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BankAgreementRecord, ?>>asList(Keys.BANK_AGREEMENT__BANK_AGREEMENT_PERSON_ID_FKEY);
    }

    public Person person() {
        return new Person(this, Keys.BANK_AGREEMENT__BANK_AGREEMENT_PERSON_ID_FKEY);
    }

    @Override
    public BankAgreement as(String alias) {
        return new BankAgreement(DSL.name(alias), this);
    }

    @Override
    public BankAgreement as(Name alias) {
        return new BankAgreement(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BankAgreement rename(String name) {
        return new BankAgreement(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BankAgreement rename(Name name) {
        return new BankAgreement(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, Long, String, Boolean, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}