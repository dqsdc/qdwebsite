package cn.anpe.website.configration;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @Auther: dqsdc
 * @Date: 2020-04-09 20:30
 * @Description:
 */
@Configuration
public class PageHelperConfig {
    @Bean
    public PageHelper pageHelper() {
        PageHelper helper = new PageHelper();
        Properties properties = new Properties();
        //设置为true，会将RowBounds第一个参数offset当成pageNum页码使用
        properties.setProperty("offsetAsPageNum", "true");

        //设置为true，使用RowBounds分页进行count查询
        properties.setProperty("rowBoundsWithCount", "true");
        properties.setProperty("reasonable", "true");
        helper.setProperties(properties);
        return helper;
    }

}
