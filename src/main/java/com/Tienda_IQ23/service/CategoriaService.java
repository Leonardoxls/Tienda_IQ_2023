package com.Tienda_IQ23.service;

import com.Tienda_IQ23.dominio.Categoria;
import com.Tienda_IQ23.dominio.Cliente;
import java.util.List;

public interface CategoriaService {

    public List<Categoria> getCategorias(boolean categoria);

    public List<Categoria> getCategoria(Categoria categoria);

    public void save(Categoria categoria);// tanto para insertar como para modificar un registro

    public void delete(Categoria categoria);

}
