package com.Tienda_IQ23.service;

import com.Tienda_IQ23.dominio.Cliente;
import java.util.List;

public interface ClienteService {
    
    public List<Cliente> getClientes();
    
    public Cliente getCliente(Cliente cliente);
    
    public void save(Cliente cliente); 
    
    public void delete(Cliente cliente);
    
    public List<Cliente> getClienteCorreo(String correo);
    public List<Cliente> getNombreAndApellidos(String nombre, String apellidos);
    
    public List<Cliente> getApellidos(String apellidos);
}
