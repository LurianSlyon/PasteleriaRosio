/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Service;
import java.util.List;
import java.util.Optional;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.CategoriaEntity;

/**
 *
 * @author Lurian
 */
public interface CategoriaService {
    //Funcion que permita mostrar todos los datos
    List<CategoriaEntity> findAll();
    //Funcion que permite mostrar todos los datos habilitados
    List<CategoriaEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<CategoriaEntity> findById(Long id);
    //Funcion para registrar datos
    CategoriaEntity add(CategoriaEntity d);   
    //Funcion para actualizar
    CategoriaEntity update(CategoriaEntity d);
    //Funcion para eliminar
    CategoriaEntity delete(CategoriaEntity d);
}

