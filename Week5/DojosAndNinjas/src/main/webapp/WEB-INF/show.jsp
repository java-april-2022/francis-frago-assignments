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
<title>Show Dojo Ninjas</title>
</head>
<body>

	<div class="card container mt-4">
		<div class="card-body">
			<div class="card header">
				<h1>
					<c:out value="${dojo.name}" />
					Ninjas
				</h1>
			</div>

				<table class="table table-bordered table-striped mb-3">
					<thead>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Age</th>
					</thead>
					<tbody>
						<c:forEach items="${dojo.ninjas}" var="ninja">
							<tr>
								<td>${ninja.firstName}</td>
								<td>${ninja.lastName}</td>
								<td>${ninja.age}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<a href="/ninjas/new" class="btn btn-outline-primary mx-2">Add a Ninja</a>
				<a href="/" class="btn btn-outline-secondary">Return Home</a>
		</div>
	</div>
	
</body>
</html>