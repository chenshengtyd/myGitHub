<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/13
  Time: 9:17
  To change this template use File | Settings | File Templates.
<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <fieldset>
        <legend>注册列表</legend>
        <form action="<%=basePath%>ch04/register" method="post">
            <input type="text" value="" maxlength="18" placeholder="username" id="username" name="username" /> <br>
            <input type="password" value="" maxlength="18" placeholder="password" id="password" name="password" /> <br>
            <input type="text" value="" maxlength="18" placeholder="age" id="age" name="age" /> <br>
            <input type="text" value="" maxlength="18" placeholder="birthday" id="birthday" name="birthday" /> <br>
            <input type="text" value="" maxlength="18" placeholder="phoneNumberModel" id="phoneNumberModel" name="phoneNumberModel" /> <br>
            <button type="submit">注册</button>
        </form>
    </fieldset>
    <%--<fieldset>
        <legend>Spring注册列表</legend>
        <form action="<%=basePath%>ch04/register" method="post">
            <input type="text" value="" maxlength="18" placeholder="username" id="username" name="username" /> <br>
            <input type="password" value="" maxlength="18" placeholder="password" id="password" name="password" /> <br>
            <input type="text" value="" maxlength="18" placeholder="age" id="age" name="age" /> <br>
            <input type="text" value="" maxlength="18" placeholder="birthday" id="birthday" name="birthday" /> <br>
            <input type="text" value="" maxlength="18" placeholder="phoneNumberModel" id="phoneNumberModel" name="phoneNumberModel" /> <br>
            <button type="submit">注册</button>
        </form>
    </fieldset>--%>
</body>
</html>
