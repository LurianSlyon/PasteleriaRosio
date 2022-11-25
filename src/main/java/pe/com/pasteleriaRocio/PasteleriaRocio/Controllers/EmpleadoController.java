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
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.EmpleadoEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Service.EmpleadoService;

/**
 *
 * @author Dante
 */
@RestController
    @RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;
    @GetMapping
    public List<EmpleadoEntity>findAll(){
        return empleadoService.findAll();
    }
    
    @GetMapping("/cust")
    public List<EmpleadoEntity>findAllCustom(){
        return empleadoService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<EmpleadoEntity> findById(@PathVariable Long id){
        return empleadoService.findById(id);
    }
    @PostMapping
    public EmpleadoEntity add(@RequestBody EmpleadoEntity d){
        return empleadoService.add(d);
    }
    @PutMapping("/{id}")
    public EmpleadoEntity update(@PathVariable Long id, @RequestBody EmpleadoEntity d){
        d.setCodigoemp(id);
        return empleadoService.update(d);
    }
    @DeleteMapping("/{id}")
    public EmpleadoEntity update(@PathVariable Long id){
        EmpleadoEntity objEmpleadoEntity = new EmpleadoEntity();
        objEmpleadoEntity.setEstadoemp(false);
        return  empleadoService.delete(EmpleadoEntity.builder().codigoemp(id).build());
    }
}
