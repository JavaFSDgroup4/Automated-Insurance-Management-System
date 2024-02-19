package com.fsd.customerInteraction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsd.customerInteraction.resource.QaEntry;

public interface QaEntryRepository extends JpaRepository<QaEntry, Long> {

	QaEntry findByQuestion(String question);
}

