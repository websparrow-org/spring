package org.websparrow.service;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class PointcutService extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> targetClass) {

		String methodName = method.getName();

		if (methodName.equals("deposit")) {
			return true;
		} else {
			return false;
		}
	}
}
