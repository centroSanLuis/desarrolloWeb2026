package com.howards.api.controller;

import com.howards.api.entity.Habitacion;
import com.howards.api.service.AlumnoService;
import com.howards.api.service.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/habitaciones")
public class HabitacionController {

    @Autowired
    private HabitacionService habitacionService;

    @GetMapping
    public List<Habitacion> getAllHabitaciones(){
        return habitacionService.getAllHabitaciones();
    }

}
