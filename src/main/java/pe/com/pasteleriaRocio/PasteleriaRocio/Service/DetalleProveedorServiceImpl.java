package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.CategoriaEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.DetalleProveedorEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Repository.DetalleProveedorRepository;

@Service
public class DetalleProveedorServiceImpl implements DetalleProveedorService{

	@Autowired
	private DetalleProveedorRepository detalleProveedorRep;

	@Override
	public List<DetalleProveedorEntity> listar() {
		return detalleProveedorRep.findAll();
	}

	@Override
	public List<DetalleProveedorEntity> findAllCustom() {
		return detalleProveedorRep.findAllCustom();
	}

	@Override
	public Optional<DetalleProveedorEntity> buscarPorId(Long id) {
		return detalleProveedorRep.findById(id);
	}

	@Override
	public DetalleProveedorEntity agregar(DetalleProveedorEntity detalle) {
		return detalleProveedorRep.save(detalle);
	}

	@Override
	public DetalleProveedorEntity actualizar(DetalleProveedorEntity detalle) {
		DetalleProveedorEntity objdet=detalleProveedorRep.getById(detalle.getIdetprove());
		BeanUtils.copyProperties(detalle, objdet);
		return detalleProveedorRep.save(objdet);
	}

	@Override
	public DetalleProveedorEntity eliminar(DetalleProveedorEntity detalle) {
		DetalleProveedorEntity objdet=detalleProveedorRep.getById(detalle.getIdetprove());
		objdet.setEstado(false);
        return detalleProveedorRep.save(objdet);
	}
	
	
}
