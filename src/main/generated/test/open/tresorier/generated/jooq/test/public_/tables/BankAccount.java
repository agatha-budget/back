/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables;


import java.util.Arrays;
import java.util.List;

import open.tresorier.generated.jooq.test.public_.Keys;
import open.tresorier.generated.jooq.test.public_.Public;
import open.tresorier.generated.jooq.test.public_.tables.records.BankAccountRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class BankAccount extends TableImpl<BankAccountRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>PUBLIC.BANK_ACCOUNT</code>
     */
    public static final BankAccount BANK_ACCOUNT = new BankAccount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BankAccountRecord> getRecordType() {
        return BankAccountRecord.class;
    }

    /**
     * The column <code>PUBLIC.BANK_ACCOUNT.ID</code>.
     */
    public final TableField<BankAccountRecord, String> ID = createField(DSL.name("ID"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BANK_ACCOUNT.NAME</code>.
     */
    public final TableField<BankAccountRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BANK_ACCOUNT.AGREEMENT_ID</code>.
     */
    public final TableField<BankAccountRecord, String> AGREEMENT_ID = createField(DSL.name("AGREEMENT_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BANK_ACCOUNT.DELETED</code>.
     */
    public final TableField<BankAccountRecord, Boolean> DELETED = createField(DSL.name("DELETED"), SQLDataType.BOOLEAN.defaultValue(DSL.field("FALSE", SQLDataType.BOOLEAN)), this, "");

    private BankAccount(Name alias, Table<BankAccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private BankAccount(Name alias, Table<BankAccountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>PUBLIC.BANK_ACCOUNT</code> table reference
     */
    public BankAccount(String alias) {
        this(DSL.name(alias), BANK_ACCOUNT);
    }

    /**
     * Create an aliased <code>PUBLIC.BANK_ACCOUNT</code> table reference
     */
    public BankAccount(Name alias) {
        this(alias, BANK_ACCOUNT);
    }

    /**
     * Create a <code>PUBLIC.BANK_ACCOUNT</code> table reference
     */
    public BankAccount() {
        this(DSL.name("BANK_ACCOUNT"), null);
    }

    public <O extends Record> BankAccount(Table<O> child, ForeignKey<O, BankAccountRecord> key) {
        super(child, key, BANK_ACCOUNT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<BankAccountRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_1;
    }

    @Override
    public List<ForeignKey<BankAccountRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CONSTRAINT_19);
    }

    private transient BankAgreement _bankAgreement;

    /**
     * Get the implicit join path to the <code>PUBLIC.BANK_AGREEMENT</code>
     * table.
     */
    public BankAgreement bankAgreement() {
        if (_bankAgreement == null)
            _bankAgreement = new BankAgreement(this, Keys.CONSTRAINT_19);

        return _bankAgreement;
    }

    @Override
    public BankAccount as(String alias) {
        return new BankAccount(DSL.name(alias), this);
    }

    @Override
    public BankAccount as(Name alias) {
        return new BankAccount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BankAccount rename(String name) {
        return new BankAccount(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BankAccount rename(Name name) {
        return new BankAccount(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
