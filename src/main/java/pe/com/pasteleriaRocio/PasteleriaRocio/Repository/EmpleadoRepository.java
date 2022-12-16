/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.EmpleadoEntity;


/**
 *
 * @author Dante
 */
public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long>{
    @Query("select emp from EmpleadoEntity emp where emp.estadoemp='1'")
    List<EmpleadoEntity> findAllCustom();
}
