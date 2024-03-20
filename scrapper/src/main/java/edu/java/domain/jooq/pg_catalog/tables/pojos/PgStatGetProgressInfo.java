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
public class PgStatGetProgressInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pid;
    private Long datid;
    private Long relid;
    private Long param1;
    private Long param2;
    private Long param3;
    private Long param4;
    private Long param5;
    private Long param6;
    private Long param7;
    private Long param8;
    private Long param9;
    private Long param10;
    private Long param11;
    private Long param12;
    private Long param13;
    private Long param14;
    private Long param15;
    private Long param16;
    private Long param17;
    private Long param18;
    private Long param19;
    private Long param20;

    public PgStatGetProgressInfo() {}

    public PgStatGetProgressInfo(PgStatGetProgressInfo value) {
        this.pid = value.pid;
        this.datid = value.datid;
        this.relid = value.relid;
        this.param1 = value.param1;
        this.param2 = value.param2;
        this.param3 = value.param3;
        this.param4 = value.param4;
        this.param5 = value.param5;
        this.param6 = value.param6;
        this.param7 = value.param7;
        this.param8 = value.param8;
        this.param9 = value.param9;
        this.param10 = value.param10;
        this.param11 = value.param11;
        this.param12 = value.param12;
        this.param13 = value.param13;
        this.param14 = value.param14;
        this.param15 = value.param15;
        this.param16 = value.param16;
        this.param17 = value.param17;
        this.param18 = value.param18;
        this.param19 = value.param19;
        this.param20 = value.param20;
    }

    @ConstructorProperties({ "pid", "datid", "relid", "param1", "param2", "param3", "param4", "param5", "param6", "param7", "param8", "param9", "param10", "param11", "param12", "param13", "param14", "param15", "param16", "param17", "param18", "param19", "param20" })
    public PgStatGetProgressInfo(
        @Nullable Integer pid,
        @Nullable Long datid,
        @Nullable Long relid,
        @Nullable Long param1,
        @Nullable Long param2,
        @Nullable Long param3,
        @Nullable Long param4,
        @Nullable Long param5,
        @Nullable Long param6,
        @Nullable Long param7,
        @Nullable Long param8,
        @Nullable Long param9,
        @Nullable Long param10,
        @Nullable Long param11,
        @Nullable Long param12,
        @Nullable Long param13,
        @Nullable Long param14,
        @Nullable Long param15,
        @Nullable Long param16,
        @Nullable Long param17,
        @Nullable Long param18,
        @Nullable Long param19,
        @Nullable Long param20
    ) {
        this.pid = pid;
        this.datid = datid;
        this.relid = relid;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
        this.param6 = param6;
        this.param7 = param7;
        this.param8 = param8;
        this.param9 = param9;
        this.param10 = param10;
        this.param11 = param11;
        this.param12 = param12;
        this.param13 = param13;
        this.param14 = param14;
        this.param15 = param15;
        this.param16 = param16;
        this.param17 = param17;
        this.param18 = param18;
        this.param19 = param19;
        this.param20 = param20;
    }

    @Nullable
    public Integer getPid() {
        return this.pid;
    }

    public void setPid(@Nullable Integer pid) {
        this.pid = pid;
    }

    @Nullable
    public Long getDatid() {
        return this.datid;
    }

    public void setDatid(@Nullable Long datid) {
        this.datid = datid;
    }

    @Nullable
    public Long getRelid() {
        return this.relid;
    }

    public void setRelid(@Nullable Long relid) {
        this.relid = relid;
    }

    @Nullable
    public Long getParam1() {
        return this.param1;
    }

    public void setParam1(@Nullable Long param1) {
        this.param1 = param1;
    }

    @Nullable
    public Long getParam2() {
        return this.param2;
    }

    public void setParam2(@Nullable Long param2) {
        this.param2 = param2;
    }

    @Nullable
    public Long getParam3() {
        return this.param3;
    }

    public void setParam3(@Nullable Long param3) {
        this.param3 = param3;
    }

    @Nullable
    public Long getParam4() {
        return this.param4;
    }

    public void setParam4(@Nullable Long param4) {
        this.param4 = param4;
    }

    @Nullable
    public Long getParam5() {
        return this.param5;
    }

    public void setParam5(@Nullable Long param5) {
        this.param5 = param5;
    }

    @Nullable
    public Long getParam6() {
        return this.param6;
    }

    public void setParam6(@Nullable Long param6) {
        this.param6 = param6;
    }

    @Nullable
    public Long getParam7() {
        return this.param7;
    }

    public void setParam7(@Nullable Long param7) {
        this.param7 = param7;
    }

    @Nullable
    public Long getParam8() {
        return this.param8;
    }

    public void setParam8(@Nullable Long param8) {
        this.param8 = param8;
    }

    @Nullable
    public Long getParam9() {
        return this.param9;
    }

    public void setParam9(@Nullable Long param9) {
        this.param9 = param9;
    }

    @Nullable
    public Long getParam10() {
        return this.param10;
    }

    public void setParam10(@Nullable Long param10) {
        this.param10 = param10;
    }

    @Nullable
    public Long getParam11() {
        return this.param11;
    }

    public void setParam11(@Nullable Long param11) {
        this.param11 = param11;
    }

    @Nullable
    public Long getParam12() {
        return this.param12;
    }

    public void setParam12(@Nullable Long param12) {
        this.param12 = param12;
    }

    @Nullable
    public Long getParam13() {
        return this.param13;
    }

    public void setParam13(@Nullable Long param13) {
        this.param13 = param13;
    }

    @Nullable
    public Long getParam14() {
        return this.param14;
    }

    public void setParam14(@Nullable Long param14) {
        this.param14 = param14;
    }

    @Nullable
    public Long getParam15() {
        return this.param15;
    }

    public void setParam15(@Nullable Long param15) {
        this.param15 = param15;
    }

    @Nullable
    public Long getParam16() {
        return this.param16;
    }

    public void setParam16(@Nullable Long param16) {
        this.param16 = param16;
    }

    @Nullable
    public Long getParam17() {
        return this.param17;
    }

    public void setParam17(@Nullable Long param17) {
        this.param17 = param17;
    }

    @Nullable
    public Long getParam18() {
        return this.param18;
    }

    public void setParam18(@Nullable Long param18) {
        this.param18 = param18;
    }

    @Nullable
    public Long getParam19() {
        return this.param19;
    }

    public void setParam19(@Nullable Long param19) {
        this.param19 = param19;
    }

    @Nullable
    public Long getParam20() {
        return this.param20;
    }

    public void setParam20(@Nullable Long param20) {
        this.param20 = param20;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final PgStatGetProgressInfo other = (PgStatGetProgressInfo) obj;
        if (this.pid == null) {
            if (other.pid != null)
                return false;
        }
        else if (!this.pid.equals(other.pid))
            return false;
        if (this.datid == null) {
            if (other.datid != null)
                return false;
        }
        else if (!this.datid.equals(other.datid))
            return false;
        if (this.relid == null) {
            if (other.relid != null)
                return false;
        }
        else if (!this.relid.equals(other.relid))
            return false;
        if (this.param1 == null) {
            if (other.param1 != null)
                return false;
        }
        else if (!this.param1.equals(other.param1))
            return false;
        if (this.param2 == null) {
            if (other.param2 != null)
                return false;
        }
        else if (!this.param2.equals(other.param2))
            return false;
        if (this.param3 == null) {
            if (other.param3 != null)
                return false;
        }
        else if (!this.param3.equals(other.param3))
            return false;
        if (this.param4 == null) {
            if (other.param4 != null)
                return false;
        }
        else if (!this.param4.equals(other.param4))
            return false;
        if (this.param5 == null) {
            if (other.param5 != null)
                return false;
        }
        else if (!this.param5.equals(other.param5))
            return false;
        if (this.param6 == null) {
            if (other.param6 != null)
                return false;
        }
        else if (!this.param6.equals(other.param6))
            return false;
        if (this.param7 == null) {
            if (other.param7 != null)
                return false;
        }
        else if (!this.param7.equals(other.param7))
            return false;
        if (this.param8 == null) {
            if (other.param8 != null)
                return false;
        }
        else if (!this.param8.equals(other.param8))
            return false;
        if (this.param9 == null) {
            if (other.param9 != null)
                return false;
        }
        else if (!this.param9.equals(other.param9))
            return false;
        if (this.param10 == null) {
            if (other.param10 != null)
                return false;
        }
        else if (!this.param10.equals(other.param10))
            return false;
        if (this.param11 == null) {
            if (other.param11 != null)
                return false;
        }
        else if (!this.param11.equals(other.param11))
            return false;
        if (this.param12 == null) {
            if (other.param12 != null)
                return false;
        }
        else if (!this.param12.equals(other.param12))
            return false;
        if (this.param13 == null) {
            if (other.param13 != null)
                return false;
        }
        else if (!this.param13.equals(other.param13))
            return false;
        if (this.param14 == null) {
            if (other.param14 != null)
                return false;
        }
        else if (!this.param14.equals(other.param14))
            return false;
        if (this.param15 == null) {
            if (other.param15 != null)
                return false;
        }
        else if (!this.param15.equals(other.param15))
            return false;
        if (this.param16 == null) {
            if (other.param16 != null)
                return false;
        }
        else if (!this.param16.equals(other.param16))
            return false;
        if (this.param17 == null) {
            if (other.param17 != null)
                return false;
        }
        else if (!this.param17.equals(other.param17))
            return false;
        if (this.param18 == null) {
            if (other.param18 != null)
                return false;
        }
        else if (!this.param18.equals(other.param18))
            return false;
        if (this.param19 == null) {
            if (other.param19 != null)
                return false;
        }
        else if (!this.param19.equals(other.param19))
            return false;
        if (this.param20 == null) {
            if (other.param20 != null)
                return false;
        }
        else if (!this.param20.equals(other.param20))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pid == null) ? 0 : this.pid.hashCode());
        result = prime * result + ((this.datid == null) ? 0 : this.datid.hashCode());
        result = prime * result + ((this.relid == null) ? 0 : this.relid.hashCode());
        result = prime * result + ((this.param1 == null) ? 0 : this.param1.hashCode());
        result = prime * result + ((this.param2 == null) ? 0 : this.param2.hashCode());
        result = prime * result + ((this.param3 == null) ? 0 : this.param3.hashCode());
        result = prime * result + ((this.param4 == null) ? 0 : this.param4.hashCode());
        result = prime * result + ((this.param5 == null) ? 0 : this.param5.hashCode());
        result = prime * result + ((this.param6 == null) ? 0 : this.param6.hashCode());
        result = prime * result + ((this.param7 == null) ? 0 : this.param7.hashCode());
        result = prime * result + ((this.param8 == null) ? 0 : this.param8.hashCode());
        result = prime * result + ((this.param9 == null) ? 0 : this.param9.hashCode());
        result = prime * result + ((this.param10 == null) ? 0 : this.param10.hashCode());
        result = prime * result + ((this.param11 == null) ? 0 : this.param11.hashCode());
        result = prime * result + ((this.param12 == null) ? 0 : this.param12.hashCode());
        result = prime * result + ((this.param13 == null) ? 0 : this.param13.hashCode());
        result = prime * result + ((this.param14 == null) ? 0 : this.param14.hashCode());
        result = prime * result + ((this.param15 == null) ? 0 : this.param15.hashCode());
        result = prime * result + ((this.param16 == null) ? 0 : this.param16.hashCode());
        result = prime * result + ((this.param17 == null) ? 0 : this.param17.hashCode());
        result = prime * result + ((this.param18 == null) ? 0 : this.param18.hashCode());
        result = prime * result + ((this.param19 == null) ? 0 : this.param19.hashCode());
        result = prime * result + ((this.param20 == null) ? 0 : this.param20.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatGetProgressInfo (");

        sb.append(pid);
        sb.append(", ").append(datid);
        sb.append(", ").append(relid);
        sb.append(", ").append(param1);
        sb.append(", ").append(param2);
        sb.append(", ").append(param3);
        sb.append(", ").append(param4);
        sb.append(", ").append(param5);
        sb.append(", ").append(param6);
        sb.append(", ").append(param7);
        sb.append(", ").append(param8);
        sb.append(", ").append(param9);
        sb.append(", ").append(param10);
        sb.append(", ").append(param11);
        sb.append(", ").append(param12);
        sb.append(", ").append(param13);
        sb.append(", ").append(param14);
        sb.append(", ").append(param15);
        sb.append(", ").append(param16);
        sb.append(", ").append(param17);
        sb.append(", ").append(param18);
        sb.append(", ").append(param19);
        sb.append(", ").append(param20);

        sb.append(")");
        return sb.toString();
    }
}
