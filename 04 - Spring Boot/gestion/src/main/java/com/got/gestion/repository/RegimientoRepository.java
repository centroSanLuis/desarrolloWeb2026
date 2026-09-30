package com.got.gestion.repository;

import com.got.gestion.entity.Regimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegimientoRepository extends JpaRepository<Regimiento, Integer> {
}
