/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.ProductoEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Service.ProductoService;


/**
 *
 * @author Lurian
 */
@RestController
    @RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    @GetMapping
    public List<ProductoEntity>findAll(){
        return productoService.findAll();
    }

    @GetMapping("/cus")
    public List<ProductoEntity> findAllCustom(){
        return  productoService.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<ProductoEntity> findById(@PathVariable Long id){
        return  productoService.findById(id);
    }
    @PostMapping
    public ProductoEntity add(@RequestBody ProductoEntity d){
        return productoService.add(d);
    }
    @PutMapping("/{id}")
    public ProductoEntity update(@PathVariable Long id, @RequestBody ProductoEntity d){
        d.setCodigop(id);
        return productoService.update(d);
    }
    @DeleteMapping("/{id}")
    public ProductoEntity update(@PathVariable Long id){
        ProductoEntity obproductoEntity = new ProductoEntity();
        obproductoEntity.setEstadop(false);
        return  productoService.delete(ProductoEntity.builder().codigop(id).build());
    }
    
}
