package cn.anpe.website.controller.front;

import cn.anpe.website.domain.ProductCategory;
import cn.anpe.website.domain.ProductShow;
import cn.anpe.website.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-04-15 21:22
 * @Description: 用户访问前端
 */
@Controller
@RequestMapping("front/product")
public class FrontProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("list")
    public ModelAndView showProductList(ModelAndView model,
                                        @RequestParam(value = "category", required = false) String category,
                                        @RequestParam(value = "cname", required = false) String cname) {
        List<ProductCategory> categories = productService.getAllCategory();
        if (categories.size() != 0) {
            if (category == null || category.equals("")){
                category = categories.get(0).getPcid();
                cname=categories.get(0).getShow();
            }
            List<ProductShow> products = productService.getProductListByCategory(category);
            model.addObject("categories", categories);
            model.addObject("cname", cname);
            model.addObject("products", products);
        }
        model.setViewName("front/product/product_list");
        return model;
    }

}
