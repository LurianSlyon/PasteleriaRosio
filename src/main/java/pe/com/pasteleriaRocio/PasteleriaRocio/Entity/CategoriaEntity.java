/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Lurian
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name = "CategoriaEntity")
@Table (name = "categoria")
public class CategoriaEntity implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idCategoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoc;
    @Column(name="tipo_categoria")
    private String tipoCate;
    @Column(name="estado")
    private boolean estadoc;

}
