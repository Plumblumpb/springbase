package config;

import entity.ExampleBean;
import entity.TemplateBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import service.MessageService;
import service.MessageServiceImpl;

/**
 * @Auther: cpb
 * @Date: 2018/12/26 10:50
 * @Description:
 */
@Configuration
public class MyConfig {
    @Bean()
    public ExampleBean exampleBean(){
        return  new ExampleBean();
    }


    @Bean(initMethod = "init", destroyMethod = "cleanUp")
    @Scope("singleton")//prototype
    public TemplateBean myTemplateBean() {
        TemplateBean templateBean = new TemplateBean(123,"test");
        templateBean.setExampleBean(exampleBean());
        templateBean.setIntegerProperty(123);
        return templateBean;
    }

    @Bean
    public MessageService messageService(){
        return new MessageServiceImpl();
    }
}
