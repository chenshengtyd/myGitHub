<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.naming.NamingException"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
<!-- 声明 -->
<%!
Connection getConnection () {
	Connection conn = null;
	try { //获取与逻辑名相关联的数据源对象
		Context ctx = new InitialContext();
		DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
		conn = ds.getConnection();	             
	 } catch (SQLException exception) {
		exception.printStackTrace();
	 } catch (NamingException namingException){    
		namingException.printStackTrace();
	 }
	 return conn;
 }
%>
<!-- 调用声明 -->
getConnection = <%=getConnection() %>
<% 
	Connection conn = this.getConnection();
	Statement stm = conn.createStatement();
	ResultSet rs = stm.executeQuery("select loginname,username from sys_user where userid=1");
	while(rs.next()){
		String loginName = rs.getString("loginname");
		String username = rs.getString("username");
		out.println("loginName=" + loginName + ":username=" + username);
	}
%>
<%-- 	<% 
		/* Context上下文 */
		Context context = new InitialContext();
		/* lookup 查找context.xml文件中的配置信息 */
		String testtjndi = (String)context.lookup("java:comp/env/tjndi");
		out.print(testtjndi);
		String jdbcmysql = (String)context.lookup("java:comp/env/jdbc/mysql");
		out.print(jdbcmysql);
		/* String testDriver = (String)context.lookup("java:comp/env/Driver");
		out.print(testDriver); */
	%> --%>
</body>
</html>