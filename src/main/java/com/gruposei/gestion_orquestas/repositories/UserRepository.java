package com.gruposei.gestion_orquestas.repositories;

import com.gruposei.gestion_orquestas.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUsername(String username);

    void deleteById(Long id);

}
