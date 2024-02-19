package com.fsd.customerInteraction.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fsd.customerInteraction.resource.QaEntry;
import com.fsd.customerInteraction.service.QaService;

@RestController
@RequestMapping("/api/qa")
public class QaController {

    @Autowired
    private QaService qaService;

    @PostMapping
    public QaEntry addQaEntry(@RequestBody QaEntry qaEntry) {
        return qaService.addQaEntry(qaEntry);
    }

    @GetMapping("/{question}")
    public QaEntry getQaEntry(@PathVariable String question) {
        return qaService.getQaEntry(question);
    }
}
