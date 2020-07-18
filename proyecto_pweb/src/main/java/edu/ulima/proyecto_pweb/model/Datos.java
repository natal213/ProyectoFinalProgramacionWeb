package edu.ulima.proyecto_pweb.model;

import lombok.Data;

@Data
public class Datos {
    private String Nombre;
    private String Apellido;
    private int Celular;
    private String LinkedIn;
    private String Datosrelevantes;

    public Datos() {
    }
}