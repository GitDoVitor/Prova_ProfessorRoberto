package com.uniamerica.provaprofroberto.services;

import com.uniamerica.provaprofroberto.models.Modelo;
import com.uniamerica.provaprofroberto.repositories.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModeloService {
    final
    ModeloRepository modeloRepository;
    @Autowired
    public ModeloService(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

    public Modelo cria(Modelo modelo) {
        return modeloRepository.save(modelo);
    }
}
