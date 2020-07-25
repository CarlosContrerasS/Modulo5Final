package servicios;

import java.util.List;

import modelos.Mejoras;

public interface MejorasServicio {

	Mejoras findMejorasById(int IDMejora);
	List<Mejoras> listarMejoras();
	void agregarMejoras(Mejoras mej);
	void eliminarMejoras(int IDMejora);
	void editarMejoras(Mejoras mej);
	
	
	
	
}

