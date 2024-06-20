/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.records;


import open.tresorier.generated.jooq.test.information_schema.tables.Roles;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RolesRecord extends TableRecordImpl<RolesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>INFORMATION_SCHEMA.ROLES.ROLE_NAME</code>.
     */
    public RolesRecord setRoleName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ROLES.ROLE_NAME</code>.
     */
    public String getRoleName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.ROLES.REMARKS</code>.
     */
    public RolesRecord setRemarks(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ROLES.REMARKS</code>.
     */
    public String getRemarks() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RolesRecord
     */
    public RolesRecord() {
        super(Roles.ROLES);
    }

    /**
     * Create a detached, initialised RolesRecord
     */
    public RolesRecord(String roleName, String remarks) {
        super(Roles.ROLES);

        setRoleName(roleName);
        setRemarks(remarks);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised RolesRecord
     */
    public RolesRecord(open.tresorier.generated.jooq.test.information_schema.tables.pojos.Roles value) {
        super(Roles.ROLES);

        if (value != null) {
            setRoleName(value.getRoleName());
            setRemarks(value.getRemarks());
            resetChangedOnNotNull();
        }
    }
}