package pe.idat.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.idat.entity.Producto;
import pe.idat.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService
{
	@Autowired
	private ProductoRepository repository;
	
	public ProductoServiceImpl() {		
	}

	@Override
	@Transactional
	public void insert(Producto producto) {
		repository.save(producto);
	}

	@Override
	@Transactional
	public void update(Producto producto) {
		repository.save(producto);
	}

	@Override
	@Transactional
	public void delete(Integer productoId) {
		repository.deleteById(productoId);
	}

	@Override
	@Transactional(readOnly=true)
	public Producto findById(Integer productoId) {
		return repository.findById(productoId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Producto> findAll() {
		return repository.findAll();
	}
}
