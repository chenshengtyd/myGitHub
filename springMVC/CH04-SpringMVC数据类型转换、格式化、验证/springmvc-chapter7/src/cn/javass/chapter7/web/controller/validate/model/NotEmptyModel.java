package cn.javass.chapter7.web.controller.validate.model;

import org.hibernate.validator.constraints.NotEmpty;

public class NotEmptyModel {

	
	//验证注解的元素值不为null且不为空（字符串长度不为0、集合大小不为0）
	@NotEmpty
	private String value;
	
	@NotEmpty
	private int[] array;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public void setArray(int[] array) {
		this.array = array;
	}
	public int[] getArray() {
		return array;
	}

}
