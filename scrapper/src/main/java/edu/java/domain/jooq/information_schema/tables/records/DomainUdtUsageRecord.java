/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.DomainUdtUsage;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class DomainUdtUsageRecord extends TableRecordImpl<DomainUdtUsageRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    public void setUdtCatalog(@Nullable String value) {
        set(0, value);
    }

    @Nullable
    public String getUdtCatalog() {
        return (String) get(0);
    }

    public void setUdtSchema(@Nullable String value) {
        set(1, value);
    }

    @Nullable
    public String getUdtSchema() {
        return (String) get(1);
    }

    public void setUdtName(@Nullable String value) {
        set(2, value);
    }

    @Nullable
    public String getUdtName() {
        return (String) get(2);
    }

    public void setDomainCatalog(@Nullable String value) {
        set(3, value);
    }

    @Nullable
    public String getDomainCatalog() {
        return (String) get(3);
    }

    public void setDomainSchema(@Nullable String value) {
        set(4, value);
    }

    @Nullable
    public String getDomainSchema() {
        return (String) get(4);
    }

    public void setDomainName(@Nullable String value) {
        set(5, value);
    }

    @Nullable
    public String getDomainName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<String> field1() {
        return DomainUdtUsage.DOMAIN_UDT_USAGE.UDT_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return DomainUdtUsage.DOMAIN_UDT_USAGE.UDT_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field3() {
        return DomainUdtUsage.DOMAIN_UDT_USAGE.UDT_NAME;
    }

    @Override
    @NotNull
    public Field<String> field4() {
        return DomainUdtUsage.DOMAIN_UDT_USAGE.DOMAIN_CATALOG;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return DomainUdtUsage.DOMAIN_UDT_USAGE.DOMAIN_SCHEMA;
    }

    @Override
    @NotNull
    public Field<String> field6() {
        return DomainUdtUsage.DOMAIN_UDT_USAGE.DOMAIN_NAME;
    }

    @Override
    @Nullable
    public String component1() {
        return getUdtCatalog();
    }

    @Override
    @Nullable
    public String component2() {
        return getUdtSchema();
    }

    @Override
    @Nullable
    public String component3() {
        return getUdtName();
    }

    @Override
    @Nullable
    public String component4() {
        return getDomainCatalog();
    }

    @Override
    @Nullable
    public String component5() {
        return getDomainSchema();
    }

    @Override
    @Nullable
    public String component6() {
        return getDomainName();
    }

    @Override
    @Nullable
    public String value1() {
        return getUdtCatalog();
    }

    @Override
    @Nullable
    public String value2() {
        return getUdtSchema();
    }

    @Override
    @Nullable
    public String value3() {
        return getUdtName();
    }

    @Override
    @Nullable
    public String value4() {
        return getDomainCatalog();
    }

    @Override
    @Nullable
    public String value5() {
        return getDomainSchema();
    }

    @Override
    @Nullable
    public String value6() {
        return getDomainName();
    }

    @Override
    @NotNull
    public DomainUdtUsageRecord value1(@Nullable String value) {
        setUdtCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public DomainUdtUsageRecord value2(@Nullable String value) {
        setUdtSchema(value);
        return this;
    }

    @Override
    @NotNull
    public DomainUdtUsageRecord value3(@Nullable String value) {
        setUdtName(value);
        return this;
    }

    @Override
    @NotNull
    public DomainUdtUsageRecord value4(@Nullable String value) {
        setDomainCatalog(value);
        return this;
    }

    @Override
    @NotNull
    public DomainUdtUsageRecord value5(@Nullable String value) {
        setDomainSchema(value);
        return this;
    }

    @Override
    @NotNull
    public DomainUdtUsageRecord value6(@Nullable String value) {
        setDomainName(value);
        return this;
    }

    @Override
    @NotNull
    public DomainUdtUsageRecord values(@Nullable String value1, @Nullable String value2, @Nullable String value3, @Nullable String value4, @Nullable String value5, @Nullable String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public DomainUdtUsageRecord() {
        super(DomainUdtUsage.DOMAIN_UDT_USAGE);
    }

    @ConstructorProperties({ "udtCatalog", "udtSchema", "udtName", "domainCatalog", "domainSchema", "domainName" })
    public DomainUdtUsageRecord(@Nullable String udtCatalog, @Nullable String udtSchema, @Nullable String udtName, @Nullable String domainCatalog, @Nullable String domainSchema, @Nullable String domainName) {
        super(DomainUdtUsage.DOMAIN_UDT_USAGE);

        setUdtCatalog(udtCatalog);
        setUdtSchema(udtSchema);
        setUdtName(udtName);
        setDomainCatalog(domainCatalog);
        setDomainSchema(domainSchema);
        setDomainName(domainName);
        resetChangedOnNotNull();
    }

    public DomainUdtUsageRecord(edu.java.domain.jooq.information_schema.tables.pojos.DomainUdtUsage value) {
        super(DomainUdtUsage.DOMAIN_UDT_USAGE);

        if (value != null) {
            setUdtCatalog(value.getUdtCatalog());
            setUdtSchema(value.getUdtSchema());
            setUdtName(value.getUdtName());
            setDomainCatalog(value.getDomainCatalog());
            setDomainSchema(value.getDomainSchema());
            setDomainName(value.getDomainName());
            resetChangedOnNotNull();
        }
    }
}
