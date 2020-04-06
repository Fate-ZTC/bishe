package com.xxl.api.admin.controller.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 权限限制
 * @author ztc 2019-09-12 18:29:02
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PermessionLimit {
	
	/**
	 * 要求用户登录
	 */
	boolean limit() default true;

	/**
	 * 要求管理员权限
	 */
	boolean superUser() default false;

	/**
	 * 要求产品经理权限
	 */
	boolean projectManager() default false;

	/**
	 * 要求开发组长权限
	 */
	boolean teamLeader() default false;

}