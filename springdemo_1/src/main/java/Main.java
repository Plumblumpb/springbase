import config.MyConfig;
import entity.TemplateBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.MessageService;

/**
 * @Auther: cpb
 * @Date: 2018/11/30 14:19
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        // 用我们的配置文件来启动一个 ApplicationContext
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
//        ApplicationContext context1 = new FileSystemXmlApplicationContext("classpath:application.xml");
        ApplicationContext context2 = new AnnotationConfigApplicationContext(MyConfig.class);

        System.out.println("context 启动成功");

        // 从 context 中取出我们的 Bean，而不是用 new service.MessageServiceImpl() 这种方式
        MessageService messageService = context2.getBean(MessageService.class);
        TemplateBean templateBean = context2.getBean(TemplateBean.class);
        // 这句将输出: hello world
        System.out.println(messageService.getMessage());
    }
}
