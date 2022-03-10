<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file="/WEB-INF/header.jsp" %>

<p>  <a href="emp?action=list"> Employee Management</a></p>


<a href="ProductServlet?item=laptop">Laptop</a> <br>
<a href="ProductServlet?item=mobile">Mobile</a> <br>
<a href="ProductServlet?item=menswear">Mens Wear</a> <br>
<a href="ProductServlet?item=shoe">Shoes</a> <br>


<p>  <a href="customerCart"> Check Out</a> <p>


</body>
</html>