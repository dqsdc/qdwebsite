package cn.anpe.website.controller.admin;

import cn.anpe.website.domain.*;
import cn.anpe.website.domain.vo.ResultVo;
import cn.anpe.website.service.ProductService;
import cn.anpe.website.service.SelectService;
import cn.anpe.website.util.UUID;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Auther: dqsdc
 * @Date: 2020-04-18 16:12
 * @Description: 后端选型控制
 */
@Controller
@RequestMapping("admin/select")
public class SelectController {

    @Autowired
    SelectService selectService;

    @Autowired
    ProductService productService;

    /**
     * 删除分类id
     */
    @PostMapping("deleteCategory/{pcid}")
    @ResponseBody
    public ResultVo deleteCategory(@PathVariable("pcid") String pcid) {
        ResultVo vo = new ResultVo();
        try {
            selectService.deleteCategory(pcid);
        } catch (Exception e) {
            vo.setData("该分类有对应产品，无法删除");
            vo.setCode(ResultVo.MISSING);
            return vo;
        }
        vo.setCode(ResultVo.SUCCESS);
        vo.setData("删除成功");
        return vo;
    }

    @RequestMapping("addCategory")
    @ResponseBody
    public ResultVo addCategory(ProductCategory productCategory) {
        ResultVo resultVo = new ResultVo();
        productCategory.setPcid(UUID.UU32());
        selectService.insertCategory(productCategory);
        resultVo.setCode(ResultVo.SUCCESS);
        return resultVo;
    }

    @RequestMapping("updateCategory")
    @ResponseBody
    public ResultVo updateCategory(ProductCategory productCategory) {
        ResultVo resultVo = new ResultVo();
        selectService.updateCategory(productCategory);
        resultVo.setCode(ResultVo.SUCCESS);
        return resultVo;
    }

    @RequestMapping("showUpdateCategory/{pcid}")
    public ModelAndView showUpdateCategory(ModelAndView model, @PathVariable("pcid") String pcid) {
        ProductCategory productCategory = selectService.selectCategoryByPcid(pcid);
        model.addObject("category", productCategory);
        model.setViewName("admin/select/category_update");
        return model;
    }

    @RequestMapping("showAddCategory")
    public ModelAndView showAddCategory(ModelAndView model) {
        model.setViewName("admin/select/category_add");
        return model;
    }

    @RequestMapping("showCategoryList")
    public ModelAndView showCategoryList(ModelAndView model,
                                         @RequestParam(value = "page", defaultValue = "1") int page,
                                         @RequestParam(value = "size", defaultValue = "10") int size) {
        model.setViewName("admin/select/categories_list");
        PageHelper.startPage(page, size);
        List<ProductCategory> categoryList = selectService.getAllCategoryList();
        PageInfo<ProductCategory> pageInfo = new PageInfo<>(categoryList);
        model.addObject("categories", pageInfo);
        return model;
    }

    @RequestMapping("showAddSubSeries/{pcid}")
    public ModelAndView showAddSubSeries(ModelAndView model,
                                         @PathVariable("pcid") String pcid) {
        model.addObject("pcid", pcid);
        model.setViewName("admin/select/subseries_add");
        return model;
    }

    @RequestMapping("addSubSeries")
    @ResponseBody
    public ResultVo addSubSeries(SubSeries subSeries) {
        ResultVo resultVo = new ResultVo();
        subSeries.setSid(UUID.UU32());
        selectService.addSubSeries(subSeries);
        resultVo.setCode(ResultVo.SUCCESS);
        return resultVo;
    }

    /**
     * 删除子分类
     */
    @PostMapping("deleteSubSeries/{sid}")
    @ResponseBody
    public ResultVo deleteSubSeries(@PathVariable("sid") String sid) {
        ResultVo vo = new ResultVo();
        try {
            selectService.deleteSubSeries(sid);
        } catch (Exception e) {
            vo.setData("该子分类有对应产品，无法删除");
            vo.setCode(ResultVo.MISSING);
            return vo;
        }
        vo.setCode(ResultVo.SUCCESS);
        vo.setData("删除成功");
        return vo;
    }

    @RequestMapping("updateSubSeries")
    @ResponseBody
    public ResultVo updateSubSeries(SubSeries subSeries) {
        ResultVo resultVo = new ResultVo();
        selectService.updateSubSeries(subSeries);
        resultVo.setCode(ResultVo.SUCCESS);
        return resultVo;
    }

    @RequestMapping("showUpdateSubSeries/{sid}")
    public ModelAndView showUpdateSubSeries(ModelAndView model, @PathVariable("sid") String sid) {
        SubSeries subSeries = selectService.selectSubSeriesBySid(sid);
        model.addObject("subSeries", subSeries);
        model.setViewName("admin/select/subSeries_update");
        return model;
    }

    @RequestMapping("showSubSeriesList")
    public ModelAndView showSubSeriesList(ModelAndView model,
                                          @RequestParam(value = "pcid", required = false) String pcid,
                                          @RequestParam(value = "categoryName", required = false) String categoryName,
                                          @RequestParam(value = "page", defaultValue = "1") int page,
                                          @RequestParam(value = "size", defaultValue = "10") int size) {
        model.setViewName("admin/select/subseries_list");
        List<ProductCategory> categoryList = selectService.getAllCategoryList();
        model.addObject("categories", categoryList);
        if (categoryList.size() == 0) return model;
        if (pcid == null || pcid.equals("")) {
            pcid = categoryList.get(0).getPcid();
            categoryName = categoryList.get(0).getShow();
        }
        PageHelper.startPage(page, size);
        List<SubSeries> seriesList = selectService.getAllSubSeriesList(pcid);
        PageInfo<SubSeries> pageInfo = new PageInfo<>(seriesList);
        model.addObject("categoryName", categoryName);
        model.addObject("pcid", pcid);
        model.addObject("subSeries", pageInfo);
        return model;
    }

    @RequestMapping("showAttributeList/{sid}")
    public ModelAndView showAttributeList(ModelAndView model,
                                          @PathVariable(value = "sid") String sid,
                                          @RequestParam(value = "page", defaultValue = "1") int page,
                                          @RequestParam(value = "size", defaultValue = "10") int size) {
        System.out.println(sid);
        model.setViewName("admin/select/attribute_list");
        PageHelper.startPage(page, size);
        List<Attribute> attributes = selectService.getAttributeList(sid);
        PageInfo<Attribute> pageInfo = new PageInfo<>(attributes);
        model.addObject("attributes", pageInfo);
        model.addObject("sid", sid);
        return model;
    }

    /**
     * 删除属性id
     */
    @PostMapping("deleteAttribute/{aid}")
    @ResponseBody
    public ResultVo deleteAttribute(@PathVariable("aid") String aid) {
        ResultVo vo = new ResultVo();
        try {
            selectService.deleteAttribute(aid);
        } catch (Exception e) {
            vo.setData("该属性有对应产品，无法删除");
            vo.setCode(ResultVo.MISSING);
            return vo;
        }
        vo.setCode(ResultVo.SUCCESS);
        vo.setData("删除成功");
        return vo;
    }

    @GetMapping("showUpdateAttribute/{aid}")
    public ModelAndView showAddArticle(ModelAndView model, @PathVariable("aid") String aid) {
        model.addObject("aid", aid);
        Attribute attribute = selectService.selectAttributeByAid(aid);
        model.addObject("attribute", attribute);
        model.setViewName("admin/select/attribute_update");
        return model;
    }

    @RequestMapping("updateAttribute")
    @ResponseBody
    public ResultVo updateAttribute(Attribute attribute) {
        System.out.println("update+    " + attribute);
        ResultVo resultVo = new ResultVo();
        selectService.updateAttribute(attribute);
        resultVo.setCode(ResultVo.SUCCESS);
        return resultVo;
    }


    @RequestMapping("addAttribute")
    @ResponseBody
    public ResultVo addAttribute(Attribute attribute) {
        ResultVo resultVo = new ResultVo();
        attribute.setAid(UUID.UU32());
        selectService.addAttribute(attribute);
        resultVo.setCode(ResultVo.SUCCESS);
        return resultVo;
    }

    @RequestMapping("showProductList")
    public ModelAndView showProductList(ModelAndView model, String pcid, String sid,
                                        @RequestParam(value = "page", defaultValue = "1") int page,
                                        @RequestParam(value = "size", defaultValue = "10") int size) {
        List<ProductCategory> categoryList = selectService.getAllCategoryList();
        model.addObject("categories", categoryList);//获得一级分类

        if (categoryList.size() == 0) {
            model.addObject("pcid", null);
            model.addObject("subSeries", null);
            model.addObject("sid", null);
            model.addObject("products", null);
            model.setViewName("admin/select/product_list");
            return model;
        }
        if (pcid == null || pcid.equals("")) {
            pcid = categoryList.get(0).getPcid();
        }
        List<SubSeries> seriesList = selectService.getAllSubSeriesList(pcid);
        model.addObject("pcid", pcid);
        model.addObject("subSeries", seriesList);
        System.out.println(seriesList.size());
        if (seriesList.size() == 0) {
            model.addObject("sid", sid);
            model.addObject("products", null);
            model.setViewName("admin/select/product_list");
            return model;
        }
        if (sid == null || sid.equals("")) {
            sid = seriesList.get(0).getSid();
        }
        PageHelper.startPage(page, size);
        List<Product> productList = selectService.getAllProductList(sid);
        PageInfo<Product> info = new PageInfo<>(productList);
        model.addObject("products", info);
        model.addObject("sid", sid);
        model.setViewName("admin/select/product_list");
        return model;
    }

    @RequestMapping("showAddProduct")
    public ModelAndView showAddProduct(ModelAndView model, String pcid, String sid) {
        model.addObject("pcid", pcid);
        model.addObject("sid", sid);
        model.setViewName("admin/select/product_add");
        return model;
    }

    @RequestMapping("addProduct")
    @ResponseBody
    public String addProduct(Product product) {
        productService.addProduct(product);
        return "success";
    }

    @RequestMapping("deleteProduct/{pid}")
    @ResponseBody
    public String deleteProduct(@PathVariable("pid") String pid) {
        productService.deleteProduct(pid);
        return "success";
    }

}
