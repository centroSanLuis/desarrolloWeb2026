<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>
<form action="conversion" method="post">
    <input type="number" name="euros" id="euros">
    <button type="submit">Convertir</button>
    <div>
        <% if(request.getParameter("error")!=null) { %>
            <%= request.getParameter("error") %>
        <% } %>
    </div>
</form>
</body>
</html>