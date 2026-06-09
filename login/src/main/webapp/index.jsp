<%@ page import="com.centrosanluis.login.dto.UsuarioDTO" %>
<html>
<body>
<% if(request.getParameter("nombre")!=null && request.getParameter("apellido")!=null){ %>
    <%= ((UsuarioDTO)request.getSession().getAttribute("user")).getUser() %>
    <h2>Hello <%= request.getParameter("nombre") %> <%= request.getParameter("apellido") %></h2>
<% } else{ %>
    <h2>Debes Loguearte para poder acceder <a href="login.jsp">Volver</a>
<% } %>
<a href="otraPagina.jsp">Ir a otra página</a>
</body>
</html>
