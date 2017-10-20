<%@ page language="java" import="java.util.*" pageEncoding="EUC-KR"%>
<%
	//url°ª 
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()
							 + ":" + request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>   
<title>ok.jsp page</title>	
</head>

<body>
	<h3>Success : ${message} </h3>

	<a href="index.do">Spring MVC Home</a>
	<!-- <a href="index">Spring MVC Home</a> -->
   	
</body>

</html>
