package edu.ulima.proyecto_pweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity.*;
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
@RequestMapping("/login")
public class logincontroller {
    private UsuariosRepositorio uRepository; 
    @Autowired
    public logincontroller(UsuariosRepositorio urepository){
        this.uRepository=urepository;
    }

    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String ingresar(String correo, String contraseña){
        
        HashMap<String,Object> credenciales = new HashMap<>();
        credenciales.put("Correo", correo);
        credenciales.put("Contraseña",contraseña);
        credenciales.put("Estado_cuenta","activo");
        Usuario usuario=uRepository.getData(credenciales);
        String mensaje="";
        if (usuario==null){
            mensaje=mensaje+"Lo sentimos, no puede iniciar sesión.\n Puede que su usuario o"+
            " contraseña no sean válidos o que su cuenta se encuentre inactiva.";
        }
        else{
            Long id=usuario.getId();
            return "redirect:/cv.html/{id}";
        }
        return mensaje;
    }

}