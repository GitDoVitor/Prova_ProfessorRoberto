package com.uniamerica.provaprofroberto.controllers;

import com.uniamerica.provaprofroberto.models.Modelo;
import com.uniamerica.provaprofroberto.services.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/modelos")
public class ModeloController {
    final
    ModeloService modeloService;
    @Autowired
    public ModeloController(ModeloService modeloService) {
        this.modeloService = modeloService;
    }

    @PostMapping
    ResponseEntity<?> criaModelo(@RequestBody Modelo modelo) {
        modeloService.cria(modelo);
        return new ResponseEntity<>(modelo, HttpStatus.CREATED);
    }
}
