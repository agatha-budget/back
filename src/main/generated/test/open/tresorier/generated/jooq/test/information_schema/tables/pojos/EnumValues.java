/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EnumValues implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String objectCatalog;
    private final String objectSchema;
    private final String objectName;
    private final String objectType;
    private final String enumIdentifier;
    private final String valueName;
    private final String valueOrdinal;

    public EnumValues(EnumValues value) {
        this.objectCatalog = value.objectCatalog;
        this.objectSchema = value.objectSchema;
        this.objectName = value.objectName;
        this.objectType = value.objectType;
        this.enumIdentifier = value.enumIdentifier;
        this.valueName = value.valueName;
        this.valueOrdinal = value.valueOrdinal;
    }

    public EnumValues(
        String objectCatalog,
        String objectSchema,
        String objectName,
        String objectType,
        String enumIdentifier,
        String valueName,
        String valueOrdinal
    ) {
        this.objectCatalog = objectCatalog;
        this.objectSchema = objectSchema;
        this.objectName = objectName;
        this.objectType = objectType;
        this.enumIdentifier = enumIdentifier;
        this.valueName = valueName;
        this.valueOrdinal = valueOrdinal;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ENUM_VALUES.OBJECT_CATALOG</code>.
     */
    public String getObjectCatalog() {
        return this.objectCatalog;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ENUM_VALUES.OBJECT_SCHEMA</code>.
     */
    public String getObjectSchema() {
        return this.objectSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ENUM_VALUES.OBJECT_NAME</code>.
     */
    public String getObjectName() {
        return this.objectName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ENUM_VALUES.OBJECT_TYPE</code>.
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ENUM_VALUES.ENUM_IDENTIFIER</code>.
     */
    public String getEnumIdentifier() {
        return this.enumIdentifier;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ENUM_VALUES.VALUE_NAME</code>.
     */
    public String getValueName() {
        return this.valueName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ENUM_VALUES.VALUE_ORDINAL</code>.
     */
    public String getValueOrdinal() {
        return this.valueOrdinal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EnumValues other = (EnumValues) obj;
        if (this.objectCatalog == null) {
            if (other.objectCatalog != null)
                return false;
        }
        else if (!this.objectCatalog.equals(other.objectCatalog))
            return false;
        if (this.objectSchema == null) {
            if (other.objectSchema != null)
                return false;
        }
        else if (!this.objectSchema.equals(other.objectSchema))
            return false;
        if (this.objectName == null) {
            if (other.objectName != null)
                return false;
        }
        else if (!this.objectName.equals(other.objectName))
            return false;
        if (this.objectType == null) {
            if (other.objectType != null)
                return false;
        }
        else if (!this.objectType.equals(other.objectType))
            return false;
        if (this.enumIdentifier == null) {
            if (other.enumIdentifier != null)
                return false;
        }
        else if (!this.enumIdentifier.equals(other.enumIdentifier))
            return false;
        if (this.valueName == null) {
            if (other.valueName != null)
                return false;
        }
        else if (!this.valueName.equals(other.valueName))
            return false;
        if (this.valueOrdinal == null) {
            if (other.valueOrdinal != null)
                return false;
        }
        else if (!this.valueOrdinal.equals(other.valueOrdinal))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.objectCatalog == null) ? 0 : this.objectCatalog.hashCode());
        result = prime * result + ((this.objectSchema == null) ? 0 : this.objectSchema.hashCode());
        result = prime * result + ((this.objectName == null) ? 0 : this.objectName.hashCode());
        result = prime * result + ((this.objectType == null) ? 0 : this.objectType.hashCode());
        result = prime * result + ((this.enumIdentifier == null) ? 0 : this.enumIdentifier.hashCode());
        result = prime * result + ((this.valueName == null) ? 0 : this.valueName.hashCode());
        result = prime * result + ((this.valueOrdinal == null) ? 0 : this.valueOrdinal.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EnumValues (");

        sb.append(objectCatalog);
        sb.append(", ").append(objectSchema);
        sb.append(", ").append(objectName);
        sb.append(", ").append(objectType);
        sb.append(", ").append(enumIdentifier);
        sb.append(", ").append(valueName);
        sb.append(", ").append(valueOrdinal);

        sb.append(")");
        return sb.toString();
    }
}
