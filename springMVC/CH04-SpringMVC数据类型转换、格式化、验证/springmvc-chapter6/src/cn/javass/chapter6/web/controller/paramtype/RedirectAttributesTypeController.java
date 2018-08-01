package cn.javass.chapter6.web.controller.paramtype;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.javass.chapter6.model.UserModel;


@Controller
@RequestMapping("/method/param/annotation")
public class RedirectAttributesTypeController {

    @RequestMapping(value="/redirect1")
    public String test1(Model model) {
        model.addAttribute("username", "zhang");
        model.addAttribute("role", Arrays.asList("admin", "user"));

        return "redirect:/method/param/annotation/redirectSuccess";
    }
    
    
    
    @RequestMapping(value="/redirect2")
    public String test2(RedirectAttributes redirectAttributes) {
        UserModel user = new UserModel();
        user.setUsername("zhang");
        user.setPassword("123");
        redirectAttributes.addFlashAttribute("user", user);
        return "redirect:/method/param/annotation/redirectSuccess";
    }
    
    
    @RequestMapping(value="/redirect3")
    public String edit(RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("userId", 123);
        return "redirect:/method/param/annotation/show/redirectSuccess";
    }

    
    @RequestMapping(value="/redirectSuccess")
    public String success(@ModelAttribute("user") UserModel user) {
        System.out.println(user);
        return "success";
    }
    
    
    
}
