package com.uniamerica.provaprofroberto.models;

import com.uniamerica.provaprofroberto.enums.Cor;
import com.uniamerica.provaprofroberto.enums.StatusCarro;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    private Cor cor;
    private StatusCarro status;
    private Double diaria;
    @ManyToOne
    private Marca marca;
    @ManyToOne
    private Modelo modelo;
}
