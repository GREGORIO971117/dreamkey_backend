SELECT * FROM membresias;

INSERT INTO `afiliados` ( `nombreAfiliados`, `imgAfiliados`, `descripcionAfiliados`, `ratingAfiliados`, `detallesAfiliados`, `serviciosAfiliados1`, `serviciosAfiliados2`, `serviciosAfiliados3`, `imgAfiliados1`, `imgAfiliados2`, `imgAfiliados3`) VALUES
( 'Atelier Ross Melgar', '../../assets/img-afiliados/Atelier.jpg', 'Spa & salón de belleza', 6.8, 'Es un spa y sos de peluquería y estética. Su ambiente acogedor y profesional garantiza una experiencia inolvidable para cada cliente.', 'SPA', 'Corte', 'Masaje', '../../assets/img-servicios/spa.jpg', '../../assets/img-servicios/corte.jpg', '../../assets/img-servicios/masaje.jpg');

INSERT INTO `membresias` (nombreMembresias, precioMembresia, categoriaMembresia, urlImagenMembresia,descripcionMembresia) VALUES
('Paquete 68', 700,'Básico','un url 1','Incluye 5 servicios rosas (básicos) y puedes utilizarlas en las empresas afiliadas en el programa, consulta en la página de afiliados que empresas están disponibles con este nivel.');