package com.howards.api.controller;


import com.howards.api.entity.Casa;
import com.howards.api.service.CasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/casas")
public class CasaController {

    @Autowired
    private CasaService casaService;

    @GetMapping
    public List<Casa> getAllCasas(){
        return casaService.getAllCasas();
    }

}
