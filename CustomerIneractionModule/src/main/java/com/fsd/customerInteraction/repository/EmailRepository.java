package com.fsd.customerInteraction.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.fsd.customerInteraction.resource.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {
}

