package com.fsd.customerInteraction.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsd.customerInteraction.resource.Customer;

//CustomerRepository.java
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
 List<Customer> findByDateOfBirth(LocalDate dateOfBirth);
}

