package com.Tienda_IQ23.service;


import com.Tienda_IQ23.dominio.Articulo;
import com.Tienda_IQ23.dominio.CarritoDetalle;
import java.util.List;

public interface CarritoDetalleService {

    public CarritoDetalle getCarritoDetalle(CarritoDetalle carritoDetalle);

    public CarritoDetalle getCarritoDetalleArticulo(Long idCarrito, Articulo articulo);

    public List<CarritoDetalle> getCarritoDetalles(Long idCarrito);

    public void save(CarritoDetalle carritoDetalle);

    public void delete(CarritoDetalle carritoDetalle);

    public void deleteAll(Long idCarrito);

}
