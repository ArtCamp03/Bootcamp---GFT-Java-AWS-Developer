package com.example.JAX.service;

import com.example.JAX.dto.Soldado;
import org.springframework.stereotype.Service;

@Service
public class SoldadoService {
    public Soldado buscSoldado(){
        Soldado soldado = new Soldado();
        soldado.setNome("Legulas");
        soldado.setRaca("Bolseiro");
        soldado.setArma("Espada");

        return soldado;
    }
}
