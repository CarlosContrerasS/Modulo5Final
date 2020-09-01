package com.modulo5final.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modulo5final.modelo.Cliente;
import com.modulo5final.modelo.ClienteRepositorio;



@Service
public class ClienteServicioImpl implements ClienteServicio {
	
	@Autowired
	ClienteRepositorio cr;

	@Override
	public Cliente findclienteByrut(int rut) {
		return cr.findOne(rut);
	}

	@Override
	public List<Cliente> listarCliente() {
		return (List<Cliente>)cr.findAll();
	}

	@Override
	public void agregarCliente(Cliente c) {
		cr.save(c);

	}

	@Override
	public void eliminarCliente(int rut) {
		cr.delete(rut);

	}

	@Override
	public void editarCliente(Cliente c) {
		cr.save(c);

	}

	
}
