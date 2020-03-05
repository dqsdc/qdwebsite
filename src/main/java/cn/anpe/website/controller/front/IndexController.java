package cn.anpe.website.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: dqsdc
 * @Date: 2020-02-20 22:03
 * @Description:
 */
@Controller
@RequestMapping("main")
public class IndexController {

    @RequestMapping("index")
    public String index(){
        return "front/Index";
    }
}
