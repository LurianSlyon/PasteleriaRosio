package pe.com.pasteleriaRocio.PasteleriaRocio.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.DetalleProveedorEntity;

public interface DetalleProveedorRepository extends JpaRepository<DetalleProveedorEntity, Long> {

	@Query("select c from DetalleProveedorEntity c where c.estado='1'")
    List<DetalleProveedorEntity> findAllCustom();
}
