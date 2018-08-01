package cn.javass.chapter6.web.controller.parameter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/parameter1")                                  //①处理器的通用映射前缀
public class RequestParameterController1 {

    @RequestMapping(params="create", method=RequestMethod.GET)  //②进行类级别的@RequestMapping窄化
    public String showForm() {
        System.out.println("===============showForm");
        return "parameter/create";        
    }
    @RequestMapping(params="create", method=RequestMethod.POST)  //③进行类级别的@RequestMapping窄化
    public String submit() {
        System.out.println("================submit");
        return "redirect:/success";        
    }
    
    //请求参数不包含 create参数名
    @RequestMapping(params="!create", method=RequestMethod.GET)  //进行类级别的@RequestMapping窄化
    public String error() {
        System.out.println("================error");
        return "redirect:/success";        
    }
}
