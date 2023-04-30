package com.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    @Column(length = 400)
    private String descripcion;
    private Double peso;
    private Double precio;
    private LocalDate fabricado;
    private LocalDate caducidad;
    private Integer cantidad;
    private Boolean stock;
    @ManyToOne
    private Tienda tienda;


}