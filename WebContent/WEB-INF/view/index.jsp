<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>Hello World</h1>
	<form name = "submitDog" method = "post" action = "/Pets/Dogs">
	    Name: <input type = "text" name = "name"/> <br/> <br/>
	    Breed: <input type = "text" name = "breed"/> <br/> <br/>
	    Weight: <input type = "text" name = "weight"/> <br/> <br/>
	    <input type = "submit" value = "Submit!" />
	</form>

	<form name = "submitCat" method = "post" action = "/Pets/Cats">
	    Name: <input type = "text" name = "name"/> <br/> <br/>
	    Breed: <input type = "text" name = "breed"/> <br/> <br/>
	    Weight: <input type = "text" name = "weight"/> <br/> <br/>
	    <input type = "submit" value = "Submit!" />
	</form>
</body>
</html>