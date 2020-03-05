package cn.anpe.website.controller.admin;

import cn.anpe.website.common.WebConst;
import cn.anpe.website.domain.Article;
import cn.anpe.website.domain.Meta;
import cn.anpe.website.domain.Rotation;
import cn.anpe.website.domain.User;
import cn.anpe.website.domain.vo.ResultVo;
import cn.anpe.website.service.ArticleService;
import cn.anpe.website.service.RotationService;
import cn.anpe.website.util.DateKit;
import cn.anpe.website.util.UUID;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-01-07 14:39
 * @Description:
 */
@Api("文章管理相关接口")
@Controller
@RequestMapping("article")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @Autowired
    RotationService rotationService;

    @GetMapping("detail/{aid}")
    public ModelAndView detail(ModelAndView modelAndView, @PathVariable("aid") String aid) {
        Article article = articleService.getArticleByAid(aid);
        if (article == null || article.getStatus() != 1) {
            modelAndView.addObject("msg", "您访问的文章不存在");
            modelAndView.setViewName("error/404");
            return modelAndView;
        }
        List<Meta> metas = articleService.getAllMeta();
        modelAndView.addObject("article", article);
        modelAndView.addObject("metas", metas);
        modelAndView.addObject("DateKit", new DateKit());
        modelAndView.setViewName("front/detail");
        return modelAndView;
    }


    @GetMapping("showArticleList")
    public ModelAndView showArticleList(ModelAndView model) {
        List<Article> articles = articleService.getAllArticleList(1, 10);
        Integer total = articleService.countTotalNum();
        model.addObject("articles", articles);
        model.addObject("total", Math.ceil(total / 10.0));
        model.addObject("active", 1);
        model.setViewName("admin/article_list");
        return model;
    }

    @GetMapping(value = "showArticleList/{page}")
    public ModelAndView getArticleList(ModelAndView model, @PathVariable("page") Integer page) {
        if (page < 0) page = 1;//错误输入都显示第一页
        List<Article> articles = articleService.getAllArticleList(page, 10);
        Integer total = articleService.countTotalNum();
        model.addObject("articles", articles);
        model.addObject("total", Math.ceil(total / 10.0));
        model.addObject("active", page);
        model.setViewName("admin/article_list");
        return model;
    }

    @GetMapping("showUpdateArticle/{aid}")
    public ModelAndView showUpdateArticle(ModelAndView model, @PathVariable("aid") String aid) {
        Article article = articleService.getArticleByAid(aid);
        List<String> hasMetaId = articleService.getMetaIdsByAid(aid);//此篇文章已有分类
        List<Meta> allMeta = articleService.getAllMeta();//所有分类
        model.addObject("allMeta", allMeta);
        model.addObject("hasMetaId", hasMetaId);
        model.addObject("article", article);
        model.setViewName("admin/article_update");
        return model;
    }

    @PostMapping("updateArticle")
    @ResponseBody
    public ResultVo updateArticle(Article article, @PathParam("meta") String meta, HttpSession session) {
        ResultVo vo = new ResultVo();
        if (meta == null || "".equals(meta)) {
            vo.setCode(404);
            vo.setData("标签错误");
            return vo;
        }
        User user = (User) session.getAttribute(WebConst.SESSION_USER);
        articleService.updateArticle(article, meta);//添加文章内容及其所属分类
        vo.setCode(200);
        vo.setUrl("/article/showArticleList");
        return vo;
    }

    @GetMapping("showAddArticle")
    public ModelAndView showAddArticle(ModelAndView model) {
        List<Meta> allMeta = articleService.getAllMeta();
        model.addObject("metas", allMeta);
        model.setViewName("admin/article_add");
        return model;
    }

    @PostMapping("addArticle")
    @ResponseBody
    public ResultVo addArticle(Article article, @PathParam("meta") String meta, HttpSession session) {
        ResultVo vo = new ResultVo();
        if (meta == null || "".equals(meta)) {
            vo.setCode(404);
            vo.setData("标签错误");
            return vo;
        }
        User user = (User) session.getAttribute(WebConst.SESSION_USER);
        article.setAid(UUID.UU32());
        article.setAuthorId(user.getUid());
        article.setCreateTime((long) DateKit.getCurrentUnixTime());
        article.setStatus(0);
        articleService.addArticle(article, meta);//添加文章内容及其所属分类
        vo.setCode(200);
        vo.setUrl("/article/showArticleList");
        return vo;
    }

    @GetMapping("showRotationList")
    public ModelAndView showRotationList(ModelAndView model) {
        List<Rotation> rotations = rotationService.getAllRotationList(1, 10);
        Integer total = rotationService.countTotalNum();
        model.addObject("rotations", rotations);
        model.addObject("total", Math.ceil(total / 10.0));
        model.addObject("active", 1);
        model.addObject("DateKit",new DateKit());
        model.setViewName("admin/rotation_list");
        return model;
    }

    @GetMapping(value = "showRotationList/{page}")
    public ModelAndView getRotationList(ModelAndView model, @PathVariable("page") Integer page) {
        if (page < 0) page = 1;//错误输入都显示第一页
        List<Rotation> rotations = rotationService.getAllRotationList(page, 10);
        Integer total = rotationService.countTotalNum();
        model.addObject("rotations", rotations);
        model.addObject("total", Math.ceil(total / 10.0));
        model.addObject("active", page);
        model.addObject("DateKit",new DateKit());
        model.setViewName("admin/rotation_list");
        return model;
    }

    @RequestMapping("showRotationAdd")
    public  String getRotationAdd() {
        return "admin/rotation_add";
    }

    @ApiOperation("添加新的轮播图")
    @RequestMapping("addRotation")
    @ResponseBody
    public ResultVo addRotation(Rotation rotation) {
        ResultVo resultVo = new ResultVo();
        rotation.setRid(UUID.UU32());
        rotation.setCreateTime((long) DateKit.getCurrentUnixTime());
        System.out.println("rotation:  "+rotation);
        rotationService.addRotation(rotation);
        resultVo.setCode(ResultVo.SUCCESS);
        return resultVo;
    }
}
