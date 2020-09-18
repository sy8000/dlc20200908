package cn.besbing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "cn.besbing.*")
@ComponentScan(basePackages = "cn.besbing.*")
@EnableScheduling
@EnableCaching
public class DloadercloudApplication extends WebMvcConfigurationSupport {

    public static void main(String[] args) {
        SpringApplication.run(DloadercloudApplication.class, args);
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
        registry.addResourceHandler("/fileReport/**").addResourceLocations("file:D:\\Lims_COA_ShareMenu\\frreport\\source\\");
        registry.addResourceHandler("/resignReport/**").addResourceLocations("file:D:\\resignreport\\");
        registry.addResourceHandler("/finalReport/**").addResourceLocations("file:D:\\resignreport\\finalresign\\");
        //D:\resignreport\finalresign
        super.addResourceHandlers(registry);
    }
}
