<html>
<body>
<% if(request.getParameter("nombre")!=null && request.getParameter("apellido")!=null){ %>
    <h2>Hello <%= request.getParameter("nombre") %> <%= request.getParameter("apellido") %></h2>
<% } else{ %>
    <h2>Debes Loguearte para poder acceder <a href="login.jsp">Volver</a>
<% } %>
</body>
</html>
