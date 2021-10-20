package com.example.JAX.controller;

import com.example.JAX.dto.Soldado;
import com.example.JAX.service.SoldadoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1/soldado")
public class SoldadoController {

    private SoldadoService soldadoService;

    public SoldadoController(SoldadoService soldadoService){
        this.soldadoService = soldadoService;
    }

    @GetMapping("/{cpf}")
    public ResponseBody<Soldado> buscaSoldado(#PathVariable String cpf) {
        Soldado soldado = soldadoService.buscSoldado(cpf);
        return ResponseBody.ok(soldado);
    }

    @PostMapping
    public ResponseBody<Soldado> criaSodlado(ResponseBody Soldado soldado){
        soldadoService.criaSoldado(soldado);
        return ResponseBody.ok().build();
    }

    @PostMapping("/{cpf}")
    public ResponseBody<Soldado> editaSoldado(PathVariable String cpf, ResponseBody SoldadoEdit soldadoEdit){
        soldadoService.alteraSoldado(cpf,SoldadoEdit());
        return ResponseBody.ok().build();
    }
}
