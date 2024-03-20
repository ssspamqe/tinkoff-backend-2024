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
public class PgSequences implements Serializable {

    private static final long serialVersionUID = 1L;

    private String schemaname;
    private String sequencename;
    private String sequenceowner;
    private Object dataType;
    private Long startValue;
    private Long minValue;
    private Long maxValue;
    private Long incrementBy;
    private Boolean cycle;
    private Long cacheSize;
    private Long lastValue;

    public PgSequences() {}

    public PgSequences(PgSequences value) {
        this.schemaname = value.schemaname;
        this.sequencename = value.sequencename;
        this.sequenceowner = value.sequenceowner;
        this.dataType = value.dataType;
        this.startValue = value.startValue;
        this.minValue = value.minValue;
        this.maxValue = value.maxValue;
        this.incrementBy = value.incrementBy;
        this.cycle = value.cycle;
        this.cacheSize = value.cacheSize;
        this.lastValue = value.lastValue;
    }

    @ConstructorProperties({ "schemaname", "sequencename", "sequenceowner", "dataType", "startValue", "minValue", "maxValue", "incrementBy", "cycle", "cacheSize", "lastValue" })
    public PgSequences(
        @Nullable String schemaname,
        @Nullable String sequencename,
        @Nullable String sequenceowner,
        @Nullable Object dataType,
        @Nullable Long startValue,
        @Nullable Long minValue,
        @Nullable Long maxValue,
        @Nullable Long incrementBy,
        @Nullable Boolean cycle,
        @Nullable Long cacheSize,
        @Nullable Long lastValue
    ) {
        this.schemaname = schemaname;
        this.sequencename = sequencename;
        this.sequenceowner = sequenceowner;
        this.dataType = dataType;
        this.startValue = startValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.incrementBy = incrementBy;
        this.cycle = cycle;
        this.cacheSize = cacheSize;
        this.lastValue = lastValue;
    }

    @Nullable
    public String getSchemaname() {
        return this.schemaname;
    }

    public void setSchemaname(@Nullable String schemaname) {
        this.schemaname = schemaname;
    }

    @Nullable
    public String getSequencename() {
        return this.sequencename;
    }

    public void setSequencename(@Nullable String sequencename) {
        this.sequencename = sequencename;
    }

    @Nullable
    public String getSequenceowner() {
        return this.sequenceowner;
    }

    public void setSequenceowner(@Nullable String sequenceowner) {
        this.sequenceowner = sequenceowner;
    }

    @Deprecated
    @Nullable
    public Object getDataType() {
        return this.dataType;
    }

    @Deprecated
    public void setDataType(@Nullable Object dataType) {
        this.dataType = dataType;
    }

    @Nullable
    public Long getStartValue() {
        return this.startValue;
    }

    public void setStartValue(@Nullable Long startValue) {
        this.startValue = startValue;
    }

    @Nullable
    public Long getMinValue() {
        return this.minValue;
    }

    public void setMinValue(@Nullable Long minValue) {
        this.minValue = minValue;
    }

    @Nullable
    public Long getMaxValue() {
        return this.maxValue;
    }

    public void setMaxValue(@Nullable Long maxValue) {
        this.maxValue = maxValue;
    }

    @Nullable
    public Long getIncrementBy() {
        return this.incrementBy;
    }

    public void setIncrementBy(@Nullable Long incrementBy) {
        this.incrementBy = incrementBy;
    }

    @Nullable
    public Boolean getCycle() {
        return this.cycle;
    }

    public void setCycle(@Nullable Boolean cycle) {
        this.cycle = cycle;
    }

    @Nullable
    public Long getCacheSize() {
        return this.cacheSize;
    }

    public void setCacheSize(@Nullable Long cacheSize) {
        this.cacheSize = cacheSize;
    }

    @Nullable
    public Long getLastValue() {
        return this.lastValue;
    }

    public void setLastValue(@Nullable Long lastValue) {
        this.lastValue = lastValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgSequences other = (PgSequences) obj;
        if (this.schemaname == null) {
            if (other.schemaname != null)
                return false;
        }
        else if (!this.schemaname.equals(other.schemaname))
            return false;
        if (this.sequencename == null) {
            if (other.sequencename != null)
                return false;
        }
        else if (!this.sequencename.equals(other.sequencename))
            return false;
        if (this.sequenceowner == null) {
            if (other.sequenceowner != null)
                return false;
        }
        else if (!this.sequenceowner.equals(other.sequenceowner))
            return false;
        if (this.dataType == null) {
            if (other.dataType != null)
                return false;
        }
        else if (!this.dataType.equals(other.dataType))
            return false;
        if (this.startValue == null) {
            if (other.startValue != null)
                return false;
        }
        else if (!this.startValue.equals(other.startValue))
            return false;
        if (this.minValue == null) {
            if (other.minValue != null)
                return false;
        }
        else if (!this.minValue.equals(other.minValue))
            return false;
        if (this.maxValue == null) {
            if (other.maxValue != null)
                return false;
        }
        else if (!this.maxValue.equals(other.maxValue))
            return false;
        if (this.incrementBy == null) {
            if (other.incrementBy != null)
                return false;
        }
        else if (!this.incrementBy.equals(other.incrementBy))
            return false;
        if (this.cycle == null) {
            if (other.cycle != null)
                return false;
        }
        else if (!this.cycle.equals(other.cycle))
            return false;
        if (this.cacheSize == null) {
            if (other.cacheSize != null)
                return false;
        }
        else if (!this.cacheSize.equals(other.cacheSize))
            return false;
        if (this.lastValue == null) {
            if (other.lastValue != null)
                return false;
        }
        else if (!this.lastValue.equals(other.lastValue))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.schemaname == null) ? 0 : this.schemaname.hashCode());
        result = prime * result + ((this.sequencename == null) ? 0 : this.sequencename.hashCode());
        result = prime * result + ((this.sequenceowner == null) ? 0 : this.sequenceowner.hashCode());
        result = prime * result + ((this.dataType == null) ? 0 : this.dataType.hashCode());
        result = prime * result + ((this.startValue == null) ? 0 : this.startValue.hashCode());
        result = prime * result + ((this.minValue == null) ? 0 : this.minValue.hashCode());
        result = prime * result + ((this.maxValue == null) ? 0 : this.maxValue.hashCode());
        result = prime * result + ((this.incrementBy == null) ? 0 : this.incrementBy.hashCode());
        result = prime * result + ((this.cycle == null) ? 0 : this.cycle.hashCode());
        result = prime * result + ((this.cacheSize == null) ? 0 : this.cacheSize.hashCode());
        result = prime * result + ((this.lastValue == null) ? 0 : this.lastValue.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgSequences (");

        sb.append(schemaname);
        sb.append(", ").append(sequencename);
        sb.append(", ").append(sequenceowner);
        sb.append(", ").append(dataType);
        sb.append(", ").append(startValue);
        sb.append(", ").append(minValue);
        sb.append(", ").append(maxValue);
        sb.append(", ").append(incrementBy);
        sb.append(", ").append(cycle);
        sb.append(", ").append(cacheSize);
        sb.append(", ").append(lastValue);

        sb.append(")");
        return sb.toString();
    }
}