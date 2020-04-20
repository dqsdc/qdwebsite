package cn.anpe.website.controller.front;

import cn.anpe.website.domain.Product;
import cn.anpe.website.domain.SubSeries;
import cn.anpe.website.domain.vo.AttributeVo;
import cn.anpe.website.domain.vo.SelectVo;
import cn.anpe.website.service.SelectService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-04-16 21:17
 * @Description: 前端显示select查询数据
 */
@Controller
@RequestMapping("select")
public class SelectProductController {

    @Autowired
    SelectService selectService;

    @RequestMapping("index")
    public ModelAndView index(ModelAndView model,
                              @RequestParam(value = "sid", required = false) String sid,
                              @RequestParam(value = "xilie", required = false) String xilie,
                              @RequestParam(value = "page", defaultValue = "1") int page,
                              @RequestParam(value = "limit", defaultValue = "10") int limit) {
        model.setViewName("front/select");
        //侧边栏目
        List<SelectVo> voList = selectService.getSelectVo();
        model.addObject("selectVo", voList);

        if (voList.size() > 0) {
            if (sid == null) {
                SelectVo vo = voList.get(0);
                List<SubSeries> subSeries = vo.getSubSeries();
                if (subSeries.size() > 0) {
                    SubSeries series = subSeries.get(0);
                    sid = series.getSid();
                }
            }
            //第三分类
            List<String> serList = selectService.getProductSerList(sid);
            model.addObject("serList", serList);

            //属性表
            List<AttributeVo> attributeVo = selectService.getAttributeVo(sid);
            model.addObject("attributeVo", attributeVo);

            //产品
            PageHelper.startPage(page, limit);
            List<Product> products;
            if (xilie == null) {
                products = selectService.getAllProductList(sid);
            } else {
                products = selectService.getProductListBySeries(sid, xilie);
            }
            PageInfo<Product> pageInfo = new PageInfo<>(products);
            model.addObject("products", pageInfo);

            model.addObject("sid", sid);
            model.addObject("xilie", xilie);
        }
        return model;
    }
}
