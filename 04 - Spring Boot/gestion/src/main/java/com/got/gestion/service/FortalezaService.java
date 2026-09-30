package com.got.gestion.service;

import com.got.gestion.entity.Fortaleza;
import com.got.gestion.repository.FortalezaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FortalezaService {
    private final FortalezaRepository fortalezaRepository;

    public void borrarFortaleza(Integer id){
        Fortaleza f = new Fortaleza();

        f.setId(id);

        fortalezaRepository.delete(f);
    }

    public List<Fortaleza> obtenerFortalezasEnSobrecapacidad(){
        return fortalezaRepository.obtenerFortalezasEnSobrecapacidad();
    }
}
