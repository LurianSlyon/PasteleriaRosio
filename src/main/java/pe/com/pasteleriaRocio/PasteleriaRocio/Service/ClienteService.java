/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Service;

import java.util.List;
import java.util.Optional;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.ClienteEntity;

/**
 *
 * @author Lurian
 */
public interface ClienteService {
    //Funcion que permita mostrar todos los datos
    List<ClienteEntity> findAll();
    //Funcion que permite mostrar todos los datos habilitados
    List<ClienteEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<ClienteEntity> findById(Long id);
    //Funcion para registrar datos
    ClienteEntity add(ClienteEntity d);   
    //Funcion para actualizar
    ClienteEntity update(ClienteEntity d);
    //Funcion para eliminar
    ClienteEntity delete(ClienteEntity d);
}
