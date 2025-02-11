package com.elyhouadria.acmeinc.repositories;

import com.elyhouadria.acmeinc.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

    void deletePaymentById(Integer id);
    Optional<Payment> findPaymentById(Integer id);


}
