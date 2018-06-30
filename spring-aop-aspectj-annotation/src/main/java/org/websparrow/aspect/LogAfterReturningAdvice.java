package org.websparrow.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAfterReturningAdvice {

	@AfterReturning(pointcut = "execution(* org.websparrow.service.Bank*.*(..))", returning = "status")
	public void logAfterReturning(Object status) {

		System.out.println("\nExecution status of deposit() method is: " + status);

		System.out.println(".............I WILL EXECUTE AFTER DEPOSIT METHOD WHEN IT RETURN SOMETHING.............");

	}
}
