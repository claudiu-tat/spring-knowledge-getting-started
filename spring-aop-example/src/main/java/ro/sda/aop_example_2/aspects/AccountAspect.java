package ro.sda.aop_example_2.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import ro.sda.aop_example_2.annotation.LoggerAudit;

@Component
@Aspect
public class AccountAspect {

    @After("execution(* ro.sda.aop_example_2.services.AccountService.*(..))")
    public void after() {
        System.out.println("After");
    }

    @AfterReturning("@annotation(ro.sda.aop_example_2.annotation.LoggerAudit)")
    public void afterReturning(JoinPoint j) {
        MethodSignature methodSignature = (MethodSignature) j.getSignature();
        String message = methodSignature.getMethod().getAnnotation(LoggerAudit.class).value();
        System.out.println("Method: " + methodSignature.getMethod().getName() + " returned with message: " + message);
    }
}
