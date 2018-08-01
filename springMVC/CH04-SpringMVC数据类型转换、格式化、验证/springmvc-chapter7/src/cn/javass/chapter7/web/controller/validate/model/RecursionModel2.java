package cn.javass.chapter7.web.controller.validate.model;

import javax.validation.constraints.Min;

public class RecursionModel2 {

	@Min(value=10)
	private int value;
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
}
