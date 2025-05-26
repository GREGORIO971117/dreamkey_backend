# Desarrollo Backend de la Ecommerce Dreamkey


## Base de datos con MySQL
Este repositorio contiene el modelo relacional de la base de datos para DreamKey, una plataforma de suscripción que conecta usuarios con afiliados que ofrecen distintos servicios. El sistema está diseñado para gestionar usuarios, comentarios, suscripciones, membresías y afiliados de manera eficiente.

### Entidades Principales

* **Usuario**: Contiene los datos del perfil de usuario, incluyendo correo, teléfono, contraseña, y su relación con una suscripción activa.
* **Suscripción**: Representa el vínculo entre un usuario y una membresía, con detalles como fecha de inicio, fecha de pago y estado.
* **Membresías**: Define distintos niveles de membresía con nombre, precio, categoría, imagen y descripción. Afecta tanto a usuarios como a los afiliados visibles.
* **Afiliados**: Información de los proveedores de servicios, incluyendo descripción, imagen, rating, y los servicios que ofrecen según su tipo de membresía.
* **Comentario**: Registra los comentarios que los usuarios pueden dejar, relacionados directamente con su perfil.

### Relaciones 
* Cada **Usuario** tiene una **Suscripción**.
* Cada **Suscripción** está vinculada a una **Membresía**.
* Cada **Afiliado** pertenece a una **Membresía**, que determina su visibilidad y servicios ofrecidos.
* Cada **Comentario** pertenece a un **Usuario**.

### Tecnologías utilizadas
* Diseño de base de datos relacional.
* MySQL y MySQL Workbench

![Modelo entidad relación](https://raw.githubusercontent.com/GREGORIO971117/dreamkey_backend/refs/heads/develop/BD_model_image_dreamkey.png)


