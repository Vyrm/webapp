<%@include file="header.jsp" %>
<div class="container">
    <ul class="list-group">
        <c:forEach items="${list}" var="apartment">
            <li class="list-group-item">${apartment.toString()}</li>
        </c:forEach>
    </ul>
</div>
<%@include file="footer.jsp" %>