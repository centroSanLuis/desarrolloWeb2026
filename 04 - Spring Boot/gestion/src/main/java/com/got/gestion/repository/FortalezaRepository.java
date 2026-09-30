package com.got.gestion.repository;

import com.got.gestion.entity.Fortaleza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FortalezaRepository extends JpaRepository<Fortaleza, Integer> {

    //Consulta SQL Nativa para devolver las fortalezas con mas de un 80% de capacidad
    @Query(value = "SELECT f FROM Fortaleza f JOIN f.regimientos r GROUP BY f HAVING SUM(r.numSoldados) > (f.capacidad * 0.8)")
    public List<Fortaleza> obtenerFortalezasEnSobrecapacidad();

    //Es la misma query pero NATIVA de SQL, el problema es que si usamos esta al cambiar de sistema gestor de base de datos, por ejemplo de mySQL a Oracle tendriamos que revisar la query para adaptarla
    /*@Query(value = """
    SELECT f.*
    FROM fortalezas f
    JOIN regimientos r ON r.fortalezas_id = f.id
    GROUP BY f.id
    HAVING SUM(r.num_soldados) > (f.capacidad * 0.8)
    """, nativeQuery = true)
    List<Fortaleza> obtenerFortalezasEnSobrecapacidad();*/

}
