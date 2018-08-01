package cn.javass.chapter7.web.controller;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.HandlerMethod;

import cn.javass.chapter7.model.DataBinderTestModel;
import cn.javass.chapter7.model.PhoneNumberModel;
import cn.javass.chapter7.web.controller.support.editor.PhoneNumberEditor;

@Controller
public class DataBinderTestController {

    @RequestMapping(value = "/dataBind")
    public String test(DataBinderTestModel command, Model model) {
        
    	//输出command对象看看是否绑定正确
		System.out.println(command);
		model.addAttribute("dataBinderTest", command);
		return "bind/success";
	}
   
    /*
    @InitBinder
   //此处的参数也可以是ServletRequestDataBinder类型
	public void initBinder(ServletRequestDataBinder binder) throws Exception {
		//注册自定义的属性编辑器
		//1、日期
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		CustomDateEditor dateEditor = new CustomDateEditor(df, true);
		//表示如果命令对象有Date类型的属性，将使用该属性编辑器进行类型转换
		binder.registerCustomEditor(Date.class, dateEditor);
		
		//自定义的电话号码编辑器(和【4.16.1、数据类型转换】一样)
		binder.registerCustomEditor(PhoneNumberModel.class, new PhoneNumberEditor());
	}
	*/
}
