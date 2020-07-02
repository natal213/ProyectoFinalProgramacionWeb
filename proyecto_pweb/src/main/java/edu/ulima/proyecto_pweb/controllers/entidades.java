package edu.ulima.proyecto_pweb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class entidades {
    /*
    Este metodo responde a entidades
    EJEM: http://locahost:8080/entidades.html
    */
    @RequestMapping(value="/entidades.html", method=RequestMethod.GET)
    public String entidad(Model model, HttpSession session){
        return "entidades";
    }
   
}