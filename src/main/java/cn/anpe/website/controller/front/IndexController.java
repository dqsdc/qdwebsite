package cn.anpe.website.controller.front;

import cn.anpe.website.domain.Article;
import cn.anpe.website.domain.Rotation;
import cn.anpe.website.service.ArticleService;
import cn.anpe.website.service.RotationService;
import cn.anpe.website.util.DateKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-02-20 22:03
 * @Description:
 */
@Controller
@RequestMapping("main")
public class IndexController {


    RotationService rotationService;

    ArticleService articleService;

    @Autowired
    public void setRotationService(RotationService rotationService) {
        this.rotationService = rotationService;
    }

    @Autowired
    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }


    @RequestMapping("index")
    public ModelAndView index(ModelAndView model) {
        List<Rotation> rotations = rotationService.selectRotationShowList();
        List<Article> articles = articleService.getAllArticleList(1, 5);
        model.addObject("rotations", rotations);
        model.addObject("articles", articles);
        model.addObject("dateKit",new DateKit());
        model.setViewName("front/Index");
        return model;
    }
}
