package aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Auther: cpb
 * @Date: 2019/1/18 17:05
 * @Description:
 */
public class LogBeforeAdvice implements MethodBeforeAdvice {
    /**
     *
     * @param method 方法名称
     * @param objects 参数名称
     * @param o 类权限名称
     * @throws Throwable
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("objects:"+objects[0].toString());
        System.out.println("o"+o.toString());
        System.out.println("方法名称："+method.getName());
    }
}
