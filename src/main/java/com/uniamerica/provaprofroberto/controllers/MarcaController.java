package com.uniamerica.provaprofroberto.controllers;

import com.uniamerica.provaprofroberto.models.Marca;
import com.uniamerica.provaprofroberto.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marcas")
public class MarcaController {
    final
    MarcaService marcaService;

    @Autowired
    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @PostMapping
    ResponseEntity<?> criaMarca(@RequestBody Marca marca) {
        marcaService.cria(marca);
        return new ResponseEntity<>(marca, HttpStatus.CREATED);
    }
}
