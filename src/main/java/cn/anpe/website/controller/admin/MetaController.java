package cn.anpe.website.controller.admin;

import cn.anpe.website.domain.Article;
import cn.anpe.website.domain.Meta;
import cn.anpe.website.service.MetaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-04-08 22:26
 * @Description:
 */
@Controller
@RequestMapping("meta")
public class MetaController {
    @Autowired
    MetaService metaService;

    @GetMapping("showMetaList")
    public ModelAndView showMetaList(ModelAndView model,
                                     @RequestParam(value = "page", defaultValue = "1") int page,
                                     @RequestParam(value = "size", defaultValue = "10") int size) {
        PageHelper.startPage(page, size);
        List<Meta> metas = metaService.getAllMetas();
        PageInfo<Meta> pageInfo = new PageInfo<>(metas);
        model.addObject("metas", pageInfo);
        model.setViewName("admin/meta_list");
        return model;
    }
}
