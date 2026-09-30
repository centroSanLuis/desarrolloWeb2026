package com.howards.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "casas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Casa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    @OneToMany(mappedBy = "casa")
    @JsonIgnoreProperties("casa")
    private List<Alumno> alumnos;

    @OneToOne
    @JoinColumn(name="profesores_id")
    private Profesor profesor;
}
