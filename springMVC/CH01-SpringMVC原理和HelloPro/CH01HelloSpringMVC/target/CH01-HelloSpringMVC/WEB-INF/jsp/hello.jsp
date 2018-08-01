<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/6
  Time: 10:22
  To change this template use File | Settings | File Templates.
<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>显示信息</title>
</head>
<body>
    message1 =${message1}
    <hr>
    message2 = ${message2}
</body>
</html>
