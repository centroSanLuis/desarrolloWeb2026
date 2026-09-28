package com.got.gestion.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.got.gestion.entity.enums.EstadoPago;
import com.got.gestion.entity.ids.RecaudacionId;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "recuadaciones")
@Data
public class Recaudacion {

    @EmbeddedId
    private RecaudacionId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("granCasaId")
    @JoinColumn(name="grandes_casas_id")
    @JsonIgnoreProperties("recaudacionesObtenidas")
    private GranCasa granCasa;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("maestreId")
    @JoinColumn(name="maestres_id")
    @JsonIgnoreProperties("recaudacionesRealizadas")
    private Maestre maestre;

    private Integer importe;

    @Column(name = "estado_pago")
    @Enumerated(EnumType.STRING)
    private EstadoPago estadoPago;

    @JsonProperty("fecha")
    public LocalDate getFecha(){
        if(id != null){
            return id.getFecha();
        }else{
            return null;
        }
    }

}
