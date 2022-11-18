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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name = "DetalleProveedorEntity")
@Table (name = "detalles_proveedor")
public class DetalleProveedorEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @Column(name = "iddetprove")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idetprove;
	@ManyToOne
    @JoinColumn(name = "idalmacen",nullable = false)
	private AlmacenEntity almacen;
	@ManyToOne
    @JoinColumn(name = "idproveedor",nullable = false)
	private ProveedorEntity proveedor;
	@Column(name="nomb_insumos")
	private String nombreInsumos;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="fecha_compra")
	private Date fechaCompra;
	@Column(name="fecha_venta")
	private Date fechaVenta;
	@Column(name="estado")
	private boolean estado;
	

}
