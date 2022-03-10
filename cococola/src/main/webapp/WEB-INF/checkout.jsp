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

<%@include file="/WEB-INF/header.jsp" %>

<h3> List of product selected (Available in Cart)</h3>

<c:out value="${csp}"/>

<table>
		<c:forEach var="cspitem" items="${csp}">
			<tr>
				<td><c:out value="${cspitem}"/><td>
			</tr>
		</c:forEach>
	</table>

<br>  <br>

<p>  <a href="ProductServlet"> Show Product Category Available</a></p>


</body>
</html>