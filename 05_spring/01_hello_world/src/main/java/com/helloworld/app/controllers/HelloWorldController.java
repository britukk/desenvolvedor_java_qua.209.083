package com.helloworld.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// classe que traz os comandos do spring boot para dentro do meu código
@Controller

// toda vez que criar uma nova pagina, você precisa criar um novo método no controller
public class HelloWorldController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
