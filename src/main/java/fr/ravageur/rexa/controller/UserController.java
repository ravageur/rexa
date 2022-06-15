package fr.ravageur.rexa.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController 
{
    @GetMapping("/user")
    public String MainPageUser()
    {
        return "user";
    }
}
