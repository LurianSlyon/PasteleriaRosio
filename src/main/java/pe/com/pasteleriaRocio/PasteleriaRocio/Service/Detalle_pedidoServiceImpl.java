package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.Detalle_pedidoEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Repository.Detalle_pedidoRepository;
/**
*
* @author anthonyCS
*/
@Service
public class Detalle_pedidoServiceImpl implements Detalle_pedidoService{
	
	@Autowired
	private Detalle_pedidoRepository repository;

	@Override
	@Transactional
	public void insert(Detalle_pedidoEntity detalle_pedidoEntity) {
		// TODO Auto-generated method stub
		repository.save(detalle_pedidoEntity);
	}

	@Override
	@Transactional
	public void update(Detalle_pedidoEntity detalle_pedidoEntity) {
		// TODO Auto-generated method stub
		repository.save(detalle_pedidoEntity);
	}

	@Override
	@Transactional
	public void delete(Integer id_apoderado) {
		// TODO Auto-generated method stub
		repository.deleteById(id_apoderado);
	}

	@Override
	@Transactional
	public Detalle_pedidoEntity findById(Integer id_apoderado) {
		// TODO Auto-generated method stub
		return repository.findById(id_apoderado).orElse(null);
	}

	@Override
	@Transactional
	public Collection<Detalle_pedidoEntity> findAll() {
		// TODO Auto-generated method stub
		return (Collection<Detalle_pedidoEntity>)repository.findAll();
	}

}
