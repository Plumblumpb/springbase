package aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Auther: cpb
 * @Date: 2019/1/18 17:16
 * @Description:
 */
public class LogRetureAdvice implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("返回值："+o);
    }
}
