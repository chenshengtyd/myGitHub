package cn.javass.chapter6.web.controller.paramtype;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.security.Principal;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import cn.javass.chapter6.model.UserModel;

@Controller
@RequestMapping("/method/param")
public class MethodParamTypeController {
    
    //获取Servlet API 相关的请求/响应
    @RequestMapping("/requestOrResponse")
    public String requestOrResponse(
        ServletRequest servletRequest, HttpServletRequest httpServletRequest,
        ServletResponse servletResponse, HttpServletResponse httpServletResponse
    ) {
        
        return "success";
    }
    
    //获取 请求/响应的 内容区数据（以字节流的形式获取）
    @RequestMapping("/inputOrOutBody")
    public void inputOrOutBody(InputStream requestBodyIn, OutputStream responseBodyOut)
        throws IOException {
        responseBodyOut.write("success".getBytes());
    }
    
    //获取 请求/响应的 内容区数据（以字符流的形式获取）
    @RequestMapping("/readerOrWriterBody")
    public void readerOrWriteBody(Reader reader, Writer writer)
        throws IOException {
        writer.write("hello");
    }
    
    
    @RequestMapping("/webRequest")
    public String webRequest(WebRequest webRequest, NativeWebRequest nativeWebRequest) {
        System.out.println(webRequest.getParameter("test"));//①得到请求参数test的值
        webRequest.setAttribute("name", "value", WebRequest.SCOPE_REQUEST);//②
        System.out.println(webRequest.getAttribute("name", WebRequest.SCOPE_REQUEST));
        HttpServletRequest request = nativeWebRequest.getNativeRequest(HttpServletRequest.class);//③
        HttpServletResponse response = nativeWebRequest.getNativeResponse(HttpServletResponse.class);
        return "success";
    }
    
    @RequestMapping("/session")
    public String session(HttpSession session) {
        System.out.println(session);
        return "success";
    }
    

    @RequestMapping(value = "/commandObject", method = RequestMethod.GET)
    public String toCreateUser(HttpServletRequest request, UserModel user) {
        return "customer/create";
    }
    
    @RequestMapping(value = "/commandObject", method = RequestMethod.POST)
    public String createUser(HttpServletRequest request, UserModel user) {
        System.out.println(user);
        return "success";
    }
    
    @RequestMapping(value = "/model")
    public String createUser(Model model, Map model2, ModelMap model3) {
        model.addAttribute("a", "a");
        model2.put("b", "b");
        model3.put("c", "c");
        System.out.println(model == model2);
        System.out.println(model2 == model3);
        return "success";
    }
    
    
    @RequestMapping(value = "/mergeModel")
    public ModelAndView mergeModel(Model model) {
        model.addAttribute("a", "a");//①添加模型数据
        ModelAndView mv = new ModelAndView("success");
        mv.addObject("a", "update");//②在视图渲染之前更新③处同名模型数据
        model.addAttribute("a", "new");//③修改①处同名模型数据
        //视图页面的a将显示为"update" 而不是"new"
        return mv;
    }
    
    @RequestMapping(value = "/error1")
    public String error1(UserModel user, BindingResult result) {
        return "success";
    }
    
    @RequestMapping(value = "/error2")
    public String error2(UserModel user, BindingResult result, Model model) {
        return "success";
    }
    
    @RequestMapping(value = "/error3")
    public String error3(UserModel user, Errors errors) {
        return "success";
    }
    //如下代码在spring3.1之前将抛出"Errors/BindingResult argument declared without preceding model attribute."异常
    //而spring3.1开始如下代码能正常工作
    @RequestMapping(value = "/error4")
    public String error4(UserModel user, Model model, Errors errors) {
        return "success";
    }
    
    @RequestMapping(value = "/other")
    public String other(Locale locale, Principal principal) {
        System.out.println(locale);
        System.out.println(principal);
        return "success";
    }
    
}
