package com.gruposei.gestion_orquestas.repositories;

import com.gruposei.gestion_orquestas.model.MusicalResourceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicalResourceTypeRepository extends JpaRepository<MusicalResourceType,Long> {

    void deleteById(Long id);
}
