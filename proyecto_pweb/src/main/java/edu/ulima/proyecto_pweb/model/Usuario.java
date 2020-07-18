package edu.ulima.proyecto_pweb.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Usuario {
    @Id
    @Indexed(unique=true)
    private Long id;
    private Datos datos;
    
}