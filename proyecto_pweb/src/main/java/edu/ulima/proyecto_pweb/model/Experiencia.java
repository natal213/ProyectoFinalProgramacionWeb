package edu.ulima.proyecto_pweb.model;

import lombok.Data;

@Data
public class Experiencia {
    private Long Id;
    private String Entidad;
    private String Ocupación;
    private int Año_de_Fin;

    public Experiencia(String ent,String ocu,int añofin) {
        this.Entidad=ent;
        this.Ocupación=ocu;
        this.Año_de_Fin=añofin;
    }
}