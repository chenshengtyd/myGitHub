package cn.javass.chapter7.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.javass.chapter7.model.UserModel;
import cn.javass.chapter7.web.controller.support.validator.UserModelValidator;

@Controller
public class SuccessController {

	@RequestMapping("/success")
	public String success() {
		return "success";
	}
	
}
