package com.ejemplo.contador.repository;

import com.ejemplo.contador.model.Contador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContadorRepository extends JpaRepository<Contador, Long> {
}