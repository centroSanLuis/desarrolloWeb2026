package com.got.gestion.entity.ids;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;


@Embeddable
@Getter
@Setter
public class RecaudacionId implements Serializable {

    @Column(name="maestres_id")
    private Integer maestreId;

    @Column(name="grandes_casas_id")
    private Integer granCasaId;

    private LocalDate fecha;

}
