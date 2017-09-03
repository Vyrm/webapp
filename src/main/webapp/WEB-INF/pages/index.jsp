<%@include file="header.jsp" %>
<div class="container">
    <div class="row">
        <c:choose>
            <c:when test="${!inSystem}">
                <h1>${message}</h1>
            </c:when>
            <c:otherwise>
                <h1>Hello ${currentUserName}</h1>
            </c:otherwise>
        </c:choose>
    </div>

    <div class="row">
        <div class="container">
            <ul class="list-group">
                <c:forEach items="${list}" var="apartment">
                    <li class="list-group-item">${apartment.toString()}</li>
                </c:forEach>
            </ul>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>