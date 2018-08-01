<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/24
  Time: 16:05
  To change this template use File | Settings | File Templates.
<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
    <form action="<%=basePath%>validator.jsp" method="post">
        <input type="text" value="" id="username" name="username" />
        <br>
        <input type="password" value="" id="password" name="password" />
        <br>
        <button type="submit">登陆</button>
    </form>
</body>
</html>
