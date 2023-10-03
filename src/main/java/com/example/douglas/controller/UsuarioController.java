package com.example.douglas.controller;

import com.example.douglas.model.Usuario;
import com.example.douglas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/users")

    public List<Usuario> getUsers() {
        return repository.findAll();

    }
    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return  repository.findByUsername(username);
    }
}
