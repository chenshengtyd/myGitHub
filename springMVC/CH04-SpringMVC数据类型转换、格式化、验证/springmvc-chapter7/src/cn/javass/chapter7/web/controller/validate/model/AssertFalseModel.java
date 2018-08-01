package cn.javass.chapter7.web.controller.validate.model;

import javax.validation.constraints.AssertFalse;

public class AssertFalseModel {
	
	//验证注解的元素值是false
	@AssertFalse
	private boolean value;
	
	public void setValue(boolean value) {
		this.value = value;
	}
	public boolean isValue() {
		return value;
	}

}
