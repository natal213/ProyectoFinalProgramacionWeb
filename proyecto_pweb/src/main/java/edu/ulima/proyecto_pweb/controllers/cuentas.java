package edu.ulima.proyecto_pweb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class cuentas {
    /*
    Este metodo responde a mi cuenta
    EJEM: http://locahost:8080/mi-cuenta.html
    */
    
    @RequestMapping(value="/mi-cuenta.html", method=RequestMethod.GET)
    public String cuenta(Model model, HttpSession session){
        return "mi-cuenta";
    }
}