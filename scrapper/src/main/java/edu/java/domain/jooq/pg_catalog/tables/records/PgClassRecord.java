/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.records;


import edu.java.domain.jooq.pg_catalog.tables.PgClass;

import java.beans.ConstructorProperties;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.NotNull;
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
public class PgClassRecord extends TableRecordImpl<PgClassRecord> {

    private static final long serialVersionUID = 1L;

    public void setOid(@NotNull Long value) {
        set(0, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getOid() {
        return (Long) get(0);
    }

    public void setRelname(@NotNull String value) {
        set(1, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getRelname() {
        return (String) get(1);
    }

    public void setRelnamespace(@NotNull Long value) {
        set(2, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRelnamespace() {
        return (Long) get(2);
    }

    public void setReltype(@NotNull Long value) {
        set(3, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getReltype() {
        return (Long) get(3);
    }

    public void setReloftype(@NotNull Long value) {
        set(4, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getReloftype() {
        return (Long) get(4);
    }

    public void setRelowner(@NotNull Long value) {
        set(5, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRelowner() {
        return (Long) get(5);
    }

    public void setRelam(@NotNull Long value) {
        set(6, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRelam() {
        return (Long) get(6);
    }

    public void setRelfilenode(@NotNull Long value) {
        set(7, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRelfilenode() {
        return (Long) get(7);
    }

    public void setReltablespace(@NotNull Long value) {
        set(8, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getReltablespace() {
        return (Long) get(8);
    }

    public void setRelpages(@NotNull Integer value) {
        set(9, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getRelpages() {
        return (Integer) get(9);
    }

    public void setReltuples(@NotNull Float value) {
        set(10, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Float getReltuples() {
        return (Float) get(10);
    }

    public void setRelallvisible(@NotNull Integer value) {
        set(11, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Integer getRelallvisible() {
        return (Integer) get(11);
    }

    public void setReltoastrelid(@NotNull Long value) {
        set(12, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getReltoastrelid() {
        return (Long) get(12);
    }

    public void setRelhasindex(@NotNull Boolean value) {
        set(13, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRelhasindex() {
        return (Boolean) get(13);
    }

    public void setRelisshared(@NotNull Boolean value) {
        set(14, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRelisshared() {
        return (Boolean) get(14);
    }

    public void setRelpersistence(@NotNull String value) {
        set(15, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getRelpersistence() {
        return (String) get(15);
    }

    public void setRelkind(@NotNull String value) {
        set(16, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getRelkind() {
        return (String) get(16);
    }

    public void setRelnatts(@NotNull Short value) {
        set(17, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getRelnatts() {
        return (Short) get(17);
    }

    public void setRelchecks(@NotNull Short value) {
        set(18, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Short getRelchecks() {
        return (Short) get(18);
    }

    public void setRelhasrules(@NotNull Boolean value) {
        set(19, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRelhasrules() {
        return (Boolean) get(19);
    }

    public void setRelhastriggers(@NotNull Boolean value) {
        set(20, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRelhastriggers() {
        return (Boolean) get(20);
    }

    public void setRelhassubclass(@NotNull Boolean value) {
        set(21, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRelhassubclass() {
        return (Boolean) get(21);
    }

    public void setRelrowsecurity(@NotNull Boolean value) {
        set(22, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRelrowsecurity() {
        return (Boolean) get(22);
    }

    public void setRelforcerowsecurity(@NotNull Boolean value) {
        set(23, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRelforcerowsecurity() {
        return (Boolean) get(23);
    }

    public void setRelispopulated(@NotNull Boolean value) {
        set(24, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRelispopulated() {
        return (Boolean) get(24);
    }

    public void setRelreplident(@NotNull String value) {
        set(25, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getRelreplident() {
        return (String) get(25);
    }

    public void setRelispartition(@NotNull Boolean value) {
        set(26, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Boolean getRelispartition() {
        return (Boolean) get(26);
    }

    public void setRelrewrite(@NotNull Long value) {
        set(27, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRelrewrite() {
        return (Long) get(27);
    }

    public void setRelfrozenxid(@NotNull Long value) {
        set(28, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRelfrozenxid() {
        return (Long) get(28);
    }

    public void setRelminmxid(@NotNull Long value) {
        set(29, value);
    }

    @jakarta.validation.constraints.NotNull
    @NotNull
    public Long getRelminmxid() {
        return (Long) get(29);
    }

    public void setRelacl(@Nullable String[] value) {
        set(30, value);
    }

    @Nullable
    public String[] getRelacl() {
        return (String[]) get(30);
    }

    public void setReloptions(@Nullable String[] value) {
        set(31, value);
    }

    @Nullable
    public String[] getReloptions() {
        return (String[]) get(31);
    }

    @Deprecated
    public void setRelpartbound(@Nullable Object value) {
        set(32, value);
    }

    @Deprecated
    @Nullable
    public Object getRelpartbound() {
        return get(32);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    public PgClassRecord() {
        super(PgClass.PG_CLASS);
    }

    @ConstructorProperties({ "oid", "relname", "relnamespace", "reltype", "reloftype", "relowner", "relam", "relfilenode", "reltablespace", "relpages", "reltuples", "relallvisible", "reltoastrelid", "relhasindex", "relisshared", "relpersistence", "relkind", "relnatts", "relchecks", "relhasrules", "relhastriggers", "relhassubclass", "relrowsecurity", "relforcerowsecurity", "relispopulated", "relreplident", "relispartition", "relrewrite", "relfrozenxid", "relminmxid", "relacl", "reloptions", "relpartbound" })
    public PgClassRecord(@NotNull Long oid, @NotNull String relname, @NotNull Long relnamespace, @NotNull Long reltype, @NotNull Long reloftype, @NotNull Long relowner, @NotNull Long relam, @NotNull Long relfilenode, @NotNull Long reltablespace, @NotNull Integer relpages, @NotNull Float reltuples, @NotNull Integer relallvisible, @NotNull Long reltoastrelid, @NotNull Boolean relhasindex, @NotNull Boolean relisshared, @NotNull String relpersistence, @NotNull String relkind, @NotNull Short relnatts, @NotNull Short relchecks, @NotNull Boolean relhasrules, @NotNull Boolean relhastriggers, @NotNull Boolean relhassubclass, @NotNull Boolean relrowsecurity, @NotNull Boolean relforcerowsecurity, @NotNull Boolean relispopulated, @NotNull String relreplident, @NotNull Boolean relispartition, @NotNull Long relrewrite, @NotNull Long relfrozenxid, @NotNull Long relminmxid, @Nullable String[] relacl, @Nullable String[] reloptions, @Nullable Object relpartbound) {
        super(PgClass.PG_CLASS);

        setOid(oid);
        setRelname(relname);
        setRelnamespace(relnamespace);
        setReltype(reltype);
        setReloftype(reloftype);
        setRelowner(relowner);
        setRelam(relam);
        setRelfilenode(relfilenode);
        setReltablespace(reltablespace);
        setRelpages(relpages);
        setReltuples(reltuples);
        setRelallvisible(relallvisible);
        setReltoastrelid(reltoastrelid);
        setRelhasindex(relhasindex);
        setRelisshared(relisshared);
        setRelpersistence(relpersistence);
        setRelkind(relkind);
        setRelnatts(relnatts);
        setRelchecks(relchecks);
        setRelhasrules(relhasrules);
        setRelhastriggers(relhastriggers);
        setRelhassubclass(relhassubclass);
        setRelrowsecurity(relrowsecurity);
        setRelforcerowsecurity(relforcerowsecurity);
        setRelispopulated(relispopulated);
        setRelreplident(relreplident);
        setRelispartition(relispartition);
        setRelrewrite(relrewrite);
        setRelfrozenxid(relfrozenxid);
        setRelminmxid(relminmxid);
        setRelacl(relacl);
        setReloptions(reloptions);
        setRelpartbound(relpartbound);
        resetChangedOnNotNull();
    }

    public PgClassRecord(edu.java.domain.jooq.pg_catalog.tables.pojos.PgClass value) {
        super(PgClass.PG_CLASS);

        if (value != null) {
            setOid(value.getOid());
            setRelname(value.getRelname());
            setRelnamespace(value.getRelnamespace());
            setReltype(value.getReltype());
            setReloftype(value.getReloftype());
            setRelowner(value.getRelowner());
            setRelam(value.getRelam());
            setRelfilenode(value.getRelfilenode());
            setReltablespace(value.getReltablespace());
            setRelpages(value.getRelpages());
            setReltuples(value.getReltuples());
            setRelallvisible(value.getRelallvisible());
            setReltoastrelid(value.getReltoastrelid());
            setRelhasindex(value.getRelhasindex());
            setRelisshared(value.getRelisshared());
            setRelpersistence(value.getRelpersistence());
            setRelkind(value.getRelkind());
            setRelnatts(value.getRelnatts());
            setRelchecks(value.getRelchecks());
            setRelhasrules(value.getRelhasrules());
            setRelhastriggers(value.getRelhastriggers());
            setRelhassubclass(value.getRelhassubclass());
            setRelrowsecurity(value.getRelrowsecurity());
            setRelforcerowsecurity(value.getRelforcerowsecurity());
            setRelispopulated(value.getRelispopulated());
            setRelreplident(value.getRelreplident());
            setRelispartition(value.getRelispartition());
            setRelrewrite(value.getRelrewrite());
            setRelfrozenxid(value.getRelfrozenxid());
            setRelminmxid(value.getRelminmxid());
            setRelacl(value.getRelacl());
            setReloptions(value.getReloptions());
            setRelpartbound(value.getRelpartbound());
            resetChangedOnNotNull();
        }
    }
}