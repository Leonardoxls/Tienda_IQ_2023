package com.Tienda_IQ23.controller;

import com.Tienda_IQ23.dominio.Cliente;
import com.Tienda_IQ23.service.ClienteService;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author leonardo Reyes
 */
@Slf4j
@Controller
public class IndexController {
    @Autowired
    ClienteService clienteService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizando MVC");
        var clientes=clienteService.getClientes();
        model.addAttribute("clientes", clientes);
        
        return "index";
    }
    
}


