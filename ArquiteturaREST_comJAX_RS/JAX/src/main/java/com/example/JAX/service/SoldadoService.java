package com.example.JAX.service;

import com.example.JAX.dto.Soldado;
import org.springframework.stereotype.Service;

@Service
public class SoldadoService {
    public Soldado buscSoldado(String cpf){
        Soldado soldado = new Soldado();
        soldado.setNome("Legulas");
        soldado.setRaca("Bolseiro");
        soldado.setArma("Espada");

        return soldado;
    }

    public void criaSoldado(Soldado soldado){

    }

    public void alteraSoldado(String cpf, SoldadoEdit soldadoEdit ){

    }
}
