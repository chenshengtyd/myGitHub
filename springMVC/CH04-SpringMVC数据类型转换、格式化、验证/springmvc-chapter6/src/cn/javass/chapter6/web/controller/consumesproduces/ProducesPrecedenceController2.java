package cn.javass.chapter6.web.controller.consumesproduces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProducesPrecedenceController2 {

    
    //当请求头为 Accept：application/xml;q=0.5,application/json;q=0.9,text/html将匹配该方法
    @RequestMapping(value = "/precedence2", produces="text/html")
    public String test1() {
        System.out.println("text/html");
        return "success";
    }
    
    //当请求头为 Accept：application/xml;q=0.5,application/json;q=0.9 将匹配该方法
    @RequestMapping(value = "/precedence2", produces="application/json")
    public String test2() {
        System.out.println("application/json");
        return "success";
    }
    
}
