package cn.javass.chapter7.web.controller.validate;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.javass.chapter7.web.controller.validate.model.AssertFalseModel;
import cn.javass.chapter7.web.controller.validate.model.AssertTrueModel;
import cn.javass.chapter7.web.controller.validate.model.DecimalMaxModel;
import cn.javass.chapter7.web.controller.validate.model.DecimalMinModel;
import cn.javass.chapter7.web.controller.validate.model.DigitsModel;
import cn.javass.chapter7.web.controller.validate.model.EmailModel;
import cn.javass.chapter7.web.controller.validate.model.FutureDateModel;
import cn.javass.chapter7.web.controller.validate.model.LengthModel;
import cn.javass.chapter7.web.controller.validate.model.MaxModel;
import cn.javass.chapter7.web.controller.validate.model.MinModel;
import cn.javass.chapter7.web.controller.validate.model.NotBlankModel;
import cn.javass.chapter7.web.controller.validate.model.NotEmptyModel;
import cn.javass.chapter7.web.controller.validate.model.NotNullModel;
import cn.javass.chapter7.web.controller.validate.model.NullModel;
import cn.javass.chapter7.web.controller.validate.model.PastDateModel;
import cn.javass.chapter7.web.controller.validate.model.PatternModel;
import cn.javass.chapter7.web.controller.validate.model.RangeModel;
import cn.javass.chapter7.web.controller.validate.model.ValidModel;

@Controller
public class ValidatorAnnotationTestController {

	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/AssertFalse?value=true
	 */
	@RequestMapping("/validate/AssertFalse")
	public String assertFalse(@Valid @ModelAttribute("model") AssertFalseModel model, Errors errors) {

		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
		
	}
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/AssertTrue?value=false
	 */
	@RequestMapping("/validate/AssertTrue")
	public String assertTrue(@Valid @ModelAttribute("model") AssertTrueModel model, Errors errors) {

		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/notNull
	 */
	@RequestMapping("/validate/notNull")
	public String notNull(@Valid @ModelAttribute("model") NotNullModel model, Errors errors) {

		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/null?value=123
	 */
	@RequestMapping("/validate/null")
	public String mustNull(@Valid @ModelAttribute("model") NullModel model, Errors errors) {

		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/min?value=9
	 */
	@RequestMapping("/validate/min")
	public String min(@Valid @ModelAttribute("model") MinModel model, Errors errors) {

		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/max?value=101
	 */
	@RequestMapping("/validate/max")
	public String max(@Valid @ModelAttribute("model") MaxModel model, Errors errors) {

		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/decimalMin?value=9
	 */
	@RequestMapping("/validate/decimalMin")
	public String decimalMin(@Valid @ModelAttribute("model") DecimalMinModel model, Errors errors) {

		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/decimalMax?value=101
	 */
	@RequestMapping("/validate/decimalMax")
	public String decimalMax(@Valid @ModelAttribute("model") DecimalMaxModel model, Errors errors) {

		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/digits?value=912211.23(整数位超长)
	 * http://localhost:9080/springmvc-chapter7/validate/digits?value=12.232(小数位超长)
	 */
	@RequestMapping("/validate/digits")
	public String digits(@Valid @ModelAttribute("model") DigitsModel model, Errors errors) {

		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/past?date=2112-10-10
	 */
	@RequestMapping("/validate/past")
	public String pastDate(@Valid @ModelAttribute("model") PastDateModel model, Errors errors) {

		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/future?date=2002-10-10
	 */
	@RequestMapping("/validate/future")
	public String futureDate(@Valid @ModelAttribute("model") FutureDateModel model, Errors errors) {
		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/notBlank  (没有值 即value=null)
	 * http://localhost:9080/springmvc-chapter7/validate/notBlank?value=    (value是空字符串)
	 */
	@RequestMapping("/validate/notBlank")
	public String notBlank(@Valid @ModelAttribute("model") NotBlankModel model, Errors errors) {
		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/length?value=1  (下限最小是2)
	 * http://localhost:9080/springmvc-chapter7/validate/length?value=12345678901  (上限最大是10)
	 */
	@RequestMapping("/validate/length")
	public String length(@Valid @ModelAttribute("model") LengthModel model, Errors errors) {
		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/notEmpty?array=1 (value字符串为空)
	 * http://localhost:9080/springmvc-chapter7/validate/notEmpty?value=123 (array数组为空)
	 */
	@RequestMapping("/validate/notEmpty")
	public String notEmpty(@Valid @ModelAttribute("model") NotEmptyModel model, Errors errors) {
		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/range?value=1   (数字的最小值是2)
	 * http://localhost:9080/springmvc-chapter7/validate/range?value=11  (数字的最大值是10)
	 * 
	 */
	@RequestMapping("/validate/range")
	public String range(@Valid @ModelAttribute("model") RangeModel model, Errors errors) {
		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/email?value=zhang.com
	 * 
	 * 输入如下地址将验证成功
	 * http://localhost:9080/springmvc-chapter7/validate/email?value=zhang@gmail.com 
	 * 
	 */
	@RequestMapping("/validate/email")
	public String email(@Valid @ModelAttribute("model") EmailModel model, Errors errors) {
		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	
	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/pattern?value=zhan  (长度在5-20之间	)
	 * http://localhost:9080/springmvc-chapter7/validate/pattern?value=7aa (不能以数字开头) 
	 * 
	 */
	@RequestMapping("/validate/pattern")
	public String pattern(@Valid @ModelAttribute("model") PatternModel model, Errors errors) {
		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	

	/**
	 * 
	 * 输入如下地址将验证失败
	 * http://localhost:9080/springmvc-chapter7/validate/recursionValid?r1.value=1   (r1对象的value长度必须在2-10之间)

	 * 输入如下地址将验证成功
	 * http://localhost:9080/springmvc-chapter7/validate/recursionValid?r1.value=123  
	 * 
	 * r2对象不会进行递归参与验证
	 * 
	 */
	@RequestMapping("/validate/recursionValid")
	public String recursionValid(@Valid @ModelAttribute("model") ValidModel model, Errors errors) {
		if(errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}
	
	
	
	
}
