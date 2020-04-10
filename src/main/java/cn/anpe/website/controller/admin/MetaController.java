package cn.anpe.website.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: dqsdc
 * @Date: 2020-04-08 22:26
 * @Description:
 */
@Controller
@RequestMapping("meta")
public class MetaController {
    @GetMapping("showMetaList")
    public String showMetaList() {
        return "admin/meta_list";
    }
}
