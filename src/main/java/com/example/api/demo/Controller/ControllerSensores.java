package com.example.api.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.demo.Implements.ImplementSensorSolo;
import com.example.api.demo.Modelo.ModeloSensorSolo;
import com.example.api.demo.Modelo.RespostaJson;


@RestController
public class ControllerSensores {
   
    @Autowired
    ImplementSensorSolo sensorSolo;

    @PostMapping("/sensor-solo")
    private ResponseEntity<RespostaJson> RecebeSensorSolo(@RequestBody ModeloSensorSolo obj){
        return ResponseEntity.ok().body(sensorSolo.save(obj));
    }

    @GetMapping("/sensor-solo-read")
    private ResponseEntity<ModeloSensorSolo> UltimoValorLido(){

        return ResponseEntity.ok().body(sensorSolo.findTopByOrderByIdDesc());
    }
}
