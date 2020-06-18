package cn.anpe.website.dao;


import cn.anpe.website.domain.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface ProductMapper extends Mapper<Product> {

    /**
     * 根据子系列获取不重复的 列别如 C系列 H系列
     *
     * @param sid
     * @return
     */
    List<String> getProductSerList(String sid);
    /**
     * 批量id查询用户
     * @param ids 用户list
     * @return
     */
    List<Product> selectAllByIds(@Param("ids") List<String> ids);
}