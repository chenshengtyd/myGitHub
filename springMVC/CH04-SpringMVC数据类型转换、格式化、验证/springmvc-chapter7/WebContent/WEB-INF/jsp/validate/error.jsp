<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form commandName="user">
	<form:errors path="*" cssStyle="color:red"></form:errors><br/>
</form:form>

<form:form commandName="model">
	<form:errors path="*" cssStyle="color:red"></form:errors><br/>
</form:form>

<form:form commandName="a">
	<form:errors path="*" cssStyle="color:red"></form:errors><br/>
</form:form>

<form:form commandName="b">
	<form:errors path="*" cssStyle="color:red"></form:errors><br/>
</form:form>
