package com.cybersec.controller;

import org.springframework.web.bind.annotation.*;
import com.cybersec.service.IntrusionDetectionService;
import com.cybersec.model.SecurityLog;

@RestController
@RequestMapping("/api/security")
public class IntrusionController {

    private final IntrusionDetectionService intrusionDetectionService;

    public IntrusionController(IntrusionDetectionService intrusionDetectionService) {
        this.intrusionDetectionService = intrusionDetectionService;
    }

    @PostMapping("/analyze")
    public String analyzeLog(@RequestBody SecurityLog log) {
        return intrusionDetectionService.detectThreat(log);
    }
}