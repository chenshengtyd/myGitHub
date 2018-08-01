package cn.javass.chapter6.web.controller.paramtype;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.util.WebUtils;

import cn.javass.chapter6.model.UserModel;

@Controller
@RequestMapping("/wizard")
@SessionAttributes(value = {"user"})    //① 标识 模型对象中名字如果是“user”将存储在会话范围，并自动暴露到模型数据中
public class WizardFormController {
    
    public static final String PARAM_TARGET = "_target";//下一页 
    public static final String PARAM_PAGE = "_page"; //当前页
    
    private String[] pageViews; //分步骤视图
    public void setPageViews(String[] pageViews) {
        this.pageViews = pageViews;
    }
    
    private String successView;//成功视图
    public void setSuccessView(String successView) {
        this.successView = successView;
    }
    private String cancelView;//取消视图
    public void setCancelView(String cancelView) {
        this.cancelView = cancelView;
    }
    
    @ModelAttribute("user")    //② 如果模型数据中没有名字为user的对象，调用该方法并存储到模型数据中
    public UserModel initUser() {
        return new UserModel();
    }
    
    
    //返回值为void 将不暴露表单引用数据到模型数据
    @ModelAttribute
    public void referenceData(@RequestParam(value = "_page", defaultValue="0") int currentPage, HttpServletRequest request, Map model) {
        if(getTargetPage(request, currentPage) == 1) { //如果是填写学校信息页 需要学校类型信息
            model.put("schoolTypeList", Arrays.asList("高中", "中专", "大学"));
            return;
        }
        if(getTargetPage(request, currentPage) == 2) {//如果是填写工作信息页 需要工作城市信息
            model.put("cityList", Arrays.asList("济南", "北京", "上海"));
            return;
        }
    }
    
    //得到目标页码（即下一个页码）
    public int getTargetPage(HttpServletRequest request, int currentPage) {
        return WebUtils.getTargetPage(request, PARAM_TARGET, currentPage);//得到下一页页码（如_target0 0就是页码）
    }
    
    
    @RequestMapping(params={"!_finish", "!_cancel"}) //不是finish/cancel即是表单中的步骤
    public String form(HttpServletRequest request, @RequestParam(value = "_page", defaultValue="0") int currentPage, @ModelAttribute("user") UserModel user) {
        return pageViews[getTargetPage(request, currentPage)];
    }
    
    @RequestMapping(params="_cancel") //即请求的参数中包含_cancel则认为是取消 
    public String cancel(@ModelAttribute("user") UserModel user, SessionStatus status) {
        System.out.println(user);
        status.setComplete();
        return cancelView;
    }
    
    @RequestMapping(params = "_finish")  //即请求的参数中包含_finish则认为是成功   
    public String finish(@ModelAttribute("user") UserModel user, SessionStatus status) {
        System.out.println(user);
        status.setComplete();
        return successView;
    }
    
    //TODO 数据验证
    
}
