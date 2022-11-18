package pe.com.pasteleriaRocio.PasteleriaRocio.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.DetalleProveedorEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Service.DetalleProveedorService;

@RestController
@RequestMapping("/detalleProveedor")
public class DetalleProveedorController {
	
	@Autowired
	private DetalleProveedorService detalleService;
	
	@GetMapping
    public List<DetalleProveedorEntity>findAll(){
        return detalleService.listar();
    }

    @GetMapping("/cus")
    public List<DetalleProveedorEntity> findAllCustom(){
        return  detalleService.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<DetalleProveedorEntity> findById(@PathVariable Long id){
        return  detalleService.buscarPorId(id);
    }
    @PostMapping
    public DetalleProveedorEntity add(@RequestBody DetalleProveedorEntity d){
        return detalleService.agregar(d);
    }
    @PutMapping("/{id}")
    public DetalleProveedorEntity update(@PathVariable Long id, @RequestBody DetalleProveedorEntity d){
        d.setIdetprove(id);
        return detalleService.actualizar(d);
    }
    @DeleteMapping("/{id}")
    public DetalleProveedorEntity delete(@PathVariable Long id){
    	DetalleProveedorEntity objDetalle = new DetalleProveedorEntity();
    	objDetalle.setEstado(false);
        return  detalleService.eliminar(DetalleProveedorEntity.builder().idetprove(id).build());
    }
    
}

