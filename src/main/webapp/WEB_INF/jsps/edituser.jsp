<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta charset="UTF-8">
<title>Edit Information</title>
</head>
<body>

	<h2>${phonenumber}</h2>
	<div class="container">
		<%-- <div class="alert alert-primary" role="alert">A User Created
			with phone number: ${phonenumber}</div> --%>
		<form action="edituser" method="post" class="card p-4">
			<div class="form-group">
				<label>Firstname</label>
				<input class="form-control" name="firstName" type="text" />
			</div>
			
			<div class="form-group">
				<label>Lastname</label> 
				<input class="form-control" name="lastName"type="text" />
			</div>
			
			<Label>Gender</Label>
			<div class="form-check">
			<input class="form-check-input" type="radio" name="gID"  value="1" checked>
			  <label class="form-check-label">
			    Man
			  </label>
			  </div>
			  <div class="form-check">
			<input class="form-check-input" type="radio" name="gID"  value="2">
			  <label class="form-check-label">
			    Woman
			  </label>
			</div>
			</br>
			</br>
			
			<Label>Insurance</Label>
			<div class="form-check">
			<input class="form-check-input" type="radio" name="iID"  value="1" checked>
			  <label class="form-check-label">
			    Melli
			  </label>
			  </div>
			  <div class="form-check">
			<input class="form-check-input" type="radio" name="iID"  value="2">
			  <label class="form-check-label">
			    Ejtemaii
			  </label>
			</div>
			
			<div class="form-group">
				<label>Password</label> 
				<input class="form-control" name="password"type="text" />
			</div>
			
			<div class="form-group">
				<label>Birthday</label> 
				<input class="form-control" name="birthDay"type="text" />
			</div>
			
			<input class="btn btn-outline-primary" value="Save" type="submit" />


		</form>

	</div>

	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
</body>
</html>