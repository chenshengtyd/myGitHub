<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/24
  Time: 16:10
  To change this template use File | Settings | File Templates.
<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>验证登陆</title>
</head>
<body>
    username = <c:out value="${username}" /> <br>


    <c:if test="${'yeahsir'.equals(username)}" var="isLike">
        1
        <c:out value="${isLike}" default="false" />
    </c:if>
    <c:if test="${username != 'yeahsir'}">
        2
    </c:if>

    <hr>

    <c:choose>
        <c:when test="${3>2}">3>2</c:when>
        <c:when test="${4>3}">4>3</c:when>
        <c:when test="${3>4}">3>4</c:when>
        <c:otherwise>前面的条件都不满足</c:otherwise>
    </c:choose>

    <hr>

    1.相当于for循环，输出*号 <br>
    <c:forEach begin="1" end="5" step="1">
        <c:out value="*"></c:out> <br>
    </c:forEach>

    <br>

    <table border="1px" style="border-color: hotpink;">
        <tr>
            <th>用户名称</th>
            <th>用户密码</th>
        </tr>
        <c:forEach items="${list}" var="user" varStatus="status">
            <tr>
                <td>${user.username}</td>
                <td>${user.password}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
