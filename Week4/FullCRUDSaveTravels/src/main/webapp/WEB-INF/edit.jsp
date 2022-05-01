<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Edit Expenses</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="card container mt-4">
		<h1 class="card-header">Edit Travel Expense</h1>
		<div class="card-body">
			<form:form action="/expenses/${editExpense.id}" method="post" modelAttribute="editExpense">
				<input type="hidden" name="_method" value="put">
				<div class="form-group">
					<form:label path="name">Expense Name: </form:label>
					<form:input class="form-control" path="name" />
					<form:errors path="name" class="text-danger" />
				</div>
				<div class="form-group mt-3">
					<form:label path="vendor">Vendor: </form:label>
					<form:input class="form-control" path="vendor" />
					<form:errors path="vendor" class="text-danger" />
				</div>
				<div class="form-group mt-3">
					<form:label path="amount">Amount: </form:label>
					<form:input class="form-control" path="amount" />
					<form:errors path="amount" />
				</div>
					<div class="form-group mt-3">
					<form:label path="description">Description: </form:label>
					<form:textarea class="form-control" path="description" />
					<form:errors path="description" class="text-danger" />
				</div>
				<a class="btn btn-outline-secondary mt-3" href="/">Return Home</a>
                &nbsp;
				<button class="btn btn-outline-primary mt-3">Update Expense</button>
			</form:form>
		</div>
	</div>


</body>
</html>