package com.got.gestion.service;

import com.got.gestion.repository.CasaVasallaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CasaVasallaService {

    private final CasaVasallaRepository casaVasallaRepository;

    public List<CasaVasallaRepository.CasaVasallaResumen> obtenerCasasPorLealtad(int lealtad){
        return casaVasallaRepository.findByLealtadGreaterThan(lealtad);
    }

}
