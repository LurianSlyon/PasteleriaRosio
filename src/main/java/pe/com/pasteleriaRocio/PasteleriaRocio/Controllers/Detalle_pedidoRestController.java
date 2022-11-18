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

import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.Detalle_pedidoEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Service.Detalle_pedidoService;

@RestController
@RequestMapping("/Detalle_pedido")
public class Detalle_pedidoRestController {
	
	@Autowired
	private Detalle_pedidoService detalle_pedidoService;
	
	@GetMapping("/listar")
	public ResponseEntity<?> listar(){
		Collection<Detalle_pedidoEntity> itemsDllp = detalle_pedidoService.findAll();
		return new ResponseEntity<>(itemsDllp,HttpStatus.OK);
	}
	
	@GetMapping("/buscar/{codigodet}")
	public ResponseEntity<?> buscar(@PathVariable Integer codigodet){
		Detalle_pedidoEntity detalle_pedidoDb= detalle_pedidoService.findById(codigodet);
		
		if (detalle_pedidoDb != null) {
			return new ResponseEntity<>(detalle_pedidoDb,HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/agregar")
	public ResponseEntity<?> agregar(@RequestBody Detalle_pedidoEntity detalle_pedidoEntity){
		detalle_pedidoService.insert(detalle_pedidoEntity);
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/editar/{codigodet}")
	public ResponseEntity<?> editar(@PathVariable Integer codigodet, @RequestBody Detalle_pedidoEntity newDetalle_pedido){
		Detalle_pedidoEntity detalle_pedidoDb = detalle_pedidoService.findById(codigodet);
		
		if (detalle_pedidoDb != null) {
			detalle_pedidoDb.setFecha_entrega(newDetalle_pedido.getFecha_entrega());
			detalle_pedidoDb.setSubtotal(newDetalle_pedido.getSubtotal());
			detalle_pedidoDb.setCantidad(newDetalle_pedido.getCantidad());
			detalle_pedidoDb.setObservacion(newDetalle_pedido.getObservacion());
			detalle_pedidoDb.setIdproducto(newDetalle_pedido.getIdproducto());
			detalle_pedidoDb.setIdcabpedido(newDetalle_pedido.getIdcabpedido());
			
			detalle_pedidoService.update(detalle_pedidoDb);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/borrar/{id_apoderado}")
	public ResponseEntity<?> borrar(@PathVariable Integer codigodet){
		Detalle_pedidoEntity detalle_pedidoDb = detalle_pedidoService.findById(codigodet);
		
		if(detalle_pedidoDb != null) {
			detalle_pedidoService.delete(codigodet);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
}
