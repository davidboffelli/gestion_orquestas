package com.gruposei.gestion_orquestas.repositories;

import com.gruposei.gestion_orquestas.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Long> {

    Optional<Users> findByUsername(String username);

}
