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
phoneNumber:<spring:bind path="dataBinderTest.phoneNumber">${status.value}</spring:bind><br/>

<!-- 如果没有配置org.springframework.web.servlet.handler.ConversionServiceExposingInterceptor将会报错 -->
phoneNumber:<spring:eval expression="dataBinderTest.phoneNumber"></spring:eval><br/>

state:<spring:bind path="dataBinderTest.state">${status.value}</spring:bind><br/>
date:<spring:bind path="dataBinderTest.date">${status.value}</spring:bind><br/>


<form:form commandName="dataBinderTest">
    <form:input path="phoneNumber"/><!-- 如果出错会显示错误之前的数据而不是空 -->
</form:form>

</body>
</html>