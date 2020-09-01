package com.modulo5final.servicio;

import java.util.List;

import com.modulo5final.modelo.Usuario;

public interface UsuarioServicio {
	
	Usuario findusuarioByusuarioid(int usuarioid);
	List<Usuario> listarUsuario();
	void agregarUsuario(Usuario u);
	void eliminarUsuario(int usuarioid);
	void editarUsuario(Usuario u);

}
