package co.edu.unbosque.ciclo3back.model;

import javax.persistence.*;

@Entity
@Table(name = "detalle_ventas")
public class DetalleVentas {
	@Id
	@Column(name = "codigo_detalle_ventas")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo_detalle_venta;

	private int cantidad_producto;

	@ManyToOne(optional = false)
	@JoinColumn(name = "producto_venta", referencedColumnName = "codigo_producto")
	private Productos producto;

	@ManyToOne(optional = false)
	@JoinColumn(name = "codigo_venta_detalle", referencedColumnName = "codigo_venta")
	private Ventas venta;

	// Getters and Setters
	public long getCodigo_detalle_venta() {
		return codigo_detalle_venta;
	}

	public void setCodigo_detalle_venta(long codigo_detalle_venta) {
		this.codigo_detalle_venta = codigo_detalle_venta;
	}

	public int getCantidad_producto() {
		return cantidad_producto;
	}

	public void setCantidad_producto(int cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	public Ventas getVenta() {
		return venta;
	}

	public void setVenta(Ventas venta) {
		this.venta = venta;
	}

}
