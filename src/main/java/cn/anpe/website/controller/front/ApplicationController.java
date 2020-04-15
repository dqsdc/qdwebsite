package cn.anpe.website.controller.front;

import cn.anpe.website.domain.Article;
import cn.anpe.website.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-04-12 20:42
 * @Description:
 */
@Controller
@RequestMapping("application")
public class ApplicationController {
    //应用首页
    @RequestMapping("index")
    public String showAppIndex() {
        return "front/application/application";
    }

    //石化
    @RequestMapping("petrochemical")
    public String showPetrochemical() {
        return "front/application/petrochemical";
    }

    //油气
    @RequestMapping("oil")
    public String showOil() {
        return "front/application/oil";
    }

    //冶金
    @RequestMapping("metallurgy")
    public String showMetallurgy() {
        return "front/application/metallurgy";
    }

    //市政工程
    @RequestMapping("municipal")
    public String showMunicipal() {
        return "front/application/municipal";
    }

    //电力工程
    @RequestMapping("electric")
    public String showElectric() {
        return "front/application/electric";
    }

    //生物制药
    @RequestMapping("biopharmaceutical")
    public String showBiopharmaceutical() {
        return "front/application/biopharmaceutical";
    }

    //军工
    @RequestMapping("military")
    public String showMilitary() {
        return "front/application/military";
    }

    //环保
    @RequestMapping("environmental")
    public String showEnvironmental() {
        return "front/application/environmental";
    }

    //轨道
    @RequestMapping("rail")
    public String showRail() {
        return "front/application/rail";
    }

    //服务
    @RequestMapping("after")
    public String showAfter() {
        return "front/after";
    }

    @Autowired
    ArticleService articleService;

    //常见问题
    @RequestMapping("ques")
    public ModelAndView showQues(ModelAndView model,
                                 @RequestParam(value = "page", defaultValue = "1") int page,
                                 @RequestParam(value = "limit", defaultValue = "10") int limit) {
        PageHelper.startPage(page, limit);
        List<Article> articles = articleService.getArticlesByMetaName("常见问题");
        PageInfo<Article> pageInfo=new PageInfo<>(articles);
        model.addObject("articles", pageInfo);
        model.setViewName("front/ques");
        return model;
    }
}
