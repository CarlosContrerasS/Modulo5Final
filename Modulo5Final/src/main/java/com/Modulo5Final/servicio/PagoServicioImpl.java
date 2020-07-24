package com.reskilling4.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reskilling4.dao.Pago;
import com.reskilling4.dao.PagoRepositorio;

@Service
public class PagoServicioImpl implements PagoServicio {
	
	@Autowired
	PagoRepositorio pr;

	@Override
	public Pago findPagoByPagoid(int pagoid) {
		// TODO Auto-generated method stub
		return pr.findOne(pagoid);
	}

	@Override
	public List<Pago> listarPago() {
		// TODO Auto-generated method stub
		return (List<Pago>)pr.findAll();
	}

	@Override
	public void agregarPago(Pago p) {
		pr.save(p);
		
	}

	@Override
	public void eliminarPago(int pagoid) {
		pr.delete(pagoid);
		
	}

	@Override
	public void editarPago(Pago p) {
		pr.save(p);
		
	}

}
