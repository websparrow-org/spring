package org.websparrow.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogBeforeAdvice {

	// It will execute only for Bank's deposit method
	@Pointcut("execution(* org.websparrow.service.Bank.deposit(..))")
	public void depositPointcut() {
	}

	@Before("depositPointcut()")
	public void logBefore() {

		System.out.println(".............I WILL EXECUTE ONLY BEFORE DEPOSIT METHOD.............");
	}
}
