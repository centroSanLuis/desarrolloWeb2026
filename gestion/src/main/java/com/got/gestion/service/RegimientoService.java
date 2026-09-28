package com.got.gestion.service;

import com.got.gestion.entity.Regimiento;
import com.got.gestion.repository.RegimientoRepository;
import lombok.AllArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegimientoService {

    private final RegimientoRepository regimientoRepository;

    public Regimiento guardarRegimiento(Regimiento regimiento){
        Regimiento resultado = null;
        try {
            resultado = regimientoRepository.save(regimiento);
        } catch (DataIntegrityViolationException e) {
            // Violación de clave única, foreign key, etc.
            return resultado;
        } catch (DataAccessException e) {
            // Error genérico de BD (desconexión, timeout, etc.)
            return resultado;

        } catch (Exception e) {
            // Cualquier otro fallo inesperado
            return resultado;
        }

        return resultado;
    }
}
