package com.Tienda_IQ23.dao;

import com.Tienda_IQ23.dominio.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author leonardo Reyes
 */
public interface ClienteDao extends CrudRepository<Cliente, Long> {
    
}
