package cn.anpe.website.controller;



import cn.anpe.website.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("test")
    public String test() {
        return "test";
    }

    @RequestMapping("error/404")
    public String error(){
        return "error/404";
    }
}
