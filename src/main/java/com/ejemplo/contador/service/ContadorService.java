package com.ejemplo.contador.service;

import com.ejemplo.contador.model.Contador;
import com.ejemplo.contador.repository.ContadorRepository;
import org.springframework.stereotype.Service;

@Service
public class ContadorService {

    private final ContadorRepository contadorRepository;

    public ContadorService(ContadorRepository contadorRepository) {
        this.contadorRepository = contadorRepository;
    }

    public Contador incrementar() {

        Contador contador = contadorRepository.findById(1L)
                .orElseGet(() -> {
                    Contador nuevo = new Contador();
                    nuevo.setValor(0);
                    return nuevo;
                });

        contador.setValor(contador.getValor() + 1);

        return contadorRepository.save(contador);
    }
    public Contador obtener() {
        return contadorRepository.findById(1L)
                .orElseGet(() -> {
                    Contador nuevo = new Contador();
                    nuevo.setValor(0);
                    return contadorRepository.save(nuevo);
                });
    }
    public Contador reiniciar() {
        Contador contador = contadorRepository.findById(1L)
                .orElseGet(() -> {
                    Contador nuevo = new Contador();
                    nuevo.setValor(0);
                    return nuevo;
                });

        contador.setValor(0);

        return contadorRepository.save(contador);
    }
}