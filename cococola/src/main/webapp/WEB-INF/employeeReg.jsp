<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%@include file="/WEB-INF/header.jsp" %>



	<h3>  Employee Registration Form </h3>
	
	 
	
	<c:if test="${not empty saveStatus}">  
	
	<h5>  <c:out value="${saveStatus}"/>  </h5>
	
	</c:if>  
	
	<c:if test="${not empty empId}">  
	
	<h5> Please note your employee id :   <c:out value="${empId}"/>  </h5>
	
	</c:if>  
	
	<p>  <a href="emp?action=list"> List Employee</a></p>
	
	
	<form action="emp?action=save" method="post">
	
	 <label for="fn"> First Name : </label>
	 <input type="text" id="fn"  name="firstname"/>

      <br>

 	 <label for="ln"> Last Name : </label>
	 <input type="text" id="ln"  name="lastname"/>

	<br>

      <label for="age"> Age : </label>
	<input type="number" id="age"  name="age"/>


 	<br>
	
	
	<input type="submit" value="Register Employee">
	
	
	</form>
	
	
	
	
	
</body>
</html>