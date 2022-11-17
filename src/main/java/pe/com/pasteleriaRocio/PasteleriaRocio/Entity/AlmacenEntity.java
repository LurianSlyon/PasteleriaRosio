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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Dante
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "AlmacenEntity")
@Table (name = "Almacen")

public class AlmacenEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "idalmacen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoa;
    @Column(name="cantidad")
    private int cantidad;
    @Column(name="insumos")
    private String insumos;
    @Column(name="estado")
    private boolean estadoa;
    @ManyToOne
    @JoinColumn(name = "idproducto",nullable = false)
    private ProductoEntity producto;
}
