<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- <link href="style.css" rel="stylesheet" type="text/css" /> -->
<!-- <script src="javascript.js" type="text/javascript"></script> -->
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript">
	/* Ajax的核心是 xmlhttprequest */
	<%-- function loadXMLDoc() {
		var xmlhttp;
		/* 兼容性判断 */
		if (window.XMLHttpRequest) {
			//  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
			xmlhttp = new XMLHttpRequest();
		} else {
			// IE6, IE5 浏览器执行代码
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		/* onreadystatechange：指定回调函数 */
		xmlhttp.onreadystatechange = function() {
			/* 判断请求正常-成功 */
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				document.getElementById("myDiv").innerHTML = xmlhttp.responseText;
			}
		}
		/* 创建请求 */
		/* 
			参数一：请求的方式 GET POST
			参数二：请求的URL 地址
			参数三：true 异步 false 同步
		*/
		xmlhttp.open("GET", "<%=basePath%>GetInfoServlet", true);
		/* 发送请求 */
		xmlhttp.send();
	} --%>
	
	/* JQuery的Ajax */
	$(document).ready(function(){
		$("button").click(function(){
			$.ajax({url:"demo_ajax_load.txt",async:true,success:function(result){
				$("div").html(result);
			}});
		});
	});
</script>
</head>
<body>
	<button type="button" onclick="loadXMLDoc();">AJAX TEST</button>
	<div id="myDiv">这是原始的值</div>
</body>
</html>