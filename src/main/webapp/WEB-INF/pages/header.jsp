<%@include file="include.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html">
    <meta charset="utf-8">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>

    <title>Rieltor-helper</title>
</head>
<body>
<nav class="navbar navbar-inverse navbar-static-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">Rieltor-Helper</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="/">Home</a></li>
            <c:if test="${inSystem}">
                <li><a href="/addapartment">Add apartment</a></li>
                <li><a href="/showapartments">Show apartments</a></li>
            </c:if>


        </ul>
        <ul class="nav navbar-nav navbar-right">
            <c:choose>
                <c:when test="${!inSystem}">
                    <li><a href="/signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                    <li><a href="/signin"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                </c:when>
                <c:otherwise>
                    <li><p>Hello ${currentUserName}</p></li>
                    <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> LogOut</a></li>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>
</nav>
