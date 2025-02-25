CREATE TABLE security_logs (
    id SERIAL PRIMARY KEY,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    source_ip VARCHAR(50) NOT NULL,
    destination_ip VARCHAR(50) NOT NULL,
    severity VARCHAR(10) NOT NULL,
    log_message TEXT NOT NULL
);