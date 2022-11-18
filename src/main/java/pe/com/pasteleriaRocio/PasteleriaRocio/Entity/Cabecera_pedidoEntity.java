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

@Entity(name = "Cabecera_pedidoEntity")
@Table (name = "cabecera_pedido")
public class Cabecera_pedidoEntity implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idcabpedido")	
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcabpedido;
    
    @Column(name="numb_pedido")
    private float number_pedido;
    
    @Column(name="fecha")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    @Column(name="estado")
    private boolean estado;
    
    @Column(name="dni_cliente",nullable = false, length = 9)
    private String dni_cliente;
    
    @Column(name="nomb_cliente",nullable = false, length = 40)
    private String nombre_cliente;
    

}
