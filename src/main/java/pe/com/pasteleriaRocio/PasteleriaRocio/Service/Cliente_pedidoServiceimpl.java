
package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.ClienteEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Repository.ClienteRepository;

/**
 *
 * @author Fabian
 */
public class Cliente_pedidoServiceimpl implements ClienteService{
    @Autowired
    private ClienteRepository repositoriocli;
    
    @Override
    @Transactional
    public List<ClienteEntity> findAll() {
         return repositoriocli.findAll();
    }

    @Override
    @Transactional
    public List<ClienteEntity> findAllCustom() {
        return repositoriocli.findAllCustom();
    }

    @Override
    @Transactional
    public Optional<ClienteEntity> findById(Long id) {
        return repositoriocli.findById(id);
    }

    @Override
    @Transactional
    public ClienteEntity add(ClienteEntity c) {
        return repositoriocli.save(c);
    }

    @Override
    @Transactional
    public ClienteEntity update(ClienteEntity c) {
        ClienteEntity objcliente = repositoriocli.getById(c.getCodeclient());
        BeanUtils.copyProperties(c, objcliente);
        return repositoriocli.save(objcliente);
    }

    @Override
    @Transactional
    public ClienteEntity dalete(ClienteEntity c) {
       ClienteEntity objcliente = repositoriocli.getById(c.getCodeclient());
       objcliente.setEstadoc(false);
       return repositoriocli.save(objcliente);
    }

    
    
    
    
}
