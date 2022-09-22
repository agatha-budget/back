/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Collations implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String collationCatalog;
    private final String collationSchema;
    private final String collationName;
    private final String padAttribute;
    private final String languageTag;

    public Collations(Collations value) {
        this.collationCatalog = value.collationCatalog;
        this.collationSchema = value.collationSchema;
        this.collationName = value.collationName;
        this.padAttribute = value.padAttribute;
        this.languageTag = value.languageTag;
    }

    public Collations(
        String collationCatalog,
        String collationSchema,
        String collationName,
        String padAttribute,
        String languageTag
    ) {
        this.collationCatalog = collationCatalog;
        this.collationSchema = collationSchema;
        this.collationName = collationName;
        this.padAttribute = padAttribute;
        this.languageTag = languageTag;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLLATIONS.COLLATION_CATALOG</code>.
     */
    public String getCollationCatalog() {
        return this.collationCatalog;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLLATIONS.COLLATION_SCHEMA</code>.
     */
    public String getCollationSchema() {
        return this.collationSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLLATIONS.COLLATION_NAME</code>.
     */
    public String getCollationName() {
        return this.collationName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLLATIONS.PAD_ATTRIBUTE</code>.
     */
    public String getPadAttribute() {
        return this.padAttribute;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLLATIONS.LANGUAGE_TAG</code>.
     */
    public String getLanguageTag() {
        return this.languageTag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Collations (");

        sb.append(collationCatalog);
        sb.append(", ").append(collationSchema);
        sb.append(", ").append(collationName);
        sb.append(", ").append(padAttribute);
        sb.append(", ").append(languageTag);

        sb.append(")");
        return sb.toString();
    }
}
