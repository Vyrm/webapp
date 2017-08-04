<%@include file="header.jsp"%>
<div class="container">
    <form action="/signInUser" method="post">
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

<div class="container">
    <div class="row">

        <div class="col-md-offset-3 col-md-6">
            <form class="form-horizontal">
                <span class="heading">АВТОРИЗАЦИЯ hello привет</span>
                <div class="form-group">
                    <input type="email" class="form-control" id="inputEmail" placeholder="E-mail">
                    <i class="fa fa-user"></i>
                </div>
                <div class="form-group help">
                    <input type="password" class="form-control" id="inputPassword" placeholder="Password">
                    <i class="fa fa-lock"></i>
                    <a href="#" class="fa fa-question-circle"></a>
                </div>
                <div class="form-group">
                    <div class="main-checkbox">
                        <input type="checkbox" value="none" id="checkbox1" name="check"/>
                        <label for="checkbox1"></label>
                    </div>
                    <span class="text">Запомнить</span>
                    <button type="submit" class="btn btn-default">ВХОД</button>
                </div>
            </form>
        </div>

    </div><!-- /.row -->
</div><!-- /.container -->
<%@include file="footer.jsp"%>
