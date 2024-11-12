<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" />
<title>Customer Management System</title>

</head>
<body>
	<center>
		<h1>Customer Management System</h1>
		<br>
		<div class="card">
			<div class="card-body" style="background-color: #7B79E8">
				<form action="CustomerController" method="post">
					<div class="form-group row">
						<label for="cid" class="col-sm-3 col-form-label">Enter
							Customer ID</label>

						<div class="col-sm-7">
							<input type="text" class="form-control" name="cid">
						</div>
					</div>

					<div class="form-group row">
						<label for="caccount" class="col-sm-3 col-form-label">Enter
							Customer Name</label>

						<div class="col-sm-7">
							<input type="text" class="form-control" name="cname">
						</div>
					</div>
					<div class="form-group row">
						<label for="cbalance" class="col-sm-3 col-form-label">Enter
							Customer Account No</label>

						<div class="col-sm-7">
							<input type="text" name="caccount" class="form-control">
						</div>
					</div>
					<div class="form-group row">
						<label for="cbalance" class="col-sm-3 col-form-label">Enter
							Customer Balance</label>

						<div class="col-sm-7">
							<input type="text" class="form-control" name="cbalance">
						</div>
					</div>

					<input type="submit" value="Insert"
						class="btn btn-primary btn-custom" name="btn" /> 
					<input type="submit" value="Update" class="btn btn-primary btn-success"
						name="btn" /> 
					<input type="submit" value="Delete"
						class="btn btn-primary btn-danger" name="btn" />
					 <input type="submit" value="Find" class="btn btn-primary btn btn-info"
						name="btn" /> 
					<input type="submit" value="FindAll"
						class="btn btn-primary btn btn-info" name="btn" />
				</form>
			</div>
		</div>
	</center>
</body>
</html>