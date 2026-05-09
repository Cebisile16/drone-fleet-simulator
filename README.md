# drone-fleet-simulator
Drone Fleet Simulator is a cloud-native drone simulation project built to showcase backend engineering and DevOps skills using Java, Docker, CI/CD, and Azure.

**Drone Fleet Simulator** 🚁

A cloud-native drone simulation platform built to demonstrate backend engineering and DevOps skills.

The project simulates multiple drones navigating inside a virtual city grid while performing missions such as movement, scanning, delivery, and obstacle avoidance.

**This project is designed as a portfolio piece to showcase:**

Object-Oriented Programming
REST APIs
Automated Testing
Docker & Containers
CI/CD Pipelines
Cloud Deployment
Monitoring & Observability
Infrastructure Thinking

**Features**
Core Drone Features
Drone movement system
Direction & rotation handling
Obstacle detection
Collision prevention
Battery/energy management
Delivery mission simulation
Multi-drone support

Architecture
Services
Drone Service

**Handles:**

movement
battery
positioning
drone status
World Service

**Handles:**

world boundaries
obstacles
collision detection
Mission Service

**Handles:**

delivery missions
package tracking
mission completion
Command API

Receives commands from users or clients.

**Tech Stack**
Backend
Java
Spring Boot
Database
PostgreSQL
Testing
JUnit
DevOps
Docker
Docker Compose
GitHub Actions / GitLab CI
Cloud
Microsoft Azure

**Project Structure**
drone-fleet-simulator/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   │
│   └── test/
│
├── docker/
├── .github/workflows/
├── docker-compose.yml
├── Dockerfile
├── pom.xml
└── README.md



👨‍💻 **Author**

Built as part of a 6-month roadmap toward becoming a job-ready DevOps Engineer.

📄 **License**

This project is licensed under the MIT Licence

