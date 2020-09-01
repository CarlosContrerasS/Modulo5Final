package com.modulo5final.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.modulo5final.modelo.Cliente;
import com.modulo5final.servicio.ClienteServicio;


@Controller
public class ClienteControlador {
	
	@Autowired
	ClienteServicio cs;

	// MOSTRAR LOS CLIENTES EN UNA LISTA

	@RequestMapping("/listaclientes")
	public String verclientes(Model m) {
		List<Cliente> listacliente = cs.listarCliente(); // Crear una lista de Clientes
		m.addAttribute("lclientes", listacliente);
		return "listadocliente";
	}

	// AGREGAR CLIENTE:

	// Manda al formulario
	@RequestMapping("/nuevocliente")
	public String crearcliente(Model m) {
		m.addAttribute("command", new Cliente());
		return "clienteform";
	}

	// Trae del Formulario, lo guarda y la manda a mostrar en una lista.

	@RequestMapping(value = "/guardarcliente", method = RequestMethod.POST)
	public String nuevotest(Cliente cli) {
		cs.agregarCliente(cli);
		return "redirect:/listaclientes";
	}

	// ELIMINAR CLIENTE:

	// Viene del nav y manda al forumulario para eliminar
	@RequestMapping("/deletecliente")
	public String deletedatos(Model m) {
		m.addAttribute("cliente", new Cliente());
		return "Clientedelete";
	}

	// Viene del formulario y de la lista para eliminar. Finalmente manda a la lista
	// para mostrar

	@RequestMapping(value = "/eliminarcliente", method = RequestMethod.GET)
	public String deletecliente(@RequestParam("Rut") int Rut) {
		cs.eliminarCliente(Rut);
		return "redirect:/listaclientes";
	}

	// Es usado para buscar el rut en el formulario y entregar los datos del cliente
	// a editar
	@RequestMapping(value = "/detallecliente", method = RequestMethod.GET)
	public String updatedatos(@RequestParam("Rut") int Rut, Model m) {
		Cliente c = cs.findclienteByrut(Rut);
		m.addAttribute("cliente", c);
		return "Clientedelete";
	}

	// EDITAR CLIENTE:

	// Viene del nav y lo lleva al formulario para editar
	@RequestMapping("/editcliente")
	public String actualizardatos(Model m) {
		m.addAttribute("cliente", new Cliente());
		return "Clienteeditform";
	}

	// Viene del listado y lo lleva al formulario para editar
	@RequestMapping(value = "/editarcliente", method = RequestMethod.GET)
	public String edit(@RequestParam("Rut") int Rut, Model m) {
		Cliente cli = cs.findclienteByrut(Rut);
		m.addAttribute("cliente", cli);
		return "Clienteeditform";
	}

	// Guarda los datos editados y los manda al listado para mostrar
	@RequestMapping(value = "/guardareditcliente", method = RequestMethod.POST)
	public String editsave(Cliente cli) {
		cs.editarCliente(cli);
		return "redirect:/listaclientes";
	}

}
