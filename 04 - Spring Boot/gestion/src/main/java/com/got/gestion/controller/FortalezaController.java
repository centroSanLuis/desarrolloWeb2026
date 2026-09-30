package com.got.gestion.controller;

import com.got.gestion.service.FortalezaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
