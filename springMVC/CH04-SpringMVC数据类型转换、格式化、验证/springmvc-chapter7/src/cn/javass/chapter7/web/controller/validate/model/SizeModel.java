package cn.javass.chapter7.web.controller.validate.model;

import java.util.List;

import javax.validation.constraints.Size;

public class SizeModel {
	
	@Size(min=1, max=5)
	private String string;
	
	@Size(min=0, max=2)
	private List<Integer> list;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}
	
	
}
