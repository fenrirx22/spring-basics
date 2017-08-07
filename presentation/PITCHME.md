 ## Getting started with Spring & Kotlin

![SpringLogo](presentation/assets/springlogo.png)
![KotlinLogo](presentation/assets/kotlin-logo.png)

---

### Agenda

1. Spring Framework
2. Spring Boot
3. Starting new project
4. Configuration
5. "Hello World" Controller
6. Model and Repository
7. Transactions
8. Exercise

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

+++
## Configuration
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
@[1]
@[2-5]

#HSLIDE
### Controller
```kotlin
@RestController
@RequestMapping("user")
internal class UserController @Autowired constructor(val userService: UserService) {

    @GetMapping(produces = arrayOf("application/json"))
        fun getUser(@PathParam("name") name: String): ResponseEntity<UserDto> {
        return ResponseEntity(userService.getUserByName(name), HttpStatus.OK)
    }
}
```
@[1]
@[2]
@[3]
@[5]
@[6-7]

#VSLIDE

### Service

```kotlin
@Service
class UserService @Autowired constructor(val userRepository: UserRepository, val objectMapper: ObjectMapper) {

    fun getUserByName(name: String): UserDto {
        val user = userRepository.findFirstByName(name) ?: throw UserNotFoundException()
        return objectMapper.convertValue(user, UserDto::class.java)
    }
}
```
@[1]
@[2]
@[4-7]

#VSLIDE

### Repository

```kotlin
@Repository
interface UserRepository : JpaRepository<User, Long> {

    fun findFirstByName(name: String): User?

    @Query("select u from User u where u.name = :name")
    fun findAllUsersWithName(@Param("name") name: String): List<User>
}
```

@[1]
@[2]
@[4]
@[6-7]
@[6]

#VSLIDE

### Model
