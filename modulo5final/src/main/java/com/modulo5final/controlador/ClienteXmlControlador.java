package com.modulo5final.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.modulo5final.modelo.Cliente;
import com.modulo5final.modelo.ClienteXml;
import com.modulo5final.modelo.ClienteXmlLista;
import com.modulo5final.servicio.ClienteServicio;


public class ClienteXmlControlador {
	
	@Autowired
	ClienteServicio cs;
	
	@RequestMapping(value = "/clilistxml", method = RequestMethod.GET, headers = "Accept=application/xml")
	public ClienteXmlLista getClientes() {
		ClienteXmlLista clientesxml = new ClienteXmlLista();
		List<Cliente> listacli = cs.listarCliente();
		List<ClienteXml> listaclixml = new ArrayList<ClienteXml>();

		for (int i = 0; i < listacli.size(); i++) {
			Cliente c = listacli.get(i);
			ClienteXml cx = new ClienteXml();
			cx.setRut(c.getRut());
			cx.setNombre(c.getNombre());
			cx.setRubro(c.getRubro());
			cx.setTelefono(c.getTelefono());
			cx.setMail(c.getMail());
			cx.setDireccion(c.getDireccion());
			listaclixml.add(cx);
			
		}

		clientesxml.setListaclientes(listaclixml);
		return clientesxml;
	}

}
