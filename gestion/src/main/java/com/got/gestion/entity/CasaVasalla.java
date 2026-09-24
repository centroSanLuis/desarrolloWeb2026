package com.got.gestion.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="casas_vasallas")
@Data
public class CasaVasalla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String castillo;
    private int lealtad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grandes_casas_id")
    @JsonIgnoreProperties("casasVasallas")
    private GranCasa granCasa;

    @OneToMany(mappedBy = "casa")
    @JsonIgnoreProperties("casa")
    private List<Regimiento> regimientos;
}
