/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.List;
import java.util.Optional;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.EmpleadoEntity;

/**
 *
 * @author Dante
 */
public interface EmpleadoService {
    //Funcion que permita mostrar todos los datos
    List<EmpleadoEntity> findAll();
    //Funcion que permite mostrar todos los datos habilitados
    List<EmpleadoEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<EmpleadoEntity> findById(Long id);
    //Funcion para registrar datos
    EmpleadoEntity add(EmpleadoEntity d);   
    //Funcion para actualizar
    EmpleadoEntity update(EmpleadoEntity d);
    //Funcion para eliminar
    EmpleadoEntity delete(EmpleadoEntity d);
}
