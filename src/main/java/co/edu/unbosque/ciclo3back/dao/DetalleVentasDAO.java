package co.edu.unbosque.ciclo3back.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.edu.unbosque.ciclo3back.model.DetalleVentas;

@Repository
public interface DetalleVentasDAO extends JpaRepository<DetalleVentas, Long>{
	
}