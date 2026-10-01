# Contador Web

Aplicación web de un contador desarrollada con Java y Spring Boot.

El proyecto implementa una API REST, persistencia de datos con MySQL y una interfaz web desarrollada con HTML, CSS y JavaScript.

## Tecnologías

- Java 26
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL 8
- HTML
- CSS
- JavaScript
- Docker
- Docker Compose
- Maven

## Arquitectura

El backend utiliza una arquitectura por capas:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
MySQL

```
## Controller

Recibe las peticiones HTTP y las deriva al Service.

## Service

Contiene la lógica del contador.

## Repository

Utiliza Spring Data JPA para acceder a la base de datos.

## Entity

La clase Contador representa los datos almacenados en MySQL.

## Funcionalidades
Consultar el valor actual del contador.
Incrementar el contador en 1.
Reiniciar el contador a 0.
Guardar el valor del contador en MySQL.
Interfaz web para interactuar con el contador.
##  API REST
Obtener contador
```text
GET /api/contador
```
Incrementar contador
```text
POST /api/contador/incrementar
```
Reiniciar contador
```text
POST /api/contador/reiniciar
```


## Como ejecutar el proyecto
La forma recomendada de ejecutar el proyecto es utilizando Docker Compose.

Requisitos

Tener instalado:
```text
Git
Docker 
Desktop
```
No es necesario instalar Java, Maven ni MySQL manualmente.

Clonar el repositorio
```text
git clone https://github.com/jaros87975/contador-spring-boot.git
```
Entrar en la carpeta:
```text
cd contador-spring-boot
```
Iniciar la aplicación
```text
docker compose up --build
```
La primera ejecución puede tardar unos minutos porque Docker debe descargar las imágenes y construir la aplicación.

Una vez iniciada, abrir en el buscador web:
```text
http://localhost:8080
```

Para detener la aplicación

Presionar en powershell:

Ctrl + C


También se puede detener desde otra terminal con:
```text
docker compose down
```


Estructura del proyecto
```text
contador-spring-boot/
│
├── Dockerfile
├── docker-compose.yml
├── pom.xml
├── mvnw
├── mvnw.cmd
├── .gitignore
├── README.md
│
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/ejemplo/contador/
    │   │       ├── controller/
    │   │       ├── model/
    │   │       ├── repository/
    │   │       └── service/
    │   │
    │   └── resources/
    │       ├── application.properties
    │       └── static/
    │           ├── index.html
    │           ├── script.js
    │           └── style.css
    │
    └── test/
        └── java/

```

## Autor
Tomas Jarolaski