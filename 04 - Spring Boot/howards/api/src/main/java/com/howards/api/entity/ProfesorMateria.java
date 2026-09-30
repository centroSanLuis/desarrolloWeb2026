package com.howards.api.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.howards.api.entity.ids.ProfesoresMateriasID;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="profesores_materias")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfesorMateria {

    @EmbeddedId
    private ProfesoresMateriasID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("profesorId")
    @JoinColumn(name="profesores_id")
    private Profesor profesor;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("materiaId")
    @JoinColumn(name="materias_id")
    private Materia materia;

    @JsonProperty("curso")
    public Integer getCurso(){
        if(id!=null){
            return id.getCurso();
        }else{
            return null;
        }
    }

}
