package cn.anpe.website.service;

import cn.anpe.website.domain.Article;
import cn.anpe.website.domain.Product;
import cn.anpe.website.domain.ProductCategory;
import cn.anpe.website.domain.ProductShow;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-04-14 22:35
 * @Description:
 */
public interface ProductService {
    List<ProductCategory> getAllCategory();

    ProductShow getProductByAid(String aid);

    void addProduct(ProductShow show);

    /**
     * 删除产品
     * @param aid 文章id
     * @return
     */
    boolean deleteProductShow(String aid);

    boolean deleteProduct(String aid);
    /**
     * 更新产品
     * @param productShow
     * @return
     */

    boolean updateArticle(ProductShow productShow);

    List<ProductShow> getAllProductList();

    /**
     * 快捷改变文章显示状态  1为显示，0为隐藏
     * @param aid
     * @param status
     * @return
     */
    boolean changeProductShowStatus(String aid,int status);

    List<ProductShow> getProductListByCategory(String category);

    void addProduct(Product product);
}
