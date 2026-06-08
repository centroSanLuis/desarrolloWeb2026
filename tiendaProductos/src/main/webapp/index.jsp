<% String error = request.getParameter("error"); %>
<% String nombre = request.getParameter("nombre"); %>
<% String precio = request.getParameter("precio"); %>
<% int stock = request.getParameter("stock")!=null?Integer.parseInt(request.getParameter("stock")):0; %>

<%
    /*int stock = 0;

    if(request.getParameter("stock")!=null){
        stock = Integer.parseInt(request.getParameter("stock");
    }*/

    String estiloStock = "verde";

    if(stock == 0){
        estiloStock = "rojo";
    }else if(stock>0 && stock<5){
        estiloStock = "amarillo";
    }

%>


<html>
<head>
   <title>Buscador</title>
   <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h2>Buscador</h2>
    <form action="buscar" method="get">
        <input type="text" name="nombre">
        <button>Buscar</button>
    </form>
    <div>
        <% if(error!=null) { %>
            <h3>producto no encontrado</h3>
        <% }else if(nombre != null){ %>
            <div>
                Producto: <%= nombre %>
            </div>

            <div>
                Precio: <%= precio %>
            </div>

            <div>
                Stock: <span class='<%= estiloStock %>'> <%= stock %> </span>
            </div>
        <% } %>
    </div>
    <script>
        const stock = <%= stock %>

    </script>
</body>
</html>
