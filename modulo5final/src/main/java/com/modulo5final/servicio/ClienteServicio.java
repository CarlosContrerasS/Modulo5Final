package com.modulo5final.servicio;

import java.util.List;

import com.modulo5final.modelo.Cliente;

public interface ClienteServicio {
	
	Cliente findclienteByrut(int rut);
	List<Cliente> listarCliente();
	void agregarCliente(Cliente c);
	void eliminarCliente(int rut);
	void editarCliente(Cliente c);

}
