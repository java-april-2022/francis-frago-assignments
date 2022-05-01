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
<title>Show Book</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="js/app.js"></script>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="card container mt-4">
		<h1 class="card-header ">Book Detail</h1>
		<div class="card-body">
			<div>
				<h3>Title: <c:out value="${showBook.title}" /></h3>
				<hr>
					<h6>Description: <c:out value="${showBook.description}" /></h6>
					<h6>Language: <c:out value="${showBook.language}" /></h6>
					<h6>Number of Pages: <c:out value="${showBook.numberOfPages}" /></h6>
				<hr>
				<a href="/books" class="btn btn-outline-secondary">Return to Books Dashboard</a>
			</div>
		</div>
	</div>

</body>
</html>