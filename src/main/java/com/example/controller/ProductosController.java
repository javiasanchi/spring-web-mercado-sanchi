package com.example.controller;

import com.example.entities.Productos;
import com.example.service.ProductosService;
import com.example.service.TiendaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
public class ProductosController {

    private final ProductosService productosServ;
    private final TiendaService tiendaServ;

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
    public String crearForm(Model model) {
        model.addAttribute("producto", new Productos());
        return "form-productos";
    }

    @GetMapping("productos/{id}/editar")
    public String editForm(Model model, @PathVariable Long id) {
        Optional<Productos> productosOpt = productosServ.findById(id);
        if (productosOpt.isPresent())
            model.addAttribute("producto", productosOpt.get());
        else
            model.addAttribute("error", "PRODUCTO NO EXISTE O NO SE ENCUENTRA");

        return "form-productos";
    }

    @PostMapping("productos")
    public String save(@ModelAttribute Productos producto) {
        productosServ.save(producto);
        return "redirect:/productos";
    }

    @GetMapping("productos/{id}/borrar")
    public String deleteById(@PathVariable Long id) {
        productosServ.deleteById(id);
        return "redirect:/productos";
    }

    @GetMapping("productos/tienda/{id}")
    public String findByTiendasId(Model model, @PathVariable Long id) {
        model.addAttribute("productos", productosServ.findAllByTiendaId(id));
        return "productos";


    }

}
