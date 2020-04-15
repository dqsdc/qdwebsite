package cn.anpe.website.dao;

import cn.anpe.website.domain.ProductCategory;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface ProductCategoryMapper extends Mapper<ProductCategory> {

}