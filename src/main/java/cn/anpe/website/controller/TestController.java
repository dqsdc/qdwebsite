package cn.anpe.website.controller;


import cn.anpe.website.dao.ArticleMapper;
import cn.anpe.website.domain.Article;
import cn.anpe.website.service.TestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2019-12-29 17:41
 * @Description:
 */
@Controller
public class TestController {

    @RequestMapping("index")
    public String indexHtml() {
        return "index";
    }


    @Autowired
    TestService service;

    @Autowired
    ArticleMapper mapper;

    @RequestMapping("test")
    public String test() {
        return "test";
    }

    @RequestMapping("error/404")
    public String error() {
        return "error/404";
    }

    @RequestMapping("mapper")
    @ResponseBody
    public  PageInfo<Article> testMapper() {
        PageHelper.startPage(1,1);
        List<Article> list = mapper.selectAll();
        PageInfo<Article> info=new PageInfo<>(list);
        return info;
    }
}
