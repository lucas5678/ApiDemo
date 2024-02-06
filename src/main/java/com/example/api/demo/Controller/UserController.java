package com.example.api.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.demo.Modelo.ModeloUser;
import com.example.api.demo.Services.impl.UserImpl;

@RestController
public class UserController {
    //controller usuario.
    @Autowired
    UserImpl implemento;

    @GetMapping("/usuariosAll")
    private ResponseEntity<List<ModeloUser>> UsuariosAll(){
        return ResponseEntity.ok().body(implemento.findAll());
    }

    @PostMapping("/usuario")
    private ResponseEntity<ModeloUser> Usuario(@RequestBody ModeloUser usuario){
        return ResponseEntity.ok().body(implemento.findById(usuario.getId()));
    }
}
