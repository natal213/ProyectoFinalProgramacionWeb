package edu.ulima.proyecto_pweb.repository;

import java.util.HashMap;

import org.springframework.data.mongodb.repository.MongoRepository;
import edu.ulima.proyecto_pweb.model.Usuario;

public interface UsuariosRepositorio extends MongoRepository<Usuario,Long>{
    //Busqueda de usuarios por correo;
    public Usuario findByCorreo(String correo);
    //Busqueda de usuarios por varios parámetros
    public Usuario getData(HashMap<String,Object> condicion);
}