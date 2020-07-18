package edu.ulima.proyecto_pweb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@RequestMapping("/")
public class htmlcontroller {
    Long id;

    //Controller para pag principal http://locahost:9080/mi-cuenta.html
    @RequestMapping(value="/mi-cuenta.html/{id}", method=RequestMethod.GET)
    public String micuenta(HttpSession session){
        return "mi-cuenta";
    }
    
    @RequestMapping(value="/mi-cuenta.html", method=RequestMethod.GET)
    public String micuentar(HttpSession session){
        return "redirect:/mi-cuenta.html/"+id;
    }

    //Controller para cv http://locahost:9080/cv.html
    @RequestMapping(value="/cv.html/{id}", method=RequestMethod.GET)
    public String cv(HttpSession session, @PathVariable("id") Long id){
        this.id=id;
        return "cv";
    }

    @RequestMapping(value="/cv.html", method=RequestMethod.GET)
    public String cvr(HttpSession session, @PathVariable("id") Long id){
        this.id=id;
        return "redirect:/cv.html/"+id;
    }

    //Controller para mis datos http://locahost:9080/mis-datos.html
    @RequestMapping(value="/mis-datos.html/{id}", method=RequestMethod.GET)
    public String misdatos(HttpSession session){
        return "mis-datos";
    }

    @RequestMapping(value="/mis-datos.html", method=RequestMethod.GET)
    public String misdatosr(HttpSession session){
        return "redirect:/mis-datos.html/"+id;
    }

    //Controller para entidades http://locahost:9080/entidades.html
    @RequestMapping(value="/entidades.html/{id}", method=RequestMethod.GET)
    public String entidades(HttpSession session){
        return "entidades";
    }

    @RequestMapping(value="/entidades.html", method=RequestMethod.GET)
    public String entidadesr(HttpSession session){
        return "redirect:/entidades.html/"+id;
    }

    //Controller para experiencia http://locahost:9080/experiencia.html
    @RequestMapping(value="/experiencia.html/{id}", method=RequestMethod.GET)
    public String experiencia(HttpSession session){
        return "experiencia";
    }

    @RequestMapping(value="/experiencia.html", method=RequestMethod.GET)
    public String experienciar(HttpSession session){
        return "redirect:/experiencia.html/"+id;
    }

    //Controller para formacion http://locahost:9080/formacion.html
    @RequestMapping(value="/formacion.html/{id}", method=RequestMethod.GET)
    public String formacion(HttpSession session){
        return "formacion";
    }

    @RequestMapping(value="/formacion.html", method=RequestMethod.GET)
    public String formacionr(HttpSession session){
        return "redirect:/formacion.html/"+id;
    }

    /*Controller para el login en sus dos formas
    http://locahost:9080/ y http://localhost:9080/login.html*/
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String principal(HttpSession session){
        return "login";
    }
    @RequestMapping(value="/login.html", method=RequestMethod.GET)
    public String login(HttpSession session){
        return "login";
    }

    //Controller para ocupaciones http://locahost:9080/ocupaciones.html
    @RequestMapping(value="/ocupaciones.html/{id}", method=RequestMethod.GET)
    public String ocupaciones(HttpSession session){
        return "ocupaciones";
    }

    @RequestMapping(value="/ocupaciones.html", method=RequestMethod.GET)
    public String ocupacionesr(HttpSession session){
        return "redirect:/ocupaciones.html/"+id;
    }

    @RequestMapping(value="/usuarios.html/{id}", method=RequestMethod.GET)
    public String usuarios(HttpSession session){
        return "usuarios";
    }    

    @RequestMapping(value="/usuarios.html", method=RequestMethod.GET)
    public String usuariosr(HttpSession session){
        return "redirect:/usuarios.html/"+id;
    }  
}