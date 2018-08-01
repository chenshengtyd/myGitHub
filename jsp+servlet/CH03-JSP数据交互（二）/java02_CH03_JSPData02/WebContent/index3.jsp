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
<title>首页</title>
<!-- <link href="style.css" rel="stylesheet" type="text/css" /> -->
<!-- <script src="javascript.js" type="text/javascript"></script> -->
</head>
<body>
  	<%
	  Integer count = (Integer) application.getAttribute("count");
	  if(count !=  null){
		  count = 1 + count;
	  }else{
		  count = 1;	 	
	  }
	  application.setAttribute("count", count);
	%>
	<%
	  Integer i = (Integer) application.getAttribute("count");
	  //out.println: 相当于写了一个空白的页面
	  out.println("统计访问量：目前有 " + i + " 个人访问过本网站" );
	%>
</body>
</html>