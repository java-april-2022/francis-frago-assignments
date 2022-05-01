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
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>Edit Expense</title>
</head>
<body>

	<div
		class="container-md border border-3 border rounded bg-light p-5 mt-3">
		<h1 class="mb-2">Save Travel Expense</h1>
		<h5 class="mb-3">Edit expense for: <c:out value="${editExpense.expDescription}" /></h5>
		<a class="btn btn-outline-secondary mb-3" href="/">Return Home</a>
		
		<form:form class="container-md p-2 border border-4 mb-3"
			action="/expenses/${editExpense.id}" method="post"
			modelAttribute="editExpense">
			<input type="hidden" name="_method" value="put">
			<div class="mt-2 mb-3 text-left">
				<form:label path="expDescription">Title</form:label>
				<form:input path="expDescription" />
				<form:errors path="expDescription" class="text-danger" />
			</div>
			<div class="mb-3 text-left">
				<form:label path="vendor">Vendor</form:label>
				<form:input path="vendor" />
				<form:errors path="vendor" class="text-danger" />
			</div>
			<div class="mb-3 text-left">
				<form:label path="amount">Amount</form:label>
				<form:input path="amount" />
				<form:errors path="amount" />
			</div>
			<button class="btn btn-outline-secondary mb-3">Update Expense</button>
		</form:form>

	</div>


</body>
</html>