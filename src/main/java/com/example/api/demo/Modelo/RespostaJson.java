package com.example.api.demo.Modelo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class RespostaJson {
    
    private String status;
    private String mensagem;
}
