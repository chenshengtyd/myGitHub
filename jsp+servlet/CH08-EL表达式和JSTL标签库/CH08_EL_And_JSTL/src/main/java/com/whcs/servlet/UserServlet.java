package com.whcs.servlet;

import com.whcs.entity.Address;
import com.whcs.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Yegz on 2017/7/24.
        */
@WebServlet(name = "UserServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User("yeahsir","123456",new Address("武汉","荆州"));


        request.setAttribute("username","YangDaXian DaZhan LOL");
//        存user到session作用域
        request.getSession().setAttribute("user", user);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
