package com.howards.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.howards.api.entity.ids.CursoId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cursos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    @EmbeddedId
    private CursoId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("alumnoId")
    @JoinColumn(name="alumnos_id")
    private Alumno alumno;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("materiaId")
    @JoinColumn(name="materias_id")
    private Materia materia;

    private float nota;

    @JsonProperty("curso")
    public Integer getCurso(){
        if(id!=null){
            return id.getCurso();
        }else{
            return null;
        }
    }

}
