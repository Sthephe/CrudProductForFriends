package pe.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.idat.entity.Producto;

//usando Spring Data
public interface ProductoRepository extends JpaRepository<Producto,Integer> {
	
}
