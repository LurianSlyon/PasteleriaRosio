/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.AlmacenEntity;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.CategoriaEntity;

/**
 *
 * @author Dante
 */
public interface AlmacenRepository extends JpaRepository<AlmacenEntity, Long>{
    @Query("select c from AlmacenEntity a where a.estadoc='1'")
    List<AlmacenEntity> findAllCustom();
}
