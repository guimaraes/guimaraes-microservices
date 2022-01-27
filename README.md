# guimaraes-microservices
Microsserviços com Feign Spring Cloud Netflix Eureka API Gateway Circuit Breaker Resilience4j Config Server LoadBalancer

## config-server
*SERVER PORT: 8888*

- JAVA 16
- Spring Framework 2.5.9
- Actuator
- Spring Boot
- Spring Cloud
- Rest

Adicionar anotação _@EnableConfigServer_ na ```Aplication``` do projeto.

```

package br.com.guimaraes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
```
```ConfigServerApplication``` classe principal do projeto.


**Project structure**

```
main
|
|____java
|       |
|       |____ConfigServerApplication.java
|
|____resources
        |
        |____application.yml
``` 

## greeting-service
*SERVER PORT: 9100*

- JAVA 16
- Spring Framework 2.5.0-M3
- Actuator
- Spring Boot
- Spring Cloud
- Rest

**Project structure**

```
main
|
|____java
|       |
|       |____configuration
|       |        |
|       |        |_____GreetingConfiguration.java
|       | 
|       |____controllers
|       |        |
|       |        |_____GreetingController.java
|       |
|       |____model
|       |        |
|       |        |_____Greeting.java
|       |
|       |____GreetingServiceApplication.java
|
|____resources
        |
        |____application.yml
``` 

## cambio-service
*SERVER PORT: 9200*

- JAVA 16
- Spring Framework 2.5.0-M3
- Actuator
- Spring Boot
- Spring Cloud
- Rest



**Project structure**

```
main
|
|____java
|       |
|       |____ConfigServerApplication.java
|
|____resources
        |
        |____application.yml
``` 






