# Hystrix-BaseCommands

## Purpose
Base command classes for HTTP, REST, and SOAP operations wrapped in Netflix Hystrix circuit-breaker patterns. Provides reusable, resilient HTTP command abstractions that can be extended for specific API integrations.

## Tech Stack
- Language: Java 8+
- Framework: Netflix Hystrix
- Build: Maven
- Key dependencies: Hystrix, Apache HttpClient, SLF4J

## Architecture
Library providing abstract base classes (`BaseHttpGetHystrixCommand`, `BaseHttpPostHystrixCommand`, etc.) that wrap HTTP operations in Hystrix commands with circuit-breaker, timeout, and fallback support. Consumers extend these base classes and implement target-specific logic (path, headers, authentication).

## Key Entry Points
- `BaseHttpGetHystrixCommand` - GET request base command
- `BaseHttpPostHystrixCommand` - POST request base command
- `pom.xml` - Maven coordinates: `no.cantara.base:Hystrix-BaseCommands`

## Development
```bash
# Build
mvn clean install

# Test
mvn test
```

## Domain Context
Resilience infrastructure library. Provides circuit-breaker-wrapped HTTP commands used across the Cantara ecosystem (Whydah SDKs, load testing, service communication) to ensure fault tolerance in distributed systems.
