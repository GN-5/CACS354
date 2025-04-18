<!DOCTYPE html>
<html>

<head>
    <title>Dashboard</title>
    <meta charset="UTF-8">
</head>

<body>
    <h2>Welcome to the Dashboard</h2>
    <p>Here you can manage your account and settings.</p>
    parameter : name : <b>
        <%= request.getParameter("username") %>
    </b> <br>
    parameter : password : <b>
        <%= request.getParameter("password") %>
    </b> <br>
    session-attribute : username : <b>
        <%= session.getAttribute("username") %>
    </b> <br>
    <a href="./logout">Logout</a>
    <a href="./contact">Contact</a>

</html>