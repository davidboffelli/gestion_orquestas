package com.gruposei.gestion_orquestas.repositories;

import com.gruposei.gestion_orquestas.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
