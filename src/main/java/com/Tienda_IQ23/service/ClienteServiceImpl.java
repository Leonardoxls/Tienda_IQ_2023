
package com.Tienda_IQ23.service;

import com.Tienda_IQ23.dao.ClienteDao;
import com.Tienda_IQ23.dominio.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true) // para manejar transacciones de solo lectura
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true) // para manejar transacciones de solo lectura
    public List<Cliente> getCliente(Cliente cliente) {
        return (List<Cliente>) clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());
    }

}
