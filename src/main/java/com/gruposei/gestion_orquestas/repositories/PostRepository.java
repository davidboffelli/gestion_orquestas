package com.gruposei.gestion_orquestas.repositories;


import com.gruposei.gestion_orquestas.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
}
