package cn.javass.chapter7.web.controller.validate.model;

import javax.validation.constraints.NotNull;

public class NotNullModel {
	
	//验证注解的元素值不是null
	@NotNull
	private String value;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
