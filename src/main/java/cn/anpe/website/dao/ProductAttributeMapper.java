package cn.anpe.website.dao;


import cn.anpe.website.domain.Attribute;
import cn.anpe.website.domain.ProductAttribute;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface ProductAttributeMapper extends Mapper<ProductAttribute> {
    /**
     * 根据属性id获取中间表中属性值列表
     * 举例 ：输入功率：10V  20V  30V
     * @param aid
     * @return
     */
    List<String> getAttributeValueList(String aid);
}