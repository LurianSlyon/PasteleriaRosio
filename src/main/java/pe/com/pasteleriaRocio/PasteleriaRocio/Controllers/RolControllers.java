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
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.RolEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Service.RolService;

/**
 *
 * @author Lurian
 */
@RestController
    @RequestMapping("/rol")
public class RolControllers {
    @Autowired
    private RolService rolService;
    @GetMapping
    public List<RolEntity>findAll(){
        return rolService.findAll();
    }

    @GetMapping("/custom")
    public List<RolEntity> findAllCustom(){
        return  rolService.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<RolEntity> findById(@PathVariable Long id){
        return  rolService.findById(id);
    }
    @PostMapping
    public RolEntity add(@RequestBody RolEntity d){
        return rolService.add(d);
    }
    @PutMapping("/{id}")
    public RolEntity update(@PathVariable Long id, @RequestBody RolEntity d){
        d.setCodigor(id);
        return rolService.update(d);
    }
    @DeleteMapping("/{id}")
    public RolEntity update(@PathVariable Long id){
        RolEntity obRolEntity = new RolEntity();
        obRolEntity.setEstador(false);
        return  rolService.delete(RolEntity.builder().codigor(id).build());
    }
    
}
