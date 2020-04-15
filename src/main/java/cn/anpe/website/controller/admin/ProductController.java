package cn.anpe.website.controller.admin;

import cn.anpe.website.common.WebConst;
import cn.anpe.website.domain.*;
import cn.anpe.website.domain.vo.ResultVo;
import cn.anpe.website.service.ProductService;
import cn.anpe.website.util.DateKit;
import cn.anpe.website.util.UUID;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-04-14 22:33
 * @Description:
 */
@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("detail/{aid}")
    public ModelAndView detail(ModelAndView modelAndView, @PathVariable("aid") String aid) {
        ProductShow productShow = productService.getProductByAid(aid);
        if (productShow == null) {
            modelAndView.addObject("msg", "您访问的文章不存在");
            modelAndView.setViewName("error/404");
            return modelAndView;
        }
        modelAndView.addObject("product", productShow);
        modelAndView.addObject("DateKit", new DateKit());
        modelAndView.setViewName("front/product");
        return modelAndView;
    }

    @GetMapping("showUpdateProduct/{aid}")
    public ModelAndView showUpdateArticle(ModelAndView model, @PathVariable("aid") String aid) {
        ProductShow product = productService.getProductByAid(aid);
        List<ProductCategory> categories = productService.getAllCategory();
        model.addObject("allMeta", categories);
        model.addObject("product", product);
        model.setViewName("admin/product_update");
        return model;
    }

    @GetMapping("showProductList")
    public ModelAndView showProductList(ModelAndView model,
                                        @RequestParam(value = "page", defaultValue = "1") int page,
                                        @RequestParam(value = "size", defaultValue = "10") int size) {
        PageHelper.startPage(page, size);
        List<ProductShow> products = productService.getAllProductList();
        PageInfo<ProductShow> pageInfo = new PageInfo<>(products);
        model.addObject("products", pageInfo);
        model.setViewName("admin/product_list");
        return model;
    }

    @GetMapping("showAddProduct")
    public ModelAndView showAddArticle(ModelAndView model) {
        List<ProductCategory> categories = productService.getAllCategory();
        model.addObject("categories", categories);
        model.setViewName("admin/product_add");
        return model;
    }

    @PostMapping("addProduct")
    @ResponseBody
    public ResultVo addProduct(ProductShow productShow, @PathParam("meta") String meta, HttpSession session) {
        ResultVo vo = new ResultVo();
        if (meta == null || "".equals(meta)) {
            vo.setCode(404);
            vo.setData("标签错误");
            return vo;
        }
        String pcid = meta.split("&&")[0];
        String show = meta.split("&&")[1];
        User user = (User) session.getAttribute(WebConst.SESSION_USER);
        productShow.setAid(UUID.UU32());
        productShow.setAuthorId(user.getUid());
        productShow.setAuthorName(user.getScreenName());
        productShow.setCreateTime((long) DateKit.getCurrentUnixTime());
        productShow.setStatus(1);
        productShow.setPcid(pcid);
        productShow.setPcShow(show);
        productShow.setCommentNum(0);
        productShow.setHits(0);
        productShow.setOrderBy(0);
        System.out.println(productShow);
        productService.addProduct(productShow);
        vo.setCode(200);
        vo.setUrl("/product/showProductList");
        return vo;
    }

    /**
     * 删除文章id
     */
    @PostMapping("deleteProduct/{aid}")
    @ResponseBody
    public ResultVo deleteProduct(@PathVariable("aid") String aid) {
        ResultVo vo = new ResultVo();
        boolean flag = productService.deleteProduct(aid);
        if (flag) {
            vo.setCode(ResultVo.SUCCESS);
            vo.setData("删除成功");
            return vo;
        }
        vo.setCode(ResultVo.MISSING);
        vo.setData("删除失败！");
        return vo;
    }

    @PostMapping("updateProduct")
    @ResponseBody
    public ResultVo updateProduct(ProductShow productShow, @PathParam("meta") String meta, HttpSession session) {
        ResultVo vo = new ResultVo();
        if (meta == null || "".equals(meta)) {
            vo.setCode(404);
            vo.setData("标签错误");
            return vo;
        }
        User user = (User) session.getAttribute(WebConst.SESSION_USER);
        String pcid = meta.split("&&")[0];
        String show = meta.split("&&")[1];
        productShow.setPcid(pcid);
        productShow.setPcShow(show);
        System.out.println("--------------------"+productShow);
        productService.updateArticle(productShow);//添加文章内容及其所属分类
        vo.setCode(200);
        vo.setUrl("/product/showProductList");
        return vo;
    }

    @RequestMapping("changeProductShowStatus")
    @ResponseBody
    public ResultVo changeProductShowStatus(@RequestParam("aid") String aid, int status) {
        ResultVo resultVo = new ResultVo();
        if (status > 1 || status < 0) {
            resultVo.setCode(404);
            resultVo.setData("无效的状态码");
            return resultVo;
        }
        if (status == 0) {
            status = 1;
        } else {
            status = 0;
        }
        if (productService.changeProductShowStatus(aid, status)) {
            resultVo.setCode(200);
            resultVo.setData("success");
        } else {
            resultVo.setCode(400);
            resultVo.setData("update had failed");
        }
        return resultVo;

    }
}
