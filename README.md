# Kafka Consumer Groups with Spring Boot

## Overview
This project demonstrates how to consume the same Kafka event using different consumer groups in a Spring Boot application. It includes multiple microservices: an Order Service (Producer), a Stock Service (Consumer), and a Payment Service (Consumer). Each service is configured to consume Kafka messages independently.

## Tech Stack
- **Spring Boot** (2.7.5)
- **Apache Kafka**
- **Zookeeper**
- **Docker & Docker Compose**

## Architecture
- **Order Service**: Produces order events to Kafka.
- **Stock Service**: Listens to order events in the `stock-group` consumer group.
- **Payment Service**: Listens to order events in the `payment-group` consumer group.
- **Kafdrop**: Web UI to monitor Kafka topics.

## Setup & Installation

### Step 1: Start Kafka and Zookeeper
Run the following command to start the required services using Docker Compose:
```sh
docker-compose up -d
