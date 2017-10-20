<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  	<head>   
 		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     	<title>post page</title>	
  	</head>
  
  	<body>
    	<h3>@RequestMapping의 post 설정으로 이동된 page입니다</h3>
    	<hr>
    	client가 입력한 id값 - ${my.id} <br>
    	client가 입력한 name값 - ${my.name} <br>
    	client가 입력한 age값 - ${my.age} <br>   	
    
    <hr>
	<a href="index.do">Spring MVC Home</a>
	<!-- <a href="index">Spring MVC Home</a> -->
    	
  	</body>

</html>
