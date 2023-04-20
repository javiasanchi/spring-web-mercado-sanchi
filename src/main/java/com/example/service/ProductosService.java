package com.example.service;

import com.example.entities.Productos;

import java.util.List;
import java.util.Optional;

public interface ProductosService {

    List<Productos> findAll();

    Optional<Productos> findById(Long id);

    Productos save(Productos productos);

    void deleteById(Long id);


}
