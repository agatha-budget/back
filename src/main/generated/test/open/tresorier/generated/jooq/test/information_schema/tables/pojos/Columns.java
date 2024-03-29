/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Columns implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final String columnName;
    private final Integer ordinalPosition;
    private final String columnDefault;
    private final String isNullable;
    private final String dataType;
    private final Long characterMaximumLength;
    private final Long characterOctetLength;
    private final Integer numericPrecision;
    private final Integer numericPrecisionRadix;
    private final Integer numericScale;
    private final Integer datetimePrecision;
    private final String intervalType;
    private final Integer intervalPrecision;
    private final String characterSetCatalog;
    private final String characterSetSchema;
    private final String characterSetName;
    private final String collationCatalog;
    private final String collationSchema;
    private final String collationName;
    private final String domainCatalog;
    private final String domainSchema;
    private final String domainName;
    private final Integer maximumCardinality;
    private final String dtdIdentifier;
    private final String isIdentity;
    private final String identityGeneration;
    private final Long identityStart;
    private final Long identityIncrement;
    private final Long identityMaximum;
    private final Long identityMinimum;
    private final String identityCycle;
    private final String isGenerated;
    private final String generationExpression;
    private final String declaredDataType;
    private final Integer declaredNumericPrecision;
    private final Integer declaredNumericScale;
    private final String geometryType;
    private final Integer geometrySrid;
    private final Long identityBase;
    private final Long identityCache;
    private final String columnOnUpdate;
    private final Boolean isVisible;
    private final Boolean defaultOnNull;
    private final Integer selectivity;
    private final String remarks;

    public Columns(Columns value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.columnName = value.columnName;
        this.ordinalPosition = value.ordinalPosition;
        this.columnDefault = value.columnDefault;
        this.isNullable = value.isNullable;
        this.dataType = value.dataType;
        this.characterMaximumLength = value.characterMaximumLength;
        this.characterOctetLength = value.characterOctetLength;
        this.numericPrecision = value.numericPrecision;
        this.numericPrecisionRadix = value.numericPrecisionRadix;
        this.numericScale = value.numericScale;
        this.datetimePrecision = value.datetimePrecision;
        this.intervalType = value.intervalType;
        this.intervalPrecision = value.intervalPrecision;
        this.characterSetCatalog = value.characterSetCatalog;
        this.characterSetSchema = value.characterSetSchema;
        this.characterSetName = value.characterSetName;
        this.collationCatalog = value.collationCatalog;
        this.collationSchema = value.collationSchema;
        this.collationName = value.collationName;
        this.domainCatalog = value.domainCatalog;
        this.domainSchema = value.domainSchema;
        this.domainName = value.domainName;
        this.maximumCardinality = value.maximumCardinality;
        this.dtdIdentifier = value.dtdIdentifier;
        this.isIdentity = value.isIdentity;
        this.identityGeneration = value.identityGeneration;
        this.identityStart = value.identityStart;
        this.identityIncrement = value.identityIncrement;
        this.identityMaximum = value.identityMaximum;
        this.identityMinimum = value.identityMinimum;
        this.identityCycle = value.identityCycle;
        this.isGenerated = value.isGenerated;
        this.generationExpression = value.generationExpression;
        this.declaredDataType = value.declaredDataType;
        this.declaredNumericPrecision = value.declaredNumericPrecision;
        this.declaredNumericScale = value.declaredNumericScale;
        this.geometryType = value.geometryType;
        this.geometrySrid = value.geometrySrid;
        this.identityBase = value.identityBase;
        this.identityCache = value.identityCache;
        this.columnOnUpdate = value.columnOnUpdate;
        this.isVisible = value.isVisible;
        this.defaultOnNull = value.defaultOnNull;
        this.selectivity = value.selectivity;
        this.remarks = value.remarks;
    }

    public Columns(
        String tableCatalog,
        String tableSchema,
        String tableName,
        String columnName,
        Integer ordinalPosition,
        String columnDefault,
        String isNullable,
        String dataType,
        Long characterMaximumLength,
        Long characterOctetLength,
        Integer numericPrecision,
        Integer numericPrecisionRadix,
        Integer numericScale,
        Integer datetimePrecision,
        String intervalType,
        Integer intervalPrecision,
        String characterSetCatalog,
        String characterSetSchema,
        String characterSetName,
        String collationCatalog,
        String collationSchema,
        String collationName,
        String domainCatalog,
        String domainSchema,
        String domainName,
        Integer maximumCardinality,
        String dtdIdentifier,
        String isIdentity,
        String identityGeneration,
        Long identityStart,
        Long identityIncrement,
        Long identityMaximum,
        Long identityMinimum,
        String identityCycle,
        String isGenerated,
        String generationExpression,
        String declaredDataType,
        Integer declaredNumericPrecision,
        Integer declaredNumericScale,
        String geometryType,
        Integer geometrySrid,
        Long identityBase,
        Long identityCache,
        String columnOnUpdate,
        Boolean isVisible,
        Boolean defaultOnNull,
        Integer selectivity,
        String remarks
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.columnName = columnName;
        this.ordinalPosition = ordinalPosition;
        this.columnDefault = columnDefault;
        this.isNullable = isNullable;
        this.dataType = dataType;
        this.characterMaximumLength = characterMaximumLength;
        this.characterOctetLength = characterOctetLength;
        this.numericPrecision = numericPrecision;
        this.numericPrecisionRadix = numericPrecisionRadix;
        this.numericScale = numericScale;
        this.datetimePrecision = datetimePrecision;
        this.intervalType = intervalType;
        this.intervalPrecision = intervalPrecision;
        this.characterSetCatalog = characterSetCatalog;
        this.characterSetSchema = characterSetSchema;
        this.characterSetName = characterSetName;
        this.collationCatalog = collationCatalog;
        this.collationSchema = collationSchema;
        this.collationName = collationName;
        this.domainCatalog = domainCatalog;
        this.domainSchema = domainSchema;
        this.domainName = domainName;
        this.maximumCardinality = maximumCardinality;
        this.dtdIdentifier = dtdIdentifier;
        this.isIdentity = isIdentity;
        this.identityGeneration = identityGeneration;
        this.identityStart = identityStart;
        this.identityIncrement = identityIncrement;
        this.identityMaximum = identityMaximum;
        this.identityMinimum = identityMinimum;
        this.identityCycle = identityCycle;
        this.isGenerated = isGenerated;
        this.generationExpression = generationExpression;
        this.declaredDataType = declaredDataType;
        this.declaredNumericPrecision = declaredNumericPrecision;
        this.declaredNumericScale = declaredNumericScale;
        this.geometryType = geometryType;
        this.geometrySrid = geometrySrid;
        this.identityBase = identityBase;
        this.identityCache = identityCache;
        this.columnOnUpdate = columnOnUpdate;
        this.isVisible = isVisible;
        this.defaultOnNull = defaultOnNull;
        this.selectivity = selectivity;
        this.remarks = remarks;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.ORDINAL_POSITION</code>.
     */
    public Integer getOrdinalPosition() {
        return this.ordinalPosition;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_DEFAULT</code>.
     */
    public String getColumnDefault() {
        return this.columnDefault;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.IS_NULLABLE</code>.
     */
    public String getIsNullable() {
        return this.isNullable;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.DATA_TYPE</code>.
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public Long getCharacterMaximumLength() {
        return this.characterMaximumLength;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_OCTET_LENGTH</code>.
     */
    public Long getCharacterOctetLength() {
        return this.characterOctetLength;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_PRECISION</code>.
     */
    public Integer getNumericPrecision() {
        return this.numericPrecision;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_PRECISION_RADIX</code>.
     */
    public Integer getNumericPrecisionRadix() {
        return this.numericPrecisionRadix;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_SCALE</code>.
     */
    public Integer getNumericScale() {
        return this.numericScale;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.DATETIME_PRECISION</code>.
     */
    public Integer getDatetimePrecision() {
        return this.datetimePrecision;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.INTERVAL_TYPE</code>.
     */
    public String getIntervalType() {
        return this.intervalType;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.INTERVAL_PRECISION</code>.
     */
    public Integer getIntervalPrecision() {
        return this.intervalPrecision;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_SET_CATALOG</code>.
     */
    public String getCharacterSetCatalog() {
        return this.characterSetCatalog;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_SET_SCHEMA</code>.
     */
    public String getCharacterSetSchema() {
        return this.characterSetSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_SET_NAME</code>.
     */
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.COLLATION_CATALOG</code>.
     */
    public String getCollationCatalog() {
        return this.collationCatalog;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.COLLATION_SCHEMA</code>.
     */
    public String getCollationSchema() {
        return this.collationSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.COLLATION_NAME</code>.
     */
    public String getCollationName() {
        return this.collationName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.DOMAIN_CATALOG</code>.
     */
    public String getDomainCatalog() {
        return this.domainCatalog;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.DOMAIN_SCHEMA</code>.
     */
    public String getDomainSchema() {
        return this.domainSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.DOMAIN_NAME</code>.
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.MAXIMUM_CARDINALITY</code>.
     */
    public Integer getMaximumCardinality() {
        return this.maximumCardinality;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.DTD_IDENTIFIER</code>.
     */
    public String getDtdIdentifier() {
        return this.dtdIdentifier;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.IS_IDENTITY</code>.
     */
    public String getIsIdentity() {
        return this.isIdentity;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_GENERATION</code>.
     */
    public String getIdentityGeneration() {
        return this.identityGeneration;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_START</code>.
     */
    public Long getIdentityStart() {
        return this.identityStart;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_INCREMENT</code>.
     */
    public Long getIdentityIncrement() {
        return this.identityIncrement;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_MAXIMUM</code>.
     */
    public Long getIdentityMaximum() {
        return this.identityMaximum;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_MINIMUM</code>.
     */
    public Long getIdentityMinimum() {
        return this.identityMinimum;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_CYCLE</code>.
     */
    public String getIdentityCycle() {
        return this.identityCycle;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.IS_GENERATED</code>.
     */
    public String getIsGenerated() {
        return this.isGenerated;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.GENERATION_EXPRESSION</code>.
     */
    public String getGenerationExpression() {
        return this.generationExpression;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.DECLARED_DATA_TYPE</code>.
     */
    public String getDeclaredDataType() {
        return this.declaredDataType;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.COLUMNS.DECLARED_NUMERIC_PRECISION</code>.
     */
    public Integer getDeclaredNumericPrecision() {
        return this.declaredNumericPrecision;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.COLUMNS.DECLARED_NUMERIC_SCALE</code>.
     */
    public Integer getDeclaredNumericScale() {
        return this.declaredNumericScale;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.GEOMETRY_TYPE</code>.
     */
    public String getGeometryType() {
        return this.geometryType;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.GEOMETRY_SRID</code>.
     */
    public Integer getGeometrySrid() {
        return this.geometrySrid;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_BASE</code>.
     */
    public Long getIdentityBase() {
        return this.identityBase;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.IDENTITY_CACHE</code>.
     */
    public Long getIdentityCache() {
        return this.identityCache;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_ON_UPDATE</code>.
     */
    public String getColumnOnUpdate() {
        return this.columnOnUpdate;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.IS_VISIBLE</code>.
     */
    public Boolean getIsVisible() {
        return this.isVisible;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.DEFAULT_ON_NULL</code>.
     */
    public Boolean getDefaultOnNull() {
        return this.defaultOnNull;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.SELECTIVITY</code>.
     */
    public Integer getSelectivity() {
        return this.selectivity;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.REMARKS</code>.
     */
    public String getRemarks() {
        return this.remarks;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Columns other = (Columns) obj;
        if (this.tableCatalog == null) {
            if (other.tableCatalog != null)
                return false;
        }
        else if (!this.tableCatalog.equals(other.tableCatalog))
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
        if (this.columnName == null) {
            if (other.columnName != null)
                return false;
        }
        else if (!this.columnName.equals(other.columnName))
            return false;
        if (this.ordinalPosition == null) {
            if (other.ordinalPosition != null)
                return false;
        }
        else if (!this.ordinalPosition.equals(other.ordinalPosition))
            return false;
        if (this.columnDefault == null) {
            if (other.columnDefault != null)
                return false;
        }
        else if (!this.columnDefault.equals(other.columnDefault))
            return false;
        if (this.isNullable == null) {
            if (other.isNullable != null)
                return false;
        }
        else if (!this.isNullable.equals(other.isNullable))
            return false;
        if (this.dataType == null) {
            if (other.dataType != null)
                return false;
        }
        else if (!this.dataType.equals(other.dataType))
            return false;
        if (this.characterMaximumLength == null) {
            if (other.characterMaximumLength != null)
                return false;
        }
        else if (!this.characterMaximumLength.equals(other.characterMaximumLength))
            return false;
        if (this.characterOctetLength == null) {
            if (other.characterOctetLength != null)
                return false;
        }
        else if (!this.characterOctetLength.equals(other.characterOctetLength))
            return false;
        if (this.numericPrecision == null) {
            if (other.numericPrecision != null)
                return false;
        }
        else if (!this.numericPrecision.equals(other.numericPrecision))
            return false;
        if (this.numericPrecisionRadix == null) {
            if (other.numericPrecisionRadix != null)
                return false;
        }
        else if (!this.numericPrecisionRadix.equals(other.numericPrecisionRadix))
            return false;
        if (this.numericScale == null) {
            if (other.numericScale != null)
                return false;
        }
        else if (!this.numericScale.equals(other.numericScale))
            return false;
        if (this.datetimePrecision == null) {
            if (other.datetimePrecision != null)
                return false;
        }
        else if (!this.datetimePrecision.equals(other.datetimePrecision))
            return false;
        if (this.intervalType == null) {
            if (other.intervalType != null)
                return false;
        }
        else if (!this.intervalType.equals(other.intervalType))
            return false;
        if (this.intervalPrecision == null) {
            if (other.intervalPrecision != null)
                return false;
        }
        else if (!this.intervalPrecision.equals(other.intervalPrecision))
            return false;
        if (this.characterSetCatalog == null) {
            if (other.characterSetCatalog != null)
                return false;
        }
        else if (!this.characterSetCatalog.equals(other.characterSetCatalog))
            return false;
        if (this.characterSetSchema == null) {
            if (other.characterSetSchema != null)
                return false;
        }
        else if (!this.characterSetSchema.equals(other.characterSetSchema))
            return false;
        if (this.characterSetName == null) {
            if (other.characterSetName != null)
                return false;
        }
        else if (!this.characterSetName.equals(other.characterSetName))
            return false;
        if (this.collationCatalog == null) {
            if (other.collationCatalog != null)
                return false;
        }
        else if (!this.collationCatalog.equals(other.collationCatalog))
            return false;
        if (this.collationSchema == null) {
            if (other.collationSchema != null)
                return false;
        }
        else if (!this.collationSchema.equals(other.collationSchema))
            return false;
        if (this.collationName == null) {
            if (other.collationName != null)
                return false;
        }
        else if (!this.collationName.equals(other.collationName))
            return false;
        if (this.domainCatalog == null) {
            if (other.domainCatalog != null)
                return false;
        }
        else if (!this.domainCatalog.equals(other.domainCatalog))
            return false;
        if (this.domainSchema == null) {
            if (other.domainSchema != null)
                return false;
        }
        else if (!this.domainSchema.equals(other.domainSchema))
            return false;
        if (this.domainName == null) {
            if (other.domainName != null)
                return false;
        }
        else if (!this.domainName.equals(other.domainName))
            return false;
        if (this.maximumCardinality == null) {
            if (other.maximumCardinality != null)
                return false;
        }
        else if (!this.maximumCardinality.equals(other.maximumCardinality))
            return false;
        if (this.dtdIdentifier == null) {
            if (other.dtdIdentifier != null)
                return false;
        }
        else if (!this.dtdIdentifier.equals(other.dtdIdentifier))
            return false;
        if (this.isIdentity == null) {
            if (other.isIdentity != null)
                return false;
        }
        else if (!this.isIdentity.equals(other.isIdentity))
            return false;
        if (this.identityGeneration == null) {
            if (other.identityGeneration != null)
                return false;
        }
        else if (!this.identityGeneration.equals(other.identityGeneration))
            return false;
        if (this.identityStart == null) {
            if (other.identityStart != null)
                return false;
        }
        else if (!this.identityStart.equals(other.identityStart))
            return false;
        if (this.identityIncrement == null) {
            if (other.identityIncrement != null)
                return false;
        }
        else if (!this.identityIncrement.equals(other.identityIncrement))
            return false;
        if (this.identityMaximum == null) {
            if (other.identityMaximum != null)
                return false;
        }
        else if (!this.identityMaximum.equals(other.identityMaximum))
            return false;
        if (this.identityMinimum == null) {
            if (other.identityMinimum != null)
                return false;
        }
        else if (!this.identityMinimum.equals(other.identityMinimum))
            return false;
        if (this.identityCycle == null) {
            if (other.identityCycle != null)
                return false;
        }
        else if (!this.identityCycle.equals(other.identityCycle))
            return false;
        if (this.isGenerated == null) {
            if (other.isGenerated != null)
                return false;
        }
        else if (!this.isGenerated.equals(other.isGenerated))
            return false;
        if (this.generationExpression == null) {
            if (other.generationExpression != null)
                return false;
        }
        else if (!this.generationExpression.equals(other.generationExpression))
            return false;
        if (this.declaredDataType == null) {
            if (other.declaredDataType != null)
                return false;
        }
        else if (!this.declaredDataType.equals(other.declaredDataType))
            return false;
        if (this.declaredNumericPrecision == null) {
            if (other.declaredNumericPrecision != null)
                return false;
        }
        else if (!this.declaredNumericPrecision.equals(other.declaredNumericPrecision))
            return false;
        if (this.declaredNumericScale == null) {
            if (other.declaredNumericScale != null)
                return false;
        }
        else if (!this.declaredNumericScale.equals(other.declaredNumericScale))
            return false;
        if (this.geometryType == null) {
            if (other.geometryType != null)
                return false;
        }
        else if (!this.geometryType.equals(other.geometryType))
            return false;
        if (this.geometrySrid == null) {
            if (other.geometrySrid != null)
                return false;
        }
        else if (!this.geometrySrid.equals(other.geometrySrid))
            return false;
        if (this.identityBase == null) {
            if (other.identityBase != null)
                return false;
        }
        else if (!this.identityBase.equals(other.identityBase))
            return false;
        if (this.identityCache == null) {
            if (other.identityCache != null)
                return false;
        }
        else if (!this.identityCache.equals(other.identityCache))
            return false;
        if (this.columnOnUpdate == null) {
            if (other.columnOnUpdate != null)
                return false;
        }
        else if (!this.columnOnUpdate.equals(other.columnOnUpdate))
            return false;
        if (this.isVisible == null) {
            if (other.isVisible != null)
                return false;
        }
        else if (!this.isVisible.equals(other.isVisible))
            return false;
        if (this.defaultOnNull == null) {
            if (other.defaultOnNull != null)
                return false;
        }
        else if (!this.defaultOnNull.equals(other.defaultOnNull))
            return false;
        if (this.selectivity == null) {
            if (other.selectivity != null)
                return false;
        }
        else if (!this.selectivity.equals(other.selectivity))
            return false;
        if (this.remarks == null) {
            if (other.remarks != null)
                return false;
        }
        else if (!this.remarks.equals(other.remarks))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tableCatalog == null) ? 0 : this.tableCatalog.hashCode());
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.columnName == null) ? 0 : this.columnName.hashCode());
        result = prime * result + ((this.ordinalPosition == null) ? 0 : this.ordinalPosition.hashCode());
        result = prime * result + ((this.columnDefault == null) ? 0 : this.columnDefault.hashCode());
        result = prime * result + ((this.isNullable == null) ? 0 : this.isNullable.hashCode());
        result = prime * result + ((this.dataType == null) ? 0 : this.dataType.hashCode());
        result = prime * result + ((this.characterMaximumLength == null) ? 0 : this.characterMaximumLength.hashCode());
        result = prime * result + ((this.characterOctetLength == null) ? 0 : this.characterOctetLength.hashCode());
        result = prime * result + ((this.numericPrecision == null) ? 0 : this.numericPrecision.hashCode());
        result = prime * result + ((this.numericPrecisionRadix == null) ? 0 : this.numericPrecisionRadix.hashCode());
        result = prime * result + ((this.numericScale == null) ? 0 : this.numericScale.hashCode());
        result = prime * result + ((this.datetimePrecision == null) ? 0 : this.datetimePrecision.hashCode());
        result = prime * result + ((this.intervalType == null) ? 0 : this.intervalType.hashCode());
        result = prime * result + ((this.intervalPrecision == null) ? 0 : this.intervalPrecision.hashCode());
        result = prime * result + ((this.characterSetCatalog == null) ? 0 : this.characterSetCatalog.hashCode());
        result = prime * result + ((this.characterSetSchema == null) ? 0 : this.characterSetSchema.hashCode());
        result = prime * result + ((this.characterSetName == null) ? 0 : this.characterSetName.hashCode());
        result = prime * result + ((this.collationCatalog == null) ? 0 : this.collationCatalog.hashCode());
        result = prime * result + ((this.collationSchema == null) ? 0 : this.collationSchema.hashCode());
        result = prime * result + ((this.collationName == null) ? 0 : this.collationName.hashCode());
        result = prime * result + ((this.domainCatalog == null) ? 0 : this.domainCatalog.hashCode());
        result = prime * result + ((this.domainSchema == null) ? 0 : this.domainSchema.hashCode());
        result = prime * result + ((this.domainName == null) ? 0 : this.domainName.hashCode());
        result = prime * result + ((this.maximumCardinality == null) ? 0 : this.maximumCardinality.hashCode());
        result = prime * result + ((this.dtdIdentifier == null) ? 0 : this.dtdIdentifier.hashCode());
        result = prime * result + ((this.isIdentity == null) ? 0 : this.isIdentity.hashCode());
        result = prime * result + ((this.identityGeneration == null) ? 0 : this.identityGeneration.hashCode());
        result = prime * result + ((this.identityStart == null) ? 0 : this.identityStart.hashCode());
        result = prime * result + ((this.identityIncrement == null) ? 0 : this.identityIncrement.hashCode());
        result = prime * result + ((this.identityMaximum == null) ? 0 : this.identityMaximum.hashCode());
        result = prime * result + ((this.identityMinimum == null) ? 0 : this.identityMinimum.hashCode());
        result = prime * result + ((this.identityCycle == null) ? 0 : this.identityCycle.hashCode());
        result = prime * result + ((this.isGenerated == null) ? 0 : this.isGenerated.hashCode());
        result = prime * result + ((this.generationExpression == null) ? 0 : this.generationExpression.hashCode());
        result = prime * result + ((this.declaredDataType == null) ? 0 : this.declaredDataType.hashCode());
        result = prime * result + ((this.declaredNumericPrecision == null) ? 0 : this.declaredNumericPrecision.hashCode());
        result = prime * result + ((this.declaredNumericScale == null) ? 0 : this.declaredNumericScale.hashCode());
        result = prime * result + ((this.geometryType == null) ? 0 : this.geometryType.hashCode());
        result = prime * result + ((this.geometrySrid == null) ? 0 : this.geometrySrid.hashCode());
        result = prime * result + ((this.identityBase == null) ? 0 : this.identityBase.hashCode());
        result = prime * result + ((this.identityCache == null) ? 0 : this.identityCache.hashCode());
        result = prime * result + ((this.columnOnUpdate == null) ? 0 : this.columnOnUpdate.hashCode());
        result = prime * result + ((this.isVisible == null) ? 0 : this.isVisible.hashCode());
        result = prime * result + ((this.defaultOnNull == null) ? 0 : this.defaultOnNull.hashCode());
        result = prime * result + ((this.selectivity == null) ? 0 : this.selectivity.hashCode());
        result = prime * result + ((this.remarks == null) ? 0 : this.remarks.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Columns (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(columnName);
        sb.append(", ").append(ordinalPosition);
        sb.append(", ").append(columnDefault);
        sb.append(", ").append(isNullable);
        sb.append(", ").append(dataType);
        sb.append(", ").append(characterMaximumLength);
        sb.append(", ").append(characterOctetLength);
        sb.append(", ").append(numericPrecision);
        sb.append(", ").append(numericPrecisionRadix);
        sb.append(", ").append(numericScale);
        sb.append(", ").append(datetimePrecision);
        sb.append(", ").append(intervalType);
        sb.append(", ").append(intervalPrecision);
        sb.append(", ").append(characterSetCatalog);
        sb.append(", ").append(characterSetSchema);
        sb.append(", ").append(characterSetName);
        sb.append(", ").append(collationCatalog);
        sb.append(", ").append(collationSchema);
        sb.append(", ").append(collationName);
        sb.append(", ").append(domainCatalog);
        sb.append(", ").append(domainSchema);
        sb.append(", ").append(domainName);
        sb.append(", ").append(maximumCardinality);
        sb.append(", ").append(dtdIdentifier);
        sb.append(", ").append(isIdentity);
        sb.append(", ").append(identityGeneration);
        sb.append(", ").append(identityStart);
        sb.append(", ").append(identityIncrement);
        sb.append(", ").append(identityMaximum);
        sb.append(", ").append(identityMinimum);
        sb.append(", ").append(identityCycle);
        sb.append(", ").append(isGenerated);
        sb.append(", ").append(generationExpression);
        sb.append(", ").append(declaredDataType);
        sb.append(", ").append(declaredNumericPrecision);
        sb.append(", ").append(declaredNumericScale);
        sb.append(", ").append(geometryType);
        sb.append(", ").append(geometrySrid);
        sb.append(", ").append(identityBase);
        sb.append(", ").append(identityCache);
        sb.append(", ").append(columnOnUpdate);
        sb.append(", ").append(isVisible);
        sb.append(", ").append(defaultOnNull);
        sb.append(", ").append(selectivity);
        sb.append(", ").append(remarks);

        sb.append(")");
        return sb.toString();
    }
}
