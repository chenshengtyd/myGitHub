package cn.javass.chapter7.web.controller.validate.model;

import javax.validation.constraints.DecimalMin;

public class DecimalMinModel {
	
	//验证注解的元素值大于等于@ DecimalMin指定的value值
	@DecimalMin(value="10")
	private int value;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
