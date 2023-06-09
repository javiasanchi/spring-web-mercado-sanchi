package com.example.service;

import com.example.entities.Productos;
import com.example.entities.Tienda;
import com.example.repository.TiendaRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
@Slf4j
public class TiendaServiceImpl implements TiendaService {
    private final TiendaRepository tiendaRepo;
    private final ProductosService productosServ;

    @Override
    public List<Tienda> findAll() {
        log.info("Buscando tiendas findAll()");
        return tiendaRepo.findAll();
    }

    @Override
    public Optional<Tienda> findById(Long id) {
        log.info("Buscar tienda por Id findById()");
        return tiendaRepo.findById(id);
    }

    @Override
    public List<Tienda> findAllByCategoria(String categoria) {
        return tiendaRepo.findAllByCategoria(categoria);
    }

    @Override
    public Tienda save(Tienda tiendas) {
        return tiendaRepo.save(tiendas);
    }

    @Override
    public void deleteById(Long id) {
        List<Productos> productos = productosServ.findAllByTiendaId(id);
        for (Productos producto : productos) {
            producto.setTienda(null);
        }
        productosServ.saveAll(productos);
        tiendaRepo.deleteById(id);

    }

}
