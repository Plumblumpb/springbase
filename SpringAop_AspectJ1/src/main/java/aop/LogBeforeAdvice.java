package aop;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import java.util.Arrays;

/**
 * @Auther: cpb
 * @Date: 2019/1/18 17:05
 * @Description:
 */
@Aspect
public class LogBeforeAdvice  {
    private Boolean parameter;

    public Boolean getParameter() {
        return parameter;
    }

    public void setParameter(Boolean parameter) {
        this.parameter = parameter;
    }

    @Before("aop.SystemArchitecture.businessService()")
    public void logArgs(JoinPoint joinPoint) {
        if (parameter) {
            System.out.println("[@AspectJ]方法执行前，打印入参：" + Arrays.toString(joinPoint.getArgs()));
        }
    }
}
