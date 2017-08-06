<%@include file="header.jsp"%>
<div class="container">
    <form action="/signinuser" method="post">
        <p>Login
            <input type="text" name="login">
        </p>
        <p>Password
            <input type="password" name="password">
        </p>
        <input type="submit">
    </form>
    <a href="/">Back</a>
</div>
<%@include file="footer.jsp"%>
