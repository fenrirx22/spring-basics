 ## Getting started with Spring & Kotlin
 
 ![SpringLogo](assets/springlogo.png)
 
 ![Kotlin](.assets/kotlin-logo.png)
 
 ![CHUJ](/assets/kotlin-logo.png)
 
 <img src="/assets/springlogo.png" width="100" height="100" />
 <img src="assets/kotlin-logo.png" width="100" style="border: 0;" />
 <img src="https://spring.io/img/spring-by-pivotal-9066b55828deb3c10e27e609af322c40.png" width="100" />

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
 - framework that glue things together
 
---
 
### Spring Boot

##### The primary goals of Spring Boot are:

* <span style="font-size: larger">To provide a radically faster and widely accessible ‘getting started’ experience for all Spring development</span>
* <span style="font-size: larger;">To be opinionated out of the box, but get out of the way quickly as requirements start to diverge from the defaults</span>
* <span style="font-size: larger">To provide a range of non-functional features that are common to large classes of projects (e.g. embedded servers, security, metrics, health checks, externalized configuration)
</span>

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