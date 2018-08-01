package cn.javass.chapter7.web.controller.validate.model;

import org.hibernate.validator.constraints.Range;

public class RangeModel {

	
	//验证注解的元素值在最小值和最大值之间
	@Range(min=2, max=10)
	private int value;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
