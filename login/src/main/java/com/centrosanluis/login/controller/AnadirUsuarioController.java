package com.centrosanluis.login.controller;

import com.centrosanluis.login.dto.UsuarioDTO;
import com.centrosanluis.login.model.UsuarioModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="anadirUsuario", urlPatterns = {"/anadirUsuario"})
public class AnadirUsuarioController extends HttpServlet {

    private UsuarioModel usuarioModel;

    @Override
    public void init() throws ServletException {
        usuarioModel = UsuarioModel.getInstance();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");

        UsuarioDTO usuario = new UsuarioDTO(user, pass, nombre, apellido);

        boolean anadido = usuarioModel.anadirUsuario(usuario);

        if(anadido) {
            response.sendRedirect("login.jsp?registro=OK");
        }else{
            response.sendRedirect("login.jsp?registro=KO");
        }

    }
}
