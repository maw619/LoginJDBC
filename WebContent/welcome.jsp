<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
welcome 
<c:forEach var="list" items="${listar }">
	<ul>
		<h1>Hello <li>${list.username }</li></h1>
	</ul>
</c:forEach>


<a href="ListChannelsController">Go to Channels</a>


</body>
</html>