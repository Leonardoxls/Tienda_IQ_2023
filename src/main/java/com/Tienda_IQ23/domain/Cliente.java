package com.Tienda_IQ23.domain;

import lombok.Data;

@Data
public class Cliente {

    private Long idCliente; //transforma un  id Cliente
    String nombre;
    String apellidos;
    String correo;
    String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }

}
