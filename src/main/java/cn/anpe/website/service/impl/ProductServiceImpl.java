package cn.anpe.website.service.impl;

import cn.anpe.website.dao.ProductCategoryMapper;
import cn.anpe.website.dao.ProductMapper;
import cn.anpe.website.dao.ProductShowMapper;
import cn.anpe.website.domain.Product;
import cn.anpe.website.domain.ProductCategory;
import cn.anpe.website.domain.ProductShow;
import cn.anpe.website.service.ProductService;
import cn.anpe.website.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-04-14 22:35
 * @Description:
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductCategoryMapper productCategoryMapper;

    @Autowired
    ProductShowMapper productShowMapper;

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductCategory> getAllCategory() {
        return productCategoryMapper.selectAll();
    }

    @Override
    public ProductShow getProductByAid(String aid) {
        return productShowMapper.selectByPrimaryKey(aid);
    }

    @Override
    public void addProduct(ProductShow show) {
        productShowMapper.insert(show);
    }

    @Transactional
    @Override
    public boolean deleteProductShow(String aid) {
        int i = productShowMapper.deleteByPrimaryKey(aid);
        return i == 1;
    }

    @Override
    public boolean updateArticle(ProductShow productShow) {
        return productShowMapper.updateByPrimaryKeySelective(productShow) == 1;
    }

    @Override
    public List<ProductShow> getAllProductList() {
        return productShowMapper.selectAll();
    }

    @Override
    public boolean changeProductShowStatus(String aid, int status) {
        return productShowMapper.changeProductShowStatus(aid, status) == 1;
    }

    @Override
    public List<ProductShow> getProductListByCategory(String pcid) {
        return productShowMapper.getProductListByCategory(pcid);
    }

    @Override
    public void addProduct(Product product) {
        product.setPid(UUID.UU32());
        productMapper.insert(product);
    }

    @Override
    public boolean deleteProduct(String aid) {
        return productMapper.deleteByPrimaryKey(aid) == 1;
    }
}
