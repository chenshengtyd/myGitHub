package cn.javass.chapter7.web.controller.validate;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.javass.chapter7.model.UserModel;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/validate/hello")
	public String validate(@Valid @ModelAttribute("user") UserModel user, Errors errors) {
		
		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
}
