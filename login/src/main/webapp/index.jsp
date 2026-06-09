<%@ page import="com.centrosanluis.login.dto.UsuarioDTO" %>
<% UsuarioDTO usuario = (UsuarioDTO)request.getSession().getAttribute("user"); %>
<html>
<body>
<% if(usuario!=null){ %>
    <%= usuario.getUser() %>
    <h2>Hello <%= usuario.getNombre() %> <%= usuario.getApellidos() %></h2>
<% } else{ %>
    <h2>Debes Loguearte para poder acceder <a href="login.jsp">Volver</a>
<% } %>
<a href="otraPagina.jsp">Ir a otra página</a>
</body>
</html>
