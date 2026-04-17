# ShopFusion Backend

Spring Boot REST API for ShopFusion. Handles authentication, catalog, cart, checkout, orders, returns, support, and admin operations.

## Tech Stack
- Spring Boot 3.4 (Java 17)
- Spring Data JPA
- JWT (jjwt)
- BCrypt
- Razorpay Java SDK
- MySQL

## Running Locally
1. Configure database and secrets in `src/main/resources/application.properties`.
2. Start the API:
```bash
./mvnw spring-boot:run
```

API runs at `http://localhost:9090`.

## Key Modules
- `controller/` Customer APIs
- `admin/controller/` Admin APIs
- `service/` Business logic
- `repository/` JPA repositories
- `entity/` JPA entities and enums
- `filter/` AuthenticationFilter
- `config/` CORS and admin bootstrap config

## Database Scripts
Located in `src/main/resources/db`:
- `shopfusion_schema.sql`
- `shopfusion_seed.sql`
- `shopfusion_full_setup.sql`
- `shopfusion_settings_migration.sql`
- `shopfusion_migration_20260310.sql`

## Docker
A Dockerfile is included at `Dockerfile` for container deployment.
