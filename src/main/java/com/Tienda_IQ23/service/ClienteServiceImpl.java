package com.Tienda_IQ23.service;


import com.Tienda_IQ23.dao.ClienteDao;
import com.Tienda_IQ23.dao.CreditoDao;
import com.Tienda_IQ23.dominio.Cliente;
import com.Tienda_IQ23.dominio.Credito;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service 
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteDao clienteDao;
    
    @Autowired
    CreditoDao creditoDao; 

    @Override
    @Transactional(readOnly = true) 
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true) 
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        Credito credito = cliente.getCredito();
        credito = creditoDao.save(credito);
        cliente.setCredito(credito);
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());

    }
    @Override
    public List<Cliente> getClienteCorreo(String correo) {
        return (List<Cliente>)clienteDao.findByCorreo(correo);
    }

    @Override
    public List<Cliente> getNombreAndApellidos(String nombre, String apellidos) {
        return (List<Cliente>)clienteDao.findByNombreAndApellidos(nombre, apellidos);
    }

    @Override
    public List<Cliente> getApellidos(String apellidos) {
        return (List<Cliente>)clienteDao.findByApellidos(apellidos);
    }
}
    
