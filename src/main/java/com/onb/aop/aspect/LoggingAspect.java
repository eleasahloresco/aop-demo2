package com.onb.aop.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.onb.aop.service.*.*(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("args : " + Arrays.toString(joinPoint.getArgs()));
		System.out.println("******");
	}

	// @Before("within(com.onb.aop.service.*)")
	// public void logBeforeWithin(JoinPoint joinPoint) {
	// System.out.println("******");
	// System.out.println("logBeforeWithin() is running!");
	// System.out.println("hijacked : " + joinPoint.getSignature().getName());
	// System.out.println("******");
	// }

	// @Before("this(com.onb.aop.service.CustomerService)")
	// public void logBeforeThis(JoinPoint joinPoint) {
	// System.out.println("******");
	// System.out.println("logBeforeThis() is running!");
	// System.out.println("hijacked : " + joinPoint.getSignature().getName());
	// System.out.println("******");
	// }

	// @Before("args(java.io.Serializable, ..)")
	// public void logBeforeArgs(JoinPoint joinPoint) {
	// System.out.println("******");
	// System.out.println("logBeforeArgs() is running!");
	// System.out.println("hijacked : " + joinPoint.getSignature().getName());
	// System.out.println("hijacked arguments : " +
	// Arrays.toString(joinPoint.getArgs()));
	// System.out.println("******");
	// }

	// @After("execution(* com.onb.aop.service.CustomerService.addCustomer(..))")
	// public void logAfter(JoinPoint joinPoint) {
	//
	// System.out.println("logAfter() is running!");
	// System.out.println("hijacked : " + joinPoint.getSignature().getName());
	// System.out.println("******");
	//
	// }

	// @AfterReturning(pointcut =
	// "execution(* com.onb.aop.service.CustomerService.*(..))", returning =
	// "result")
	// public void logAfterReturning(JoinPoint joinPoint, Object result) {
	//
	// System.out.println("logAfterReturning() is running!");
	// System.out.println("hijacked : " + joinPoint.getSignature().getName());
	// System.out.println("Method returned value is : " + result);
	// System.out.println("******");
	//
	// }

	// @AfterThrowing(pointcut =
	// "execution(* com.onb.aop.service.CustomerService.addCustomerThrowException(..))",
	// throwing = "error")
	// public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
	//
	// System.out.println("logAfterThrowing() is running!");
	// System.out.println("hijacked : " + joinPoint.getSignature().getName());
	// System.out.println("Exception : " + error);
	// System.out.println("******");
	//
	// }
	//
	// @Around("execution(* com.onb.aop.service.CustomerService*.*Delete(..))")
	// public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
	//
	// System.out.println("******");
	// System.out.println("hijacked method : " +
	// joinPoint.getSignature().getName());
	// System.out.println("hijacked arguments : " +
	// Arrays.toString(joinPoint.getArgs()));
	//
	// System.out.println("Around before is running!");
	// joinPoint.proceed();
	// System.out.println("Around after is running!");
	//
	// System.out.println("******");
	//
	// }

}
