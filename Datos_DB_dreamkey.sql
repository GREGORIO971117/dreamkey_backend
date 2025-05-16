-- Datos para la tabla Membresias
USE db_dreamkey;
SELECT * FROM suscripcion;
-- Datsuscripcionos para la tabla Suscripcion
INSERT INTO DB_DreamKey.Suscripcion (idSuscripcion, fechaSuscripcion, fechaPagoSuscripcion, activaSuscripcion, Membresias_idMembresias) VALUES
(1, '2025-05-01', '2025-05-31', 1, 2),
(2, '2025-05-05', '2025-06-05', 1, 1),
(3, '2025-04-15', '2025-05-15', 1, 3),
(4, '2025-05-10', '2025-06-10', 1, 4),
(5, '2025-04-20', '2025-05-20', 0, 2);

-- Datos para la tabla membresias
INSERT INTO DB_DreamKey.membresias (idMembresias, nombreMembresia, precioMembresia, categoriaMembresia, urlImagenMembresia,descripcionMembresia) VALUES
(1, 'Paquete 1', 700,'Básico','un url 1','Incluye 5 servicios rosas (básicos) y puedes utilizarlas en las empresas afiliadas en el programa, consulta en la página de afiliados que empresas están disponibles con este nivel.'),
(2, 'Paquete 2', 1200,'Básico','un url 2','Incluye 10 servicios rosas (básicos) y puedes utilizarlas en las empresas afiliadas en el programa, consulta en la página de afiliados que empresas están disponibles con este nivel.'),
(3, 'Paquete 3', 1200,'Estándar','un url 3', 'Incluye 5 servicios platino (Estándar) y puedes utilizarlas en las empresas afiliadas en el programa, consulta en la página de afiliados que empresas están disponibles con este nivel.'),
(4, 'Paquete 4', 1800,'Estándar','un url 4', 'Incluye 10 servicios platino (Estándar) y puedes utilizarlas en las empresas afiliadas en el programa, consulta en la página de afiliados que empresas están disponibles con este nivel.'),
(5, 'Paquete 5', 1800,'Premium','un url 5', 'Incluye 5 servicios oro (Premium) y puedes utilizarlas en las empresas afiliadas en el programa, consulta en la página de afiliados que empresas están disponibles con este nivel.'),
(6, 'Paquete 6', 3500,'Premium','un url 6', 'Incluye 5 servicios oro (Premium) y puedes utilizarlas en las empresas afiliadas en el programa, consulta en la página de afiliados que empresas están disponibles con este nivel.');