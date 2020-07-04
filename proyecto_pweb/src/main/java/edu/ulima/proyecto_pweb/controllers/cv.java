package edu.ulima.proyecto_pweb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class cv {
    /*
    Este metodo responde a cv
    EJEM: http://locahost:8080/cv.html
    */
    @RequestMapping(value="/cv.html", method=RequestMethod.GET)
    public String index(Model model, HttpSession session){
        return "cv";
    }
}