package com.modulo5final.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modulo5final.modelo.Pagos;
import com.modulo5final.modelo.PagosRepositorio;

@Service
public class PagosServicioImpl implements PagosServicio {
	
	@Autowired
	PagosRepositorio pr;

	@Override
	public Pagos findPagoByPagoid(int idpago) {
		return pr.findOne(idpago);
	}

	@Override
	public List<Pagos> listarPagos() {
		return (List<Pagos>)pr.findAll();
	}

	@Override
	public void agregarPago(Pagos p) {
		pr.save(p);
		
	}

	@Override
	public void eliminarPago(int idpago) {
		pr.delete(idpago);
		
	}

	@Override
	public void editarPago(Pagos p) {
		pr.save(p);
		
	}

}
