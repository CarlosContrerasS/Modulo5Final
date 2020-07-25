package respositorios;

import org.springframework.data.repository.CrudRepository;

import modelos.Empleado;

public interface EmpleadoRepositorio extends CrudRepository<Empleado, Integer>  {
}
