package edu.ulima.proyecto_pweb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class htmlcontroller {
    
    //Controller para pag principal http://locahost:9080/mi-cuenta.html
    @RequestMapping(value="/mi-cuenta.html", method=RequestMethod.GET)
    public String micuenta(Model model, HttpSession session){
        return "mi-cuenta";
    }

    //Controller para cv http://locahost:9080/cv.html
    @RequestMapping(value="/cv.html", method=RequestMethod.GET)
    public String cv(Model model, HttpSession session){
        return "cv";
    }

    //Controller para mis datos http://locahost:9080/mis-datos.html
    @RequestMapping(value="/mis-datos.html", method=RequestMethod.GET)
    public String misdatos(Model model, HttpSession session){
        return "mis-datos";
    }

    //Controller para entidades http://locahost:9080/entidades.html
    @RequestMapping(value="/entidades.html", method=RequestMethod.GET)
    public String entidades(Model model, HttpSession session){
        return "entidades";
    }

    //Controller para experiencia http://locahost:9080/experiencia.html
    @RequestMapping(value="/experiencia.html", method=RequestMethod.GET)
    public String experiencia(Model model, HttpSession session){
        return "experiencia";
    }

    //Controller para formacion http://locahost:9080/formacion.html
    @RequestMapping(value="/formacion.html", method=RequestMethod.GET)
    public String formacion(Model model, HttpSession session){
        return "formacion";
    }

    /*Controller para el login en sus dos formas
    http://locahost:9080/ y http://localhost:9080/login.html*/
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String principal(Model model, HttpSession session){
        return "login";
    }
    @RequestMapping(value="/login.html", method=RequestMethod.GET)
    public String login(Model model, HttpSession session){
        return "login";
    }

    //Controller para ocupaciones http://locahost:9080/ocupaciones.html
    @RequestMapping(value="/ocupaciones.html", method=RequestMethod.GET)
    public String ocupaciones(Model model, HttpSession session){
        return "ocupaciones";
    }

}