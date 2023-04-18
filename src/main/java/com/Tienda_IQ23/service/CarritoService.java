package com.Tienda_IQ23.service;

import com.Tienda_IQ23.dominio.Carrito;


public interface CarritoService {
    
    public Carrito getCarrito(Carrito carrito);
    
    public Carrito getCarritoCliente(Long idCliente);
    
    
}
