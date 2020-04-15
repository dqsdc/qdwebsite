package cn.anpe.website.service;

import cn.anpe.website.domain.Article;
import cn.anpe.website.domain.Meta;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-01-02 16:06
 * @Description:
 */
public interface ArticleService {
    List<Meta>  getAllMeta();

    /**
     * 根据分类名称获取文章列表
     * @param metaName 分类名称
     * @return
     */
    List<Article> getArticlesByMetaName(String metaName);

    /**
     * 添加文章内容及其所属分类
     * @param article 文章对象
     * @param meta 详情信息  格式：xxx,xxx
     * @return 是否添加成功
     */
    boolean addArticle(Article article,String meta);

    /**
     * 更新文章
     * @param article
     * @param meta
     * @return
     */

    boolean updateArticle(Article article,String meta);


    /**
     *  获取文章列表
     * @param page 页码数
     * @param num 每页的个数
     * @return
     */
    List<Article> getAllArticleList(Integer page,Integer num);

    /**
     * 获取文章列表
     */
    List<Article> getAllArticleList();

    /**
     * 查询一共有多少文章数
     * @return 文章总数
     */
    Integer countTotalNum();

    /**
     * 通过文章id获取对应的文章对象
     */
    Article getArticleByAid(String aid);

    /**
     *  根据文章id获取文章分类
     */
    List<Meta> getMetasByAid(String aid);

    List<String> getMetaIdsByAid(String aid);

    /**
     * 删除文章
     * @param aid 文章id
     * @return
     */
    boolean deleteArticle(String aid);

    /**
     * 快捷改变文章显示状态  1为显示，0为隐藏
     * @param aid
     * @param status
     * @return
     */
    boolean changeArticleShowStatus(String aid,int status);
}
