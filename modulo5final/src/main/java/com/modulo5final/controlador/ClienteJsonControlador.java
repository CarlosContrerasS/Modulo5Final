package com.modulo5final.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.modulo5final.modelo.Cliente;
import com.modulo5final.servicio.ClienteServicio;


@RestController
public class ClienteJsonControlador {
	
	@Autowired
	ClienteServicio cs;
	
	@RequestMapping(value = "/clilist", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Cliente> getClientes() {
		List<Cliente> listaclientes = cs.listarCliente();
		return listaclientes;
	}
	
	@RequestMapping(value = "/clilist", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addCliente(@RequestBody Cliente cliente) {
		cs.agregarCliente(cliente);
	}
	
	@RequestMapping(value = "/clilist", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateCliente(@RequestBody Cliente cliente) {
		cs.editarCliente(cliente);
	}
	
	@RequestMapping(value = "/clidetalle/{rut}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Cliente getClientePorRut(@PathVariable int rut) {
		return cs.findclienteByrut(rut);
	}
	
	@RequestMapping(value = "/clidetalle/{rut}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCliente(@PathVariable("rut") int rut) {
		cs.eliminarCliente(rut);
	}
	

}
