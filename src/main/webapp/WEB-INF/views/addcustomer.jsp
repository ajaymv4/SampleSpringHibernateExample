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
				<form:form method="POST" modelAttribute="customerDetails"
					action="savecustomerdetails">

					<legend class="text-center">Register</legend>

					<fieldset>
						<legend>Account Details</legend>

						<div class="form-group col-md-6">
							<label for="firstName">First name</label>
							<form:input path="firstName"></form:input>
						</div>

						<div class="form-group col-md-6">
							<label for="lastName">Last name</label>
							<form:input path="lastName"></form:input>
						</div>

						<div class="form-group col-md-12">
							<label>Email</label>
							<form:input path="email"></form:input>
						</div>

						<div class="form-group col-md-6">
							<label>Account Number</label>
							<form:input path="account[0].accountNumber"></form:input>
						</div>

						<!--  <div class="form-group col-md-6">
                            <label for="confirmAccountNumber">Confirm Account Number</label>
                            <input type="text" class="form-control" name="" id="confirmAccountNumber" placeholder="Account Number">
                        </div> -->


					</fieldset>

					<!--<fieldset>
                        <legend>Optional Details</legend>

                        <div class="form-group col-md-6">
                            <label for="country">Country of Residence</label>
                        </div>

                        <div class="form-group col-md-12">
                            <label for="found_site">How did you find out about the site?</label>
                            <select class="form-control" name="" id="found_site">
                                <option>Company</option>
                                <option>Friend</option>
                                <option>Colleague</option>
                                <option>Advertisement</option>
                                <option>Google Search</option>
                                <option>Online Article</option>
                                <option value="other" >Other</option>
                            </select>
                        </div>

                        <div class="form-group col-md-12 hidden">
                            <label for="specify">Please Specify</label>
                            <textarea class="form-control" id="specify" name=""></textarea>
                        </div>

                    </fieldset>-->

					<div class="form-group">
						<div class="col-md-12">
							<div class="checkbox">
								<label> <input type="checkbox" value="" id=""> I
									accept the <a href="#">terms and conditions</a>.
								</label>
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="col-md-12">
							<button type="submit" class="btn btn-primary">Register</button>
							<a href="#">Already have an account?</a>
						</div>
					</div>

				</form:form>
			</div>

		</div>
	</div>
</body>
</html>

