## 🏗️ System Architecture
* Discovery Server (Eureka): Central registry for service instances.
* Order Service: Handles transactions; verifies stock via Inventory Service.
* Inventory Service: Manages real-time SKU availability.
* Product Service: Handles product catalog metadata.

## 🛠 Tech Stack
- **Backend:** Java 17, Spring Boot 3.2.5
- **Microservices:** Spring Cloud Netflix Eureka, Spring Cloud Config
- **Client:** Spring WebFlux (WebClient)
- **Database:** JPA / Hibernate (H2 for testing)
- **Build Tool:** Maven
