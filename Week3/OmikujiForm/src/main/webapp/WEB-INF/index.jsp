<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Omikuji Form</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="js/app.js"></script>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<body>
    <h3 class="header text-center mt-4 ">Send an Omikuji</h3>
    <form class="container-md text-start p-2 bg-light border border-dark" action='/processForm' method='post'>
		<div class="mb-3">
			<label class="form-label">Pick any number from 5 to 25:</label>
	    	<input class="form-control" type="number" name="randNumber">
		</div>
		<div class="mb-3">
			<label class="form-label">Enter the name of any city or state:</label>
	    	<input class="form-control" type="text" name="cityName">
		</div>
		<div class="mb-3">
			<label class="form-label">Enter the name of a person:</label>
	    	<input class="form-control" type="text" name="personName">
		</div>
		<div class="mb-3">
			<label class="form-label">Enter a professional endeavor or hobby:</label>
	    	<input class="form-control" type="text" name="hobby">
		</div>
		<div class="mb-3">
			<label class="form-label">Enter any type of living thing:</label>
	    	<input class="form-control" type="text" name="livingThing">
		</div>
		<div class="mb-3">
			<label class="form-label">Say something nice to someone:</label>
	    	<input class="form-control" type="text" name="somethingNice">
		</div>
		<div>
			<label>Send and show a friend:</label>
			<input class="btn btn-secondary" type='submit' value='Send'>
	    </div>
    </form>	
	
</body>
</html>