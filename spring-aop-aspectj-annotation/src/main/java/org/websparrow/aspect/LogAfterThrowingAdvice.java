package org.websparrow.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAfterThrowingAdvice {

	@AfterThrowing(pointcut = "execution(* org.websparrow.service.Bank*.*(..))", throwing = "ex")
	public void logAfterThrowing(Exception ex) {

		System.out.println(".............I WILL EXECUTE WHEN ANY EXECEPTION OCCURED.............");

	}

}
