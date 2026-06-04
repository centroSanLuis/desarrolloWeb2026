package com.centrosanluis.login.controller;

import com.centrosanluis.login.dto.UsuarioDTO;
import com.centrosanluis.login.model.UsuarioModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="login", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {

    private UsuarioModel usuarioModel;

    @Override
    public void init() throws ServletException {
        usuarioModel = UsuarioModel.getInstance();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String password = request.getParameter("pass");

        UsuarioDTO usuario = new UsuarioDTO(user, password);

        UsuarioDTO usuarioLogueado = usuarioModel.login(usuario);

        if(usuarioLogueado != null){
            response.sendRedirect("index.jsp?nombre="+usuarioLogueado.getNombre()+"&apellido="+usuarioLogueado.getApellidos());
        }else{
            response.sendRedirect("login.jsp?error=true");
        }
    }
}
