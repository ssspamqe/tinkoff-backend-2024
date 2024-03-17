/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.pg_catalog.PgCatalog;
import edu.java.domain.jooq.public_.Public;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jooq.Constants;
import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;


/**
 * The catalog <code></code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_CATALOG</code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>information_schema</code>.
     */
    public final InformationSchema INFORMATION_SCHEMA = InformationSchema.INFORMATION_SCHEMA;

    /**
     * The schema <code>pg_catalog</code>.
     */
    public final PgCatalog PG_CATALOG = PgCatalog.PG_CATALOG;

    /**
     * The schema <code>public</code>.
     */
    public final Public PUBLIC = Public.PUBLIC;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    @NotNull
    public final List<Schema> getSchemas() {
        return Arrays.asList(
            InformationSchema.INFORMATION_SCHEMA,
            PgCatalog.PG_CATALOG,
            Public.PUBLIC
        );
    }

    /**
     * A reference to the 3.18 minor release of the code generator. If this
     * doesn't compile, it's because the runtime library uses an older minor
     * release, namely: 3.18. You can turn off the generation of this reference
     * by specifying /configuration/generator/generate/jooqVersionReference
     */
    private static final String REQUIRE_RUNTIME_JOOQ_VERSION = Constants.VERSION_3_18;
}
