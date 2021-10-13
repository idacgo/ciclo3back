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

import co.edu.unbosque.ciclo3back.dao.DetalleVentasDAO;
import co.edu.unbosque.ciclo3back.model.DetalleVentas;

@RestController // esta es una clase REST
@RequestMapping(value = "detalle_ventas", method = RequestMethod.GET)
//value=tabla de la bd

public class DetalleVentasAPI {
	@Autowired // inyecta la dependencia de todos los mÃ©todos del JPA para usuarioDAO
	private DetalleVentasDAO detalleVentasDAO;

	@GetMapping("/listar")
	public List<DetalleVentas> listar() {
		return detalleVentasDAO.findAll();
	}

	@PostMapping("/guardar") // Request convierte en un objeto Java desde un JSon
	public void guardar(@RequestBody DetalleVentas detalleVentas) {
		detalleVentasDAO.save(detalleVentas);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		detalleVentasDAO.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody DetalleVentas detalleVentas) {
		detalleVentasDAO.save(detalleVentas);
	}

}