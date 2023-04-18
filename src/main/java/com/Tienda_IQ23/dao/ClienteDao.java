package com.Tienda_IQ23.dao;


import com.Tienda_IQ23.dominio.Cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Long> {

    List<Cliente> findByCorreo(String correo);

    List<Cliente> findByNombreAndApellidos(String nombre, String apellidos);

    List<Cliente> findByApellidos(String apellidos);
}
