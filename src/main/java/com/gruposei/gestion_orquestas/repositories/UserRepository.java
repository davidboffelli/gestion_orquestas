package com.gruposei.gestion_orquestas.repositories;

import com.gruposei.gestion_orquestas.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
}
