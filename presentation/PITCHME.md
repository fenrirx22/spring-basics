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
 - _framework that glue things together_
 ![SpringEco](presentation/assets/springecosystem.jpg)
 
---
 
### Spring Boot

##### The primary goals of Spring Boot are:

* <span style="font-size: large; color: orange;">To provide a radically faster and widely accessible ‘getting started’ experience for all Spring development</span>
* <span style="font-size: large; color: orange;">To provide a range of non-functional features that are common to large classes of projects (e.g. embedded servers, security, metrics, health checks, externalized configuration)
</span>

---

### Starting new project

---?image=presentation/assets/springstart.png&size=contain

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