package cn.anpe.website.service.impl;

import cn.anpe.website.dao.ArticleMapper;
import cn.anpe.website.dao.MetaArticleMapper;
import cn.anpe.website.dao.MetaMapper;
import cn.anpe.website.domain.Article;
import cn.anpe.website.domain.Meta;
import cn.anpe.website.domain.MetaArticle;
import cn.anpe.website.service.ArticleService;
import cn.anpe.website.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-01-02 16:06
 * @Description:
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;
    @Autowired
    MetaMapper metaMapper;
    @Autowired
    MetaArticleMapper metaArticleMapper;

    @Override
    public List<Meta> getAllMeta() {
        return metaMapper.selectAll();
    }

    @Override
    public List<Article> getArticlesByMetaName(String metaName) {
        return articleMapper.selectArticleByMetaName(metaName);
    }

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public boolean addArticle(Article article, String meta) {
        System.out.println(article);
        int a = articleMapper.insert(article);
        String[] metas = meta.split(",");
        for (String m : metas) {
            String maid = UUID.UU32();
            MetaArticle metaArticle = new MetaArticle();
            metaArticle.setAid(article.getAid());
            metaArticle.setMetaArticleId(maid);
            metaArticle.setMid(m);
            int ma = metaArticleMapper.insert(metaArticle);
            if (a <= 0 || ma <= 0) throw new RuntimeException("添加失败");
        }
        return true;
    }

    @Override
    public boolean updateArticle(Article article, String meta) {
        System.out.println(article);
        articleMapper.updateByPrimaryKeySelective(article);
        String aid = article.getAid();
        List<MetaArticle> metaArticles = metaArticleMapper.selectByAid(aid);
        String[] metas = meta.split(",");
        //添加新的关联关系
        for (String s : metas) {
            boolean flag = true;
            for (MetaArticle ma : metaArticles) {
                if (ma.getMid().equals(s)) {
                    flag = false;
                }
            }
            if (flag) {
                //证明此时m是新值
                MetaArticle metaArticle = new MetaArticle();
                metaArticle.setMetaArticleId(UUID.UU32());
                metaArticle.setAid(aid);
                metaArticle.setMid(s);
                System.out.println("insert ------" + metaArticle);
                metaArticleMapper.insert(metaArticle);
            }
        }
        //删除不存在的关联关系
        for (MetaArticle ma : metaArticles) {
            boolean flag = true;
            for (String s : metas) {
                if (ma.getMid().equals(s)) {
                    flag = false;
                }
            }
            if (flag) {
                //证明此时ma是老值
                System.out.println("delete  +" + ma);
                metaArticleMapper.deleteByPrimaryKey(ma);
            }
        }
        return true;
    }

    @Override
    public List<Article> getAllArticleList(Integer page, Integer num) {
        Integer from = (page - 1) * num;
        List<Article> articles = articleMapper.selectArticleListByPageAndNum(from, num);
        return articles;
    }

    @Override
    public List<Article> getAllArticleList() {
        return articleMapper.selectAll();
    }

    @Override
    public Integer countTotalNum() {
        return articleMapper.countTotalNum();
    }

    @Override
    public Article getArticleByAid(String aid) {
        Article article = articleMapper.selectByPrimaryKey(aid);
        return article;
    }

    @Override
    public List<Meta> getMetasByAid(String aid) {
        return metaMapper.selectMetasByAid(aid);
    }

    @Override
    public List<String> getMetaIdsByAid(String aid) {
        return metaMapper.selectMetaIdsByAid(aid);
    }

    @Transactional
    @Override
    public boolean deleteArticle(String aid) {
        int i1 = metaArticleMapper.deleteAllByAid(aid);
        int i = articleMapper.deleteByPrimaryKey(aid);
        return i == 1 && i1 > 0;
    }


}
