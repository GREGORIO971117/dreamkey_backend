-- Datos para la tabla Membresias
USE db_dreamkey;

SELECT afiliados;
SELECT * FROM suscripcion;

-- Datos para la tabla Suscripcion
INSERT INTO DB_DreamKey.Suscripcion (idSuscripcion, fechaSuscripcion, fechaPagoSuscripcion, activaSuscripcion, Membresias_idMembresias) VALUES
(1, '2025-05-01', '2025-05-31', 1, 2),
(2, '2025-05-05', '2025-06-05', 1, 1),
(3, '2025-04-15', '2025-05-15', 1, 3),
(4, '2025-05-10', '2025-06-10', 1, 4),
(5, '2025-04-20', '2025-05-20', 0, 2),
(6, '2025-05-16', '2025-06-16', 1, 5);
