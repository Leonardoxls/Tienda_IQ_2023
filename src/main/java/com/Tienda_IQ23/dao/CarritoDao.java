package com.Tienda_IQ23.dao;

import com.Tienda_IQ23.dominio.Carrito;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


public interface CarritoDao extends CrudRepository<Carrito, Long>{
    
    Optional<Carrito> findByIdCliente(Long idCliente);
    
}
