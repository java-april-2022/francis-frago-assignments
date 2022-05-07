<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Show Book</title>
</head>
<body>

	<div class="container border rounded mt-4 p-4">
		<div class="d-flex  mx-auto justify-content-between mb-3">
	    	<h1>${book.title}</h1>
	        <p><a href="/books">back to the shelves</a></p>
	   	</div>
	   	<div class="mx-auto mb-4">   	
	   	<c:choose>
	   		<c:when test="${loggedInUser.id != book.user.id}">	
	   			<p><c:out value="${book.user.userName}"/> read '<c:out value="${book.title}"/>' by <c:out value="${book.author}"/></p>
				<h4>Here are <c:out value="${book.user.userName}'s"/> thoughts: </h4>
				<hr/>
				<p class="fst-italic" ><c:out value="${book.thoughts}"/></p>
				<hr/>
			</c:when>
			<c:otherwise>
				<p>You read '<c:out value="${book.title}"/>' by <c:out value="${book.author}"/></p>
				<h3>Here are your thoughts: </h3>
				<hr/>
				<p class="fst-italic" ><c:out value="${book.thoughts}"/></p>
				<hr/>
				<div class="d-inline justify-content-between">
					<form action="/books/delete/${book.id}" method="POST">
						<a href="/books/${book.id}/edit" class="btn btn-outline-primary mx-2">Edit</a>
					    <input type="hidden" name="_method" value="delete">
					   	<input class="btn btn-outline-danger" type="submit" value="Delete">
					</form> 
				</div>                	
			</c:otherwise>
		</c:choose>
	   	</div>
	</div>

</body>
</html>