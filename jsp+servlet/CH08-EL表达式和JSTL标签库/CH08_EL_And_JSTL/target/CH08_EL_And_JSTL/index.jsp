<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/24
  Time: 14:28
  To change this template use File | Settings | File Templates.
<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>首页</title>
</head>
<body>
    首页 <br>
    <%
        //request.setAttribute("username", "ChenSheng");
        session.setAttribute("username", "LiYu");
        application.setAttribute("username", "PanJiangHua");
    %>
    1.输出username
    username = ${username}
    <hr>
    2.输出实体类User的信息 <br>
    sessionScope.user的toString = ${sessionScope.user} <br>
    sessionScope.user.username = ${sessionScope.user.username} <br>
    sessionScope.user.password = ${sessionScope.user.password} <br>
    sessionScope.user.address的toString = ${sessionScope.user.address}
    <hr>
    1==2 = ${1 eq 2}
    <hr>
    <h1>JSTL 开始</h1>
    <%--设置一个变量名为=uname的变量--%>
    C:SET = <c:set scope="session" var="uname" value="${user.username}"></c:set> <br>
    <%--移除属性--%>
    <c:remove var="uname" scope="session" />
    <%--通过变量名去获取数据--%>
    C:OUT = <c:out value="${uname}" default="cout" /> <br />

    <br>
    <%--EL表达式--%>
    <p>${"<a href='http://www.baidu.com'>百度</a>"}</p>
    <%--通过了计算--%>
    <c:out  escapeXml="false" value="<a href='http://www.baidu.com'>百度</a>" />
    <%--没有通过计算--%>
    <c:out  escapeXml="true" value="<a href='http://www.baidu.com'>百度</a>" />

</body>
</html>
