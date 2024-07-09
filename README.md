# 👉 Requisitos Importantes para ejecutar Backend

> [!IMPORTANT]
> Descarga la **base de datos de futbolistas** desde el siguiente enlace:
> [BD_Futbolistas.sql](https://drive.google.com/file/d/10H-r0XSiVKis5yjvCRIDbEO9M2keY-D3/view?unzip=true)

> [!IMPORTANT]
> **Credenciales de autenticación:**
> - Usuario: luis
> - Contraseña: luis2023

---

# 👉 Descripción de la Solución

La API backend para el sistema de gestión de futbolistas tiene las siguientes características:

### Endpoints

1. **GET: /futbolistas**
   - Recupera la lista de todos los futbolistas.

2. **GET: /futbolistas/{id}**
   - Recupera la información de un futbolista por su ID.

### Funcionalidades Clave

- La API está desarrollada utilizando **Java 17** y **Spring Boot 3.2.5**.
- Utiliza el sistema de gestión de base de datos relacional **MySQL**.
- Se implementaron 2 tablas principales para la solución: Posición y Futbolista.

### Funcionalidades Agregadas

- Se implementó paginación para la lista de futbolistas.
