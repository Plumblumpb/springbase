package config;

import entity.ExampleBean;
import entity.MyTemplateBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
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
    public MyTemplateBean myTemplateBean() {
        MyTemplateBean myTemplateBean = new MyTemplateBean(123,"test");
        myTemplateBean.setExampleBean(exampleBean());
        myTemplateBean.setIntegerProperty(123);
        return myTemplateBean;
    }

    @Bean
    public MessageService messageService(){
        return new MessageServiceImpl();
    }
}
