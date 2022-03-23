<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC tutorial - Home JSP</title>
</head>
<body>
    <h3>${CusformName}</h3>
    
    
    	<a href="/sharetradeapp/dashboard"> Go to DashBoard</a>
    

  <form:form action="saveCustomer" modelAttribute="customer" method="post">
  <table>
    <tr>
      <td>
        <form:label path="firstName">First Name</form:label>
      </td>
      <td>
        <form:input path="firstName" id="firstname" />
      </td>
    </tr>
    <tr>
      <td>
        <form:label path="lastName">Last Name</form:label>
      </td>
      <td>
        <form:input path="lastName" id="lastname" />
      </td>
    </tr>
    
   <tr> <td> <input type="submit" value="Submit"> </td> </tr>
  </form:form>
</body>
</html>