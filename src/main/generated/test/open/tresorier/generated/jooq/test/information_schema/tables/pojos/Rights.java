/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Rights implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String grantee;
    private final String granteetype;
    private final String grantedrole;
    private final String rights;
    private final String tableSchema;
    private final String tableName;

    public Rights(Rights value) {
        this.grantee = value.grantee;
        this.granteetype = value.granteetype;
        this.grantedrole = value.grantedrole;
        this.rights = value.rights;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
    }

    public Rights(
        String grantee,
        String granteetype,
        String grantedrole,
        String rights,
        String tableSchema,
        String tableName
    ) {
        this.grantee = grantee;
        this.granteetype = granteetype;
        this.grantedrole = grantedrole;
        this.rights = rights;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.RIGHTS.GRANTEE</code>.
     */
    public String getGrantee() {
        return this.grantee;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.RIGHTS.GRANTEETYPE</code>.
     */
    public String getGranteetype() {
        return this.granteetype;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.RIGHTS.GRANTEDROLE</code>.
     */
    public String getGrantedrole() {
        return this.grantedrole;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.RIGHTS.RIGHTS</code>.
     */
    public String getRights() {
        return this.rights;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.RIGHTS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.RIGHTS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Rights other = (Rights) obj;
        if (this.grantee == null) {
            if (other.grantee != null)
                return false;
        }
        else if (!this.grantee.equals(other.grantee))
            return false;
        if (this.granteetype == null) {
            if (other.granteetype != null)
                return false;
        }
        else if (!this.granteetype.equals(other.granteetype))
            return false;
        if (this.grantedrole == null) {
            if (other.grantedrole != null)
                return false;
        }
        else if (!this.grantedrole.equals(other.grantedrole))
            return false;
        if (this.rights == null) {
            if (other.rights != null)
                return false;
        }
        else if (!this.rights.equals(other.rights))
            return false;
        if (this.tableSchema == null) {
            if (other.tableSchema != null)
                return false;
        }
        else if (!this.tableSchema.equals(other.tableSchema))
            return false;
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.grantee == null) ? 0 : this.grantee.hashCode());
        result = prime * result + ((this.granteetype == null) ? 0 : this.granteetype.hashCode());
        result = prime * result + ((this.grantedrole == null) ? 0 : this.grantedrole.hashCode());
        result = prime * result + ((this.rights == null) ? 0 : this.rights.hashCode());
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Rights (");

        sb.append(grantee);
        sb.append(", ").append(granteetype);
        sb.append(", ").append(grantedrole);
        sb.append(", ").append(rights);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);

        sb.append(")");
        return sb.toString();
    }
}
