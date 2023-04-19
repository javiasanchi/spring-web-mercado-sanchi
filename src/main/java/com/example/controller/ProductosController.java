package com.example.controller;

import com.example.entities.Productos;
import com.example.service.ProductosService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
public class ProductosController {

    private final ProductosService productosServ;

    @GetMapping("productos")
    public String findAll(Model model) {
        List<Productos> productos = productosServ.findAll();
        model.addAttribute("productos", productos);
        model.addAttribute("mensaje", "Listado de productos");
        return "productos";
    }

    @GetMapping("productos/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<Productos> productOpt = productosServ.findById(id);
        if (productOpt.isPresent())
            model.addAttribute("producto", productOpt.get());
        else
            model.addAttribute("error", "PRODUCTO NO SE ENCUENTRA O NO EXISTE");
        return "info-producto";

    }
    @GetMapping("productos/crear")
    public String crearForm (Model model){
        model.addAttribute("producto", new Productos());
        return "form-productos";
    }

}
