package cn.anpe.website.configration;

import cn.anpe.website.util.UploadUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: dqsdc
 * @Date: 2019-12-26 14:51
 * @Description:
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println(UploadUtil.getUploadFilePath());
        registry.addResourceHandler("/upload/**").addResourceLocations("file:/"+ UploadUtil.getUploadFilePath()+"/upload/");
    }
}
