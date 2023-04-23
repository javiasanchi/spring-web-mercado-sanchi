package com.example.service;

import com.example.entities.Productos;
import com.example.entities.Tienda;
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
        log.info("Buscar todos los productos findAll()");
        return productosRepo.findAll();
    }

    @Override
    public Optional<Productos> findById(Long id) {
        log.info("Buscar un producto por Id findById()");
        return productosRepo.findById(id);
    }

    @Override
    public Productos save(Productos productos) {
        return productosRepo.save(productos);
    }

    @Override
    public void deleteById(Long id) {
        productosRepo.deleteById(id);

    }

    @Override
    public List<Productos> findAllByTiendaId(Long id) {
        return productosRepo.findAllByTiendaId(id);

    }

    @Override
    public void saveAll(List<Productos> productos) {
        productosRepo.saveAll(productos);

    }
}
