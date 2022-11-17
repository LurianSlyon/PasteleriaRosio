/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.List;
import java.util.Optional;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.AlmacenEntity;

/**
 *
 * @author Dante
 */
public interface AlmacenService {
    //Funcion que permita mostrar todos los datos
    List<AlmacenEntity> findAll();
    //Funcion que permite mostrar todos los datos habilitados
    List<AlmacenEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<AlmacenEntity> findById(Long id);
    //Funcion para registrar datos
    AlmacenEntity add(AlmacenEntity d);   
    //Funcion para actualizar
    AlmacenEntity update(AlmacenEntity d);
    //Funcion para eliminar
    AlmacenEntity delete(AlmacenEntity d);
}
