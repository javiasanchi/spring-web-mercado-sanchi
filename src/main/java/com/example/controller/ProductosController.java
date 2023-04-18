package com.example.controller;

import com.example.entities.Productos;
import com.example.service.ProductosService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@AllArgsConstructor
@Controller
public class ProductosController {

    private final ProductosService productosServ;

    @GetMapping("productos")
    public String findAll (Model model){
        List<Productos> productos = productosServ.findAll();
        return "productos";
    }
}
