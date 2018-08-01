package com.whcs.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.whcs.entity.User;
import com.whcs.entity.UserGroup;

/**
 * Servlet implementation class GetInfoServlet
 */
@WebServlet("/GetInfoServlet")
public class GetInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetInfoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");

		// 构建用户geust
		User guestUser = new User();
		guestUser.setName("潘大蟀");
		guestUser.setAge(18);
		// 构建用户root
		User rootUser = new User();
		rootUser.setName("女捧菲");
		rootUser.setAge(16);

		// 构建用户组对象
		UserGroup group = new UserGroup();
		group.setName("神奇的Java02男生联盟搞基班");
		List<User> listUser = new ArrayList<>();
		listUser.add(guestUser);
		listUser.add(rootUser);
		group.setUsers(listUser);

		// 用户组对象转JSON串
		String jsonString = JSON.toJSONString(group);
		System.out.println(jsonString);
		response.getWriter().append(jsonString);

		//response.getWriter().append("这是通过JQuery的GET方法来获取到的数据！");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
		response.getWriter().append("这是通过JQuery的POST方法来获取到的数据！");
	}

}
