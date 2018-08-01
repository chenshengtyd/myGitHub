package com.yeahsir.controller;

import com.yeahsir.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Yegz on 2017/9/13.
 */
@Controller
@RequestMapping("/ch04")
public class RegisterController {

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute User user, Errors errors) {
        if(errors.hasErrors()){
            System.out.println("hasErrors");
            return "registerResult";
        }
        System.out.println(user.toString());
        return "registerResult";
    }
}
