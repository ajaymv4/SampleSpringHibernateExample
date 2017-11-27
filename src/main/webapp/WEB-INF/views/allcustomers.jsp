<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Spring 4 MVC Hello World Example with Maven Eclipse</title>
<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />'
	type='text/css' media='all' />
</head>
<body>
	<h2>List of Customers Registered</h2>

	<table BORDER="1" CELLPADDING="3" CELLSPACING="1"
		style="text-align: center;">
		<tr>
			<td>Customer ID</td>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Email</td>
			<td>Account Numbers</td>
		</tr>
		<c:forEach var="customer" items="${customers}">
			<tr>

				<td><c:out value="${customer.id}" /></td>
				<td><c:out value="${customer.firstName}" /></td>
				<td><c:out value="${customer.lastName}" /></td>
				<td><c:out value="${customer.email}" /></td>
				<td><c:forEach var="account" items="${customer.account}">
						<li>${account.accountNumber}</li>
					</c:forEach></td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>