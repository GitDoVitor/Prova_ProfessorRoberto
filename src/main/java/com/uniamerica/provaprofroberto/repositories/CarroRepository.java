package com.uniamerica.provaprofroberto.repositories;

import com.uniamerica.provaprofroberto.models.Carro;
import com.uniamerica.provaprofroberto.models.Marca;
import com.uniamerica.provaprofroberto.models.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
    List<Carro> findAllByMarca_Id(Long marca_id);
    List<Carro> findAllByModelo_Id(Long modelo_id);
    Carro findByPlaca(String placa);
}
