package com.ejemplo.contador.controller;

import com.ejemplo.contador.model.Contador;
import com.ejemplo.contador.service.ContadorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contador")
public class ContadorController {

    private final ContadorService contadorService;

    public ContadorController(ContadorService contadorService) {
        this.contadorService = contadorService;
    }

    @PostMapping("/incrementar")
    public Contador incrementar() {
        return contadorService.incrementar();
    }
    @GetMapping
    public Contador obtener() {
        return contadorService.obtener();
    }
    @PostMapping("/reiniciar")
    public Contador reiniciar() {
        return contadorService.reiniciar();
    }
}