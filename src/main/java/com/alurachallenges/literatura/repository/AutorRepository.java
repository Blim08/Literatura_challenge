package com.alurachallenges.literatura.repository;

import com.alurachallenges.literatura.model.Autor;
import com.alurachallenges.literatura.model.DatosAutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AutorRepository extends JpaRepository<Autor,Long> {
    Autor findByNombre(String nombre);

    @Query("SELECT a FROM Autor a WHERE a.fechaNacimiento <= :año AND a.fechaDefuncion >= :año")
    List<Autor> autoresVivosEnDeterminadoAño (int año);

}
