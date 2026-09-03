<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>

    
    <form action="login" method="POST">
        <label for="title">username</label><br>
        <input type="text" id="title" name="username" required><br><br>

        <label for="description">Password:</label><br>
        <textarea id="description" name="pass" required></textarea><br><br>

        <button type="submit">login</button>
    </form>
</body>
</html>