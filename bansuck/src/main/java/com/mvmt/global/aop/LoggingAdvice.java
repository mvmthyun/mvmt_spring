package com.mvmt.global.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAdvice {
    @Around("execution(* com.mvmt.project.*(..))") // pointcut: 부가기능이 작용될 메서드의 패턴 ex) add*(..) add의 함수명을 입력하여 특정 함수만 적용할 수 있음
    public Object methodCallLog(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println(">>> [ START ] "+pjp.getSignature().getName() + Arrays.toString(pjp.getArgs()));
        
        Object result = pjp.proceed(); // target의 메서드 호출
        System.out.println("result="+result);
        
        System.out.println("[ END ] <<< "+(System.currentTimeMillis() - start)+"ms");
        return result;
    }

}
