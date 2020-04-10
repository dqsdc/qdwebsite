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
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
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
    public ModelAndView showArticleList(ModelAndView model,
                                        @RequestParam(value = "page", defaultValue = "1") int page,
                                        @RequestParam(value = "size", defaultValue = "10") int size) {
        PageHelper.startPage(page, size);
        List<Article> articles = articleService.getAllArticleList();
        PageInfo<Article> pageInfo = new PageInfo<>(articles);
        model.addObject("articles", pageInfo);
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

    /**
     * 删除文章id
     */
    @PostMapping("deleteArticle/{aid}")
    @ResponseBody
    public ResultVo deleteArticle(@PathVariable("aid") String aid) {
        ResultVo vo = new ResultVo();
        boolean flag = articleService.deleteArticle(aid);
        if (flag) {
            vo.setCode(ResultVo.SUCCESS);
            vo.setData("删除成功");
            return vo;
        }
        vo.setCode(ResultVo.MISSING);
        vo.setData("删除失败！");
        return vo;
    }

    @GetMapping("showRotationList")
    public ModelAndView showRotationList(ModelAndView model,
                                         @RequestParam(value = "page",defaultValue = "1")int page,
                                         @RequestParam(value = "size",defaultValue = "10")int size) {
        PageHelper.startPage(page,size);
        List<Rotation> rotations = rotationService.getAllRotationList();
        PageInfo<Rotation> pageInfo=new PageInfo<>(rotations);
        model.addObject("rotations", pageInfo);
        model.addObject("DateKit", new DateKit());
        model.setViewName("admin/rotation_list");
        return model;
    }


    @RequestMapping("showRotationAdd")
    public String getRotationAdd() {
        return "admin/rotation_add";
    }

    @ApiOperation("添加新的轮播图")
    @RequestMapping("addRotation")
    @ResponseBody
    public ResultVo addRotation(Rotation rotation) {
        ResultVo resultVo = new ResultVo();
        rotation.setRid(UUID.UU32());
        rotation.setCreateTime((long) DateKit.getCurrentUnixTime());
        System.out.println("rotation:  " + rotation);
        rotationService.addRotation(rotation);
        resultVo.setCode(ResultVo.SUCCESS);
        return resultVo;
    }

    @RequestMapping("changeRotationShowStatus")
    @ResponseBody
    public ResultVo changeRotationShowStatus(@RequestParam("rid") String rid, int status) {
        System.out.println(rid + "   " + status);
        ResultVo resultVo = new ResultVo();
        if (status > 1 || status < 0) {
            resultVo.setCode(404);
            resultVo.setData("无效的状态码");
            return resultVo;
        }
        if (status == 0) {
            status = 1;
        } else {
            status = 0;
        }
        if (rotationService.changeRotationShowStatus(rid, status)) {
            resultVo.setCode(200);
            resultVo.setData("success");
        } else {
            resultVo.setCode(400);
            resultVo.setData("update had failed");
        }
        return resultVo;

    }

    @RequestMapping("showRotationUpdate/{rid}")
    public ModelAndView getRotationUpdate(@PathVariable("rid") String rid, ModelAndView model) {
        Rotation rotation = rotationService.selectRotationByRid(rid);
        if (rotation == null) {
            model.setViewName("error/404");
            model.addObject("msg", "轮播图丢失了");
            return model;
        }
        model.setViewName("admin/rotation_update");
        model.addObject("rotation", rotation);
        return model;
    }

    @ApiOperation("更新轮播图")
    @RequestMapping("updateRotation")
    @ResponseBody
    public ResultVo updateRotation(Rotation rotation) {
        ResultVo resultVo = new ResultVo();
        System.out.println(rotation);
        if (rotation.getImgUrl().equals("")) rotation.setImgUrl(null);
        rotation.setUpdateTime((long) DateKit.getCurrentUnixTime());
        int i = rotationService.updateRotation(rotation);
        resultVo.setCode(ResultVo.SUCCESS);
        return resultVo;
    }

    @ApiOperation("删除轮播图")
    @RequestMapping("deleteRotation/{rid}")
    @ResponseBody
    public ResultVo deleteRotation(@PathVariable("rid") String rid) {
        ResultVo resultVo = new ResultVo();

        boolean flag = rotationService.deleteRotation(rid);

        if (flag) {
            resultVo.setCode(ResultVo.SUCCESS);
            return resultVo;
        }
        resultVo.setCode(ResultVo.MISSING);
        return resultVo;
    }
}
