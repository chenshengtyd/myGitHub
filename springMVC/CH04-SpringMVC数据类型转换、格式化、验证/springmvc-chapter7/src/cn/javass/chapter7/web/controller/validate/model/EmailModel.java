package cn.javass.chapter7.web.controller.validate.model;

import org.hibernate.validator.constraints.Email;

public class EmailModel {

	
	//验证注解的元素值是Email
	@Email
	private String value;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
