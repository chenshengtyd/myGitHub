package com.whcs.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestEntity {
	private String specialCharacter1; // 特殊字符值1
	private String specialCharacter2; // 特殊字符值2
	private User innerBean; // JavaBean类型
	private List<String> list; // List类型
	private String[] array; // 数组类型
	private Set<String> set; // Set类型
	private Map<String, String> map; // Map类型
	private Properties props; // Properties类型
	private String emptyValue; // 注入空字符串值
	private String nullValue = "init value"; // 注入null值

	public void setSpecialCharacter1(String specialCharacter1) {
		this.specialCharacter1 = specialCharacter1;
	}

	public void setSpecialCharacter2(String specialCharacter2) {
		this.specialCharacter2 = specialCharacter2;
	}

	public void setInnerBean(User user) {
		this.innerBean = user;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	public void setArray(String[] array) {
		this.array = array;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public void setEmptyValue(String emptyValue) {
		this.emptyValue = emptyValue;
	}

	public void setNullValue(String nullValue) {
		this.nullValue = nullValue;
	}

	/*toString()*/
	public void showValue() {
		System.out.println("特殊字符1：" + this.specialCharacter1);
		System.out.println("特殊字符2：" + this.specialCharacter2);
		System.out.println("内部Bean：" + this.innerBean.toString());
		System.out.println("List属性：" + this.list);
		System.out.println("数组属性[0]：" + this.array[0]);
		System.out.println("Set属性：" + this.set);
		System.out.println("Map属性：" + this.map);
		System.out.println("Properties属性：" + this.props);
		System.out.println("注入空字符串：[" + this.emptyValue + "]");
		System.out.println("注入null值：" + this.nullValue);
	}
}
