package com.Tienda_IQ23.dao;

import com.Tienda_IQ23.dominio.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
    
}
