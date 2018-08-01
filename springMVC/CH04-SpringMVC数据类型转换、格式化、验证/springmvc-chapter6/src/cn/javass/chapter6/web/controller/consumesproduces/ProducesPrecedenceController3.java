package cn.javass.chapter6.web.controller.consumesproduces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProducesPrecedenceController3 {

    
    //当请求头为 Accept：*/*,text/*,text/html将匹配该方法
    @RequestMapping(value = "/precedence3", produces="text/html")
    public String test1() {
        System.out.println("text/html");
        return "success";
    }
    
    //当请求头为 Accept：text/任意子类型 即可匹配
    @RequestMapping(value = "/precedence4", produces="text/*")
    public String test2() {
        System.out.println("text/*");
        return "success";
    }
    
  //当请求头为 Accept：所有类型都可匹配
    @RequestMapping(value = "/precedence5", produces="*/*")
    public String test3() {
        System.out.println("*/*");
        return "success";
    }
    
}
