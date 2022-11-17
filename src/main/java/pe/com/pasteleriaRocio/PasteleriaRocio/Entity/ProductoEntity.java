/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.pasteleriaRocio.PasteleriaRocio.Entity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
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

@Entity(name = "ProductoEntity")
@Table (name = "producto")
public class ProductoEntity implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idproducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigop;
    @Column(name="nomb_pro")
    private String nombreP;
    @Column(name="tamaño")
    private String tamano;
    @Column(name="fecha")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    @Column(name="stock")
    private int stock;
    @ManyToOne
    @JoinColumn(name = "idCategoria",nullable = false)
    private CategoriaEntity categoria;
    @Column(name="estado")
    private boolean estadop;
}

