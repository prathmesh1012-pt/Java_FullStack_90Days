<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Report New Incident</title>
</head>
<body>
    <h2>Report a New Incident</h2>

    <!-- Form submits via POST to /incident -->
    <form action="home" method="POST">
        <label for="title">Incident Title:</label><br>
        <input type="text" id="title" name="title" required><br><br>

        <label for="description">Description:</label><br>
        <textarea id="description" name="description" rows="4" cols="30" required></textarea><br><br>

        <button type="submit">Submit Incident</button>
    </form>

    <!-- Displays result after POST submission -->
    <% if (request.getAttribute("message") != null) { %>
        <hr>
        <h3 style="color: green;">${message}</h3>
        <p><strong>Title:</strong> ${submittedTitle}</p>
        <p><strong>Description:</strong> ${submittedDescription}</p>
    <% } %>
</body>
</html>