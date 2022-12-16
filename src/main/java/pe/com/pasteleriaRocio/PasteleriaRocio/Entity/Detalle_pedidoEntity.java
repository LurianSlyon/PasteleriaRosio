package pe.com.pasteleriaRocio.PasteleriaRocio.Entity;

/**
*
* @author anthony carhuayalle saboya
*/
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

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name = "Detalle_pedidoEntity")
@Table (name = "detalle_pedido")
public class Detalle_pedidoEntity implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="iddetpedido")	
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigodet;
    
    @Column(name="fecha_entrega")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_entrega;
    
    @Column(name="subtotal")
    private float subtotal;
    
    @Column(name="cantidad")
    private Integer cantidad;
    
    @Column(name="observacion",nullable = false, length = 60)
    private String observacion;
    
    @Column(name="idproducto")
	 private Integer idproducto;
    
    @Column(name="idcabpedido")
	 private Integer idcabpedido;
        
    @ManyToOne
    @JoinColumn(name = "idproducto",insertable = false, updatable = false,nullable = false)
    private ProductoEntity producto;
    
    @ManyToOne
    @JoinColumn(name = "idcabpedido",insertable = false, updatable = false,nullable = false)
    private Cabecera_pedidoEntity cabecera_pedido;

}
