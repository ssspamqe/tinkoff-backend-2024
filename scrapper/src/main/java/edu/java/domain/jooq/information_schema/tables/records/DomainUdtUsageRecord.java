/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.information_schema.tables.records;


import edu.java.domain.jooq.information_schema.tables.DomainUdtUsage;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;
import org.jooq.impl.TableRecordImpl;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class DomainUdtUsageRecord extends TableRecordImpl<DomainUdtUsageRecord> {

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