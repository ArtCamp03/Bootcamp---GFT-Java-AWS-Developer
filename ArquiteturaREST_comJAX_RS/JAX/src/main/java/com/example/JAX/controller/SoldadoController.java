package com.example.JAX.controller;

import com.example.JAX.dto.Soldado;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v1/soldado")
public class SoldadoController {

    @GetMapping
    public ResponseBody<Soldado> buscaSoldado() {
        return ResponseBody.ok().build();
    }

}
