package com.eureka.scope.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.eureka.scope.beans.SingletonBean;

/**
 * @author Vikash Singh
 *
 */
@Configuration
@ComponentScan(basePackageClasses = SingletonBean.class)
public class AppConfig {

	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		SingletonBean bean = context.getBean(SingletonBean.class);
		bean.showMessage();
		Thread.sleep(1000);

		bean = context.getBean(SingletonBean.class);
		bean.showMessage();
	}
}