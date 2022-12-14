
package pe.com.pasteleriaRocio.PasteleriaRocio.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.ClienteEntity;

/**
 *
 * @author Fabian
 */
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    @Query("select c from ClienteEntity c where c.estadocl='1'")
    List<ClienteEntity> findAllCustom();
            
    
}
