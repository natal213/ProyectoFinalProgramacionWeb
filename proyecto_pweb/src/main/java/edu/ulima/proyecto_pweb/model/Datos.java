package edu.ulima.proyecto_pweb.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@Entity
@Table(name="TbDatosCV")
public class Datos {
    private Long Id;
    private String Nombre;
    private String Apellido_Paterno;
    private int Teléfono_celular;
    private String LinkedIn_Url;
    private String Datos_Relevantes;

    @Autowired 
    public Datos(Long id, String nom, String apat, int cel, String LinUrl, String Drelev) {
        this.Id=id;
        this.Nombre=nom;
        this.Apellido_Paterno=apat;
        this.Teléfono_celular=cel;
        this.LinkedIn_Url=LinUrl;
        this.Datos_Relevantes=Drelev;
    }
}