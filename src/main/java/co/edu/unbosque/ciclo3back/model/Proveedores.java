package co.edu.unbosque.ciclo3back.model;

import java.util.*;
import javax.persistence.*;

@Entity
@Table (name = "proveedores")
public class Proveedores {
	@Id
	@Column(name="nitproveedor")
	private long nitproveedor;
	private String nombre_proveedor;
	private String direccion_proveedor;
	private String telefono_proveedor;
	private String ciudad_proveedor;
	
	@OneToMany(mappedBy = "proveedor")
	private List<Productos> proveedor_producto;
	
	//Getters and Setters
	public long getNitproveedor() {
		return nitproveedor;
	}
	public void setNitproveedor(long nitproveedor) {
		this.nitproveedor = nitproveedor;
	}
	public String getNombre_proveedor() {
		return nombre_proveedor;
	}
	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}
	public String getDireccion_proveedor() {
		return direccion_proveedor;
	}
	public void setDireccion_proveedor(String direccion_proveedor) {
		this.direccion_proveedor = direccion_proveedor;
	}
	public String getTelefono_proveedor() {
		return telefono_proveedor;
	}
	public void setTelefono_proveedor(String telefono_proveedor) {
		this.telefono_proveedor = telefono_proveedor;
	}
	public String getCiudad_proveedor() {
		return ciudad_proveedor;
	}
	public void setCiudad_proveedor(String ciudad_proveedor) {
		this.ciudad_proveedor = ciudad_proveedor;
	}
}
