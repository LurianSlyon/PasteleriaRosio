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
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.AlmacenEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Service.AlmacenService;

/**
 *
 * @author Dante
 */
@RestController
    @RequestMapping("/almacen")
public class AlmacenController {
    @Autowired
    private AlmacenService almacenService;
    @GetMapping
    public List<AlmacenEntity>findAll(){
        return almacenService.findAll();
    }
    
    @GetMapping("/cust")
    public List<AlmacenEntity>findAllCustom(){
        return almacenService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<AlmacenEntity> findById(@PathVariable Long id){
        return almacenService.findById(id);
    }
    @PostMapping
    public AlmacenEntity add(@RequestBody AlmacenEntity d){
        return almacenService.add(d);
    }
    @PutMapping("/{id}")
    public AlmacenEntity update(@PathVariable Long id, @RequestBody AlmacenEntity d){
        d.setCodigoa(id);
        return almacenService.update(d);
    }
    @DeleteMapping("/{id}")
    public AlmacenEntity update(@PathVariable Long id){
        AlmacenEntity obAlmacenEntity = new AlmacenEntity();
        obAlmacenEntity.setEstadoa(false);
        return  almacenService.delete(AlmacenEntity.builder().codigoa(id).build());
    }
}
