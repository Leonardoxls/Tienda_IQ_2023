package com.Tienda_IQ23.dao;

import com.Tienda_IQ23.dominio.Articulo;
import org.springframework.data.repository.CrudRepository;

public interface ArticuloDao extends CrudRepository<Articulo, Long>{
    
}
