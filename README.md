# api-gateway

## Descripcion
Gateway de entrada para enrutar solicitudes a los microservicios y aplicar fallback/circuit breaker.

Diagrama de microservicos completo

<img width="670" height="450" alt="image" src="https://github.com/user-attachments/assets/e4505c9e-768d-4937-ab64-778c4b129cb2" />

## Server Port
  server.port=8090
## Endpoints
- Rutas proxy:
  - `/api/v1/accounts/**`
  - `/api/v1/credits/**`
  - `/api/v1/transactions/**`
  - `/api/v1/customers/**`
  - `/api/v1/yanki/**`
  - `/api/v1/debit-cards/**`
  - `/api/v1/reports/**`
- Fallbacks:
  - `/fallback/accounts`
  - `/fallback/credits`
  - `/fallback/transactions`
  - `/fallback/customers`
  - `/fallback/yanki`
  - `/fallback/debit-cards`

## Proyectos relacionados
- https://github.com/vjoyaroj/bank-config-repo
- https://github.com/vjoyaroj/microservices-config
- https://github.com/vjoyaroj/eureka-server
- https://github.com/vjoyaroj/yanki-service
- https://github.com/vjoyaroj/api-gateway
- https://github.com/vjoyaroj/transactions-service
- https://github.com/vjoyaroj/debit-cards-service
- https://github.com/vjoyaroj/customer-service
- https://github.com/vjoyaroj/credits-service
- https://github.com/vjoyaroj/accounts-service
