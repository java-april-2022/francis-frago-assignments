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
		<h1 class="card-header">Save Travel Expense</h1>
		<div class="card-body">
			<div>
				<h6>Description: <c:out value="${showExpense.expDescription}" /></h6>
				<h6>Vendor: <c:out value="${showExpense.vendor}" /></h6>
				<h6>Amount: $<c:out value="${showExpense.amount}" /></h6>
				<a href="/expenses" class="btn btn-outline-secondary">Return Home</a>				
			</div>
		</div>
	</div>
	
</body>
</html>