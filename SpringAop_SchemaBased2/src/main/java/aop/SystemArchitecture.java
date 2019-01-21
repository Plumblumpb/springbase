package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Auther: cpb
 * @Date: 2019/1/21 17:51
 * @Description:
 */
@Aspect
public class SystemArchitecture {

//    @Pointcut("within(web..*)")
//    public void inWebLayer() {}

    @Pointcut("within(service..*)")
    public void inServiceLayer() {}

//    @Pointcut("within(dao..*)")
//    public void inDataAccessLayer() {}

    @Pointcut("execution(* service.*.*(..))")
    public void businessService() {}

//    @Pointcut("execution(* dao.*.*(..))")
//    public void dataAccessOperation() {}
}
