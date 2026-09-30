package com.got.gestion.repository;

import com.got.gestion.entity.CasaVasalla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CasaVasallaRepository extends JpaRepository<CasaVasalla, Integer> {

    public interface CasaVasallaResumen{
        String getNombre();
        String getCastillo();
        Integer getLealtad();
    }

    public List<CasaVasallaResumen> findByLealtadGreaterThan (int lealtad);
}
