package cn.anpe.website.service;

import cn.anpe.website.domain.Attribute;
import cn.anpe.website.domain.Product;
import cn.anpe.website.domain.ProductCategory;
import cn.anpe.website.domain.SubSeries;
import cn.anpe.website.domain.vo.AttributeVo;
import cn.anpe.website.domain.vo.SelectVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-04-16 21:58
 * @Description:
 */
public interface SelectService {

    /**
     * 获取侧列表
     *
     * @return selectVo
     */
    List<SelectVo> getSelectVo();


    /**
     * 获取动态属性
     *
     * @param sid 子系列
     * @return AttributeVo 属性+属性值
     */
    List<AttributeVo> getAttributeVo(String sid);

    /**
     * 获取产品分类列表
     */
    List<ProductCategory> getAllCategoryList();

    void deleteCategory(String pcid);

    void insertCategory(ProductCategory productCategory);

    ProductCategory selectCategoryByPcid(String pcid);

    void updateCategory(ProductCategory category);

    /**
     * 根据分类id获取子系列列表
     *
     * @param pcid 分类id
     */
    List<SubSeries> getAllSubSeriesList(String pcid);

    void addSubSeries(SubSeries subSeries);

    void deleteSubSeries(String sid);

    void updateSubSeries(SubSeries series);

    SubSeries selectSubSeriesBySid(String sid);

    /**
     * 根据子序列id获取属性列表
     *
     * @param sid 子序列id
     */
    List<Attribute> getAttributeList(String sid);

    void deleteAttribute(String aid);

    void addAttribute(Attribute attribute);

    void updateAttribute(Attribute attribute);

    /**
     * 根据属性id获取对应属性
     *
     * @param aid
     * @return
     */
    Attribute selectAttributeByAid(String aid);

    /**
     * 根据属性id获取属性值集合
     *
     * @param aid 属性id
     */
    List<String> getAttributeValueList(String aid);

    /**
     * 根据子序列id获取全部产品列表
     *
     * @param sid 子序列id
     */
    List<Product> getAllProductList(String sid);

    /**
     * 根据子序列id获取个别产品列表
     *
     * @param sid 子序列id
     */
    List<Product> getProductListBySeries(String sid, String xilie);

    /**
     * 根据子序列id获取产品所属分类（如C系列 H系列）
     *
     * @param sid 子序列id
     */
    List<String> getProductSerList(String sid);


    PageInfo<Product> getProductListByAttribute(String[] params, int limit, int page);

}
