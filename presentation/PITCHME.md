 ## Getting started with Spring & Kotlin

![SpringLogo](presentation/assets/springlogo.png)
![KotlinLogo](presentation/assets/kotlin-logo.png)

---

### Agenda

1. Spring Framework
2. Spring Boot
3. Starting new project
4. A little about configuration
5. "Hello World" Controller
6. Model and Repository
7. Transactions
8. Exercise

---
### Spring Framework
  _framework that glue things together_

![SpringEco](presentation/assets/springframework.jpeg)
 
---
 
### Spring Boot

##### The primary goals of Spring Boot are:

* To provide a radically faster and widely accessible ‘getting started’ experience for all Spring development
* To provide a range of non-functional features that are common to large classes of projects (e.g. embedded servers, security, metrics, health checks, externalized configuration)


---

### Starting new project
![NewProjectLogo](presentation/assets/newproject.jpg)

<b>start.spring.io</b>

+++

```groovy
dependencies {
	compile('org.springframework.boot:spring-boot-starter-data-jpa')
	compile 'mysql:mysql-connector-java'
	compile("org.springframework.boot:spring-boot-starter-web")
	compile("org.jetbrains.kotlin:kotlin-stdlib-jre8:${kotlinVersion}")
	compile("org.jetbrains.kotlin:kotlin-reflect:${kotlinVersion}")
	compile("com.fasterxml.jackson.module:jackson-module-kotlin")
	testCompile('org.springframework.boot:spring-boot-starter-test')
}
```
@[2]
@[3]
@[4]
@[5]
@[6]
@[7]
@[8]

+++
## Configuration files
.property / .yaml

```yaml
spring.datasource.driverClassName=om.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost/test
```

```yaml
spring:
    datasource:
      driverClassName: om.mysql.jdbc.Driver
      url: jdbc:mysql://localhost/test
```

---
```kotlin
@SpringBootApplication
class SpringBasicsApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBasicsApplication::class.java, *args)
}
```
@[1](Something something)
@[2-4]
@[5]

#HSLIDE

![Flux Explained](https://facebook.github.io/flux/img/flux-simple-f8-diagram-explained-1300w.png)