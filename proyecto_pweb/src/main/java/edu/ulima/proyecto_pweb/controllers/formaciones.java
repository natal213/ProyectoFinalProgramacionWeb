package edu.ulima.proyecto_pweb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class formaciones {
    /*
    Este metodo responde a formacion
    EJEM: hhtp://locahost:8080/formacion.html
    */

    @RequestMapping(value="/formacion.html", method=RequestMethod.GET)
    public String formacion(Model model, HttpSession session){
        return "formacion";
    }
}