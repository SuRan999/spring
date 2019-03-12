package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class Picture implements Serializable {
    private String pId;

    private String pName;

    private String pSrc;

    private Date pDate;

    private Integer pState;

    private static final long serialVersionUID = 1L;

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpSrc() {
        return pSrc;
    }

    public void setpSrc(String pSrc) {
        this.pSrc = pSrc == null ? null : pSrc.trim();
    }

    public Date getpDate() {
        return pDate;
    }

    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }

    public Integer getpState() {
        return pState;
    }

    public void setpState(Integer pState) {
        this.pState = pState;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Picture other = (Picture) that;
        return (this.getpId() == null ? other.getpId() == null : this.getpId().equals(other.getpId()))
            && (this.getpName() == null ? other.getpName() == null : this.getpName().equals(other.getpName()))
            && (this.getpSrc() == null ? other.getpSrc() == null : this.getpSrc().equals(other.getpSrc()))
            && (this.getpDate() == null ? other.getpDate() == null : this.getpDate().equals(other.getpDate()))
            && (this.getpState() == null ? other.getpState() == null : this.getpState().equals(other.getpState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getpId() == null) ? 0 : getpId().hashCode());
        result = prime * result + ((getpName() == null) ? 0 : getpName().hashCode());
        result = prime * result + ((getpSrc() == null) ? 0 : getpSrc().hashCode());
        result = prime * result + ((getpDate() == null) ? 0 : getpDate().hashCode());
        result = prime * result + ((getpState() == null) ? 0 : getpState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pId=").append(pId);
        sb.append(", pName=").append(pName);
        sb.append(", pSrc=").append(pSrc);
        sb.append(", pDate=").append(pDate);
        sb.append(", pState=").append(pState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}