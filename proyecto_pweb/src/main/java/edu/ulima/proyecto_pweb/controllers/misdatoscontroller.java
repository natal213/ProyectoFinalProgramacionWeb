package edu.ulima.proyecto_pweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.*;
import edu.ulima.proyecto_pweb.model.Datos;
import edu.ulima.proyecto_pweb.model.Usuario;
import edu.ulima.proyecto_pweb.repository.UsuariosRepositorio;

@RestController
@RequestMapping ("/misdatos")
public class misdatoscontroller {
    private UsuariosRepositorio uRepository;
    Usuario usuario;
    Datos datos;
    
    @Autowired
    public misdatoscontroller(UsuariosRepositorio urepository){
        this.uRepository=urepository;
    }
    
    //Aqui se llega asi http://localhost:9080/misdatos/{id}
    //Obtienes todos los datos de un usuario
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public ResponseEntity <Datos> verDatos(@PathVariable("id")Long id){
        Optional<Usuario> u=uRepository.findById(id);
    if(u.isPresent()){
        usuario=u.get();
        datos=usuario.getDatos();
        return new ResponseEntity<Datos>(datos,HttpStatus.OK);
    }
    else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    }

    //Actualizar datos de un usuario
    @RequestMapping(value="/{id}",method=RequestMethod.PUT)
    public ResponseEntity<Void> actualizarDatos(@RequestBody Datos datose){
        
        datos.setNombre(datose.getNombre());
        datos.setApellido(datose.getApellido());
        datos.setCelular(datose.getCelular());
        datos.setLinkedIn(datose.getLinkedIn());
        datos.setDatosrelevantes(datose.getDatosrelevantes());
        uRepository.save(usuario);
    }

}