package com.howards.api.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "profesores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    /*@ManyToMany
    @JoinTable(name="profesores_materias",
    joinColumns = @JoinColumn(name="profesores_id"),
    inverseJoinColumns = @JoinColumn(name="materias_id"))
    @JsonIgnoreProperties("profesores")
    private List<Materia> materias;*/

    @OneToMany(mappedBy = "profesor")
    @JsonIgnoreProperties({"profesor", "id"})
    private List<ProfesorMateria> materias;
}
