<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">
<title>Spring MVC 5 - form handling | Java Guides</title>
<link href="<c:url value="/css/bootstrap.min.css" />" rel="stylesheet">
<script src="<c:url value="/js/jquery3.6.0" />"></script>
<script src="<c:url value="/js/bootstrap.min.js" />"></script>
</head>
<body>

	<div class="container">

		<h2 class="text-center">Customer Dashboard</h2>

		<table id="mytable" class="table table-striped text-center table-bordered"
			style="margin: 10px; width: 60%;">
			<thead>
				<th scope="col">Customer Id</th>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th></th>
			</thead>
			<tbody>
				<c:forEach var="customer" items="${customerList}">
					<tr>
						<td>${customer.id }</td>
						<td>${customer.firstName }</td>
						<td>${customer.lastName }</td>

						<td><a class="btn btn-primary"
							href="/sharetradeapp/showCustomerEditForm/${customer.id}">Edit</a>
							<a class="btn btn-warning"
							href="/sharetradeapp/deleteCustomer/${customer.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>


	</div>
</body>
</html>