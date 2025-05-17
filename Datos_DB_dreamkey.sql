USE `DB_DreamKey`;

SELECT*FROM membresias;
SELECT*FROM SUSCRIPCION;
SELECT*FROM COMENTARIO;
SELECT*FROM AFILIADOS;
SELECT*FROM USUARIO;


-- Datos para la tabla Membresias
INSERT INTO `Membresias` ( `nombreMembresia`, `precioMembresia`, `categoriaMembresia`, `urlImagenMembresia`, `descripcionMembresia`) VALUES
( 'Paquete 1', 700, 'Básico', 'un url 1', 'Incluye 5 servicios rosas (básicos) y puedes utilizarlas en las empresas afiliadas en el programa, consulta en la página de afiliados que empresas están disponibles con este nivel.'),
( 'Paquete 2', 1200, 'Básico', 'un url 2', 'Incluye 10 servicios rosas (básicos) y puedes utilizarlas en las empresas afiliadas en el programa, consulta en la página de afiliados que empresas están disponibles con este nivel.'),
( 'Paquete 3', 1200, 'Estándar', 'un url 3', 'Incluye 5 servicios platino (Estándar) y puedes utilizarlas en las empresas afiliadas en el programa, consulta en la página de afiliados que empresas están disponibles con este nivel.'),
( 'Paquete 4', 1800, 'Estándar', 'un url 4', 'Incluye 10 servicios platino (Estándar) y puedes utilizarlas en las empresas afiliadas en el programa, consulta en la página de afiliados que empresas están disponibles con este nivel.'),
( 'Paquete 5', 1800, 'Premium', 'un url 5', 'Incluye 5 servicios oro (Premium) y puedes utilizarlas en las empresas afiliadas en el programa, consulta en la página de afiliados que empresas están disponibles con este nivel.'),
( 'Paquete 6', 3500, 'Premium', 'un url 6', 'Incluye 5 servicios oro (Premium) y puedes utilizarlas en las empresas afiliadas en el programa, consulta en la página de afiliados que empresas están disponibles con este nivel.');

-- Datos para la tabla Suscripcion
INSERT INTO `Suscripcion` ( `fechaSuscripcion`, `fechaPagoSuscripcion`, `activaSuscripcion`, `Membresias_idMembresias`) VALUES
('2025-05-01', '2025-05-31', 1, 2),
('2025-05-05', '2025-06-05', 1, 1),
('2025-04-15', '2025-05-15', 1, 3),
('2025-05-10', '2025-06-10', 1, 4),
('2025-04-20', '2025-05-20', 0, 2);


-- Datos para la tabla Afiliados
INSERT INTO `Afiliados` ( `nombreAfiliados`, `imgAfiliados`, `descripcionAfiliados`, `ratingAfiliados`, `detallesAfiliados`, `serviciosAfiliados1`, `serviciosAfiliados2`, `serviciosAfiliados3`, `imgServiciosAfiliados1`, `imgServiciosAfiliados2`, `imgServiciosAfiliados3`, `Membresias_idMembresias`) VALUES
( 'Atelier Ross Melgar', '../../assets/img-afiliados/Atelier.jpg', 'Spa & salón de belleza', 4.5, 'Es un spa y sos de peluquería y estética. Su ambiente acogedor y profesional garantiza una experiencia inolvidable para cada cliente.', 'SPA', 'Corte', 'Masaje', '../../assets/img-servicios/spa.jpg', '../../assets/img-servicios/corte.jpg', '../../assets/img-servicios/masaje.jpg', 1),
( 'Belleza Eterna', '../../assets/img-afiliados/Eterna.jpg', 'Spa', 3.1, 'Es un spa que se especializa en tratam para consentirte.', 'Barbería', 'Corte', 'Facial', '../../assets/img-servicios/barberia.jpg', '../../assets/img-servicios/corte.jpg', '../../assets/img-servicios/faciales.jpg', 2),
( 'Luz y Brillo', '../../assets/img-afiliados/Luz.jpg', 'Barbería', 5, 'Barbería especializada en cortes de cabe, con un estilo fresco y moderno.', 'SPA', 'Corte', 'Masaje', '../../assets/img-servicios/spa.jpg', '../../assets/img-servicios/corte.jpg', '../../assets/img-servicios/masaje.jpg', 3),
( 'Diva Glam', '../../assets/img-afiliados/Diva.jpg', 'Estudio de uñas', 4.8, 'Es un estudio de uñas que diseña da a cada cliente.', 'Manicure', 'Pedicure', 'Gelish', '../../assets/img-servicios/manicure.jpg', '../../assets/img-servicios/pedicure.jpg', '../../assets/img-servicios/gelish.jpg', 4),
( 'Elegance Studio', '../../assets/img-afiliados/Elegance.jpg', 'Centro de Belleza', 3.7, 'Centro de belleza quentos inolvidables.', 'Corte', 'Masaje', 'Peinados', '../../assets/img-servicios/corte.jpg', '../../assets/img-servicios/masaje.jpg', '../../assets/img-servicios/peinados.jpg', 5);

-- Datos para la tabla Comentario
INSERT INTO `Comentario` (`comentarioComentario`, `Usuario_idUsuario`) VALUES
('Excelente los servicios que ofrecen las empresas afiliadas en DreamKey', 1),
('Todos los servicios a los que ido con mi membresia han sido de excelente calidad', 2),
('Tengo 3 meses usando Dreamkey y no tengo ninguna queja', 3),
('Muy buenos todos los servicios, muy recomendado', 4),
('El paquete uno vale muchusimo la pena por el precio', 5);

INSERT INTO usuario (
    nombrePerfilUsuario, 
    telefonoUsuario, 
    correoUsuario, 
    contraseñaUsuario, 
    fechaPagoSuscripcionUsuario, 
    Suscripcion_idSuscripcion
) VALUES
('Ana Torres', '5512345678', 'ana.torres@example.com', 'Ana2025!', '2025-05-01', 1),
('Luis Pérez', '5598765432', 'luis.perez@example.com', 'Lu!s_123', '2025-04-28', 2),
('María López', '5587654321', 'maria.lopez@example.com', 'Mar1a*Pass', '2025-05-10', 3),
('Carlos Díaz', '5576543210', 'carlos.diaz@example.com', 'C@rlos2025', '2025-05-15', 4),
('Sofía Ramírez', '5565432109', 'sofia.ramirez@example.com', 'S0f1a!Pwd', '2025-05-05', 5);

