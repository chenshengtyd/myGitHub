package cn.javass.chapter6.web.controller.mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * URL请求映射 
 *
 */
@Controller
public class MappingController {
    
    //普通URL路径映射
    @RequestMapping(value={"/test1", "/user/create"})
    public String test11() {
        System.out.println("/test1  or /user/create  matches");
        return "mappingSuccess";
    }
    //普通URL路径映射    
    @RequestMapping(value="/users/{userId}/topics/{topicId}")
    public String test12() {
        System.out.println("/users/{userId}/topics/{topicId} matches");
        return "mappingSuccess";
    }
    
    //URI模板模式映射
    @RequestMapping(value="/users/{userId}")
    public String test21() {
        System.out.println("/users/{userId}  matches");
        return "mappingSuccess";
    }
    
    //URI模板模式映射
    @RequestMapping(value="/users/{userId}/create")
    public String test22() {
        System.out.println("/users/{userId}/create  matches");
        return "mappingSuccess";
    }
    
    //Ant风格的URL路径映射
    @RequestMapping(value="/users/**")
    public String test31() {
        System.out.println("/users/**  matches");
        return "mappingSuccess";
    }
    
    //Ant风格的URL路径映射
    @RequestMapping(value="/product?")
    public String test32() {
        System.out.println("/product?  matches");
        return "mappingSuccess";
    }
    
    //Ant风格的URL路径映射
    @RequestMapping(value="/product*")
    public String test33() {
        System.out.println("/product*  matches");
        return "mappingSuccess";
    }
    //Ant风格的URL路径映射
    @RequestMapping(value="/product/*")
    public String test34() {
        System.out.println("/product/*  matches");
        return "mappingSuccess";
    }
    
    @RequestMapping(value="/products/**/{productId}")
    public String test35() {
        System.out.println("/products/**/{productId}  matches");
        return "mappingSuccess";
    }
    
    @RequestMapping(value="/products/{categoryCode:\\d+}-{pageNumber:\\d+}")
    public String test41() {
        System.out.println("/products/{categoryCode:\\d+}-{pageNumber:\\d+}  matches");
        return "mappingSuccess";
    }
    
    
}
