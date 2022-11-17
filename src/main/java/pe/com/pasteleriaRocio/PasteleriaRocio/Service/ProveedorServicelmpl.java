/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.ProveedorEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Repository.ProveedorRepository;

/**
 *
 * @author Dante
 */
public class ProveedorServicelmpl implements ProveedorService{
    
    @Autowired
    private ProveedorRepository proveedorRepository;
    
    @Override
    public List<ProveedorEntity> findAll(){
        return proveedorRepository.findAll();
    }
    
    @Override
    public List<ProveedorEntity> findAllCustom(){
        return proveedorRepository.findAllCustom();
    }
    
    @Override
    public Optional<ProveedorEntity> findById(Long id) {
        return proveedorRepository.findById(id);
    }
    
    @Override
    public ProveedorEntity add(ProveedorEntity a) {
        return proveedorRepository.save(a);
    }
    
    @Override
    public ProveedorEntity update(ProveedorEntity a) {
        ProveedorEntity objProv=proveedorRepository.getById(a.getCodigopr());
        BeanUtils.copyProperties(a, objProv);
        return proveedorRepository.save(objProv);
    }
    
    @Override
    public ProveedorEntity delete(ProveedorEntity a) {
        ProveedorEntity objProv=proveedorRepository.getById(a.getCodigopr());
        objProv.setEstadopr(false);
        return proveedorRepository.save(objProv);
    }
}
