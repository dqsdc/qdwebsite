package cn.anpe.website.controller.front;

import cn.anpe.website.domain.Article;
import cn.anpe.website.domain.Meta;
import cn.anpe.website.service.ArticleService;
import cn.anpe.website.service.MetaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-02-11 22:17
 * @Description:
 */
@Controller
@RequestMapping("news")
public class NewsController {

    @Autowired
    ArticleService articleService;

    @GetMapping("list")
    public ModelAndView showList(ModelAndView model,
                                 @RequestParam(value = "page", defaultValue = "1") int page,
                                 @RequestParam(value = "limit", defaultValue = "9") int limit) {
        PageHelper.startPage(page, 7);
        List<Meta> metas = articleService.getAllMeta();
        model.addObject("metas", metas);
        PageHelper.startPage(page, limit);
        List<Article> articles = articleService.getAllArticleList();
        PageInfo<Article> pageInfo = new PageInfo<>(articles);
        model.addObject("articles", pageInfo);
        model.setViewName("front/news/list");
        return model;
    }

    @GetMapping("meta/{type}")
    public ModelAndView showListByMeta(ModelAndView model,
                                       @RequestParam(value = "page", defaultValue = "1") int page,
                                       @RequestParam(value = "limit", defaultValue = "9") int limit,
                                       @PathVariable(value = "type") String type) {

        PageHelper.startPage(page, limit);
        List<Article> articles = articleService.getArticlesByMetaName(type);
        PageInfo<Article> pageInfo = new PageInfo<>(articles);
        model.addObject("articles", pageInfo);
        model.addObject("type", type);
        PageHelper.startPage(page, 7);
        List<Meta> metas = articleService.getAllMeta();
        model.addObject("metas", metas);
        model.setViewName("front/news/meta");
        return model;
    }
}
