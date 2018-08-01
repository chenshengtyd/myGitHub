<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
	<!-- 采用小脚本写Java代码 -->
	<% 
		String username = "yeahsir";
		String password = "123123";
		System.out.println(username + ":" + password);
	%>
	
	用户名=<%=username %> ，密码=<%=password %>
	<a href="<%=basePath%>WEB-INF/test.jsp">test</a>
</body>
</html>