package com.test.demo;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类：切入点+通知（具体增强）
 * @author qiang
 *
 **/
public class MyAspectXml {

	public void log(){
		
		System.out.println("记录日志...");
	}
	
	public void after(){
		
		System.out.println("最终通知...");
	}
	
	public void afterReturn(){
		
		System.out.println("后置通知...");
	}
	public void around(ProceedingJoinPoint jointPoint){
		
		System.out.println("环绕通知1...");
		
		//手动开启目标函数
		try {
			jointPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("环绕通知2...");
	}
}
