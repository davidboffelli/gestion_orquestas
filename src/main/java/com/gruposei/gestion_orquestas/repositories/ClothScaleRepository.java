package com.gruposei.gestion_orquestas.repositories;

import com.gruposei.gestion_orquestas.model.ClothScale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothScaleRepository extends JpaRepository<ClothScale,Long> {

    void deleteById(Long id);
}
