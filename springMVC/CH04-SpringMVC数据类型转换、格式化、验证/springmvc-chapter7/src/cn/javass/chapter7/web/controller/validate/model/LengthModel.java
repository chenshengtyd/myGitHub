package cn.javass.chapter7.web.controller.validate.model;

import org.hibernate.validator.constraints.Length;

public class LengthModel {

	
	//验证注解的元素值长度在min和max区间内
	@Length(min=2, max=10, message="{user.name.length.error}")
	private String value;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
