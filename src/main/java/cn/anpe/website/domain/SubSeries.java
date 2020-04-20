package cn.anpe.website.domain;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "subseries")
public class SubSeries {
    @Id
    private String sid;

    private String pcid;

    private String attributeName;

    private String description;

    private String remark;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getPcid() {
        return pcid;
    }

    public void setPcid(String pcid) {
        this.pcid = pcid == null ? null : pcid.trim();
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName == null ? null : attributeName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "SubSeries{" +
                "sid='" + sid + '\'' +
                ", pcid='" + pcid + '\'' +
                ", attributeName='" + attributeName + '\'' +
                ", description='" + description + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}