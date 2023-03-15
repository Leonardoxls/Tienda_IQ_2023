package com.Tienda_IQ23.dao;

import com.Tienda_IQ23.dominio.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long> {
    
}
