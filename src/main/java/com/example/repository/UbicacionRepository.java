package com.example.repository;

import com.example.entities.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UbicacionRepository extends JpaRepository<Ubicacion, Long> {
}