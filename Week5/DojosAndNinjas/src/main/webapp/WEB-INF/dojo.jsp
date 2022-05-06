<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>New Dojo</title>
</head>
<body>
	<div class="card container mt-4">
		<h1 class="card-header">Add New Dojo</h1>
		<div class="card-body">
			<table class="table table-bordered mb-2">
				<form:form action="/dojos/create" class="col-4" method="post" modelAttribute="dojo">
					<div class="form-group mt-2">
						<form:label path="name">Name: </form:label> 
						<form:errors path="name" />
						<form:input path="name" class="form-control" />
					</div>
					<div class="form-group mt-3">
						<input type="submit" value="Create" class="btn btn-outline-primary mx-2">
						<a href="/" class="btn btn-outline-secondary">Return Home</a>
					</div
				</form:form>
			</table>
		</div>
	</div>
</body>
</html>