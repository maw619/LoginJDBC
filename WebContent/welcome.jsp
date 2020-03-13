<jsp:include page="/resources/pages/include/header2.jsp" />


welcome 
<c:forEach var="list" items="${listar}">
	<ul>
	     <li>${list.username}"/></li>
	</ul>
</c:forEach>


<a href="${pageContext.request.contextPath}/ListChannelsController">Go to Channels</a>
