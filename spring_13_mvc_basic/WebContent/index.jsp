<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	System.out.println(basePath);
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>스프링 MVC</title>
</head>

<body>

	<a href="hello.do">1. hello.do : Spring MVC 기본 예제 실행해보기</a>
	<hr>

	<a href="login/hello.do?userid=user01&userpw=pass01">2. login/hello.do?userid=user01&userpw=pass01 : Spring MVC Login 예제 실행해보기</a>
	<hr>
	
	<a href="login/hello.do">3. login/hello.do : Spring MVC Login 예제 실행해보기</a>
	<hr>

	<h3>4. post 방식으로 controller 호출해 보기</h3>
	<form method="post" action="postMethod.do">
		아이디 : <input type="text" name="id" /><br> 
		이름 : <input type="text"	name="name" /><br> 
		나이 : <input type="text" name="age" /><br>
		<input type="submit" value="post요청" />
	</form>

	<hr>
	<h3>5. get 방식으로 controller 호출해 보기</h3>
	<form method="get" action="getMethod.do">
		id : <input type="text" name="id" /><br> 
		<input type="submit" value="get요청" />
	</form>

</body>
</html>