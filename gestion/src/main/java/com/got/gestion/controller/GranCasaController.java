package com.got.gestion.controller;

import com.got.gestion.entity.GranCasa;
import com.got.gestion.repository.GranCasaRepository;
import com.got.gestion.service.GranCasaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/grandes-casas")
@AllArgsConstructor
public class GranCasaController {

    private final GranCasaService granCasaService;

    @GetMapping
    public List<GranCasa> obtenerGrandesCasas(){
        return granCasaService.obtenerGrandesCasas();
    }

    @GetMapping("/resumen")
    public List<GranCasaRepository.GranCasaResumen> obtenerGrandesCasasResumen(){
        return granCasaService.obtenerGrandesCasasResumen();
    }
}
