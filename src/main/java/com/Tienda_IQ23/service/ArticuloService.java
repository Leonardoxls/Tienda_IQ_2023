package com.Tienda_IQ23.service;

import com.Tienda_IQ23.dominio.Articulo;
import java.util.List;

public interface ArticuloService {
    
    public List<Articulo> getArticulos(boolean activos);
    
    public Articulo getArticulo(Articulo articulo);
    
    public void save(Articulo articulo); //Sirve para insertar y modificar un registro
    
    public void delete(Articulo articulo);
}
