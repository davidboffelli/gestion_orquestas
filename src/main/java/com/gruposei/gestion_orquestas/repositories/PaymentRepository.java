package com.gruposei.gestion_orquestas.repositories;

import com.gruposei.gestion_orquestas.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment,Long> {

    Optional<Payment> findByExternalReference(String externalReference);

    boolean existsByExternalReference(String externalReference);
}
