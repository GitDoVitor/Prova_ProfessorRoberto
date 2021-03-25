package com.uniamerica.provaprofroberto.services;

import com.uniamerica.provaprofroberto.enums.StatusCarro;
import com.uniamerica.provaprofroberto.models.Carro;
import com.uniamerica.provaprofroberto.models.Marca;
import com.uniamerica.provaprofroberto.models.Modelo;
import com.uniamerica.provaprofroberto.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {
    final
    CarroRepository carroRepository;

    @Autowired
    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public Carro salva(Carro carro) {
        carro.setStatus(StatusCarro.DISPONIVEL);
        return carroRepository.save(carro);
    }

    public List<Carro> listaTodos() {
        return carroRepository.findAll();
    }

    public void apaga(Long id) {
        carroRepository.deleteById(id);
    }

    public List<Carro> listaPorModelo(Long id) {
        return carroRepository.findAllByModelo_Id(id);
    }

    public List<Carro> listaPorMarca(Long id) {
        return carroRepository.findAllByMarca_Id(id);
    }

    public Carro listaPorPlaca(String placa) {
        return carroRepository.findByPlaca(placa);
    }
}
