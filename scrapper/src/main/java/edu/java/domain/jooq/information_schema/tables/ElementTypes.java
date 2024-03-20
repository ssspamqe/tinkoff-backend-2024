/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables;


import edu.java.domain.jooq.information_schema.InformationSchema;
import edu.java.domain.jooq.information_schema.tables.records.ElementTypesRecord;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ElementTypes extends TableImpl<ElementTypesRecord> {

    private static final long serialVersionUID = 1L;

    public static final ElementTypes ELEMENT_TYPES = new ElementTypes();

    @Override
    @NotNull
    public Class<ElementTypesRecord> getRecordType() {
        return ElementTypesRecord.class;
    }

    public final TableField<ElementTypesRecord, String> OBJECT_CATALOG = createField(DSL.name("object_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> OBJECT_SCHEMA = createField(DSL.name("object_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> OBJECT_NAME = createField(DSL.name("object_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> OBJECT_TYPE = createField(DSL.name("object_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> COLLECTION_TYPE_IDENTIFIER = createField(DSL.name("collection_type_identifier"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> DATA_TYPE = createField(DSL.name("data_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<ElementTypesRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<ElementTypesRecord, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> DOMAIN_DEFAULT = createField(DSL.name("domain_default"), edu.java.domain.jooq.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> UDT_NAME = createField(DSL.name("udt_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> SCOPE_CATALOG = createField(DSL.name("scope_catalog"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> SCOPE_SCHEMA = createField(DSL.name("scope_schema"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> SCOPE_NAME = createField(DSL.name("scope_name"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("maximum_cardinality"), edu.java.domain.jooq.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    public final TableField<ElementTypesRecord, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), edu.java.domain.jooq.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private ElementTypes(Name alias, Table<ElementTypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ElementTypes(Name alias, Table<ElementTypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    public ElementTypes(String alias) {
        this(DSL.name(alias), ELEMENT_TYPES);
    }

    public ElementTypes(Name alias) {
        this(alias, ELEMENT_TYPES);
    }

    public ElementTypes() {
        this(DSL.name("element_types"), null);
    }

    @Override
    @Nullable
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    @NotNull
    public ElementTypes as(String alias) {
        return new ElementTypes(DSL.name(alias), this);
    }

    @Override
    @NotNull
    public ElementTypes as(Name alias) {
        return new ElementTypes(alias, this);
    }

    @Override
    @NotNull
    public ElementTypes as(Table<?> alias) {
        return new ElementTypes(alias.getQualifiedName(), this);
    }

    @Override
    @NotNull
    public ElementTypes rename(String name) {
        return new ElementTypes(DSL.name(name), null);
    }

    @Override
    @NotNull
    public ElementTypes rename(Name name) {
        return new ElementTypes(name, null);
    }

    @Override
    @NotNull
    public ElementTypes rename(Table<?> name) {
        return new ElementTypes(name.getQualifiedName(), null);
    }
}