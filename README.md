# 🛡️ AI-Powered Intrusion Detection System

## 📌 Overview
This project is an **AI-driven Intrusion Detection System (IDS)** that analyzes network traffic and system logs to detect **suspicious activities and cyber threats** using **Spring Boot, Python (ML), and PostgreSQL**.

## 🚀 Features
- ✅ **Real-Time Threat Detection** – Analyzes logs and detects security anomalies.
- ✅ **AI-Powered Threat Scoring** – Uses **Random Forest ML model** to classify threats.
- ✅ **SIEM Integration** – Logs security alerts into **PostgreSQL/Elasticsearch**.
- ✅ **Role-Based Access Control (RBAC)** – Secure authentication for security analysts.
- ✅ **Docker Support** – Easily deploy using Docker Compose.

## 🏗️ Tech Stack
- **Backend:** Java (Spring Boot)  
- **Machine Learning:** Python (Scikit-learn, Pandas)  
- **Database:** PostgreSQL  
- **Containerization:** Docker & Docker Compose  
- **API Security:** JWT Authentication (Future Update)  

## 📂 Project Structure
```
├── backend/
│   ├── src/main/java/com/cybersec/
│   │   ├── Application.java
│   │   ├── controller/IntrusionController.java
│   │   ├── service/IntrusionDetectionService.java
│   │   ├── service/ThreatAnalysisService.java
│   │   ├── model/SecurityLog.java
│   │   ├── config/SecurityConfig.java
│   ├── resources/application.properties
├── database/
│   ├── schema.sql
├── ai_model/
│   ├── intrusion_detection.py
├── docker-compose.yml
├── README.md
```

## 🛠️ Setup & Installation
### **1️⃣ Clone the Repository**
```bash
git clone https://github.com/YOUR_GITHUB_USERNAME/AI-Powered-Intrusion-Detection-System.git
cd AI-Powered-Intrusion-Detection-System
```

### **2️⃣ Run the Backend (Spring Boot)**
```bash
cd backend
./mvnw spring-boot:run
```

### **3️⃣ Run the Machine Learning Model Training (Optional)**
```bash
cd ai_model
python intrusion_detection.py
```

### **4️⃣ Run Everything Using Docker (Recommended)**
```bash
docker-compose up --build
```

## 📡 API Endpoints (Spring Boot)
| Method | Endpoint                  | Description                     |
|--------|---------------------------|---------------------------------|
| POST   | `/api/security/analyze`   | Analyzes a security log for threats |

### **Example API Request**
```json
POST /api/security/analyze
{
  "timestamp": "2025-02-24T18:00:00Z",
  "sourceIP": "192.168.1.100",
  "destinationIP": "10.0.0.1",
  "severity": "High",
  "logMessage": "Multiple failed login attempts detected."
}
```
#### **Example API Response**
```json
{
  "message": "Threat Detected! Immediate Action Required!"
}
```

## 📝 Future Enhancements
- 🔒 **JWT Authentication** for API security  
- 📊 **Security Dashboard for real-time monitoring**  
- 🤖 **Better AI Model with Deep Learning (LSTMs, Transformer Models)**  

---
🚀 **Like this project? Star it on GitHub!** ⭐  
