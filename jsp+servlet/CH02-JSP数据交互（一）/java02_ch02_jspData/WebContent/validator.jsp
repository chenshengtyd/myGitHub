<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- <link href="style.css" rel="stylesheet" type="text/css" /> -->
<!-- <script src="javascript.js" type="text/javascript"></script> -->
</head>
<body>
	<%
		/* 从首页的From表单当中获取提交过来的数据 */
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String message = "";
		if ("yeahsir".equals(username) && "123456".equals(password)) {
			message = "恭喜您" + username + "登陆成功！";
			/* 会话 */
			session.setAttribute("message", message);
			session.setAttribute("message", "123456");
			/* 重定向 */
			response.sendRedirect("success.jsp");
			
		}else{
			message = "混蛋，滚。。。";
			request.setAttribute("message", message);
			/* 转发 */
			request.getRequestDispatcher("errors.jsp").forward(request, response);
		}
	%>
	
</body>
</html>