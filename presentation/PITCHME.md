 ## Getting started with Spring & Kotlin

 <img src="https://spring.io/img/spring-by-pivotal-9066b55828deb3c10e27e609af322c40.png" width="300"   style="border: 0; background: none;" />
 <img src="https://d21ii91i3y6o6h.cloudfront.net/gallery_images/from_proof/14939/small/1472226645/kotlin-logo.png" width="100"  style="border: 0; margin=left: 30px; background: none;"/>

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
 - _framework that glue things together_
 
---
 
### Spring Boot

##### The primary goals of Spring Boot are:

* <span style="font-size: 18px; color: orange;">To provide a radically faster and widely accessible ‘getting started’ experience for all Spring development</span>
* <span style="font-size: 18px; color: orange;">To be opinionated out of the box, but get out of the way quickly as requirements start to diverge from the defaults</span>
* <span style="font-size: 18px; color: orange;">To provide a range of non-functional features that are common to large classes of projects (e.g. embedded servers, security, metrics, health checks, externalized configuration)
</span>

---

### Starting new project
![Online tool](https://start.spring.io)
![TestImg](assets/springlogo.png)

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