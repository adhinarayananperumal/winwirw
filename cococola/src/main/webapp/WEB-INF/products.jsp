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

	<h3>Products available</h3>

<form action="customerCart" method="post">
	<table>
		<c:forEach var="prod" items="${productDet}">
			<tr>
				<td><input type="checkbox" name="<c:out value="${prod}"/>" value="<c:out value="${prod}"/>" /><c:out value="${prod}"/><td>
			</tr>
		</c:forEach>
	</table>
		<input type="submit" value="Add to Cart">
	
	</form>
	
	<p>  <a href="ProductServlet"> Show peoduct list </a></p>
	

</body>
</html>