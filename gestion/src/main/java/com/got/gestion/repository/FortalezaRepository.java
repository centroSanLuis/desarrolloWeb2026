package com.got.gestion.repository;

import com.got.gestion.entity.Fortaleza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FortalezaRepository extends JpaRepository<Fortaleza, Integer> {
}
