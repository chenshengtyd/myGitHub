<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/13
  Time: 9:19
  To change this template use File | Settings | File Templates.
<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>注册的结果页面</title>
</head>
<body>
    ${user.username} <br>
    ${user.password} <br>
    ${user.birthday} <br>
    ${user.age} <br>
    ${user.phoneNumberModel} <br>
    <hr />
    Spring:<spring:bind path="user.birthday">${status.value}</spring:bind> <br>
    JSTL：<fmt:formatDate value="${user.birthday}" pattern="yyyy年MM月dd日" />

    <hr />
    <form:form commandName="user">
        <form:errors path="*" cssStyle="color: red"></form:errors> <br>
    </form:form>
</body>
</html>
