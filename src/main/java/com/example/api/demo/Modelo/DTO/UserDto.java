package com.example.api.demo.Modelo.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class UserDto {
    private int id;
    private String usuario;
    private String email;

    @JsonIgnore
    private String senha;
}
