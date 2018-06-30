package org.websparrow.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAroundAdvice {

	@Around("execution(* org.websparrow.service.Bank*.*(..))")
	public void logAround(ProceedingJoinPoint jp) throws Throwable {

		System.out.println(".............I WILL EXECUTE BEFORE DEPOSIT METHOD.............");
		jp.proceed();
		System.out.println(".............I WILL EXECUTE AFTER DEPOSIT METHOD.............");
	}
}
