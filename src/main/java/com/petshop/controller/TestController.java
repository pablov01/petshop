package com.petshop.controller;

import com.petshop.model.Usuario;
import com.petshop.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public TestController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/test")
    @ResponseBody
    public String testConnection() {
        Usuario usuarios = new Usuario();
        usuarios.setNombre("Ejemplo");
        usuarioRepository.save(usuarios);
        return "¡Conexión exitosa! Usuario guardado.";
    }
}

