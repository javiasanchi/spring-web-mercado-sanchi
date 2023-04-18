package com.example.service;

import com.example.entities.Productos;
import com.example.repository.ProductosRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class ProductosServiceImpl implements ProductosService {

    private final ProductosRepository productosRepo;

    @Override
    public List<Productos> findAll() {
        return productosRepo.findAll();
    }

    @Override
    public Optional<Productos> findById(Long id) {
        return productosRepo.findById(id);
    }
}
