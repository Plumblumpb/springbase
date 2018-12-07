package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @Auther: cpb
 * @Date: 2018/12/7 16:16
 * @Description:
 */
@Configuration
@ComponentScan(basePackages = {"controller"})
public class WebConfig extends WebMvcConfigurationSupport {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/html/");
        resolver.setSuffix(".html");
        return resolver;
    }
}
