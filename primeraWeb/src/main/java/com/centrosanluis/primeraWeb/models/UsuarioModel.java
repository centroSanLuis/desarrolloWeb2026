package com.centrosanluis.primeraWeb.models;

import com.centrosanluis.primeraWeb.dto.UsuarioDTO;

public class UsuarioModel {
	
	public UsuarioDTO login(UsuarioDTO usuarioLogin) {
		UsuarioDTO respuesta = null;
		
		if(usuarioLogin.getUser().equals("alberto") && usuarioLogin.getPass().equals("1234")) {
			respuesta = new UsuarioDTO("alberto", "1234", "Alberto", "Garcia de Cortazar");
		}
		
		return respuesta;
	}

}
