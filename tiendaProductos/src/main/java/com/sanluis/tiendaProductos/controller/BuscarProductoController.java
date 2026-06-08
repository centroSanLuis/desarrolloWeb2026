package com.sanluis.tiendaProductos.controller;

import com.sanluis.tiendaProductos.dto.ProductoDTO;
import com.sanluis.tiendaProductos.model.ProductoModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="buscar", urlPatterns = {"/buscar"})
public class BuscarProductoController extends HttpServlet {

    ProductoModel productoModel;

    @Override
    public void init() throws ServletException {
        productoModel = ProductoModel.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");

        ProductoDTO producto = productoModel.getProductoByName(nombre);

        if(producto != null){
            response.sendRedirect("index.jsp?nombre="+ producto.getNombre() +"&precio="+producto.getPrecio() + "&stock=" +producto.getStock());
        }else{
            response.sendRedirect("index.jsp?error=error");
        }
    }
}
