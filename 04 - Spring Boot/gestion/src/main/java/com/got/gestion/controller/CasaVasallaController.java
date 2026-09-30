package com.got.gestion.controller;

import com.got.gestion.repository.CasaVasallaRepository;
import com.got.gestion.service.CasaVasallaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/casa-vasalla")
@AllArgsConstructor
public class CasaVasallaController {
    private final CasaVasallaService casaVasallaService;

    @GetMapping("/lealtad-minima")
    public ResponseEntity<List<CasaVasallaRepository.CasaVasallaResumen>> obtenerCasasVasallasPorLealtad(@RequestParam int lealtad){
    //public List<CasaVasallaRepository.CasaVasallaResumen> obtenerCasasVasallasPorLealtad(@RequestParam int lealtad){
        List<CasaVasallaRepository.CasaVasallaResumen> listaCasasVasallas = casaVasallaService.obtenerCasasPorLealtad(lealtad);

        if(listaCasasVasallas.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(listaCasasVasallas);
        }
    }
}
