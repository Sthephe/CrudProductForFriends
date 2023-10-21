package pe.idat.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.idat.entity.Producto;
import pe.idat.service.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController 
{
	@Autowired
	private ProductoService productoService;
	
	public ProductoController() {		
	}
	
	@GetMapping("/listar")
	public String listar_GET(Map map)
	{
		map.put("bProductos",productoService.findAll());
		return "Producto/listar";
	}
	
	@GetMapping("/registrar")
	public String registrar_GET(Model model)
	{
		//productoModel (vacío)
		Producto productoModel=new Producto();
		
		//llave-valor
		model.addAttribute("producto",productoModel);
		
		return "Producto/registrar";
	}
	
	@PostMapping("/registrar")
	public String registrar_POST(Producto producto) //producto cargado
	{
		//guardar a la BD
		productoService.insert(producto);
		
		//redireccionar
		return "redirect:/producto/listar";
	}
	
	@GetMapping("/editar/{productoId}")
	public String editar_GET(Model model,@PathVariable Integer productoId)
	{
		//productoModel (cargado según el ID)
		Producto productoModel=productoService.findById(productoId);
		
		//llave-valor
		model.addAttribute("producto",productoModel);		
		
		return "Producto/editar";
	}
	
	@PostMapping("/editar/{productoId}")
	public String editar_POST(Producto producto) //producto cargado editado
	{
		//actualizar en la BD
		productoService.update(producto);
		
		//redireccionar
		return "redirect:/producto/listar";
	}
	
	@GetMapping("/borrar/{productoId}")
	public String borrar_GET(Model model,@PathVariable Integer productoId)
	{
		Producto productoModel=productoService.findById(productoId);
		model.addAttribute("producto",productoModel);
		
		return "Producto/borrar";
	}
	
	@PostMapping("/borrar/{productoId}")
	public String borrar_POST(Producto producto)
	{
		productoService.delete(producto.getProductoId());
		return "redirect:/producto/listar";
	}
}
