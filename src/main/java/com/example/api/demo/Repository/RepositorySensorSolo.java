package com.example.api.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.api.demo.Modelo.ModeloSensorSolo;

public interface RepositorySensorSolo extends CrudRepository<ModeloSensorSolo,Integer> {

    ModeloSensorSolo findTopByOrderByIdDesc();
    
}
