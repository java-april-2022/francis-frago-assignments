<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Dojo Home</title>
</head>
<body>

<div class="card container mt-4">
	<h1 class="card-header">Dojos</h1>
	
	<div class="card-body">
		<table class="table table-striped table-bordered align-middle mb-3">
			<a href="/dojos/new" class="btn btn-outline-primary">New Dojo</a>
			<a href="/ninjas/new" class="btn btn-outline-primary mx-2">New Ninja</a>
	</div>
	
	<div class="form-group">
		<table class="table table-bordered table-striped mb-3">
			<thead>
				<th>Location List</th>
			</thead>
			<tbody>
				<c:forEach items="${dojos}" var="dojo">
					<tr>
						<td><a href="/dojos/${dojo.id}"> <c:out value="${dojo.name}" /></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
</div>

</body>
</html>
