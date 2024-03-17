/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.pg_catalog.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jetbrains.annotations.Nullable;


@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PgEventTriggerDdlCommands implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long classid;
    private Long objid;
    private Integer objsubid;
    private String commandTag;
    private String objectType;
    private String schemaName;
    private String objectIdentity;
    private Boolean inExtension;
    private Object command;

    public PgEventTriggerDdlCommands() {}

    public PgEventTriggerDdlCommands(PgEventTriggerDdlCommands value) {
        this.classid = value.classid;
        this.objid = value.objid;
        this.objsubid = value.objsubid;
        this.commandTag = value.commandTag;
        this.objectType = value.objectType;
        this.schemaName = value.schemaName;
        this.objectIdentity = value.objectIdentity;
        this.inExtension = value.inExtension;
        this.command = value.command;
    }

    @ConstructorProperties({ "classid", "objid", "objsubid", "commandTag", "objectType", "schemaName", "objectIdentity", "inExtension", "command" })
    public PgEventTriggerDdlCommands(
        @Nullable Long classid,
        @Nullable Long objid,
        @Nullable Integer objsubid,
        @Nullable String commandTag,
        @Nullable String objectType,
        @Nullable String schemaName,
        @Nullable String objectIdentity,
        @Nullable Boolean inExtension,
        @Nullable Object command
    ) {
        this.classid = classid;
        this.objid = objid;
        this.objsubid = objsubid;
        this.commandTag = commandTag;
        this.objectType = objectType;
        this.schemaName = schemaName;
        this.objectIdentity = objectIdentity;
        this.inExtension = inExtension;
        this.command = command;
    }

    @Nullable
    public Long getClassid() {
        return this.classid;
    }

    public void setClassid(@Nullable Long classid) {
        this.classid = classid;
    }

    @Nullable
    public Long getObjid() {
        return this.objid;
    }

    public void setObjid(@Nullable Long objid) {
        this.objid = objid;
    }

    @Nullable
    public Integer getObjsubid() {
        return this.objsubid;
    }

    public void setObjsubid(@Nullable Integer objsubid) {
        this.objsubid = objsubid;
    }

    @Nullable
    public String getCommandTag() {
        return this.commandTag;
    }

    public void setCommandTag(@Nullable String commandTag) {
        this.commandTag = commandTag;
    }

    @Nullable
    public String getObjectType() {
        return this.objectType;
    }

    public void setObjectType(@Nullable String objectType) {
        this.objectType = objectType;
    }

    @Nullable
    public String getSchemaName() {
        return this.schemaName;
    }

    public void setSchemaName(@Nullable String schemaName) {
        this.schemaName = schemaName;
    }

    @Nullable
    public String getObjectIdentity() {
        return this.objectIdentity;
    }

    public void setObjectIdentity(@Nullable String objectIdentity) {
        this.objectIdentity = objectIdentity;
    }

    @Nullable
    public Boolean getInExtension() {
        return this.inExtension;
    }

    public void setInExtension(@Nullable Boolean inExtension) {
        this.inExtension = inExtension;
    }

    @Deprecated
    @Nullable
    public Object getCommand() {
        return this.command;
    }

    @Deprecated
    public void setCommand(@Nullable Object command) {
        this.command = command;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgEventTriggerDdlCommands other = (PgEventTriggerDdlCommands) obj;
        if (this.classid == null) {
            if (other.classid != null)
                return false;
        }
        else if (!this.classid.equals(other.classid))
            return false;
        if (this.objid == null) {
            if (other.objid != null)
                return false;
        }
        else if (!this.objid.equals(other.objid))
            return false;
        if (this.objsubid == null) {
            if (other.objsubid != null)
                return false;
        }
        else if (!this.objsubid.equals(other.objsubid))
            return false;
        if (this.commandTag == null) {
            if (other.commandTag != null)
                return false;
        }
        else if (!this.commandTag.equals(other.commandTag))
            return false;
        if (this.objectType == null) {
            if (other.objectType != null)
                return false;
        }
        else if (!this.objectType.equals(other.objectType))
            return false;
        if (this.schemaName == null) {
            if (other.schemaName != null)
                return false;
        }
        else if (!this.schemaName.equals(other.schemaName))
            return false;
        if (this.objectIdentity == null) {
            if (other.objectIdentity != null)
                return false;
        }
        else if (!this.objectIdentity.equals(other.objectIdentity))
            return false;
        if (this.inExtension == null) {
            if (other.inExtension != null)
                return false;
        }
        else if (!this.inExtension.equals(other.inExtension))
            return false;
        if (this.command == null) {
            if (other.command != null)
                return false;
        }
        else if (!this.command.equals(other.command))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.classid == null) ? 0 : this.classid.hashCode());
        result = prime * result + ((this.objid == null) ? 0 : this.objid.hashCode());
        result = prime * result + ((this.objsubid == null) ? 0 : this.objsubid.hashCode());
        result = prime * result + ((this.commandTag == null) ? 0 : this.commandTag.hashCode());
        result = prime * result + ((this.objectType == null) ? 0 : this.objectType.hashCode());
        result = prime * result + ((this.schemaName == null) ? 0 : this.schemaName.hashCode());
        result = prime * result + ((this.objectIdentity == null) ? 0 : this.objectIdentity.hashCode());
        result = prime * result + ((this.inExtension == null) ? 0 : this.inExtension.hashCode());
        result = prime * result + ((this.command == null) ? 0 : this.command.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgEventTriggerDdlCommands (");

        sb.append(classid);
        sb.append(", ").append(objid);
        sb.append(", ").append(objsubid);
        sb.append(", ").append(commandTag);
        sb.append(", ").append(objectType);
        sb.append(", ").append(schemaName);
        sb.append(", ").append(objectIdentity);
        sb.append(", ").append(inExtension);
        sb.append(", ").append(command);

        sb.append(")");
        return sb.toString();
    }
}
