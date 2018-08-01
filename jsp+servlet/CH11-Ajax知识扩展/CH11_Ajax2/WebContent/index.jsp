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
	<!-- <link href="style.css" rel="stylesheet" type="text/css" /> -->
	<!-- <script src="javascript.js" type="text/javascript"></script> -->
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript">
		
	
		$(function(){
			$("button").click(function(){
				
				var userObj = new Object();//创建一个对象
				userObj.username = "yeahsir1";
				userObj.password = "123456";
				userObj.age = 18;
				userObj.sex = "M";
				
				//1.url
				//2.data
				//3.success
				//4.dataType 没用到
				<%-- $.getJSON(
					"<%=basePath%>GetInfoServlet",
					function(result){//result 是json格式
						var obj = eval(result);//转成对象，解析JSON格式
						var str = "";
						for (var i = 0; i < obj.users.length; i++) {
							str += obj.users[i].age + ":" + obj.users[i].name + "<br />";
						}
						$("#mydiv").html(str);
					}
				); --%>
				$.getJSON("<%=basePath%>GetJsonServlet",function(result){
					var userObj = eval(result);
					
					var str = "";
					for (var i = 0; i < userObj.length; i++) {
						str += userObj[i].age + ":" + userObj[i].name + "<br />";
					}
					
					$("#mydiv").html(str);
				});
			});
		});
		/* $(document).ready(function(){
			
		}); */
	</script>
</head>
<body>
	<button id="mybtn" type="button">TST</button>
	<div id="mydiv">
		这是原始的值！
	</div>
</body>
</html>