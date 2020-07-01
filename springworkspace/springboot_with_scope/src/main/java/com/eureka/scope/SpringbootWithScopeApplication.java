package com.eureka.scope;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eureka.scope.beans.SingletonBean;
import com.eureka.scope.config.AppConfig;

/**
 * @author Vikash Singh
 *
 */
@SpringBootApplication
public class SpringbootWithScopeApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		SingletonBean bean1 = context.getBean(SingletonBean.class);
		bean1.setCountryTime("India Time");
		SingletonBean bean2 = context.getBean(SingletonBean.class);
		bean2.setCountryTime("Patna Time");
		System.out.println(bean1.getCountryTime() + ":" + bean1.showMessage());
		System.out.println(bean2.getCountryTime() + ":" + bean2.showMessage());
	}

}
