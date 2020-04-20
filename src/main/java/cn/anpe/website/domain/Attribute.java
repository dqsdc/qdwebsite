package cn.anpe.website.domain;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "attribute")
public class Attribute {
    @Id
    private String aid;

    private String sid;

    private String attributeName;

    private String description;

    private String remark;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
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
        return "Attribute{" +
                "aid='" + aid + '\'' +
                ", sid='" + sid + '\'' +
                ", attributeName='" + attributeName + '\'' +
                ", description='" + description + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}