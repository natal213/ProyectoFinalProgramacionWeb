package edu.ulima.proyecto_pweb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class login_principal {
    /*
    Este metodo responde a welcome page
    EJEM: hhtp://locahost:8080
    */
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(Model model, HttpSession session){
        return "login";
    }
    @RequestMapping(value="/login.html", method=RequestMethod.GET)
    public String login(Model model, HttpSession session){
        return "login";
    }
    
}