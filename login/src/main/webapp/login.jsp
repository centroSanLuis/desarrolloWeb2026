<html lang="es">
<head>
<meta charset="UTF-8">
</head>
<body>
<form action="login" method="post">
<input type="text" name="user" placeholder="Usuario">
<input type="password" name="pass" placeholder="Contraseña">
<button>Entrar</button>
<%if(request.getParameter("error")!=null){%>
<div>
    Usuario y/o contraseña erroneos
</div>
<%}%>
<% if(request.getParameter("registro")!= null && request.getParameter("registro").equals("OK")){ %>
<div>
    Usuario creado correctamente!
</div>
<% } else if(request.getParameter("registro")!= null && request.getParameter("registro").equals("KO")){ %>
<div>
    El usuario ya existe en la "BD"
</div>
<% } %>
</form>
<div>
    <a href="registro.html">Registrate</a>
</div>
</body>
</html>
