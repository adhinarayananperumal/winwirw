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
<p>  <a href="emp?action=registrationForm"> Show Employee RegistrationForm</a></p>

<h3> Employee Dashboard</h3>

 <table border="1px">
                        <thead>
                            <tr>
                                <th>Employee ID</th>
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Age</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>

                               <c:forEach var="employee" items="${listEmployee}">

                                <tr>
                                    <td>
                                        <c:out value="${employee.empId}" />
                                    </td>
                                    <td>
                                        <c:out value="${employee.firstname}" />
                                    </td>
                                    <td>
                                        <c:out value="${employee.lastname}" />
                                    </td>
                                    <td>
                                        <c:out value="${employee.age}" />
                                    </td>
                                    <td><a href="emp?empId=<c:out value='${employee.empId}' />&action=edit">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="emp?empId=<c:out value='${employee.empId}' />&action=delete">Delete</a></td>
                                </tr>
                            </c:forEach>
                             </tbody>
                    </table>

</body>
</html>