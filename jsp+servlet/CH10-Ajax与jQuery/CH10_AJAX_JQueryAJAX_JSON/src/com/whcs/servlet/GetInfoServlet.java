package com.whcs.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

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

		boolean[] boolArray = new boolean[] { true, false, true };
		JSONArray jsonArray1 = JSONArray.fromObject(boolArray);
		System.out.println(jsonArray1);
		// prints [true,false,true]

		List<String> list = new ArrayList<>();
		list.add("first");
		list.add("second");
		JSONArray jsonArray2 = JSONArray.fromObject(list);
		System.out.println("jsonArray2=" + jsonArray2);
		// prints ["first","second"]

		JSONArray jsonArray3 = JSONArray.fromObject("['json','is','easy']");
		System.out.println(jsonArray3);
		// prints ["json","is","easy"]

		response.setCharacterEncoding("UTF-8");// {'password':123456,
												// 'repwd':123456, 'age': 38,
												// 'jjsize':15}
		response.getWriter().append(jsonArray2.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
