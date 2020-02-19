package cn.anpe.website.controller;

import cn.anpe.website.util.UploadUtil;
import com.baidu.ueditor.ActionEnter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ServerController {
    @RequestMapping("/config")
    @ResponseBody
    public String config(HttpServletRequest request) {
        String rootPath = UploadUtil.getUploadFilePath() + "upload/";
        String msg= new ActionEnter(request, rootPath).exec();
        System.out.println(msg);
        return msg;
    }
}