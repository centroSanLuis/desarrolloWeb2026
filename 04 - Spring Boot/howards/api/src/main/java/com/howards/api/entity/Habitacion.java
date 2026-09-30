package com.howards.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "habitaciones")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="num_camas")
    private String numCamas;

    private String ubicacion;

    @OneToMany(mappedBy = "habitacion")
    @JsonIgnoreProperties("habitacion")
    private List<Alumno> alumnos;

}
