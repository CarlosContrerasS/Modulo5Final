package com.modulo5final.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modulo5final.modelo.Usuario;
import com.modulo5final.modelo.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {
	
	@Autowired
	UsuarioRepositorio ur;

	@Override
	public Usuario findusuarioByusuarioid(int usuarioid) {
		// TODO Auto-generated method stub
		return ur.findOne(usuarioid);
	}

	@Override
	public List<Usuario> listarUsuario() {
		// TODO Auto-generated method stub
		return  (List<Usuario>) ur.findAll();
	}

	@Override
	public void agregarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		ur.save(u);
	}

	@Override
	public void eliminarUsuario(int usuarioid) {
		// TODO Auto-generated method stub
		ur.delete(usuarioid);
	}

	@Override
	public void editarUsuario(Usuario u) {
		// TODO Auto-generated method stub
		ur.save(u);
	}

	
	
	

	

}
