package com.cybersec.model;

import jakarta.persistence.*;

@Entity
public class SecurityLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String timestamp;
    private String sourceIP;
    private String destinationIP;
    private String severity;
    private String logMessage;

    // Getters and Setters
}