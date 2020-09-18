package cn.besbing.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@Configuration
public class URLConfig extends WebMvcConfigurerAdapter {
    //虚拟路径
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/url/fileReport/**").addResourceLocations("file:/D:/Lims_COA_ShareMenu/frreport/source/");
        registry.addResourceHandler("/url/fineReport/**").addResourceLocations("h");
        super.addResourceHandlers(registry);
    }
}
