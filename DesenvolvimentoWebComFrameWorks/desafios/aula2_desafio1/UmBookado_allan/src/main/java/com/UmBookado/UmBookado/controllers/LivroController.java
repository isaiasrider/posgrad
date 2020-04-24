package com.UmBookado.UmBookado.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("livros")
public class LivroController {

    @GetMapping
    public String livros() {

        return "livros";
    }

    @GetMapping("{id}")
    public String porId(@PathVariable String id) {
        return id;
    }

    @GetMapping("porAutor/{id}")
    public String porAutor(@PathVariable String id) {
        return "livros " + id;
    }


}
