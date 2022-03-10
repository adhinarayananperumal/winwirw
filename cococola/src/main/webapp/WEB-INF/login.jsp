<%@ page language="java" session="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file="/WEB-INF/header.jsp" %>

<h3> Employee Login  </h3>

   <form action="LoginServlet" method="post">
	
	 <label for="username"> User Name: </label>
	 <input type="text" id="username"  name="username"/>

      <br>

 	 <label for="password"> Password : </label>
	 <input type="text" id="password"  name="password"/>

	<br>

	
	
	<input type="submit" value="Login">
	
	
	</form>
	

</body>
</html>