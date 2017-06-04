<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tyrus Admin Page</title>
        <link rel="stylesheet" href="Admin/CSS/AdminPage.css"/>

    </head>
    <body>
        <div class="login">
            <h1>Login</h1>
            <form method="post" name="regform" action="AdminAuth">
                <input type="text" name="u" placeholder="Username" required="required" />
                <input type="password" name="p" placeholder="Password" required="required" />
                <button type="submit" name="submit" class="btn btn-primary btn-block btn-large">Login</button>
            </form>
        </div>
    </body>
</html>
