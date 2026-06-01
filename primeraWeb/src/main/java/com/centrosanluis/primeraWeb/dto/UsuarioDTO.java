package com.centrosanluis.primeraWeb.dto;

public class UsuarioDTO {
	
	private String user;
	private String pass;
	private String nombre;
	private String apellidos;
	
	public UsuarioDTO(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}

	public UsuarioDTO(String user, String pass, String nombre, String apellidos) {
		this.user = user;
		this.pass = pass;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
