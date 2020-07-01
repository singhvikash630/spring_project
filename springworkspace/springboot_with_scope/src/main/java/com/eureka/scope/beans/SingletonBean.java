package com.eureka.scope.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @author Vikash Singh
 *
 */
@Component
public class SingletonBean {
	String countryTime;

	public String getCountryTime() {
		return countryTime;
	}

	public void setCountryTime(String countryTime) {
		this.countryTime = countryTime;
	}

	public String showMessage() {
		PrototypeBean bean = getPrototypeBean();
		 return bean.getDateTime();
	}

	@Lookup
	public PrototypeBean getPrototypeBean() {
		// spring will override this method
		return null;
	}
}
