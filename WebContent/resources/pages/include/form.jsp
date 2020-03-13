<form>
    Select a Category:&nbsp;
    <select name="category">
        <c:forEach items="${list}" var="list">
            <option value="${list.channel}">${list.channel}</option>
        </c:forEach>
    </select>
    <br/><br/>
    <input type="submit" value="Submit" />
</form>

<form action="" method="">

	<div class="mine">
		<div class="row">

			<%--     
          <button type="submit" class="btn btn-primary">Sony</button>
        <div class="col-lg-4 col-md-6 col-xl-3"><p><a href='${pageContext.request.contextPath}/pages/sites/abcnews.jsp' class="btn btn-info" role="button" style="width:100%;height:100%;border:0px; margin:0px;padding: 40px;line-height: normal;-webkit-border-radius: 8px;font-size: 22px;-moz-border-radius: 8px;border-radius: 8px;">ABCNews</a></button></p></div>

         --%>

			<c:forEach var="list" items="${listar}">
				<div class="col-lg-4 col-md-6 col-xl-3">
					<p>
						<a
							href='${pageContext.request.contextPath}/resources/pages/sites/${list.channel }.jsp'
							class="btn btn-info" role="button"
							style="width: 100%; height: 100%; border: 0px; margin: 0px; padding: 40px; line-height: normal; -webkit-border-radius: 8px; font-size: 22px; -moz-border-radius: 8px; border-radius: 8px;">ABCNews</a>
					
					</p>
				</div>

			</c:forEach>
		</div>

	</div>
</form>











<jsp:include page="/resources/pages/include/footer.jsp" />








