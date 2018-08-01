package cn.javass.chapter7.web.controller.validate.model;

import javax.validation.constraints.DecimalMax;

public class DecimalMaxModel {
	
	//验证注解的元素值小于等于@ DecimalMax指定的value值
	@DecimalMax(value="100")
	private int value;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
