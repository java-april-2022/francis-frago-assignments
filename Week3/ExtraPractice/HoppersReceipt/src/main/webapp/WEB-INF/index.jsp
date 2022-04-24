<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Hopper's Receipt</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h3 class="header text-center mt-4 ">Purchase Receipt</h3>
	<div class=" container-md p-3 mt-2 mb-2 bg-light border border-dark">
		<div class="d-grid gap-3">
			<div class="p-2 bg-light border"> Customer: <c:out value="${fullName}"/> </div>
			<div class="p-2 bg-light border"> Item name: <c:out value="${item}"/> </div>
			<div class="p-2 bg-light border"> Price: $<c:out value="${price}"/> </div>
			<div class="p-2 bg-light border"> Description: <c:out value="${description}"/> </div>
			<div class="p-2 bg-light border"> Vendor: <c:out value="${vendor}"/> </div>
		</div>
	</div>
</body>
</html>