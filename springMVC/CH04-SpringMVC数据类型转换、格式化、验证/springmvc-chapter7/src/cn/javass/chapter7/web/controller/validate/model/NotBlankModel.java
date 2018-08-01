package cn.javass.chapter7.web.controller.validate.model;

import org.hibernate.validator.constraints.NotBlank;

public class NotBlankModel {
	
	//验证注解的元素值不为空（不为null、去除首位空格后长度为0），不同于@NotEmpty，@NotBlank只应用于字符串且在比较时会去除字符串的首位空格
	@NotBlank
	private String value;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
