package com.howards.api.service;

import com.howards.api.entity.Alumno;
import com.howards.api.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepository alumnoRepository;

    public List<Alumno> getAllAlumnos(){
        List<Alumno> resultado = alumnoRepository.findAll();
        return resultado;
    }

}
