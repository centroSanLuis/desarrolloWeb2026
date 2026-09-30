package com.got.gestion.controller;

import com.got.gestion.entity.Fortaleza;
import com.got.gestion.service.FortalezaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fortaleza")
@AllArgsConstructor
public class FortalezaController {

    private final FortalezaService fortalezaService;

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarFortaleza(@PathVariable Integer id){
        fortalezaService.borrarFortaleza(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/sobrecapacidad")
    public ResponseEntity<List<Fortaleza>> obtenerFortalezasEnSobrecapacidad(){
        List<Fortaleza> fortalezas = fortalezaService.obtenerFortalezasEnSobrecapacidad();

        if(fortalezas.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(fortalezas);
        }
    }

}
