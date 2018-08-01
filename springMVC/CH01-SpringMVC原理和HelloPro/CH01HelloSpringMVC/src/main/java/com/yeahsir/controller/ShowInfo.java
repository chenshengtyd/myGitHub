package com.yeahsir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Yegz on 2017/9/6.
 */
@Controller
@RequestMapping("/show")
public class ShowInfo {

    @RequestMapping("/getInfo")
    public ModelAndView getInfo(){
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("message1", "yeahsir");
        mv.addObject("message2", "yeahsir");
        return  mv;
    }

    @RequestMapping("/fuckyou")
    public ModelAndView getInfo2(){
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("message1", "i love you!");
        mv.addObject("message2", "i miss you!");
        return  mv;
    }
}
