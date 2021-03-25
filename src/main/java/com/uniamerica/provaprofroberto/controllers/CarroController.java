package com.uniamerica.provaprofroberto.controllers;

import com.uniamerica.provaprofroberto.models.Carro;
import com.uniamerica.provaprofroberto.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {
    final
    CarroService carroService;

    @Autowired
    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    @PostMapping
    ResponseEntity<?> adicionaCarro(@RequestBody Carro carro) {
        carroService.salva(carro);
        return new ResponseEntity<>(carro, null, HttpStatus.CREATED);
    }

    @GetMapping("/marca/{marca}")
    List<Carro> listaPorMarca(@PathVariable String marca) {
        return carroService.listaPorMarca(marca);
    }

    @GetMapping("/modelo/{modelo}")
    List<Carro> listaPorModelo(@PathVariable String modelo) {
        return carroService.listaPorModelo(modelo);
    }

    @GetMapping()
    List<Carro> listaTodos() {
        return carroService.listaTodos();
    }

    @GetMapping("/placa/{placa}")
    ResponseEntity<?> listaPorPlaca(@PathVariable String placa) {
        Carro carro = carroService.listaPorPlaca(placa);
        return new ResponseEntity<>(carro, null, HttpStatus.FOUND);
    }
}
