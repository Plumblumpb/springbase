package aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @Auther: cpb
 * @Date: 2019/1/18 17:16
 * @Description:
 */
@Aspect
public class LogRetureAdvice  {
    @AfterReturning(pointcut = "aop.SystemArchitecture.businessService()", returning = "result")
    public void logResult(Object result) {
            System.out.println("[@AspectJ]返回值：" + result);
    }
}
