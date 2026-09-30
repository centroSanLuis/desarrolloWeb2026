package com.howards.api.service;

import com.howards.api.entity.Habitacion;
import com.howards.api.repository.HabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitacionService {

    @Autowired
    private HabitacionRepository habitacionRepository;

    public List<Habitacion> getAllHabitaciones(){
        return habitacionRepository.findAll();
    }
}
