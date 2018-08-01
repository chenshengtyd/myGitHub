<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>上传</title>
	<!-- <link href="style.css" rel="stylesheet" type="text/css" /> -->
	<!-- <script src="javascript.js" type="text/javascript"></script> -->
</head>
<body>
	<form action="<%=basePath %>UploadServlet" enctype="multipart/form-data" method="post">
		<p>姓名：<input type="text" name="user"></p> 
   		<p>选择图片：<input type="file" name="nfile"></p> 
   		<p><button type="submit">提交</button></p>
	</form>
</body>
</html>