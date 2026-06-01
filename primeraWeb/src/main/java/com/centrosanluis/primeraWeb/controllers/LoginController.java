package com.centrosanluis.primeraWeb.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.primeraWeb.dto.UsuarioDTO;
import com.centrosanluis.primeraWeb.models.UsuarioModel;

@WebServlet(name = "login", urlPatterns = { "/login" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioModel usuarioModel;
	
	@Override
	public void init() throws ServletException {
		usuarioModel = new UsuarioModel();
	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		UsuarioDTO usuario = new UsuarioDTO(user, pass);
		
		UsuarioDTO usuarioLogueado = usuarioModel.login(usuario);
		
		if(usuarioLogueado != null) {
			response.sendRedirect("secreto.html");
		}else {
			response.sendRedirect("index.html");
		}
		
	}

}
