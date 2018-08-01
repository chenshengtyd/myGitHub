package cn.javass.chapter7.web.controller.validate.model;

import javax.validation.constraints.AssertTrue;

public class AssertTrueModel {
	
	//验证注解的元素值是true
	@AssertTrue
	private boolean value;
	
	public void setValue(boolean value) {
		this.value = value;
	}
	public boolean isValue() {
		return value;
	}

}
