package cn.javass.chapter7.web.controller.validate.model;

import javax.validation.constraints.Min;

public class MinModel {
	
	//验证注解的元素值大于等于@Min指定的value值
	@Min(value=10)
	private int value;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
