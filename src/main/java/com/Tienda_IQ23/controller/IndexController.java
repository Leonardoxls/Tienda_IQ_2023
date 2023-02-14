package com.Tienda_IQ23.controller;

import com.Tienda_IQ23.domain.Cliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author leonardo Reyes
 */
@Controller
@Slf4j
public class IndexController {
    
    @GetMapping("/")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        log.info("Ahora utilizando MVC");
        String mensaje =  "Estamos en semana 4, Saludos!";
        model.addAttribute("MensajeSaludo", mensaje);
        
        
        Cliente cliente = new Cliente();
        model.addAttribute("cliente", mensaje);
        
        
      
        return "index";
    }
    
}
