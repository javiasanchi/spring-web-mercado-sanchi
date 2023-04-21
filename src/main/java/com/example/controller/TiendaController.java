package com.example.controller;

import com.example.entities.Tienda;
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
public class TiendaController {
    private final TiendaService tiendaServ;

    @GetMapping("/tiendas")
    public String findAll(Model model) {
        List<Tienda> tiendas = tiendaServ.findAll();
        model.addAttribute("tiendas", tiendas);
        model.addAttribute("mensajetienda", "Listado de tiendas");
        return "tiendas";
    }

    @GetMapping("tiendas/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<Tienda> tiendaOpt = tiendaServ.findById(id);
        if (tiendaOpt.isPresent())
            model.addAttribute("tienda", tiendaOpt.get());
        else
            model.addAttribute("errortien", "TIENDA NO SE ENCUENTRA O NO EXISTE");
        return "info-tienda";
    }

    @GetMapping("tiendas/crear")
    public String crearForm(Model model) {
        model.addAttribute("tienda", new Tienda());
        return "form-tiendas";
    }

    @GetMapping("tiendas/{id}/editar")
    public String editForm(Model model, @PathVariable Long id) {
        Optional<Tienda> tiendasOpt = tiendaServ.findById(id);
        if (tiendasOpt.isPresent())
            model.addAttribute("tienda", tiendasOpt.get());
        else
            model.addAttribute("errortienda", "TIENDA NO EXISTE O NO SE ENCUENTRA");

        return "form-tiendas";
    }

    @PostMapping("tiendas")
    public String save(@ModelAttribute Tienda tienda) {
        tiendaServ.save(tienda);
        return "redirect:/tiendas";
    }

    @GetMapping("tiendas/{id}/borrar")
    public String deleteById(@PathVariable Long id) {
        tiendaServ.deleteById(id);
        return "redirect:/tiendas";
    }

}
