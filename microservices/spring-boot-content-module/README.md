# scs-received-content-api

This a sample spring boot project that can be used as a template to build REST APIs.

### Configuration Enabled:

1. JPA Repository - out of the box CRUD operations
2. Spring Boot profiles to dynamically load the proper .properites or .yml files based on active profile
    * @Value
    * @ConfigurationProperties
3. Global Exception handler using an Exception Handler
4. SLF4J with Logback
5. Swagger Configuration enabled
6. HAL - Browsing Spring Data REST repositories in your browser
7. Enabling H2 in-memory DB console
8. Cobertura report
9. Unit Test with org.springframework.test.web.servlet.MockMvc
10. Lombok - Java annotation library which helps to reduce boilerplate code and code faster

### Installing and Running

* IntelliJ
* Maven
* Run as executable jar from command prompt:
    * mvn package
    * java -jar target/scs-received-content-api-0.0.1-SNAPSHOT.jar

### Run

* Swagger UI: http://localhost:8080/swagger-ui.html
* H2 Console: http://localhost:8080/console
* HAL Browser: http://localhost:8080

### Inspiration

* Learning and sampling!!!

### References

 * [Spring Boot](http://projects.spring.io/spring-boot/#quick-start) 

<img src="http://coderscampus.com/wp-content/uploads/2016/06/spring-boot-project-logo.png" width=100x />
 
 

