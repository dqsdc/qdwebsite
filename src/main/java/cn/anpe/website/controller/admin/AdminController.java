package cn.anpe.website.controller.admin;

import cn.anpe.website.common.WebConst;
import cn.anpe.website.domain.User;
import cn.anpe.website.domain.vo.ResultVo;
import cn.anpe.website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

/**
 * @Auther: dqsdc
 * @Date: 2020-01-02 10:49
 * @Description:
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    UserService userService;

    @GetMapping("index")
    public ModelAndView index(ModelAndView model) {
        model.setViewName("admin/index");
        return model;
    }

    @GetMapping("index/{auth}")
    public ModelAndView index(HttpSession session, ModelAndView model, @PathVariable("auth") String auth) {
        User user = (User) session.getAttribute(WebConst.SESSION_USER);
        if (user == null || auth == null || !user.getUid().equals(auth)) {
            model.setViewName("error/404");
        } else {
            model.setViewName("admin/index");
        }
        return model;
    }

    @GetMapping("login")
    public String login() {
        return "admin/login";
    }


    @PostMapping("loginSure")
    @ResponseBody
    public ResultVo loginSure(HttpSession session, @PathParam("username") String username, @PathParam("password") String password, @PathParam("captcha") String captcha) {
        ResultVo resultVo = new ResultVo();
        System.out.println(username + "   " + password + "  " + captcha);
        String code = (String) session.getAttribute(WebConst.IDENTIFY_CODE);
        System.out.println(code);
        if (!code.toUpperCase().equals(captcha.toUpperCase())) {
            resultVo.setCode(ResultVo.MISSING);//验证码错误
            resultVo.setData("验证码错误");
            return resultVo;
        }
       User user= userService.userLogin(username, password);
        System.out.println(user);
        if (user == null) {
            resultVo.setCode(401);//登录失败
            return resultVo;
        }
        session.setAttribute(WebConst.SESSION_USER, user);
        resultVo.setCode(200);
        resultVo.setAuth(user.getUid());
        resultVo.setUrl("/admin/index/");
        return resultVo;
    }
}
