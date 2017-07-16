 # Getting started with Spring & Kotlin
 
 <img src="/assets/springlogo.png" width="100" height="100" />
 <img src=".assets/kotlin-logo.png" width="100" />

---

### Agenda


1. Spring boot
2.
3. adasdasdasd

---

### Spring Boot

##### The primary goals of Spring Boot are:

* <span style="font-size: 1em;">To provide a radically faster and widely accessible ‘getting started’ experience for all Spring development</span>
* <span style="font-size: 1em;">To be opinionated out of the box, but get out of the way quickly as requirements start to diverge from the defaults</span>
* <span style="font-size: 1em;">To provide a range of non-functional features that are common to large classes of projects (e.g. embedded servers, security, metrics, health checks, externalized configuration)
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