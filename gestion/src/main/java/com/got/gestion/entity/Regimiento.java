package com.got.gestion.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.got.gestion.entity.enums.TipoTropa;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="regimientos")
@Data
public class Regimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name="tipo_tropa")
    private TipoTropa tipoTropa;

    @Column(name="num_soldados")
    private Integer numSoldados;

    @Column(name = "coste_mantenimiento")
    private Double costeMantenimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "casas_vasallas_id")
    @JsonIgnoreProperties("regimientos")
    private CasaVasalla casa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fortalezas_id")
    @JsonIgnoreProperties("regimientos")
    private Fortaleza fortaleza;
}
