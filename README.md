# address-cloud-service

#### how to run multiple instances to test load balancer of this service clients
- Go to run configuration.
- specify --server.port=8085 in program arguments, and make this for as much instances as you need

#### dependencies needed
- spring-cloud-starter-netflix-eureka-client
- **in propeties:** *eureka.client.service-url.defaultZone=http://localhost:8761/eureka and spring.application.name=address-service*

