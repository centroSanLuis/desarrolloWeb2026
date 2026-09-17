package com.howards.api.service;

import com.howards.api.entity.Casa;
import com.howards.api.repository.CasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CasaService {

    @Autowired
    CasaRepository casaRepository;

    public List<Casa> getAllCasas(){
        return casaRepository.findAll();
    }
}
