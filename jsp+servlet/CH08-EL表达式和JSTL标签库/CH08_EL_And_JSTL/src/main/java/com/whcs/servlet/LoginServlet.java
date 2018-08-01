package com.whcs.servlet;

import com.whcs.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yegz on 2017/7/24.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        request.setAttribute("username", username);
        request.setAttribute("password", password);

        //list
        List<User> list = new ArrayList<>();
        list.add(new User("xiaofei", "123456"));
        list.add(new User("xiaofeifei", "123456"));
        list.add(new User("xiaofeifeifei", "123456"));
        list.add(new User("xiaofeifeifeifei", "123456"));
        list.add(new User("xiaofeifeifeifeifei", "123456"));

        request.setAttribute("list", list);

        request.getRequestDispatcher("/validator.jsp").forward(request,response);
    }
}
