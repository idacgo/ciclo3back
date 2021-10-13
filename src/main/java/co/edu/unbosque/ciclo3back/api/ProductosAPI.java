package co.edu.unbosque.ciclo3back.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.ciclo3back.dao.ProductosDAO;
import co.edu.unbosque.ciclo3back.model.Productos;

@RestController //esta es una clase REST
@RequestMapping(value="productos",method=RequestMethod.GET)
//value=tabla de la bd

public class ProductosAPI {
	@Autowired //inyecta la dependencia de todos los mÃ©todos del JPA para usuarioDAO
	private ProductosDAO productosDAO;
	
	@GetMapping("/listar")
	public List<Productos> listar(){
		return productosDAO.findAll();
	}
	
	@PostMapping("/guardar")//Request convierte en un objeto Java desde un JSon
	public void guardar(@RequestBody Productos productos) {
		productosDAO.save(productos);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		productosDAO.deleteById(id);
	}
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Productos productos) {
		productosDAO.save(productos);
	}
	
}