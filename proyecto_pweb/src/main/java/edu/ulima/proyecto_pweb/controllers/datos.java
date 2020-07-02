package edu.ulima.proyecto_pweb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class datos {
    /*
    Este metodo responde a mis datos
    EJEM: hhtp://locahost:8080/mis-datos.html
    */
    @RequestMapping(value="/mis-datos.html", method=RequestMethod.GET)
    public String misdatos(Model model, HttpSession session){
        return "mis-datos";
    }
    
}