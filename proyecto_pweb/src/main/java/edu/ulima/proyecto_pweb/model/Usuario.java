package edu.ulima.proyecto_pweb.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.*;

@Data
@Document
public class Usuario {
    @Id
    @Indexed(unique=true)
    private Long id;
    private String correo;
    private String rol;
    private String estado;
    private Datos datos;
    private List<Experiencia> experiencias;
    private List<Entidad> entidades;
    private List<Ocupacion> ocupaciones;
    private List<Formacion> formaciones;

    public Usuario(String correo, String rol, String estado){
        this.correo=correo;
        this.rol=rol;
        this.estado=estado;
        experiencias=new ArrayList<Experiencia>();
        entidades=new ArrayList<Entidad>();
        ocupaciones=new ArrayList<Ocupacion>();
        formaciones=new ArrayList<Formacion>();
    }
}