package pe.com.pasteleriaRocio.PasteleriaRocio.Entity;

/**
*
* @author anthonyBC
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
    
    @Column(name="number_pedido")
    private float number_pedido;
    
    @Column(name="fecha")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    @Column(name="estado")
    private boolean estado;
    /**/
    @Column(name="idcliente")
	 private Integer idcliente;

	

	public Integer getIdcabpedido() {
		return idcabpedido;
	}

	public void setIdcabpedido(Integer idcabpedido) {
		this.idcabpedido = idcabpedido;
	}

	public float getNumber_pedido() {
		return number_pedido;
	}

	public void setNumber_pedido(float number_pedido) {
		this.number_pedido = number_pedido;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
	
}
