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
 * @author Dante
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "ProveedorEntity")
@Table (name = "proveedor")

public class ProveedorEntity implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "idproveedor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigopr;
    @Column(name="nomb_prove")
    private String nomproveedor;
    @Column(name="telef_prove")
    private String telefproveedor;
    @Column(name="dire_prove")
    private String direproveedor;
    @Column(name="estado")
    private boolean estadopr;
}
