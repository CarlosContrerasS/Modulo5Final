package com.Modulo5Final.servicio;

import java.util.List;

import com.Modulo5Final.dao.Cliente;



public interface ClienteServicio {
	
	Cliente findclienteByrut(int rut);
	List<Cliente> listarCliente();
	void agregarCliente(Cliente c);
	void eliminarCliente(int rut);
	void editarCliente(Cliente c);

}
