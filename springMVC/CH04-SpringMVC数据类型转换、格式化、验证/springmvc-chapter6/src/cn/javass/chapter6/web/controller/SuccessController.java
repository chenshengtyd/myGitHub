package cn.javass.chapter6.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuccessController {

    @RequestMapping(value="/success")
    public String success() {
        return "success";
    }
}
