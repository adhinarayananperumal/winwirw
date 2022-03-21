<%@ include file="header.jsp" %>
<body>

	<div class="container">

	<h2>Customer Edit Form</h2>

	<form:form action="saveCustomer" modelAttribute="customer"
		method="post">
		<table class="table table-striped text-center table-bordered">
			<tr>
				<td><form:label path="firstName">First Name</form:label></td>
				<td><form:input path="firstName" id="firstname" /></td>
			</tr>
			<tr>
				<td><form:label path="lastName">Last Name</form:label></td>
				<td><form:input path="lastName" id="lastname" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
	</div>
</body>
</html>