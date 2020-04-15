package cn.anpe.website.dao;


import cn.anpe.website.domain.ProductShow;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface ProductShowMapper extends Mapper<ProductShow> {
    //快速更改文章状态
    int changeProductShowStatus(String aid,int status);

    List<ProductShow> getProductListByCategory(String pcid);
}