package com.fsd.customerInteraction.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.customerInteraction.repository.QaEntryRepository;
import com.fsd.customerInteraction.resource.QaEntry;

@Service
public class QaService {

    @Autowired
    private QaEntryRepository qaEntryRepository;

    public QaEntry addQaEntry(QaEntry qaEntry) {
        return qaEntryRepository.save(qaEntry);
    }

    public QaEntry getQaEntry(String question) {
        return qaEntryRepository.findByQuestion(question);
    }
}
