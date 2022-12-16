package pe.com.pasteleriaRocio.PasteleriaRocio.Controllers;

/**
*
* @author anthony carhuayalle saboya
*/
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.Cabecera_pedidoEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Service.Cabecera_pedidoService;

@RestController
@RequestMapping("/cabecera_pedido")
public class Cabecera_pedidoRestController {
	
	@Autowired
	private Cabecera_pedidoService cabecera_pedidoService;
	
	
	@GetMapping("/listar")
	public ResponseEntity<?> listar(){
		Collection<Cabecera_pedidoEntity> itemscbp = cabecera_pedidoService.findAll();
		return new ResponseEntity<>(itemscbp,HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{idcabpedido}")
	public ResponseEntity<?> buscar(@PathVariable Integer idcabpedido){
		Cabecera_pedidoEntity cabecera_pedidoDb= cabecera_pedidoService.findById(idcabpedido);
		
		if (cabecera_pedidoDb != null) {
			return new ResponseEntity<>(cabecera_pedidoDb,HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/agregar")
	public ResponseEntity<?> agregar(@RequestBody Cabecera_pedidoEntity cabecera_pedidoEntity){
		cabecera_pedidoService.insert(cabecera_pedidoEntity);
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/editar/{idcabpedido}")
	public ResponseEntity<?> editar(@PathVariable Integer idcabpedido, @RequestBody Cabecera_pedidoEntity newCabecera_pedido){
		Cabecera_pedidoEntity cabecera_pedidoDb = cabecera_pedidoService.findById(idcabpedido);
		
		if (cabecera_pedidoDb != null) {
			cabecera_pedidoDb.setNumber_pedido(newCabecera_pedido.getNumber_pedido());
			cabecera_pedidoDb.setFecha(newCabecera_pedido.getFecha());
			cabecera_pedidoDb.setEstado(newCabecera_pedido.isEstado());
			cabecera_pedidoDb.setIdcliente(newCabecera_pedido.getIdcliente());
			
			cabecera_pedidoService.update(cabecera_pedidoDb);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/borrar/{idcabpedido}")
	public ResponseEntity<?> borrar(@PathVariable Integer idcabpedido){
		Cabecera_pedidoEntity cabecera_pedidoDb = cabecera_pedidoService.findById(idcabpedido);
		
		if(cabecera_pedidoDb != null) {
			cabecera_pedidoService.delete(idcabpedido);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
}
