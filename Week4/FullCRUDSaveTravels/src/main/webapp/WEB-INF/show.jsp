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
	<title>Show Expense</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="card container mt-4">
		<h1 class="card-header">Detail of Travel Expense</h1>
		<div class="card-body">
			<table class="table table-bordered mb-3">
				<tbody>
			        <tr>
						<td>Expense Name: </td>
						<td><c:out value="${showExpense.name}" /></td>
					</tr>
					<tr>
						<td>Description:</td> 
						<td><c:out value="${showExpense.description}" /></td>
					</tr>
					<tr>
						<td>Vendor: </td> 
						<td><c:out value="${showExpense.vendor}" /></td>
					<tr>
						<td> Amount Spent: </td> 
						<td> $<c:out value="${showExpense.amount}" /></td>
					</tr>
				</tbody>
			</table>
			<div>
				<a href="/expenses" class="btn btn-outline-secondary">Return Home</a>				
			</div>
		</div>
	</div>
	
</body>
</html>