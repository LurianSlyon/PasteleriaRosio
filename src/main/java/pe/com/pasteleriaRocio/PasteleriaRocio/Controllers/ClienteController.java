package pe.com.pasteleriaRocio.PasteleriaRocio.Controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.ClienteEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Service.ClienteService;

/**
 *
 * @author Fabian
 */
@RestController
    @RequestMapping("/cliente")
    @CrossOrigin(origins = "http://localhost:4200")//permisos para reconocer en angular
public class ClienteController {
    @Autowired
    private ClienteService servicio;
    @GetMapping
    public List<ClienteEntity>findAll(){
        return servicio.findAll();
    }
    @GetMapping("/custom")
    public List<ClienteEntity>findAllCustom(){
        return servicio.findAllCustom();
    }
     @GetMapping("/{id}")
    public Optional<ClienteEntity>findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    @PostMapping
    public ClienteEntity add(@RequestBody ClienteEntity c){
        return servicio.add(c);
    }
    @PutMapping("/{id}")
    public ClienteEntity update(@PathVariable Long id, @RequestBody ClienteEntity c){
        c.setCodeclient(id);
        return servicio.update(c);
    }
    @DeleteMapping("/{id}")
    public ClienteEntity delete (@PathVariable Long id){
        ClienteEntity objCliente = new ClienteEntity();
        objCliente.setEstadoc(false);
        return servicio.dalete(ClienteEntity.builder().codeclient(id).build());
     }
}
