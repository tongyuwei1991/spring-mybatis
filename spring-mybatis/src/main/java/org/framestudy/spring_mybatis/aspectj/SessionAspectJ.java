package org.framestudy.spring_mybatis.aspectj;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.ibatis.session.SqlSession;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.framestudy.spring_mybatis.utils.SessionUtils;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SessionAspectJ {
	SqlSession session = null;
	
	@Before(value="execution(* org.framestudy.spring_mybatis.*mag.dao.impl.*.*(..))")
	public void beforeAdvice(JoinPoint jp){
		
		Object obj=jp.getTarget();
		Class<?> cls = obj.getClass();
		session= SessionUtils.getSession();
		Method meth;
		try {
			meth = cls.getMethod("setSession",SqlSession.class);
			meth.invoke(obj, session);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@AfterReturning(returning="obj",pointcut="execution(* org.framestudy.spring_mybatis.*mag.dao.impl.*.*(..))")
	public void afterReturning(JoinPoint jp,Object obj){
		session.commit();
		session.close();
	}
	
	@AfterThrowing(throwing="obj",pointcut="execution(* org.framestudy.spring_mybatis.*mag.dao.impl.*.*(..))")
	public void afterThrowing(JoinPoint jp,Object obj){
		session.rollback();
		session.close();
	}
}
