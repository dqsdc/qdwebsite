package cn.anpe.website.dao;


import cn.anpe.website.domain.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface ArticleMapper extends Mapper<Article> {
    /**
     * 分页获取数据!
     * @param from 从哪个数据开始取
     * @param num 取多少个
     * @return 返回结果集
     */
    List<Article> selectArticleListByPageAndNum(@Param("from") Integer from, @Param("num") Integer num);

    Integer countTotalNum();
}