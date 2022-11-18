package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.Collection;

import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.Cabecera_pedidoEntity;

/**
*
* @author anthony carhuayalle saboya
*/

public interface Cabecera_pedidoService {
	public abstract void insert (Cabecera_pedidoEntity cabecera_pedidoEntity);
	public abstract void update (Cabecera_pedidoEntity cabecera_pedidoEntity);
	public abstract void delete (Integer idcabpedido);
	public abstract Cabecera_pedidoEntity findById (Integer idcabpedido);
	public abstract Collection<Cabecera_pedidoEntity>findAll();
}
