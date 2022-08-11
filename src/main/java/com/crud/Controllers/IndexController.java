package com.crud.Controllers;

import com.crud.Models.Tiendas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String sayHello() {
        return "You can create a new Note by making a POST request to /api/notes endpoint.";
    }
}