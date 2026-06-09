<%@ page import="com.centrosanluis.login.dto.UsuarioDTO" %>
<html>
<body>
<%= ((UsuarioDTO)request.getSession().getAttribute("user")).getUser() %>
<h2>Esta es otra página<h2>
</body>
</html>
