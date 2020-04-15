package cn.anpe.website.domain;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "product_category")
public class ProductCategory {
    @Id
    private String pcid;

    private String showName;

    private String description;

    private Integer sort;

    private String remark;

    public String getPcid() {
        return pcid;
    }

    public void setPcid(String pcid) {
        this.pcid = pcid == null ? null : pcid.trim();
    }

    public String getShow() {
        return showName;
    }

    public void setShow(String show) {
        this.showName = show == null ? null : show.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}