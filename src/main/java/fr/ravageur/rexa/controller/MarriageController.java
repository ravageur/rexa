package fr.ravageur.rexa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MarriageController 
{
    @GetMapping("/")
    public String mainPage()
    {
        return "acceuil";
    }
}
