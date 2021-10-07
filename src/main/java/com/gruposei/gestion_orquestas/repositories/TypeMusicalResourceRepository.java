package com.gruposei.gestion_orquestas.repositories;

import com.gruposei.gestion_orquestas.model.TypeMusicalResource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeMusicalResourceRepository extends JpaRepository<TypeMusicalResource,Long> {

    void deleteById(Long id);
}
