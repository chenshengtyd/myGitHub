package cn.javass.chapter7.web.controller.validate.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class B {

	@NotNull
	@Length(min=3, max=10)
	private String b;
	
	public void setB(String b) {
		this.b = b;
	}
	public String getB() {
		return b;
	}
}
