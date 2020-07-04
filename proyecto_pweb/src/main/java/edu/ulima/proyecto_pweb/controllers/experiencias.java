package edu.ulima.proyecto_pweb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class experiencias {
    /*
    Este metodo responde a experiencia
    EJEM: hhtp://locahost:8080/experiencia.html
    */

    @RequestMapping(value="/experiencia.html", method=RequestMethod.GET)
    public String experiencia(Model model, HttpSession session){
        return "experiencia";
    }
    
}