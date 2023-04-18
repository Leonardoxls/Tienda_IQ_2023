package com.Tienda_IQ23.controller;


import com.Tienda_IQ23.dominio.Articulo;
import com.Tienda_IQ23.dominio.CarritoDetalle;
import com.Tienda_IQ23.service.ArticuloService;
import com.Tienda_IQ23.service.CarritoDetalleService;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CarritoController {
    
    @Autowired
    CarritoDetalleService carritoDetalleService;
    
    @Autowired
    ArticuloService articuloService;
    
    @GetMapping("/carrito/agregar/{idArticulo}")
    public String agregar(Articulo articulo, HttpSession session){
    
        Long idCarrito = (Long)session.getAttribute("idCarrito");
        articulo = articuloService.getArticulo(articulo);
        
        
        CarritoDetalle carritoDetalle = carritoDetalleService.getCarritoDetalleArticulo(idCarrito, articulo);
        
        if(carritoDetalle != null){
            carritoDetalle.setCantidad(carritoDetalle.getCantidad()+1);
        } else {
            carritoDetalle = new CarritoDetalle (idCarrito,articulo,articulo.getPrecio(), 1);
        }
        
        carritoDetalleService.save(carritoDetalle);
        
        return "redirect:/";
    }
    
    @GetMapping("/carrito/listado")
    public String listado(Model model, HttpSession session){
        Long idCarrito = (Long)session.getAttribute("idCarrito");
        
        List<CarritoDetalle> carritoDetalles = carritoDetalleService.getCarritoDetalles(idCarrito);
        
        double montoTotal = 0;
        double montoImpuestos = 0.0;
        
        for(CarritoDetalle c : carritoDetalles){
            montoTotal += c.getCantidad() * c.getPrecio();
        }
        
        montoImpuestos = montoTotal * 0.13;
        
        model.addAttribute("carritoDetalles", carritoDetalles);
        model.addAttribute("cantidadArticulosCarrito", carritoDetalles.size());
        model.addAttribute("montoImpuestos", montoImpuestos);
        model.addAttribute("montoTotal", montoTotal);
        
        return "/carrito/listado";
    }
    
    @GetMapping("/carrito/eliminar/{idDetalle}")
    public String eliminar(CarritoDetalle carritoDetalle) {
        carritoDetalleService.delete(carritoDetalle);
        
        return "redirect:/";
    }
    
}
