package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.Cabecera_pedidoEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Repository.Cabecera_pedidoRepository;

/**
*
* @author anthonyCS
*/
@Service
public class Cabecera_pedidoServiceImpl  implements Cabecera_pedidoService{

	@Autowired
	private Cabecera_pedidoRepository repository;

	@Override
	@Transactional
	public void insert(Cabecera_pedidoEntity cabecera_pedidoEntity) {
		// TODO Auto-generated method stub
		repository.save(cabecera_pedidoEntity);
	}

	@Override
	@Transactional
	public void update(Cabecera_pedidoEntity cabecera_pedidoEntity) {
		// TODO Auto-generated method stub
		repository.save(cabecera_pedidoEntity);
	}

	@Override
	@Transactional
	public void delete(Integer idcabpedido) {
		// TODO Auto-generated method stub
		repository.deleteById(idcabpedido);
	}

	@Override
	@Transactional
	public Cabecera_pedidoEntity findById(Integer idcabpedido) {
		// TODO Auto-generated method stub
		return repository.findById(idcabpedido).orElse(null);
	}

	@Override
	@Transactional
	public Collection<Cabecera_pedidoEntity> findAll() {
		// TODO Auto-generated method stub
		return (Collection<Cabecera_pedidoEntity>)repository.findAll();
	}
	
	
}
