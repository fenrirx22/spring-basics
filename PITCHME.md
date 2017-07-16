 # Spring & Kotlin

#HSLIDE

### Agenda

![Logo](https://spring.io/img/spring-by-pivotal-9066b55828deb3c10e27e609af322c40.png)

1. Spring boot
2. 
3. adasdasdasd

---

### Spring Boot

##### The primary goals of Spring Boot are:

* To provide a radically faster and widely accessible ‘getting started’ experience for all Spring development
* To be opinionated out of the box, but get out of the way quickly as requirements start to diverge from the defaults
* To provide a range of non-functional features that are common to large classes of projects (e.g. embedded servers, security, metrics, health checks, externalized configuration)


---

@[1](Something something)
@[2-4]
@[5]
```kotlin
@SpringBootApplication
class SpringBasicsApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBasicsApplication::class.java, *args)
}
```

#HSLIDE

![Flux Explained](https://facebook.github.io/flux/img/flux-simple-f8-diagram-explained-1300w.png)