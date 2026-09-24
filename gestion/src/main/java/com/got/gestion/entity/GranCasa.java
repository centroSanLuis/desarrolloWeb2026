package com.got.gestion.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.got.gestion.entity.enums.Region;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="grandes_casas")
@Data
public class GranCasa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    @Enumerated(EnumType.STRING)
    private Region region;

    private String lema;

    @OneToMany(mappedBy = "granCasa")
    @JsonIgnoreProperties("granCasa")
    private List<CasaVasalla> casasVasallas;

}
