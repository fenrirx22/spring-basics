 ## Getting started with Spring & Kotlin

![SpringLogo](presentation/assets/springlogo.png)
![KotlinLogo](presentation/assets/kotlin-logo.png)

---?image=presentation/assets/springframework.jpeg&size=contain
 
---
 
### Spring Boot

##### The primary goals of Spring Boot are:

* To provide a radically faster and widely accessible ‘getting started’ experience for all Spring development
* To provide a range of non-functional features that are common to large classes of projects (e.g. embedded servers, security, metrics, health checks, externalized configuration)


---

### Spring = MVC
![MVCImage](presentation/assets/mvc.png)

---
### Starting new project
![NewProjectLogo](presentation/assets/runner.png)

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

---
### Thanks for listening!
![NewProjectLogo](presentation/assets/computer.png)

