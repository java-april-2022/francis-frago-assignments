<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Omikuji</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="js/app.js"></script>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<h2 class="header text-center mt-4 ">This is my Omikuji</h2>
	<div class="container-md text-center p-2 bg-secondary boarder fs-5 ">
		<c:out value="${omikujiResults}" />
		<img src="/images/sandStones.jpg" class="img-fluid" alt="...">
	</div>
	
	<div class="text-center mt-2">
		<a href="/omikuji"> create another</a>
	</div>


</body>
</html>