package cn.javass.chapter7.web.controller.validate.model;

import javax.validation.constraints.Null;

public class NullModel {
	
	//验证注解的元素值是null
	@Null
	private String value;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
