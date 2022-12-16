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
@Entity(name = "EmpleadoEntity")
@Table (name = "empleado")

public class EmpleadoEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "idempleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoemp;
    @Column(name="nombreemp")
    private String nombreemp;
    @Column(name="apellidoemp")
    private String apellidoemp;
    @Column(name="dniemp")
    private String dniemp;
    @Column(name="telefonoemp")
    private String telefonoemp;
    @Column(name="estado")
    private boolean estadoemp;
    @ManyToOne
    @JoinColumn(name = "idrol",nullable = false)
    private RolEntity rol;
}
