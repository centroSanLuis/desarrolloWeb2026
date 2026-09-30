package com.got.gestion.service;

import com.got.gestion.entity.GranCasa;
import com.got.gestion.repository.GranCasaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GranCasaService {
    private final GranCasaRepository granCasaRepository;

    public List<GranCasa> obtenerGrandesCasas(){
        return granCasaRepository.findAll();
    }

    public List<GranCasaRepository.GranCasaResumen> obtenerGrandesCasasResumen(){
        return granCasaRepository.findAllBy();
    }

    public Optional<GranCasaRepository.GranCasaResumen> buscarPorNombre(String nombre){
        return granCasaRepository.findByNombreIgnoreCase(nombre);
    }
}
