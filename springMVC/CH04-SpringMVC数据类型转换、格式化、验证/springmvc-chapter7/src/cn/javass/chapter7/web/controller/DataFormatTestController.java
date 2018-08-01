package cn.javass.chapter7.web.controller;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.javass.chapter7.model.FormatterModel;
import cn.javass.chapter7.model.PhoneNumberModel;
import cn.javass.chapter7.model.UserModel;
import cn.javass.chapter7.web.controller.support.formatter.PhoneNumber;

@Controller
public class DataFormatTestController {

	//http://localhost:9080/springmvc-chapter7/format1?totalCount=100000&discount=0.51&sumMoney=100000.128&phoneNumber=010-12345678
    @RequestMapping(value = "/format1")
    public String test1(@ModelAttribute("model") FormatterModel formatModel) {
		return "format/success";
	}

    //http://localhost:9080/springmvc-chapter7/format2?phoneNumber=010-12345678&date=2012-05-01
    @RequestMapping(value = "/format2")
    public String test2(
    		@PhoneNumber @RequestParam("phoneNumber") PhoneNumberModel phoneNumber, 
    		@DateTimeFormat(pattern="yyyy-MM-dd") @RequestParam("date") Date date) {
    	System.out.println(phoneNumber);
    	System.out.println(date);
    	return "format/success2";
    }
    
}
