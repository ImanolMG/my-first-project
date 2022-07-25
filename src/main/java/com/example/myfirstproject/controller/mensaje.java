package com.example.myfirstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class mensaje {


    @GetMapping
    public String mensage(){
        return "Hello world";
    }

    @GetMapping(path = "/otro-mensaje")
    public String otromensaje(){
        return "Otro mensaje de \"Mensaje\"";
    }

}
