package com.example;

import com.example.entities.Productos;
import com.example.repository.ProductosRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);

        ProductosRepository productosRepo = context.getBean(ProductosRepository.class);

        var prod1 = new Productos(null, "Chorizo Ibérico", "El chorizo ibérico es un embutido muy típico y originario de España. Está hecho con carne de cerdo ibérico que se cura mediante un proceso complejo de secado yestá condimentado con sal, ajo y pimentón, lo que le da un aroma ahumado.", 800D, 21.69, LocalDate.of(2022, 8, 21), LocalDate.of(2024, 8, 21), 120, true);
        var prod2 = new Productos(null, "Salchichón Ibérico", "Se trata de un producto natural (concretamente, un embutido) elaborado con la carne magra picada del cerdo ibérico de bellota. Este matiz en el animal es muy importante, ya que solo una dieta a base de bellota podrá determinar el calificativo de ibérico de bellota en el producto final.", 700D, 19.69, LocalDate.of(2022, 6, 11), LocalDate.of(2024, 11, 27), 170, true);
        var prod3 = new Productos(null, "Jamón Ibérico", "El jamón ibérico es un tipo de jamón serrano procedente del cerdo de raza ibérica, muy considerado en la gastronomía española y en la portuguesa (presunto ibérico), que se considera como un artículo de alta cocina y un manjar exquisito.", 700D, 25.69, LocalDate.of(2021, 2, 11), LocalDate.of(2025, 5, 7), 250, true);
        var prod4 = new Productos(null, "Lomo Ibérico", "Cuando nos referimos al lomo, estamos hablando de la carne procedente de la parte superior del cerdo, más cercana al espinazo del animal. Proviene de un cerdo ibérico y su categoría, como en el caso del jamón, va a depender de la alimentación y crianza que haya tenido dicho animal.", 550D, 29.69, LocalDate.of(2022, 2, 16), LocalDate.of(2026, 8, 27), 150, false);
        var prod5 = new Productos(null, "Presa Ibérica", "Esta parte se encuentra exactamente entre el cabecero del lomo y la paleta. Podríamos decir que es como si fuese el hombro del animal. Al estar en esa área es una zona de mucha movilidad y eso hace que sea una carne con fibra y por tanto, súper nutritiva.", 680D, 21.49, LocalDate.of(2022, 1, 11), LocalDate.of(2024, 4, 14), 130, true);
        var prod6 = new Productos(null, "Pluma Ibérica", "La pluma ibérica es una pieza de la canal del cerdo ibérico que se encuentra en la parte anterior del lomo, junto a la presa, y tiene una característica forma triangular (de ahí su nombre). Es alargada y no muy gruesa, de entre cien y ciento cincuenta gramos de peso, y de cada canal se extraen solo dos.", 150D, 20.9, LocalDate.of(2023, 2, 11), LocalDate.of(2026, 9, 23), 60, true);
        var prod7 = new Productos(null, "Secreto Ibérico", "El secreto ibérico es una pieza del cerdo que se encuentra en la parte interna del lomo, junto a la maza de la paleta. Se trata de un verdadero manjar. El secreto ibérico se ubica en la axila del cerdo, entre la paletilla y la panceta. En algunas zonas del sur, se conoce como “lomito”.", 780D, 15.39, LocalDate.of(2022, 2, 16), LocalDate.of(2024, 7, 19), 50, false);
        var prod8 = new Productos(null, "Queso Ibérico", "El queso Ibérico es un queso de pasta presada elaborado con la mezcla de tres leches (vaca, oveja y cabra). Debe estar elaborado con leche fresca de origen ibérico en las siguientes proporciones: máximo del 50% de leche de vaca, Mínimo del 15% de leche de cabra y mínimo del 15% de leche de oveja.", 1200D, 28.69, LocalDate.of(2021, 2, 11), LocalDate.of(2025, 5, 7), 250, true);
        var prod9 = new Productos(null, "Cecina de León", "La cecina de León es la mejor carne de vacuno curada del mundo. Lo afirmamos tan rotundamente porque estamos sumamente convencidos de ello y os invitamos a averiguarlo.", 340D, 18.6, LocalDate.of(2020, 4, 10), LocalDate.of(2025, 5, 7), 140, true);
        var prod10 = new Productos(null, "Morcilla de Burgos", "La morcilla de burgos es un embutido sin carne que se rellena con sangre coagulada (en la mayoría de los casos de cerdo), arroz extra, manteca de cerdo, sal y cebolla horcal; y es aderezada con especias para conseguir su sabor característico (principalmente pimienta y pimentón.", 140D, 12.29, LocalDate.of(2023, 1, 11), LocalDate.of(2024, 3, 17), 130, true);

        productosRepo.saveAll(List.of(prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9, prod10));
        
    }

}
