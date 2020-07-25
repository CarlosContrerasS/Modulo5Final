package ServiciosImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelos.Pagos;
import respositorios.PagosRepositorio;
import servicios.PagosServicio;

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
	public void eliminarPago(int pagoid) {
		pr.delete(pagoid);
		
	}

	@Override
	public void editarPago(Pagos p) {
		pr.save(p);
		
	}

}
