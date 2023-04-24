package com.example.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "ubicacion")
public class Ubicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String calle;
    private String localidad;
    private String ciudad;
    private Integer cp;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Ubicacion ubicacion = (Ubicacion) o;
        return getId() != null && Objects.equals(getId(), ubicacion.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}