package cn.anpe.website.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: dqsdc
 * @Date: 2020-02-11 22:17
 * @Description:
 */
@Controller
@RequestMapping("news")
public class NewsController {
    @GetMapping
    public void show(){

    }
}
