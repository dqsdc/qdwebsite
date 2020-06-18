package cn.anpe.website.service.impl;

import cn.anpe.website.dao.*;
import cn.anpe.website.domain.*;
import cn.anpe.website.domain.vo.AttributeVo;
import cn.anpe.website.domain.vo.SelectVo;
import cn.anpe.website.service.SelectService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Auther: dqsdc
 * @Date: 2020-04-16 21:58
 * @Description:
 */
@Service
public class SelectServiceImpl implements SelectService {

    @Autowired//分类
            ProductCategoryMapper productCategoryMapper;

    @Autowired//子分类
            SubSeriesMapper subSeriesMapper;

    @Autowired//属性
            AttributeMapper attributeMapper;

    @Autowired//产品
            ProductMapper productMapper;

    @Autowired//产品属性关联表
            ProductAttributeMapper productAttributeMapper;

    @Override
    public List<SelectVo> getSelectVo() {
        List<ProductCategory> categories = getAllCategoryList();
        List<SelectVo> voList = new ArrayList<>();
        for (ProductCategory pc : categories) {
            SelectVo vo = new SelectVo();
            vo.setProductCategory(pc);
            List<SubSeries> subSeries = getAllSubSeriesList(pc.getPcid());
            vo.setSubSeries(subSeries);
            voList.add(vo);
        }
        return voList;
    }

    @Override
    public List<AttributeVo> getAttributeVo(String sid) {
        List<Attribute> attributes = getAttributeList(sid);
        List<AttributeVo> voList = new ArrayList<>();
        for (Attribute a : attributes) {
            AttributeVo vo = new AttributeVo();
            vo.setAttribute(a);
            List<String> valueList = getAttributeValueList(a.getAid());
            vo.setValues(valueList);
            voList.add(vo);
        }
        return voList;
    }

    @Override
    public List<ProductCategory> getAllCategoryList() {
        return productCategoryMapper.selectAll();
    }

    @Override
    public void deleteCategory(String pcid) {
        productCategoryMapper.deleteByPrimaryKey(pcid);
    }

    @Override
    public void insertCategory(ProductCategory productCategory) {
        productCategoryMapper.insert(productCategory);
    }

    @Override
    public ProductCategory selectCategoryByPcid(String pcid) {
        return productCategoryMapper.selectByPrimaryKey(pcid);
    }

    @Override
    public void updateCategory(ProductCategory category) {
        productCategoryMapper.updateByPrimaryKeySelective(category);
    }

    @Override
    public List<SubSeries> getAllSubSeriesList(String pcid) {
        return subSeriesMapper.getAllSubSeriesList(pcid);
    }

    @Override
    public void addSubSeries(SubSeries subSeries) {
        subSeriesMapper.insert(subSeries);
    }

    @Override
    public void deleteSubSeries(String sid) {
        subSeriesMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public void updateSubSeries(SubSeries series) {
        subSeriesMapper.updateByPrimaryKeySelective(series);
    }

    @Override
    public SubSeries selectSubSeriesBySid(String sid) {
        return subSeriesMapper.selectByPrimaryKey(sid);
    }

    @Override
    public List<Attribute> getAttributeList(String sid) {
        AttributeExample example = new AttributeExample();
        AttributeExample.Criteria criteria = example.createCriteria();
        criteria.andSidEqualTo(sid);
        return attributeMapper.selectByExample(example);
    }

    @Override
    public void deleteAttribute(String aid) {
        attributeMapper.deleteByPrimaryKey(aid);
    }

    @Override
    public void addAttribute(Attribute attribute) {
        attributeMapper.insert(attribute);
    }

    @Override
    public void updateAttribute(Attribute attribute) {
        attributeMapper.updateByPrimaryKeySelective(attribute);
    }

    @Override
    public Attribute selectAttributeByAid(String aid) {
        return attributeMapper.selectByPrimaryKey(aid);
    }

    @Override
    public List<String> getAttributeValueList(String aid) {
        return productAttributeMapper.getAttributeValueList(aid);
    }

    @Override
    public List<Product> getAllProductList(String sid) {
        ProductExample example = new ProductExample();
        ProductExample.Criteria criteria = example.createCriteria();
        criteria.andSidEqualTo(sid);
        return productMapper.selectByExample(example);
    }

    @Override
    public List<Product> getProductListBySeries(String sid, String xilie) {
        ProductExample example = new ProductExample();
        ProductExample.Criteria criteria = example.createCriteria();
        criteria.andSidEqualTo(sid);
        criteria.andSeriesEqualTo(xilie);
        return productMapper.selectByExample(example);
    }

    @Override
    public List<String> getProductSerList(String sid) {
        return productMapper.getProductSerList(sid);
    }

    @Override
    public PageInfo<Product> getProductListByAttribute(String[] params, int limit, int page) {
        ProductAttributeKV[] param = new ProductAttributeKV[params.length];
        for (int i = 0; i < params.length; i++) {
            String key = params[i].split("qdzdhqdzdh")[0];
            String val = params[i].split("qdzdhqdzdh")[1];
            param[i] = new ProductAttributeKV(key, val);
        }

        List<String> ids = productAttributeMapper.getProductIdByAttribute(param, param.length);
        if (ids == null || ids.size() == 0) return new PageInfo<>();
        PageHelper.startPage(limit, page);
        List<Product> products = productMapper.selectAllByIds(ids);
        return new PageInfo<>(products);
    }
}
