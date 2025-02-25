package com.cybersec.service;

import org.springframework.stereotype.Service;
import com.cybersec.model.SecurityLog;

@Service
public class ThreatAnalysisService {

    public String analyzeLog(SecurityLog log) {
        // Simulated AI Intrusion Detection Logic (Replace with real AI model call)
        if (log.getSeverity().equals("High")) {
            return "Threat Detected! Immediate Action Required!";
        }
        return "No Threat Detected.";
    }
}