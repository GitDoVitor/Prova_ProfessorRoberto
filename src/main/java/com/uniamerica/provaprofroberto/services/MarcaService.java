package com.uniamerica.provaprofroberto.services;

import com.uniamerica.provaprofroberto.models.Marca;
import com.uniamerica.provaprofroberto.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarcaService {
    final
    MarcaRepository marcaRepository;

    @Autowired
    public MarcaService(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    public Marca cria(Marca marca) {
        return marcaRepository.save(marca);
    }
}
