package com.example.controller;

import ch.qos.logback.core.model.Model;
import com.example.entities.Tienda;
import com.example.service.TiendaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@AllArgsConstructor
@Controller
public class TiendaController {
    private final TiendaService tiendaServ;

    @GetMapping("/tienda")
    public String findAll (Model model){
        List<Tienda> tiendas = tiendaServ.findAll();
        model.add
    }
}
