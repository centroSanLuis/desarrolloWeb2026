package com.got.gestion.controller;

import com.got.gestion.entity.Regimiento;
import com.got.gestion.service.RegimientoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/regimiento")
@AllArgsConstructor
public class RegimientoController {

    private final RegimientoService regimientoService;

    @PostMapping
    public Regimiento guardarRegimiento(@RequestBody Regimiento regimiento){
        return regimientoService.guardarRegimiento(regimiento);
    }

}
