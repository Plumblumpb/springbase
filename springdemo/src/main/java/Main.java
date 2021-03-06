import entity.TemplateBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MessageService;

import java.util.Hashtable;

/**
 * @Auther: cpb
 * @Date: 2018/11/30 14:19
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        // 用我们的配置文件来启动一个 ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
//        ApplicationContext context1 = new FileSystemXmlApplicationContext("D:application.xml");
//        ApplicationContext context2 = new AnnotationConfigApplicationContext("classpath:application.xml");

        System.out.println("context 启动成功");
        BeanFactory beanFactory = context;
        // 从 context 中取出我们的 Bean，而不是用 new service.MessageServiceImpl() 这种方式
        MessageService messageService = context.getBean(MessageService.class);
        TemplateBean templateBean = context.getBean(TemplateBean.class);
        // 这句将输出: hello world
        System.out.println(messageService.getMessage());

    }
}
