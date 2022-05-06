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
<title>New Ninja</title>
</head>
<body>

<div class="card container mt-4">
	<h1 class="card-header">Add New Ninja</h1>

	<div class="card-body">
		<table class="table table-bordered mb-3">
			<form:form action="/ninjas/create" method="post"
				modelAttribute="ninja" class="col-4">
				<div class="form-group" 
					<form:label path="dojo"> Dojo Location: </form:label>
					<form:select path="dojo" class="form-select">
						<c:forEach var="dojo" items="${dojos}"> 
						<form:option value="${dojo.id}" path="dojo"><c:out value="${dojo.name}" /></form:option>
						</c:forEach>
					</form:select>
				</div>
				<div class="form-group mt-3">
					<form:label path="firstName">First Name: </form:label>
					<form:errors path="firstName" />
					<form:input path="firstName" class="form-control" />
				</div>
				<div class="form-group mt-3">
					<form:label path="lastName">Last Name: </form:label>
					<form:errors path="lastName" />
					<form:input path="lastName" class="form-control" />
				</div>
				<div class="form-group mt-3">
					<form:label path="age">Age: </form:label>
					<form:errors path="age" />
					<form:input path="age" type="number" class="form-control" />
				</div>
				<div class="form-group mt-3">
					<input type="submit" value="Create" class="btn btn-outline-primary mx-2"> 
					<a href="/" class="btn btn-outline-secondary">Return Home</a>
				</div>
			</form:form>
		</table>
	</div>
</div>

</body>
</html>