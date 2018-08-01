package cn.javass.chapter6.web.controller.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestHeaderController {

    @RequestMapping(value="/header/test1", headers = "Accept")
    public String test11() {
        System.out.println("=========Accept");
        return "success";
    }
    
    @RequestMapping(value="/header/test1", headers = "abc")
    public String test12() {
        System.out.println("=========abc");
        return "success";
    }
    
    @RequestMapping(value="/header/test2", headers = "!abc")
    public String test2() {
        System.out.println("=========!abc");
        return "success";
    }
    
    @RequestMapping(value="/header/test3", headers = "Content-Type=application/json")
    public String test31() {
        System.out.println("=========Content-Type=text/json");
        return "success";
    }
    
    @RequestMapping(value="/header/test4", headers = "Accept=application/json")
    public String test32() {
        System.out.println("=========Accept=text/json");
        return "success";
    }
    
    @RequestMapping(value="/header/test5", headers = "Accept=text/*") 
    public String test33() {
        System.out.println("=========Accept=text/*");
        return "success";
    }
    
    @RequestMapping(value="/header/test6", headers = "Accept=*/*") 
    public String test34() {
        System.out.println("=========Accept=*/*");
        return "success";
    }
    
    
    @RequestMapping(value="/header/test7", headers = "Accept!=text/vnd.wap.wml")
    public String test4() {
        System.out.println("=========Accept!=text/vnd.wap.wml");
        return "success";
    }
    
    @RequestMapping(value="/header/test8", headers = {"Accept!=text/vnd.wap.wml", "abc=123"})
    public String test5() {
        System.out.println("=========Accept!=text/vnd.wap.wml , abc=123");
        return "success";
    }
    
    
    
}
