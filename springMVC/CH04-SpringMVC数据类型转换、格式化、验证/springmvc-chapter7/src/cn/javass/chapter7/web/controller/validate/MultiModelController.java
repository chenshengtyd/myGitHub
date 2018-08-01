package cn.javass.chapter7.web.controller.validate;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.javass.chapter7.web.controller.validate.model.A;
import cn.javass.chapter7.web.controller.validate.model.B;

@Controller
public class MultiModelController {


	/**
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/multi?a=1&b=2
	 */
	@RequestMapping("/validate/multi")
	public String multi(
			@Valid @ModelAttribute("a") A a, BindingResult aErrors,
		    @Valid @ModelAttribute("b") B b, BindingResult bErrors) {
		
		if(aErrors.hasErrors()) { //如果a模型对象验证失败
			return "validate/error";
		}
		if(bErrors.hasErrors()) { //如果a模型对象验证失败
			return "validate/error";
		}
		return "redirect:/success";
	}
}
