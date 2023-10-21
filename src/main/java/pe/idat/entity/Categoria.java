package pe.idat.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria implements Serializable
{
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer categoriaId;
	
	@Column
	private String descripcion;
	
	@OneToOne
	@JoinColumn(name="jefe_id",unique=true,nullable=false)
	private Jefe jefe;
	
	@OneToMany(mappedBy="categoria")
	private Collection<Producto> itemsProducto=new ArrayList<>();
	
	public Categoria() {		
	}

	public Categoria(Integer categoriaId, String descripcion) {
		this.categoriaId = categoriaId;
		this.descripcion = descripcion;
	}

	public Integer getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

	public Collection<Producto> getItemsProducto() {
		return itemsProducto;
	}

	public void setItemsProducto(Collection<Producto> itemsProducto) {
		this.itemsProducto = itemsProducto;
	}
}
