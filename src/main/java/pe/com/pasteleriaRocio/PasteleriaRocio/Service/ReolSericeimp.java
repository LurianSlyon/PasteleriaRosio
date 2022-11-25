/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.RolEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Repository.RolRepository;


/**
 *
 * @author Lurian
 */
@Service
public class RolSeviceimpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<RolEntity> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public List<RolEntity> findAllCustom() {
        return rolRepository.findAllCustom();
    }

    @Override
    public Optional<RolEntity> findById(Long id) {
        return rolRepository.findById(id);
    }

    @Override
    public RolEntity add(RolEntity a) {
        return rolRepository.save(a);
    }

    @Override
    public RolEntity update(RolEntity a) {
        RolEntity objrol=rolRepository.getById(a.getCodigor());
        BeanUtils.copyProperties(a, objrol);
        return rolRepository.save(objrol);
    }

    @Override
    public RolEntity delete(RolEntity a) {
        RolEntity objrol=rolRepository.getById(a.getCodigor());
        objrol.setEstador(false);
        return rolRepository.save(objrol);
    }
}
