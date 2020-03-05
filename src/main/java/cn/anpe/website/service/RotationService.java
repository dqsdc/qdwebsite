package cn.anpe.website.service;

import cn.anpe.website.domain.Article;
import cn.anpe.website.domain.Rotation;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-02-13 00:01
 * @Description:
 */
public interface RotationService {
    /**
     *  获取轮播图列表
     * @param page 页码数
     * @param num 每页的个数
     * @return
     */
    List<Rotation> getAllRotationList(Integer page, Integer num);

    /**
     * 查询一共有多少轮播图
     * @return 文章总数
     */
    Integer countTotalNum();

    /**
     * 添加一条轮播图记录
     * @param rotation
     * @return
     */
    boolean addRotation(Rotation rotation);

    /**
     * 按升序顺序获取所有需要展示的轮播图列表数据
     * @return 轮播图列表数据
     */
    List<Rotation> selectRotationShowList();
}
