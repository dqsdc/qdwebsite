package cn.anpe.website.dao;


import cn.anpe.website.domain.Rotation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface RotationMapper extends Mapper<Rotation> {
    /**
     * 分页获取数据!
     * @param from 从哪个数据开始取
     * @param num 取多少个
     * @return 返回结果集
     */
    List<Rotation> selectRotationListByPageAndNum(@Param("from") Integer from, @Param("num") Integer num);

    Integer countTotalNum();

    /**
     * 按顺序获取所有需要展示的轮播图数据
     * @return
     */
    List<Rotation> selectRotationShowList();
    //更新轮播图显示状态
    int changeRotationShowStatus(@Param("rid") String rid,@Param("status") int status);
}