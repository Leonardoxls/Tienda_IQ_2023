package com.Tienda_IQ23.service;

import com.Tienda_IQ23.dominio.Cliente;
import java.util.List;

public interface ClienteService {

    public List<Cliente> getClientes();

    public List<Cliente> getCliente(Cliente cliente);
    
    public void save(Cliente cliente);// tanto para insertar como para modificar un registro
    
    public void delete(Cliente cliente);

}
