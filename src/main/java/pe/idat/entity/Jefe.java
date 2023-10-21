package pe.idat.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="jefes")
public class Jefe implements Serializable
{
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer jefeId;
	
	@Column
	private String nombre;
	
	@Column
	private Integer telefono;
	
	@Column
	private String nacionalidad;
	
	@OneToOne(mappedBy="jefe")
	private Categoria categoria;
	
	public Jefe() {
	}

	public Jefe(Integer jefeId, String nombre, Integer telefono, String nacionalidad) {
		this.jefeId = jefeId;
		this.nombre = nombre;
		this.telefono = telefono;
		this.nacionalidad = nacionalidad;
	}

	public Integer getJefeId() {
		return jefeId;
	}

	public void setJefeId(Integer jefeId) {
		this.jefeId = jefeId;
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

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
