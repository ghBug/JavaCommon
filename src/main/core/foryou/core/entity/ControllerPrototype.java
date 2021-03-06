package foryou.core.entity;

import java.lang.reflect.Field;
import java.util.Map;

import foryou.core.base.BaseController;

/** 
* @author 罗林 E-mail:1071893649@qq.com 
* @version 创建时间：2018年1月11日 上午1:10:55 
* 类说明 
*/
public class ControllerPrototype {

	/**
	 * 控制器类路径
	 * eg:com.foryou.core.mvc.TestController
	 */
	public BaseController controller;
	
	/**
	 * 拦截器类路径
	 */
	public String interceptorClassPath;
	
	/**
	 * 控制器类里的所有属性map
	 * String 
	 */
	public Map<String, Field> fieldMap;
	
	/**
	 * 控制器类里的所有方法map
	 * String 
	 */
	public Map<String, ControllerMethod> methodMap;

	public BaseController getController() {
		return controller;
	}

	public void setController(BaseController controller) {
		this.controller = controller;
	}

	public String getInterceptorClassPath() {
		return interceptorClassPath;
	}

	public void setInterceptorClassPath(String interceptorClassPath) {
		this.interceptorClassPath = interceptorClassPath;
	}

	public Map<String, Field> getFieldMap() {
		return fieldMap;
	}

	public void setFieldMap(Map<String, Field> fieldMap) {
		this.fieldMap = fieldMap;
	}

	public Map<String, ControllerMethod> getMethodMap() {
		return methodMap;
	}

	public void setMethodMap(Map<String, ControllerMethod> methodMap) {
		this.methodMap = methodMap;
	}

}
