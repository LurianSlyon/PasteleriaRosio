/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.pasteleriaRocio.PasteleriaRocio.Entity.CategoriaEntity;


/**
 *
 * @author Lurian
 */
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long>  {
    @Query("select c from CategoriaEntity c where c.estadoc='1'")
    List<CategoriaEntity> findAllCustom();
}
