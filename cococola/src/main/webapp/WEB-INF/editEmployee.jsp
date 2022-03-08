<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>  <a href="emp?action=list"> List Employee</a></p>


<c:if test="${not empty updateStatus}">  
	
	<h5>  <c:out value="${updateStatus}"/>  </h5>
	
	</c:if>  

   <h3>  Edit Employee Detail</h3>

	
	
	<form action="emp?action=edit" method="post">
	
	 <label for="empId"> Employee Id  : </label>
	 <input type="text" id="empId"  name="empId" value="${employeePojo.empId}" readonly/>

      <br>
	
	 <label for="fn"> First Name : </label>
	 <input type="text" id="fn"  name="firstname" value="${employeePojo.firstname}"/>

      <br>

 	 <label for="ln"> Last Name : </label>
	 <input type="text" id="ln"  name="lastname" value="${employeePojo.lastname}"/>

	<br>

      <label for="age"> Age : </label>
	<input type="number" id="age"  name="age" value="${employeePojo.age}"/>


 	<br>
	
	
	<input type="submit" value="Edit Employee">
	
	
	</form>
	



</body>
</html>