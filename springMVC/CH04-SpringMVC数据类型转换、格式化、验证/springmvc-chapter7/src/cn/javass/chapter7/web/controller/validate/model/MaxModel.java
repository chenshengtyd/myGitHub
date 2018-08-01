package cn.javass.chapter7.web.controller.validate.model;

import javax.validation.constraints.Max;

public class MaxModel {
	
	//验证注解的元素值小于等于@Max指定的value值
	@Max(value=100)
	private int value;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
