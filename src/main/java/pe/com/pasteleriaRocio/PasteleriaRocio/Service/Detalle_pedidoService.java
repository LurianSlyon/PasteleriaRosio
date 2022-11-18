package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.Collection;

import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.Detalle_pedidoEntity;
/**
*
* @author anthony carhuayalle saboya
*/

public interface Detalle_pedidoService {
	public abstract void insert (Detalle_pedidoEntity detalle_pedidoEntity);
	public abstract void update (Detalle_pedidoEntity detalle_pedidoEntity);
	public abstract void delete (Integer id_apoderado);
	public abstract Detalle_pedidoEntity findById (Integer id_apoderado);
	public abstract Collection<Detalle_pedidoEntity>findAll();
}
