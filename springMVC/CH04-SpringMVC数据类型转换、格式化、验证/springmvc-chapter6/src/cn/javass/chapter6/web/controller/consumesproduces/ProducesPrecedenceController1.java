package cn.javass.chapter6.web.controller.consumesproduces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProducesPrecedenceController1 {

    
    //当请求头为 Accept：text/html, application/xml,application/json 将匹配该方法
    @RequestMapping(value = "/precedence1", produces="text/html")
    public String test1() {
        System.out.println("text/html");
        return "success";
    }
    
    //当请求头为 Accept：application/xml,application/json,text/html 将匹配该方法
    @RequestMapping(value = "/precedence1", produces="application/xml")
    public String test2() {
        System.out.println("application/xml");
        return "success";
    }
    
    //当请求头为 Accept：application/json,application/xml,text/html 将匹配该方法
    @RequestMapping(value = "/precedence1", produces="application/json")
    public String test3() {
        System.out.println("application/json");
        return "success";
    }
    
}
