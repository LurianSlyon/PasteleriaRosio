
package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.List;
import java.util.Optional;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.ClienteEntity;

/**
 *
 * @author Fabian
 */
public interface ClienteService {
    List<ClienteEntity>findAll();
    List<ClienteEntity>findAllCustom();
    Optional<ClienteEntity>findById(Long id);
    ClienteEntity add(ClienteEntity c);
    ClienteEntity update(ClienteEntity c);
    ClienteEntity dalete (ClienteEntity c);
}
