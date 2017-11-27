<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>

<body>
	<div class="container">
		<div class="row">

			<div class="col-md-8 col-md-offset-2">
				<form:form id="myform" method="GET" action="addcustomer">

					<input type="hidden" name="name" value="value" />
					<a onclick="document.getElementById('myform').submit();">Add a Customer</a>


				</form:form>
				<form:form id="myform1" method="GET" action="getcustomerdetails">

					<input type="hidden" name="name" value="value" />
					<a onclick="document.getElementById('myform1').submit();">Get All Customer</a>


				</form:form>
				
			</div>

		</div>
	</div>
</body>
</html>

