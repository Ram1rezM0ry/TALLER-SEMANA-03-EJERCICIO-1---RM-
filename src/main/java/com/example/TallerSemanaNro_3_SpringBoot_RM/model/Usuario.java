package com.example.TallerSemanaNro_3_SpringBoot_RM.model;


public class Usuario {

    private String nombre;
    private String correo;
    
    // Getters y Setters
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre (String nombre) {
        this.nombre= nombre;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo (String correo) {
    this.correo = correo;
    }
}