package cn.anpe.website.domain.vo;

import cn.anpe.website.domain.ProductCategory;
import cn.anpe.website.domain.ProductShow;
import cn.anpe.website.domain.SubSeries;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-04-16 23:38
 * @Description:
 */
public class SelectVo {
    ProductCategory productCategory;
    List<SubSeries> subSeries;

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public List<SubSeries> getSubSeries() {
        return subSeries;
    }

    public void setSubSeries(List<SubSeries> subSeries) {
        this.subSeries = subSeries;
    }
}
