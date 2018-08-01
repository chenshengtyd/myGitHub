package cn.javass.chapter6.web.controller.paramtype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/method/param/annotation")
public class RequestParamController {

    @RequestMapping("/requestparam1")
    public String requestparam1(@RequestParam String username) {
        System.out.println(username);
        return "success";
    }
    
    @RequestMapping("/requestparam2")
    public String requestparam2(@RequestParam("username") String username) {
        System.out.println(username);
        return "success";
    }
    
    @RequestMapping("/requestparam3")
    public String requestparam3(@RequestParam(value="username", required=true) String username) {
        System.out.println(username);
        return "success";
    }
    
    @RequestMapping("/requestparam4")
    public String requestparam4(@RequestParam(value="username", required=false) String username) {
        System.out.println(username);
        return "success";
    }
    
    @RequestMapping("/requestparam5")
    public String requestparam5(@RequestParam(value="username", required=true, defaultValue="zhang") String username) {
        System.out.println(username);
        return "success";
    }
    
    @RequestMapping("/requestparam51")
    public String requestparam51(@RequestParam(value="username", required=true, defaultValue="#{systemProperties['java.vm.version']}") String username) {
        System.out.println(username);
        return "success";
    }
    
    @RequestMapping("/requestparam6")
    public String requestparam6(@RequestParam(value="role") String roleList) {
        System.out.println(roleList);
        return "success";
    }
    
    @RequestMapping("/requestparam7")
    public String requestparam7(@RequestParam(value="role") String[] roleList) {
        System.out.println(Arrays.toString(roleList));
        return "success";
    }
    
    @RequestMapping("/requestparam8")
    public String requestparam8(@RequestParam(value="list") List<String> list) {
        System.out.println(list);
        return "success";
    }
    
    
    @RequestMapping("/requestparam9")
    public String requestparam9(@RequestParam(value="list") List<String> list) {
        System.out.println(list);
        return "success";
    }
    
}
