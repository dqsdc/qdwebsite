package cn.anpe.website.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: dqsdc
 * @Date: 2020-02-11 22:29
 * @Description: 公司大类：公司简介、企业理念、企业领军、资质荣誉、智能制造、两化融合、技术研发
 */
@Controller
@RequestMapping("company")
public class CompanyController {
    //公司简介
    @GetMapping("/showProfile")
    public String showProfile() {
        return "front/company/profile";
    }

    //资质荣誉
    @GetMapping("/showHonour")
    public String showHonour() {
        return "front/company/honour";
    }

    //企业理念
    @GetMapping("/showIdea")
    public String showIdea() {
        return "front/company/idea";
    }

    //企业领军
    @GetMapping("/showLeader")
    public String showLeader() {
        return "front/company/leader";
    }

    //两化融合
    @GetMapping("/showMix")
    public String showMix() {
        return "front/company/mix";
    }

    //两化融合
    @GetMapping("/showProduce")
    public String showProduce() {
        return "front/company/produce";
    }

    //技术研发
    @GetMapping("/showTech")
    public String showTech() {
        return "front/company/tech";
    }
}
