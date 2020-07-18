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
import edu.ulima.proyecto_pweb.model.Usuario;
import edu.ulima.proyecto_pweb.repository.UsuariosRepositorio;

@RestController
@RequestMapping("/usuarios")
public class usuariocontroller {
    private UsuariosRepositorio uRepository;
    Usuario usuario;
    
    @Autowired
    public usuariocontroller(UsuariosRepositorio urepository){
        this.uRepository=urepository;
    }

    @RequestMapping(value="/agregar",method=RequestMethod.POST)
    public ResponseEntity <Void> agregarUsuario(@RequestBody Usuario NewUsuario){
        uRepository.save(NewUsuario);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
}