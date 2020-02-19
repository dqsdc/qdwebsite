package cn.anpe.website.dao;

import cn.anpe.website.domain.Meta;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface MetaMapper extends Mapper<Meta>{
       String selectMidByMetaName(@Param("metaName") String metaName);
       
       List<Meta> selectMetasByAid(@Param("aid") String aid);

       List<String> selectMetaIdsByAid(@Param("aid") String aid);
}