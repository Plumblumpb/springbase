
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.FoodService;


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
        FoodService foodService = context.getBean(FoodService.class);
        foodService.makeNoodle("noodle");
        foodService.makeFish("fish");
    }
}
