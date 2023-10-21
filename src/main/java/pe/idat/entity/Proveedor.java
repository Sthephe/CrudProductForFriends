package pe.idat.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="proveedores")
public class Proveedor implements Serializable
{
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer proveedorId;
	
	@Column
	private String nombre;
	
	@Column
	private Integer telefono;
	
	@Column
	private String pais;
	
	@Column(unique=true,nullable=false)
	private Long ruc;
	
	@Column(unique=true,nullable=false)
	private String website;
	
	@ManyToMany(mappedBy="itemsProveedor")
	private Set<Producto> itemsProducto=new HashSet<>();
	
	public Proveedor() {		
	}

	public Proveedor(Integer proveedorId, String nombre, Integer telefono, String pais, Long ruc, String website) {
		this.proveedorId = proveedorId;
		this.nombre = nombre;
		this.telefono = telefono;
		this.pais = pais;
		this.ruc = ruc;
		this.website = website;
	}

	public Integer getProveedorId() {
		return proveedorId;
	}

	public void setProveedorId(Integer proveedorId) {
		this.proveedorId = proveedorId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Long getRuc() {
		return ruc;
	}

	public void setRuc(Long ruc) {
		this.ruc = ruc;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Set<Producto> getItemsProducto() {
		return itemsProducto;
	}

	public void setItemsProducto(Set<Producto> itemsProducto) {
		this.itemsProducto = itemsProducto;
	}
}
