package com.centrosanluis.login.model;

import com.centrosanluis.login.dto.UsuarioDTO;

import java.util.ArrayList;

public class UsuarioModel {

    private ArrayList<UsuarioDTO> usuarios;
    private static UsuarioModel usuarioModel;

    private UsuarioModel() {
        if(usuarios == null){
            usuarios = new ArrayList<>();
            usuarios.add(new UsuarioDTO("admin", "admin", "Alberto", "GCR"));
        }
    }

    public static UsuarioModel getInstance() {
        if(usuarioModel==null){
            usuarioModel = new UsuarioModel();
        }

        return usuarioModel;
    }

    public UsuarioDTO login(UsuarioDTO usuario) {
        //UsuarioDTO retorno = null;

        /*for(int i=0;i<usuarios.size();i++){
            UsuarioDTO user = usuarios.get(i);
            if(user.getUser().equals(usuario.getUser()) && user.getPass().equals(usuario.getPass())) {
                retorno = user;
                break;
            }
        }*/

        for (UsuarioDTO user : usuarios) {
            if(user.getUser().equals(usuario.getUser()) && user.getPass().equals(usuario.getPass())) {
                /*retorno = user;
                break;*/
                return user;
            }
        }

        return null;
        //return retorno;
    }

    public boolean anadirUsuario(UsuarioDTO usuario) {
        for (UsuarioDTO user : usuarios) {
            if(user.getUser().equals(usuario.getUser())){
                return false;
            }
        }

        usuarios.add(usuario);
        return true;
    }

}
