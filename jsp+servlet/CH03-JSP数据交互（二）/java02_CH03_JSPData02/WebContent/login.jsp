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
  		
  		//3. 调用Cookie
  		Cookie[] cks = request.getCookies();
  		String username = "";
  		String password = "";
  		for(int i = 0; i< cks.length; i++){
  			String ckName = cks[i].getName();
  			if("username".equals(ckName)){
  				out.println("cookie的名称：" + ckName);
  	  			out.println("cookie的值：" + cks[i].getValue());
  			}
  		}
  	%>
  	
  	<form action="vali.jsp">
  		denglu ...
  		<input type="text" id name value="<%=username %>" />
  		<input type="password" id name value="<%=password %>" />
  	</form>
</body>
</html>