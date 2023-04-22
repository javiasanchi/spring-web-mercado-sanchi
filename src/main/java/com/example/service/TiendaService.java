package com.example.service;

import com.example.entities.Tienda;

import java.util.List;
import java.util.Optional;

public interface TiendaService {
    List<Tienda> findAll();

    Optional<Tienda> findById(Long id);

    Tienda save(Tienda tiendas);

    void deleteById(Long id);


}

