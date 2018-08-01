package cn.javass.chapter6.web.controller.paramtype;

import javax.servlet.http.Cookie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/method/param/annotation")
public class CookieValueTypeController {
    
    @RequestMapping(value="/cookie")
    public String test(@CookieValue(value="JSESSIONID", defaultValue="") String sessionId) {
        
        System.out.println(sessionId);
        
        return "success";
    }
    
    @RequestMapping(value="/cookie2")
    public String test2(@CookieValue(value="JSESSIONID", defaultValue="") Cookie sessionId) {
        
        System.out.println(sessionId.getName());
        
        return "success";
    }


}
