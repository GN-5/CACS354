<html>

<head>
    <title>JSP Example</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/style.css">
    <script src="<%= request.getContextPath() %>/js/script.js"></script>
    <style>
        body {
            background-color: #f0f0f0;
        }

        h2 {
            color: #222;
        }
    </style>
</head>

<body>

    <h1>
        Welcome to the JSP Example
    </h1>
    <form action="msg" method="post">
        <label for="message">Enter a message:</label>
        <input type="text" id="msg" name="msg" required>
        <br>
        <input type="submit" value="Submit">

    </form>
    <h2>
        Arithmetic Form
    </h2>
    <form action="math" method="post">
        <label for="num1">Number 1:</label>
        <input type="text" id="num1" name="num1" required>
        <br>
        <label for="num2">Number 2:</label>
        <input type="text" id="num2" name="num2" required>
        <br>
        <input type="submit" name="btn" value="Add">
        <input type="submit" name="btn" value="Subtract">
</body>

</html>