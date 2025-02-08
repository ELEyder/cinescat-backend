# Cinescat API

Cinescat API es una API RESTful desarrollada en Java utilizando el framework Spring Boot. Su propósito es gestionar de forma eficiente las operaciones de un cine, incluyendo la administración de películas, funciones, ventas de boletos, facturación y devoluciones.

## Características principales

- **Gestión de películas:** CRUD para administrar la cartelera.
- **Programación de funciones:** Control de horarios y salas.
- **Ventas de boletos:** Registro de ventas de boletas y facturas.
- **Módulo de devoluciones:** Gestión de reembolsos y generación de nuevas ventas.
- **Facturación electrónica:** Soporte para la emisión de comprobantes de pago.

## Tecnologías utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL/PostgreSQL** (a través de **XAMPP** si se utiliza MySQL)
- **Maven**

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/cinescat-api.git
   ```
2. Inicia XAMPP y asegúrate de que el servidor MySQL esté en ejecución.
3. Crea la base de datos en tu gestor de base de datos (MySQL/PostgreSQL):
   ```sql
   CREATE DATABASE cinescat;
   ```
4. Configura el archivo `application.properties` con tus credenciales de base de datos.
5. Ejecuta la aplicación con el siguiente comando:
   ```bash
   ./run.ps1
   ```

## Contribución

Las contribuciones son bienvenidas. Abre un *issue* o envía un *pull request* para sugerir mejoras.

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.

