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
     *  获取轮播图列表
     */
    List<Rotation> getAllRotationList();

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

    /**
     * 快捷改变轮播图显示状态  1为显示，2为隐藏
     * @param rid
     * @param status
     * @return
     */
    boolean changeRotationShowStatus(String rid,int status);

    /**
     * 查询对应rotation信息
     * @param rid 唯一id
     * @return 需要查询的对象
     */
    Rotation selectRotationByRid(String rid);

    /**
     * 更新轮播图
     * @param rotation
     * @return
     */
    int updateRotation(Rotation rotation);

    /**
     * 删除轮播图
     * @param rid 要删除的主键id
     * @return 是否删除成功
     */
    boolean deleteRotation(String rid);
}
