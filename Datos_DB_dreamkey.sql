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

-- Datos para la tabla Afiliados 
INSERT INTO DB_DreamKey.afiliados (
    idAfiliados, nombreAfiliados, imgAfiliados, descripcionAfiliados,
    ratingAfiliados, detallesAfiliados,
    serviciosAfiliados1, serviciosAfiliados2, serviciosAfiliados3,
    imgServiciosAfiliados1, imgServiciosAfiliados2, imgServiciosAfiliados3, Membresias_idMembresias
) VALUES
(1, 'Atelier Ross Melgar', '../../assets/img-afiliados/Atelier.jpg', 'Spa & salón de belleza', 4.5, 
 'Es un spa y salón de belleza que ofrece una experiencia única de relajación y cuidado personal. Con un equipo altamente capacitado brindando y cuidando siempre la calidad de sus servicios. Ofrecen una amplia gama de tratamientos faciales y corporales, así como servicios de peluquería y estética. Su ambiente acogedor y profesional garantiza una experiencia inolvidable para cada cliente.',
 'SPA', 'Corte', 'Masaje',
 '../../assets/img-servicios/spa.jpg', '../../assets/img-servicios/corte.jpg', '../../assets/img-servicios/masaje.jpg', null),

(2, 'Belleza Eterna', '../../assets/img-afiliados/Eterna.jpg', 'Spa', 3.1,
 'Es un spa que se especializa en tratamientos de belleza y bienestar. Ofrecen servicios con una calidad excepcional y un enfoque personalizado para cada cliente. Además de contar con productos de alta gamma y personal altamente capacitado para consentirte.',
 'Barbería', 'Corte', 'Facial',
 '../../assets/img-servicios/barberia.jpg', '../../assets/img-servicios/corte.jpg','../../assets/img-servicios/faciales.jpg', null),

(3, 'Luz y Brillo', '../../assets/img-afiliados/Luz.jpg', 'Barbería', 5,
 'Barbería especializada en cortes de cabello y afeitados. Ofrecen una experiencia única de relajación y servicio personalizado. Cuentan con certificaciones y un equipo que buscara siempre la calidad en sus servicios, con un estilo fresco y moderno.',
 'SPA', 'Corte', 'Masaje',
 '../../assets/img-servicios/spa.jpg', '../../assets/img-servicios/corte.jpg', '../../assets/img-servicios/masaje.jpg', null),

(4, 'Diva Glam', '../../assets/img-afiliados/Diva.jpg', 'Estudio de uñas', 4.8,
 'Es un estudio de uñas que diseña y crea uñas acrílicas, gelish y decoradas. Ofrecen una amplia gama de servicios de manicura y pedicura, con un enfoque en la calidad y la atención al detalle. Su equipo de profesionales está altamente capacitado para brindar una experiencia única y personalizada a cada cliente.',
 'Manicure', 'Pedicure', 'Gelish',
 '../../assets/img-servicios/manicure.jpg', '../../assets/img-servicios/pedicure.jpg', '../../assets/img-servicios/gelish.jpg', null),

(5, 'Elegance Studio', '../../assets/img-afiliados/Elegance.jpg', 'Centro de Belleza', 3.7,
 'Centro de belleza que ofrece una amplia gama de servicios para toda la familia, con un ambiente acogedor y profesional Elegance Studio busca brindar una experiencia para incluir a toda la familia y que puedan disfrutar y consentirse en familia, dando momentos inolvidables.',
 'Corte', 'Masaje', 'Peinados',
 '../../assets/img-servicios/corte.jpg', '../../assets/img-servicios/masaje.jpg', '../../assets/img-servicios/peinados.jpg', null);
 
-- Datos para la tabla Comentario
INSERT INTO Comentario (comentarioComentario) VALUES 
(NULL,"Excelente los servicios que ofrecen las empresas afiliadas en DreamKey", NULL),
(NULL,"Todos los servicios a los que ido con mi membresia han sido de excelente calidad",NULL),
(NULL,"Tengo 3 meses usando Dreamkey y no tengo ninguna queja", NULL),
(NULL, "Muy buenos todos los servicios, muy recomendado", NULL),
(NULL,"El paquete uno vale muchusimo la pena por el precio", NULL); 