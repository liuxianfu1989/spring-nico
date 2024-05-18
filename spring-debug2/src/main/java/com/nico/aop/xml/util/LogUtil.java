package com.nico.aop.xml.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

import java.util.Arrays;

public class LogUtil {

	public void myPointCut() {}

	public void myPointCut1() {}

	private int start(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		Object[] args = joinPoint.getArgs();
		System.out.println("log--start---" + signature.getName() + "方法开始执行：参数是：" + Arrays.asList(args));
		return 100;
	}

	public static void stop(JoinPoint joinPoint, Object result) {
		Signature signature = joinPoint.getSignature();
		System.out.println("log--stop---" + signature.getName() + "方法执行结束，结果是： " + result);
	}

	public static void logException(JoinPoint joinPoint, Exception e) {
		Signature signature = joinPoint.getSignature();
		System.out.println("log--exception---" + signature.getName() + "方法抛出异常： " + e.getMessage());
	}

	public static void logFinally(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		System.out.println("log--finally---" + signature.getName() + "方法执行结束。。。Over");
	}

	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		Signature signature = pjp.getSignature();
		Object[] args = pjp.getArgs();
		Object result = null;
		try {
			System.out.println("log--around--start---" + signature.getName() + "方法开始执行，参数为： " + Arrays.asList(args));
			result = pjp.proceed(args);
			System.out.println("log--around--stop---" + signature.getName() + "方法执行结束");
		} catch (Throwable throwable) {
			System.out.println("log--around--exception---" + signature.getName() + "出现异常");
			throw throwable;
		} finally {
			System.out.println("log--around--finally---" + signature.getName() + "方法返回结果是：" + result);
		}
		return result;
	}
}
