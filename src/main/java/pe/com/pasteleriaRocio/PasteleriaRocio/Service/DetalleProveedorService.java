package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.List;
import java.util.Optional;

import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.DetalleProveedorEntity;

public interface DetalleProveedorService {

	 List<DetalleProveedorEntity> listar();
	    //Funcion que permite mostrar todos los datos habilitados
	    List<DetalleProveedorEntity> findAllCustom();
	    //Funcion para poder buscar por codigo
	    Optional<DetalleProveedorEntity> buscarPorId(Long id);
	    //Funcion para registrar datos
	    DetalleProveedorEntity agregar(DetalleProveedorEntity detalle);   
	    //Funcion para actualizar
	    DetalleProveedorEntity actualizar(DetalleProveedorEntity detalle);
	    //Funcion para eliminar
	    DetalleProveedorEntity eliminar (DetalleProveedorEntity detalle);
}
