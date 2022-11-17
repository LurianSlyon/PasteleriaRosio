/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.List;
import java.util.Optional;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.ProveedorEntity;

/**
 *
 * @author Dante
 */
public interface ProveedorService {
    //Funcion que permita mostrar todos los datos
    List<ProveedorEntity> findAll();
    //Funcion que permite mostrar todos los datos habilitados
    List<ProveedorEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<ProveedorEntity> findById(Long id);
    //Funcion para registrar datos
    ProveedorEntity add(ProveedorEntity d);   
    //Funcion para actualizar
    ProveedorEntity update(ProveedorEntity d);
    //Funcion para eliminar
    ProveedorEntity delete(ProveedorEntity d);
}
