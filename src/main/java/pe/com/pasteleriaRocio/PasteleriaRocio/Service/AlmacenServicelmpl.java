/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.AlmacenEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Repository.AlmacenRepository;

/**
 *
 * @author Dante
 */
public class AlmacenServicelmpl implements AlmacenService{
    
    @Autowired
    private AlmacenRepository almacenRepository;
    
    @Override
    public List<AlmacenEntity> findAll(){
        return almacenRepository.findAll();
    }
    
    @Override
    public List<AlmacenEntity> findAllCustom(){
        return almacenRepository.findAllCustom();
    }
    
    @Override
    public Optional<AlmacenEntity> findById(Long id) {
        return almacenRepository.findById(id);
    }
    
    @Override
    public AlmacenEntity add(AlmacenEntity a) {
        return almacenRepository.save(a);
    }
    
    @Override
    public AlmacenEntity update(AlmacenEntity a) {
        AlmacenEntity objAlmac=almacenRepository.getById(a.getCodigoa());
        BeanUtils.copyProperties(a, objAlmac);
        return almacenRepository.save(objAlmac);
    }
    
    @Override
    public AlmacenEntity delete(AlmacenEntity a) {
        AlmacenEntity objAlmac=almacenRepository.getById(a.getCodigoa());
        objAlmac.setEstadoa(false);
        return almacenRepository.save(objAlmac);
    }
}
