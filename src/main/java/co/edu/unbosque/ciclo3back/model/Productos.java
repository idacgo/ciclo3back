package co.edu.unbosque.ciclo3back.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table (name = "productos")
public class Productos {
	@Id
	@Column(name="codigo_producto")
	private long codigo_producto;
	private String nombre_producto;
	
	@ManyToOne (optional = false)
	@JoinColumn(name = "proveedor_producto", referencedColumnName = "nitproveedor")
	private Proveedores proveedor;
	
	private double precio_compra;
	private double ivacompra;
	private double precio_venta;
	
	@OneToMany(mappedBy = "producto")
	private List<DetalleVentas> producto_venta;
	
	//Getters and Setters
	public long getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public Proveedores getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedores proveedor) {
		this.proveedor = proveedor;
	}
	public double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(Double precio_compra) {
		this.precio_compra = precio_compra;
	}
	public double getIvacompra() {
		return ivacompra;
	}
	public void setIvacompra(Double ivacompra) {
		this.ivacompra = ivacompra;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(Double precio_venta) {
		this.precio_venta = precio_venta;
	}
}