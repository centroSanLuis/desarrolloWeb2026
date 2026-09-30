package com.got.gestion.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.got.gestion.entity.enums.Especialidad;
import com.got.gestion.entity.enums.TipoEslabon;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "maestres")
@Data
public class Maestre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    @Column(name = "tipo_eslabon")
    @Enumerated(EnumType.STRING)
    private TipoEslabon tipoEslabon;

    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;

    @Column(name = "ano_graduacion")
    private Integer anoGraduacion;

    @OneToMany(mappedBy = "maestre")
    @JsonIgnoreProperties({"maestre"})
    private List<Recaudacion> recaudacionesRealizadas;

}
