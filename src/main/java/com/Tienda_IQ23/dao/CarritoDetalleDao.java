package com.Tienda_IQ23.dao;

import com.Tienda_IQ23.dominio.Articulo;
import com.Tienda_IQ23.dominio.CarritoDetalle;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CarritoDetalleDao extends CrudRepository<CarritoDetalle, Long>{
    
    List<CarritoDetalle> findByIdCarrito(Long idCarrito);
    
    CarritoDetalle findByIdCarritoAndArticulo(Long idCarrito, Articulo articulo);
    
    void deleteByIdCarrito(Long idCarrito);
}
