package cn.anpe.website.dao;


import cn.anpe.website.domain.SubSeries;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface SubSeriesMapper extends Mapper<SubSeries> {
     List<SubSeries> getAllSubSeriesList(String pcid);
}