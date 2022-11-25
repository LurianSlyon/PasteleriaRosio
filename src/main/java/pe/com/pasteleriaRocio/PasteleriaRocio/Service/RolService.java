/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.List;
import java.util.Optional;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.RolEntity;

/**
 *
 * @author Lurian
 */
public interface RolService {
        //Funcion que permita mostrar todos los datos
    List<RolEntity> findAll();
    //Funcion que permite mostrar todos los datos habilitados
    List<RolEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<RolEntity> findById(Long id);
    //Funcion para registrar datos
    RolEntity add(RolEntity d);   
    //Funcion para actualizar
    RolEntity update(RolEntity d);
    //Funcion para eliminar
    RolEntity delete(RolEntity d);
}
