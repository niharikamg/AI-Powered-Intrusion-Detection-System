package com.cybersec.service;

import org.springframework.stereotype.Service;
import com.cybersec.model.SecurityLog;
import com.cybersec.service.ThreatAnalysisService;

@Service
public class IntrusionDetectionService {

    private final ThreatAnalysisService threatAnalysisService;

    public IntrusionDetectionService(ThreatAnalysisService threatAnalysisService) {
        this.threatAnalysisService = threatAnalysisService;
    }

    public String detectThreat(SecurityLog log) {
        return threatAnalysisService.analyzeLog(log);
    }
}