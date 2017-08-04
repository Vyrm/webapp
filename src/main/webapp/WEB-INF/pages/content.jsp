
<c:choose>
    <c:when test="${!inSystem}">
        <h1>${message}</h1>
    </c:when>
    <c:otherwise>
        <h1>Hello ${currentUserName}</h1>
    </c:otherwise>
</c:choose>