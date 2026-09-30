package com.got.gestion.repository;

import com.got.gestion.entity.CasaVasalla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasaVasallaRepository extends JpaRepository<CasaVasalla, Integer> {
    


}
