package com.example.api.demo.Services;

import org.springframework.stereotype.Service;

import com.example.api.demo.Modelo.ModeloSensorSolo;
import com.example.api.demo.Modelo.RespostaJson;

@Service
public interface ServiceSensorSolo {
    
    RespostaJson save(ModeloSensorSolo objDados);

    ModeloSensorSolo findTopByOrderByIdDesc();
}
