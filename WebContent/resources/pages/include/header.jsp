<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signin</title>


<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>


<link href="<c:url value="/resources/css/login.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">
<script type="text/javascript" src="<c:url value="../resources/js/bootstrap.js"/>"></script>
<script type="text/javascript" src="<c:url value="../resources/jquery-3.4.1.min.js"/>"></script>

 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="X-Frame-Options" content="allow">
    
</head>

<body>

<jsp:include page="/resources/pages/include/nav.jsp" />
<div class="container">
<div id="bg">
  <img src="${pageContext.request.contextPath}/resources/images/2.png" alt="">
</div>
	
	
	