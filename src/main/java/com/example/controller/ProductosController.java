package com.example.controller;

import com.example.service.ProductosService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class ProductosController {

    private final ProductosService productosServ;

    @GetMapping("productos")
    public String findAll(Model model) {
        model.addAttribute("mensaje", "Listado de productos");
        model.addAttribute("productos", productosServ.findAll());
        return "productos";
    }
}
