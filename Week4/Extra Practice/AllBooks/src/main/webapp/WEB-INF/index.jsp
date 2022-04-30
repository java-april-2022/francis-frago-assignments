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
<title>All Books</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="js/app.js"></script>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="card container mt-4">
		<h1 class="card-header">All Books</h1>
		<div class="card-body">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Title</th>
						<th>Language</th>
						<th># Pages</th>
					</tr>
				</thead>
				<c:forEach var="book" items="${allBooks}">
					<tbody>
						<tr>
							<th><c:out value="${book.id}" /></th>
							<td><a href="/books/${book.id}"><c:out value="${book.title}" /></a></td>
							<td><c:out value="${book.language}" /></td>
							<td><c:out value="${book.numberOfPages}" /></td>
						</tr>
					</tbody>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>