package com.got.gestion.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "fortalezas")
@Data
public class Fortaleza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private Integer capacidad;
    private String ubicacion;

    @OneToMany(mappedBy = "fortaleza")
    @JsonIgnoreProperties("fortaleza")
    private List<Regimiento> regimientos;
}
