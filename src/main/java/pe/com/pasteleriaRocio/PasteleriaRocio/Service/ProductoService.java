/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Service;
import java.util.List;
import java.util.Optional;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.ProductoEntity;

/**
 *
 * @author Fabian Puma
 */
public interface ProductoService {
    //Funcion que permita mostrar todos los datos
    List<ProductoEntity> findAll();
    //Funcion que permite mostrar todos los datos habilitados
    List<ProductoEntity> findAllCustom();
    //Funcion para poder buscar por codigo
    Optional<ProductoEntity> findById(Long id);
    //Funcion para registrar datos
    ProductoEntity add(ProductoEntity d);   
    //Funcion para actualizar
    ProductoEntity update(ProductoEntity d);
    //Funcion para eliminar
    ProductoEntity delete(ProductoEntity d);
}
