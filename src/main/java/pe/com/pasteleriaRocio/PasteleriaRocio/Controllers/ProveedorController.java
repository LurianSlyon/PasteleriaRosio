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
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.ProveedorEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Service.ProveedorService;

/**
 *
 * @author Dante
 */
@RestController
    @RequestMapping("/proveedor")
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;
    @GetMapping
    public List<ProveedorEntity>findAll(){
        return proveedorService.findAll();
    }
    
    @GetMapping("/custo")
    public List<ProveedorEntity>findAllCustom(){
        return proveedorService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ProveedorEntity> findById(@PathVariable Long id){
        return proveedorService.findById(id);
    }
    @PostMapping
    public ProveedorEntity add(@RequestBody ProveedorEntity d){
        return proveedorService.add(d);
    }
    @PutMapping("/{id}")
    public ProveedorEntity update(@PathVariable Long id, @RequestBody ProveedorEntity d){
        d.setCodigopr(id);
        return proveedorService.update(d);
    }
    @DeleteMapping("/{id}")
    public ProveedorEntity update(@PathVariable Long id){
        ProveedorEntity obProveedorEntity = new ProveedorEntity();
        obProveedorEntity.setEstadopr(false);
        return  proveedorService.delete(ProveedorEntity.builder().codigopr(id).build());
    }
}
