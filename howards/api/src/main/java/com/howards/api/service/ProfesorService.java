package com.howards.api.service;

import com.howards.api.entity.Profesor;
import com.howards.api.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public List<Profesor> getAllProfesores(){
        return profesorRepository.findAll();
    }

}
