package com.got.gestion.repository;

import com.got.gestion.entity.GranCasa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GranCasaRepository extends JpaRepository<GranCasa, Integer> {

    public interface GranCasaResumen{
        String getNombre();
        String getLema();
        String getRegion();
    }

    public List<GranCasaResumen> findAllBy();

    public Optional<GranCasaResumen> findByNombreIgnoreCase(String nombre);
}
