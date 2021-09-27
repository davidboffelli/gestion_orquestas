package com.gruposei.gestion_orquestas.repositories;

import com.gruposei.gestion_orquestas.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
