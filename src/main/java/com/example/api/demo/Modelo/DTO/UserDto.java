package com.example.api.demo.Modelo.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@NotBlank
@NotNull
public class UserDto {
    private int id;
    private String usuario;
    private String email;

    @JsonIgnore
    private String senha;
}
