package pe.idat.service;

import java.util.Collection;

import pe.idat.entity.Producto;

public interface ProductoService 
{
	//se define los servicios
	public abstract void insert(Producto producto);
	public abstract void update(Producto producto);
	public abstract void delete(Integer productoId);
	public abstract Producto findById(Integer productoId);
	public abstract Collection<Producto> findAll();
}
