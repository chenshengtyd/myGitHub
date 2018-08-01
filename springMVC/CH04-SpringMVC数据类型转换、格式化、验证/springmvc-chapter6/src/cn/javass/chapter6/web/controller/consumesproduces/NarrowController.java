package cn.javass.chapter6.web.controller.consumesproduces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/narrow", produces="text/html")     //①类级别的映射
public class NarrowController {

    
    @RequestMapping(produces="application/xml") //②方法级别的produces将覆盖类级别的 而不是继承
    public String test1() {
        System.out.println("application/xml");
        return "success";
    }
    
    
    @RequestMapping(produces={"text/html", "application/json"}) //组合使用是或的关系
    public String test2() {
        System.out.println("text/html or application/json");
        return "success";
    }
    
    @RequestMapping(produces={"text/*"}) 
    public String test3() {
        System.out.println("text/*");
        return "success";
    }
    @RequestMapping(produces={"*/*"}) 
    public String test4() {
        System.out.println("*/*");
        return "success";
    }
    
    
    
}
