package com.example.repository;

import com.example.entities.Productos;
import com.example.entities.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductosRepository extends JpaRepository<Productos, Long> {
    List<Tienda> findAllByTiendaId(Long id);


}