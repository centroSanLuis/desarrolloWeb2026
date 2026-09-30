package com.got.gestion.controller;

import com.got.gestion.entity.GranCasa;
import com.got.gestion.repository.GranCasaRepository;
import com.got.gestion.service.GranCasaService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/gran-casa")
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

    @GetMapping("/buscar")
    public ResponseEntity<GranCasaRepository.GranCasaResumen> buscarPorNombre(@RequestParam String nombre){
        Optional<GranCasaRepository.GranCasaResumen> optionalGranCasa = granCasaService.buscarPorNombre(nombre);

        if(optionalGranCasa.isPresent()){
            return ResponseEntity.ok(optionalGranCasa.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
