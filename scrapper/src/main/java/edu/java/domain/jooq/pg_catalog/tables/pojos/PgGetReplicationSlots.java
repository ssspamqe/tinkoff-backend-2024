/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


/**
 * The table <code>pg_catalog.pg_get_replication_slots</code>.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgGetReplicationSlots implements Serializable {

    private static final long serialVersionUID = 1L;

    private String slotName;
    private String plugin;
    private String slotType;
    private Long datoid;
    private Boolean temporary;
    private Boolean active;
    private Integer activePid;
    private Long xmin;
    private Long catalogXmin;
    private Object restartLsn;
    private Object confirmedFlushLsn;
    private String walStatus;
    private Long safeWalSize;
    private Boolean twoPhase;
    private Boolean conflicting;

    public PgGetReplicationSlots() {}

    public PgGetReplicationSlots(PgGetReplicationSlots value) {
        this.slotName = value.slotName;
        this.plugin = value.plugin;
        this.slotType = value.slotType;
        this.datoid = value.datoid;
        this.temporary = value.temporary;
        this.active = value.active;
        this.activePid = value.activePid;
        this.xmin = value.xmin;
        this.catalogXmin = value.catalogXmin;
        this.restartLsn = value.restartLsn;
        this.confirmedFlushLsn = value.confirmedFlushLsn;
        this.walStatus = value.walStatus;
        this.safeWalSize = value.safeWalSize;
        this.twoPhase = value.twoPhase;
        this.conflicting = value.conflicting;
    }

    @ConstructorProperties({ "slotName", "plugin", "slotType", "datoid", "temporary", "active", "activePid", "xmin", "catalogXmin", "restartLsn", "confirmedFlushLsn", "walStatus", "safeWalSize", "twoPhase", "conflicting" })
    public PgGetReplicationSlots(
        @Nullable String slotName,
        @Nullable String plugin,
        @Nullable String slotType,
        @Nullable Long datoid,
        @Nullable Boolean temporary,
        @Nullable Boolean active,
        @Nullable Integer activePid,
        @Nullable Long xmin,
        @Nullable Long catalogXmin,
        @Nullable Object restartLsn,
        @Nullable Object confirmedFlushLsn,
        @Nullable String walStatus,
        @Nullable Long safeWalSize,
        @Nullable Boolean twoPhase,
        @Nullable Boolean conflicting
    ) {
        this.slotName = slotName;
        this.plugin = plugin;
        this.slotType = slotType;
        this.datoid = datoid;
        this.temporary = temporary;
        this.active = active;
        this.activePid = activePid;
        this.xmin = xmin;
        this.catalogXmin = catalogXmin;
        this.restartLsn = restartLsn;
        this.confirmedFlushLsn = confirmedFlushLsn;
        this.walStatus = walStatus;
        this.safeWalSize = safeWalSize;
        this.twoPhase = twoPhase;
        this.conflicting = conflicting;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.slot_name</code>.
     */
    @Nullable
    public String getSlotName() {
        return this.slotName;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.slot_name</code>.
     */
    public void setSlotName(@Nullable String slotName) {
        this.slotName = slotName;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.plugin</code>.
     */
    @Nullable
    public String getPlugin() {
        return this.plugin;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.plugin</code>.
     */
    public void setPlugin(@Nullable String plugin) {
        this.plugin = plugin;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.slot_type</code>.
     */
    @Nullable
    public String getSlotType() {
        return this.slotType;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.slot_type</code>.
     */
    public void setSlotType(@Nullable String slotType) {
        this.slotType = slotType;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.datoid</code>.
     */
    @Nullable
    public Long getDatoid() {
        return this.datoid;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.datoid</code>.
     */
    public void setDatoid(@Nullable Long datoid) {
        this.datoid = datoid;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.temporary</code>.
     */
    @Nullable
    public Boolean getTemporary() {
        return this.temporary;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.temporary</code>.
     */
    public void setTemporary(@Nullable Boolean temporary) {
        this.temporary = temporary;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.active</code>.
     */
    @Nullable
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.active</code>.
     */
    public void setActive(@Nullable Boolean active) {
        this.active = active;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.active_pid</code>.
     */
    @Nullable
    public Integer getActivePid() {
        return this.activePid;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.active_pid</code>.
     */
    public void setActivePid(@Nullable Integer activePid) {
        this.activePid = activePid;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.xmin</code>.
     */
    @Nullable
    public Long getXmin() {
        return this.xmin;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.xmin</code>.
     */
    public void setXmin(@Nullable Long xmin) {
        this.xmin = xmin;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.catalog_xmin</code>.
     */
    @Nullable
    public Long getCatalogXmin() {
        return this.catalogXmin;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.catalog_xmin</code>.
     */
    public void setCatalogXmin(@Nullable Long catalogXmin) {
        this.catalogXmin = catalogXmin;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Nullable
    public Object getRestartLsn() {
        return this.restartLsn;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setRestartLsn(@Nullable Object restartLsn) {
        this.restartLsn = restartLsn;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Nullable
    public Object getConfirmedFlushLsn() {
        return this.confirmedFlushLsn;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setConfirmedFlushLsn(@Nullable Object confirmedFlushLsn) {
        this.confirmedFlushLsn = confirmedFlushLsn;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.wal_status</code>.
     */
    @Nullable
    public String getWalStatus() {
        return this.walStatus;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.wal_status</code>.
     */
    public void setWalStatus(@Nullable String walStatus) {
        this.walStatus = walStatus;
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_get_replication_slots.safe_wal_size</code>.
     */
    @Nullable
    public Long getSafeWalSize() {
        return this.safeWalSize;
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_get_replication_slots.safe_wal_size</code>.
     */
    public void setSafeWalSize(@Nullable Long safeWalSize) {
        this.safeWalSize = safeWalSize;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.two_phase</code>.
     */
    @Nullable
    public Boolean getTwoPhase() {
        return this.twoPhase;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.two_phase</code>.
     */
    public void setTwoPhase(@Nullable Boolean twoPhase) {
        this.twoPhase = twoPhase;
    }

    /**
     * Getter for <code>pg_catalog.pg_get_replication_slots.conflicting</code>.
     */
    @Nullable
    public Boolean getConflicting() {
        return this.conflicting;
    }

    /**
     * Setter for <code>pg_catalog.pg_get_replication_slots.conflicting</code>.
     */
    public void setConflicting(@Nullable Boolean conflicting) {
        this.conflicting = conflicting;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgGetReplicationSlots other = (PgGetReplicationSlots) obj;
        if (this.slotName == null) {
            if (other.slotName != null)
                return false;
        }
        else if (!this.slotName.equals(other.slotName))
            return false;
        if (this.plugin == null) {
            if (other.plugin != null)
                return false;
        }
        else if (!this.plugin.equals(other.plugin))
            return false;
        if (this.slotType == null) {
            if (other.slotType != null)
                return false;
        }
        else if (!this.slotType.equals(other.slotType))
            return false;
        if (this.datoid == null) {
            if (other.datoid != null)
                return false;
        }
        else if (!this.datoid.equals(other.datoid))
            return false;
        if (this.temporary == null) {
            if (other.temporary != null)
                return false;
        }
        else if (!this.temporary.equals(other.temporary))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        }
        else if (!this.active.equals(other.active))
            return false;
        if (this.activePid == null) {
            if (other.activePid != null)
                return false;
        }
        else if (!this.activePid.equals(other.activePid))
            return false;
        if (this.xmin == null) {
            if (other.xmin != null)
                return false;
        }
        else if (!this.xmin.equals(other.xmin))
            return false;
        if (this.catalogXmin == null) {
            if (other.catalogXmin != null)
                return false;
        }
        else if (!this.catalogXmin.equals(other.catalogXmin))
            return false;
        if (this.restartLsn == null) {
            if (other.restartLsn != null)
                return false;
        }
        else if (!this.restartLsn.equals(other.restartLsn))
            return false;
        if (this.confirmedFlushLsn == null) {
            if (other.confirmedFlushLsn != null)
                return false;
        }
        else if (!this.confirmedFlushLsn.equals(other.confirmedFlushLsn))
            return false;
        if (this.walStatus == null) {
            if (other.walStatus != null)
                return false;
        }
        else if (!this.walStatus.equals(other.walStatus))
            return false;
        if (this.safeWalSize == null) {
            if (other.safeWalSize != null)
                return false;
        }
        else if (!this.safeWalSize.equals(other.safeWalSize))
            return false;
        if (this.twoPhase == null) {
            if (other.twoPhase != null)
                return false;
        }
        else if (!this.twoPhase.equals(other.twoPhase))
            return false;
        if (this.conflicting == null) {
            if (other.conflicting != null)
                return false;
        }
        else if (!this.conflicting.equals(other.conflicting))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.slotName == null) ? 0 : this.slotName.hashCode());
        result = prime * result + ((this.plugin == null) ? 0 : this.plugin.hashCode());
        result = prime * result + ((this.slotType == null) ? 0 : this.slotType.hashCode());
        result = prime * result + ((this.datoid == null) ? 0 : this.datoid.hashCode());
        result = prime * result + ((this.temporary == null) ? 0 : this.temporary.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.activePid == null) ? 0 : this.activePid.hashCode());
        result = prime * result + ((this.xmin == null) ? 0 : this.xmin.hashCode());
        result = prime * result + ((this.catalogXmin == null) ? 0 : this.catalogXmin.hashCode());
        result = prime * result + ((this.restartLsn == null) ? 0 : this.restartLsn.hashCode());
        result = prime * result + ((this.confirmedFlushLsn == null) ? 0 : this.confirmedFlushLsn.hashCode());
        result = prime * result + ((this.walStatus == null) ? 0 : this.walStatus.hashCode());
        result = prime * result + ((this.safeWalSize == null) ? 0 : this.safeWalSize.hashCode());
        result = prime * result + ((this.twoPhase == null) ? 0 : this.twoPhase.hashCode());
        result = prime * result + ((this.conflicting == null) ? 0 : this.conflicting.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgGetReplicationSlots (");

        sb.append(slotName);
        sb.append(", ").append(plugin);
        sb.append(", ").append(slotType);
        sb.append(", ").append(datoid);
        sb.append(", ").append(temporary);
        sb.append(", ").append(active);
        sb.append(", ").append(activePid);
        sb.append(", ").append(xmin);
        sb.append(", ").append(catalogXmin);
        sb.append(", ").append(restartLsn);
        sb.append(", ").append(confirmedFlushLsn);
        sb.append(", ").append(walStatus);
        sb.append(", ").append(safeWalSize);
        sb.append(", ").append(twoPhase);
        sb.append(", ").append(conflicting);

        sb.append(")");
        return sb.toString();
    }
}
