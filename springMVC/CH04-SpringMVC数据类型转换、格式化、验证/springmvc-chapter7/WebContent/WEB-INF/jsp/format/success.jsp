<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
totalCount:<spring:bind path="model.totalCount">${status.value}</spring:bind><br/>
discount:<spring:bind path="model.discount">${status.value}</spring:bind><br/>
sumMoney:<spring:bind path="model.sumMoney">${status.value}</spring:bind><br/>
phoneNumber:<spring:bind path="model.phoneNumber">${status.value}</spring:bind><br/>
<!-- 如果没有配置org.springframework.web.servlet.handler.ConversionServiceExposingInterceptor将会报错 -->
phoneNumber:<spring:eval expression="model.phoneNumber"></spring:eval><br/>

<br/><br/>
<form:form commandName="model">
    <form:input path="phoneNumber"/><br/>
    <form:input path="sumMoney"/>
</form:form>

</body>
</html>