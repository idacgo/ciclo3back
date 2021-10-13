package co.edu.unbosque.ciclo3back.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.edu.unbosque.ciclo3back.model.Productos;

@Repository
public interface ProductosDAO extends JpaRepository<Productos, Long>{
	
}