package org.websparrow.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAfterAdvice {

	@After("execution(* org.websparrow.service.Bank*.*(..))")
	public void logAfter() {
		System.out.println(".............I WILL EXECUTE AFTER DEPOSIT METHOD.............");
	}
}
