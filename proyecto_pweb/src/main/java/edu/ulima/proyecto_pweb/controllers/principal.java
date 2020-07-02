package edu.ulima.proyecto_pweb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class principal {
    /*
    Este metodo responde a welcome page
    EJEM: hhtp://locahost:8080
    */
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(Model model, HttpSession session){
        return "login";
    }
}