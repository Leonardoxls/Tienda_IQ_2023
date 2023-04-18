package com.Tienda_IQ23.service;


import com.Tienda_IQ23.dao.CarritoDao;
import com.Tienda_IQ23.dominio.Carrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoServiceImpl implements CarritoService {

    @Autowired
    CarritoDao carritoDao;

    @Override
    public Carrito getCarrito(Carrito carrito) {
        return carritoDao.findById(carrito.getIdCarrito()).orElse(null);
    }

    @Override
    public Carrito getCarritoCliente(Long idCliente) {
        Carrito carritoCliente = carritoDao.findByIdCliente(idCliente).orElse(null);
        
        
        if (carritoCliente == null){
            Carrito carritoNuevo = new Carrito(idCliente);
            carritoCliente = carritoDao.save(carritoNuevo);
        }
        return carritoCliente;
    }

}
