package com.howards.api.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data //genera los getter y setter ademas del equals, toString...
@NoArgsConstructor //genera el constructor vacio (necesario para JPA)
@AllArgsConstructor //genera un contructor con todos los atributos
@Entity
@Table(name = "alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_mago")
    private int numMago;

    private String nombre;
    private String apellidos;

    @Column(name="ano_nacimiento")
    private int anoNacimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="casas_id")
    @JsonIgnoreProperties({"alumnos", "hibernateLazyInitializer"})
    private Casa casa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="habitaciones_id")
    @JsonIgnoreProperties({"alumnos", "hibernateLazyInitializer"})
    private Habitacion habitacion;

}
