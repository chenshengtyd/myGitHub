package cn.javass.chapter6.web.controller.consumesproduces.contenttype;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResponseContentTypeController {

    @RequestMapping("/response/ContentType")
    public void response1(HttpServletResponse response) throws IOException {
        //①表示响应的内容区数据的媒体类型为html格式，且编码为utf-8(客户端应该以utf-8解码)
        response.setContentType("text/html;charset=utf-8");
        //②写出响应体内容
        response.getWriter().write("<font style='color:red'>hello</font>");
    }
    
    
    @RequestMapping(value = "/response/ContentType", headers = "Accept=application/json")
    public void response2(HttpServletResponse response) throws IOException {
        //①表示响应的内容区数据的媒体类型为json格式，且编码为utf-8(客户端应该以utf-8解码)
        response.setContentType("application/json;charset=utf-8");
        //②写出响应体内容
        String jsonData = "{\"username\":\"zhang\", \"password\":\"123\"}";
        response.getWriter().write(jsonData);
    }
    
    @RequestMapping(value = "/response/ContentType", headers = "Accept=application/xml")
    public void response3(HttpServletResponse response) throws IOException {
        //①表示响应的内容区数据的媒体类型为xml格式，且编码为utf-8(客户端应该以utf-8解码)
        response.setContentType("application/xml;charset=utf-8");
        //②写出响应体内容
        String xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        xmlData += "<user><username>zhang</username><password>123</password></user>";
        response.getWriter().write(xmlData);
    }
    
}
