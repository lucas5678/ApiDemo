package com.example.api.demo.Services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.demo.Modelo.ModeloUser;
import com.example.api.demo.Repository.usuariosRepo;
import com.example.api.demo.Services.UserServices;
import com.example.api.demo.Services.Exceptions.ObjectNotFoudExceptions;


@Service
public class UserImpl implements UserServices {
    //metodos que devem ser implementados.
    @Autowired
    usuariosRepo userRepo;

    @Override
    public java.util.List<ModeloUser> findAll() {
        return (java.util.List<ModeloUser>) userRepo.findAll();
    }

    @Override
    public ModeloUser findById(int id) {
        Optional<ModeloUser> obj = userRepo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoudExceptions("Usuário não encontrado com o ID: " + id));
    }

   

}
