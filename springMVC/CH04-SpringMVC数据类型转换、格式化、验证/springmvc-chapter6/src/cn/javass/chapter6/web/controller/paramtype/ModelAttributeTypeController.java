package cn.javass.chapter6.web.controller.paramtype;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.javass.chapter6.model.DataBinderTestModel;
import cn.javass.chapter6.model.UserModel;


@Controller
@RequestMapping("/method/param/annotation")
public class ModelAttributeTypeController {
    
    @ModelAttribute("cityList")
    public List<String> cityList() {
        return Arrays.asList("北京", "山东");
    }
    
    @ModelAttribute("user")  //①
    public UserModel getUser(@RequestParam(value="username", defaultValue="") String username) {
        //TODO 去数据库根据用户名查找用户对象
        UserModel user = new UserModel();
        user.setRealname("zhang");
        return user;
    }

    
    @RequestMapping(value="/model1") //②
    public String test1(@ModelAttribute("user") UserModel user, Model model) {
        System.out.println(model.containsAttribute("cityList"));
        System.out.println(user);
        return "success";
    }
    
    //http://localhost:9080/springmvc-chapter6/method/param/annotation/model2/username=wang?username=zhang&bool=yes&schooInfo.specialty=computer&hobbyList[0]=program&hobbyList[1]=music&map[key1]=value1&map[key2]=value2&state=blocked
    @RequestMapping(value="/model2/{username}")
    public String test2(@ModelAttribute("model") DataBinderTestModel model) {
        System.out.println(model);
        return "success";
    }
    
    
    @RequestMapping(value="/model3")
    public @ModelAttribute("user2") UserModel test3(@ModelAttribute("user2") UserModel user) {
        UserModel user2 = new UserModel();
        user2.setUsername("zhang");
        return user2;
    }

    
    @RequestMapping(value="/model4")
    public String test4(@ModelAttribute UserModel user, Model model) {
        System.out.println(model.containsAttribute("userModel"));
        return "success";
    }
    @RequestMapping(value="/model5")
    public String test5(UserModel user, Model model) {
        System.out.println(model.containsAttribute("userModel"));
        return "success";
    }
    @RequestMapping(value="/model6")
    public @ModelAttribute List<String> test6() {
        return Arrays.asList("山东", "北京");
    }
    @RequestMapping(value="/model7")
    public @ModelAttribute List<UserModel> test7() {
        return Arrays.asList(new UserModel(), new UserModel());
    }
    
    @RequestMapping(value="/model8")
    public @ModelAttribute Map<String, UserModel> test8() {
        return new HashMap<String, UserModel>();
    }
}
