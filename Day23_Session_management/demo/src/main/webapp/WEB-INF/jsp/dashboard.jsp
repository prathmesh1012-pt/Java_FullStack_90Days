<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
    
    <!-- Displays result after POST submission -->
    <% if (request.getAttribute("user") != null) { %>
        <h3 style="color: green;">Welcome ${user}</h3>
        <form action="logout" method="get">
        <button type="submit"> logout </button>
        </form>
    <% } %>
</body>
</html>