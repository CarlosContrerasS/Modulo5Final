package servicios;

import java.util.List;

import modelos.Asesorias;

public interface AsesoriasServicio {

	
	Asesorias findAsesoriasById(int IDAsesorias);
	List<Asesorias> listarAsesorias();
	void agregarAsesorias(Asesorias ase);
	void eliminarAsesorias(int IDAsesorias);
	void editarAsesorias(Asesorias ase);
	
	
	
}