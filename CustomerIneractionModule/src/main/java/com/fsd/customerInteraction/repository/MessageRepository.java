package com.fsd.customerInteraction.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.fsd.customerInteraction.resource.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
