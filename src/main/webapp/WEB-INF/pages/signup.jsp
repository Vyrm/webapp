<%@include file="header.jsp" %>
<div class="container">
    <form action="/registeruser" method="post">
        <div class="form-group">
            <label for="login">Login:</label>
            <input type="text" class="form-control" id="login" name="login">
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" class="form-control" id="password" name="password">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </form>
    <a href="/">Back</a>
</div>
<%@include file="footer.jsp" %>
