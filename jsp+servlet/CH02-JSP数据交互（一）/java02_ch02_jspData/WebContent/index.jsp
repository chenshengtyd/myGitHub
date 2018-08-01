<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>首页</title>
	<!-- <link href="style.css" rel="stylesheet" type="text/css" /> -->
	<!-- <script src="javascript.js" type="text/javascript"></script> -->
</head>
<body>
	<%@ include file="css/index.css" %>
	<h1>首页</h1>
	<br />
	<% 
		/* 从请求的表单当中去获取数据 */
		/* request.getParameter("name"); */
		
		/* request的范围/作用域，将username这个属性key和值yeahsir放进了这么一个作用域 */
		request.setAttribute("username", "yeahsir");
		String username = "yeahsir";
		request.setCharacterEncoding("UTF-8");
	%>
	名称：<%=request.getAttribute("username") %> <br />
	<%=username %>
	<hr />
	
	<form action="validator.jsp" method="get">
		<input type="text" id="username" name="username" value="" maxlength="18" />
		<br />
		<input type="password" id="password" name="password" value="" maxlength="18" />
		<br />
		<input type="submit" value="登陆" />
	</form>
	<hr />
	<!-- SessionID:判断会话的一个标准 -->
	<%=session.getId() %>
	<hr />
	
	<jsp:include page="show.jsp"></jsp:include>
</body>
</html>