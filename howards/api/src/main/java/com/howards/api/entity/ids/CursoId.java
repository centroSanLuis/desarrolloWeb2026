package com.howards.api.entity.ids;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CursoId implements Serializable {
    @Column(name = "alumnos_id")
    private Integer alumnoId;

    @Column(name = "materias_id")
    private Integer materiaId;

    private Integer curso;
}
