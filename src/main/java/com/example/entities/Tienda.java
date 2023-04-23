package com.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
@Setter
@Entity
@Table(name = "tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nombre;
    private String descrip;
    private Integer empl;
    private Integer numPuesto;
    private LocalDate desde;
    private LocalTime apertura;
    private LocalTime cierre;
    private Boolean abierta;
    @Column(length = 9)
    private Integer telefono;
    @Column(unique = false)
    private String email;

}