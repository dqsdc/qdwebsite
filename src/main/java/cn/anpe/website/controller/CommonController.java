package cn.anpe.website.controller;

import cn.anpe.website.common.WebConst;
import cn.anpe.website.domain.vo.ResultVo;
import cn.anpe.website.util.UUID;
import cn.anpe.website.util.UploadUtil;
import cn.anpe.website.util.identify.GifCaptcha;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.io.File;
import java.io.IOException;

/**
 * @Auther: dqsdc
 * @Date: 2020-01-02 11:07
 * @Description:
 */
@Api("通用配置接口")
@RequestMapping("common")
@Controller
public class CommonController {

    @ApiOperation("图片验证码")
    @GetMapping("captcha")
    public void captcha(HttpServletResponse response, HttpSession session) {
        GifCaptcha gifCaptcha = new GifCaptcha(120, 40);
        String s = new String(gifCaptcha.getText());
        try {
            gifCaptcha.out(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        session.setAttribute(WebConst.IDENTIFY_CODE, s);
        System.out.println("验证码：" + s);
    }

    // post common-fileupload

    /**
     * @Param mybatis中使用的
     * @PathParam 获取request 中name属性中对应的值 <input type="text" name="username">
     * @PathVariable 获取mapping路径中的值  @PostMapping("uploadImg/{id}")
     * @RequestParam 获取request头中的属性
     */
    @PostMapping("uploadImg")
    @ResponseBody
    public ResultVo uploadImg(@RequestParam("thumb") MultipartFile file) {
        ResultVo resultVo = new ResultVo();
        System.out.println(file.getOriginalFilename());
        if (file.isEmpty()) {
            resultVo.setCode(404);
            return resultVo;
        }
        String fileName = file.getOriginalFilename();
        String real = UploadUtil.getUploadFilePath();//C:/data/website
        String filePath = "/upload/uploadImg/";
        String prefix = UUID.UU32().substring(6);
        File dest = new File(real + filePath + prefix + fileName);
        try {
            file.transferTo(dest);
            System.out.println("上传成功");
            resultVo.setData(filePath + prefix + fileName);
            resultVo.setCode(200);
            return resultVo;
        } catch (IOException e) {
            System.out.println("失败");
        }
        resultVo.setCode(404);
        resultVo.setData("上传失败");
        return resultVo;
    }
}
