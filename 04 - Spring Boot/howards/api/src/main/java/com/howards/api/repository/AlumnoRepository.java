package com.howards.api.repository;


import com.howards.api.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
    List<Alumno> findByNombre(String nombre);
    //boolean existsNumMago(int numMago);
}
