
package com.Tienda_IQ23.service;

import com.Tienda_IQ23.dao.CategoriaDao;
import com.Tienda_IQ23.dominio.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true) // para manejar transacciones de solo lectura
    public List<Categoria> getCategorias(boolean activos) {
        var lista = (List<Categoria>) categoriaDao.findAll();
        
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true) // para manejar transacciones de solo lectura
    public List<Categoria> getCategoria(Categoria categoria) {
        return (List<Categoria>) categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.deleteById(categoria.getIdCategoria());
    }

}
