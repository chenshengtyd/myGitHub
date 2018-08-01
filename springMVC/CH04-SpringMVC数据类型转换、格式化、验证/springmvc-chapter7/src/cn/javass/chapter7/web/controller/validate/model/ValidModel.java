package cn.javass.chapter7.web.controller.validate.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ValidModel {

	//指定递归验证关联的对象；会递归验证RecursionModel1中带有验证注解的元素
	
	@NotNull
	@Valid
	private RecursionModel1 r1;
	
	//没有指定@Valid 不会递归验证
	private RecursionModel2 r2;
	
	public void setR1(RecursionModel1 r1) {
		this.r1 = r1;
	}
	
	public void setR2(RecursionModel2 r2) {
		this.r2 = r2;
	}
	
	public RecursionModel1 getR1() {
		return r1;
	}
	
	public RecursionModel2 getR2() {
		return r2;
	}
	
	
	

}
