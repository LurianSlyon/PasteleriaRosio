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
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.CategoriaEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Service.CategoriaService;


/**
 *
 * @author Lurian
 */
@RestController
    @RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;
    @GetMapping
    public List<CategoriaEntity>findAll(){
        return categoriaService.findAll();
    }

    @GetMapping("/custom")
    public List<CategoriaEntity> findAllCustom(){
        return  categoriaService.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<CategoriaEntity> findById(@PathVariable Long id){
        return  categoriaService.findById(id);
    }
    @PostMapping
    public CategoriaEntity add(@RequestBody CategoriaEntity d){
        return categoriaService.add(d);
    }
    @PutMapping("/{id}")
    public CategoriaEntity update(@PathVariable Long id, @RequestBody CategoriaEntity d){
        d.setCodigoc(id);
        return categoriaService.update(d);
    }
    @DeleteMapping("/{id}")
    public CategoriaEntity update(@PathVariable Long id){
        CategoriaEntity obDistritoEntity = new CategoriaEntity();
        obDistritoEntity.setEstadoc(false);
        return  categoriaService.delete(CategoriaEntity.builder().codigoc(id).build());
    }
    
}

