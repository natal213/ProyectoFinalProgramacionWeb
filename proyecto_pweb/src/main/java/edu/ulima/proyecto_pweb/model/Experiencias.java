package edu.ulima.proyecto_pweb.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@Entity
@Table(name="TbExperiencias")
public class Experiencias {
    private Long IdUsuario;
    private Long IdExperiencia;
    private String Entidad;
    private String Ocupación;
    private int Año_de_Fin;

    @Autowired 
    public Experiencias(Long idu, Long ide,String ent,String ocu,int añofin) {
        this.IdUsuario=idu;
        this.IdExperiencia=ide;
        this.Entidad=ent;
        this.Ocupación=ocu;
        this.Año_de_Fin=añofin;
    }
}