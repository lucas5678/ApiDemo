package com.example.api.demo.Implements;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.api.demo.Modelo.ModeloSensorSolo;
import com.example.api.demo.Modelo.RespostaJson;
import com.example.api.demo.Repository.RepositorySensorSolo;
import com.example.api.demo.Services.ServiceSensorSolo;

@Configuration
public class ImplementSensorSolo implements ServiceSensorSolo {

    @Autowired
    RespostaJson resp;

    @Autowired
    RepositorySensorSolo sensorSolo;

    @Override
    public RespostaJson save(ModeloSensorSolo objDados) {
        if (objDados.getValor_lido() == null || objDados.getValor_lido().isEmpty()) {
            resp.setStatus("200");
            resp.setMensagem("Valor do sensor nulo");
        } else {
            objDados.setTimeStamp(new Date().toString());
            sensorSolo.save(objDados);
            resp.setStatus("200");
            resp.setMensagem("Valor salvo");
        }
        return resp;
    }

    @Override
    public ModeloSensorSolo findTopByOrderByIdDesc() {
        return sensorSolo.findTopByOrderByIdDesc();
    }
    
}
