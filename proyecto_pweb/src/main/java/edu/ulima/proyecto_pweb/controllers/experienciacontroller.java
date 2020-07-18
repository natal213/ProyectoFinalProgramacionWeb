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
import edu.ulima.proyecto_pweb.model.Experiencia;
import edu.ulima.proyecto_pweb.model.Usuario;
import edu.ulima.proyecto_pweb.repository.UsuariosRepositorio;

@RestController
@RequestMapping ("/experiencia")
public class experienciacontroller {
    private UsuariosRepositorio uRepository;
    private Usuario usuario;
    private List<Experiencia>experiencias;
    private Optional<Usuario> u;

    @Autowired
    public experienciacontroller(UsuariosRepositorio urepository){
        this.uRepository=urepository;
    }

    //Aqui se llega asi http://localhost:9080/experiencia/{id}
    //Obtienes todos las experiencias de un usuario
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public ResponseEntity <List<Experiencia>> verExperiencias(@PathVariable("id")Long id){
        Optional<Usuario> u=uRepository.findById(id);
    if(u.isPresent()){
        usuario=u.get();
        experiencias=usuario.getExperiencias();
        return new ResponseEntity<List<Experiencia>>(experiencias,HttpStatus.OK);
    }
    else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    }

    @RequestMapping(value="/{id}",method=RequestMethod.POST)
    public ResponseEntity <Void> agregarExperiencias(@PathVariable("id")Long id, @RequestBody Experiencia newExperiencia){
    u=null;
    usuario=null;
    experiencias.add(newExperiencia);
    u=uRepository.findById(id);
    if(u.isPresent()){
        usuario=u.get();
        usuario.setExperiencias(experiencias);
        uRepository.save(usuario);
    }
    else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    }
}