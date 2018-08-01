package com.yeahsir.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yegz on 2017/9/6.
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView("hello");
        String info = request.getParameter("info");
        request.setAttribute("message1", info);
        mv.addObject("message2", info);// request.setAttribute();
        return mv;
    }
}
