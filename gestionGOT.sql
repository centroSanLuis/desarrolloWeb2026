USE `gestion`;

-- ---------------------------------------------------------
-- 1. TABLAS INDEPENDIENTES
-- ---------------------------------------------------------

-- Insertar Grandes Casas
-- Enums permitidos: 'ESTE', 'NORTE', 'OESTE', 'SUR'
INSERT INTO `grandes_casas` (`id`, `nombre`, `lema`, `region`) VALUES
(1, 'Casa Stark', 'Se acerca el invierno', 'NORTE'),
(2, 'Casa Lannister', 'Oye mi rugido', 'OESTE'),
(3, 'Casa Arryn', 'Tan alto como el honor', 'ESTE'),
(4, 'Casa Martell', 'Nunca doblegado, nunca roto', 'SUR'),
(5, 'Casa Baratheon', 'Nuestra es la furia', 'SUR');

-- Insertar Fortalezas
INSERT INTO `fortalezas` (`id`, `nombre`, `ubicacion`, `capacidad`) VALUES
(1, 'Invernalia', 'El Norte', 10000),
(2, 'Roca Casterly', 'Tierras del Oeste', 12000),
(3, 'Nido de Águilas', 'Valle de Arryn', 3000),
(4, 'Lanza del Sol', 'Dorne', 5000),
(5, 'Bastión de Tormentas', 'Tierras de la Tormenta', 8000),
(6, 'Fuerte Terror', 'El Norte', 4000);

-- Insertar Maestres
-- Especialidad: 'CUERVOS', 'HISTORIA', 'MEDICINA', 'RUMORES'
-- Tipo Eslabón: 'COBRE', 'HIERRO', 'ORO', 'PLATA'
INSERT INTO `maestres` (`id`, `nombre`, `especialidad`, `tipo_eslabon`, `ano_graduacion`) VALUES
(1, 'Maestre Luwin', 'MEDICINA', 'PLATA', 280),
(2, 'Maestre Aemon', 'CUERVOS', 'HIERRO', 235),
(3, 'Maestre Pycelle', 'HISTORIA', 'ORO', 250),
(4, 'Maestre Wolkan', 'MEDICINA', 'PLATA', 292),
(5, 'Maestre Qyburn', 'RUMORES', 'COBRE', 285);

-- ---------------------------------------------------------
-- 2. TABLAS DEPENDIENTES DE NIVEL 1
-- ---------------------------------------------------------

-- Insertar Casas Vasallas
-- FK: grandes_casas_id -> grandes_casas(id)
INSERT INTO `casas_vasallas` (`id`, `nombre`, `castillo`, `lealtad`, `grandes_casas_id`) VALUES
(1, 'Casa Karstark', 'Bastión Kar', 85, 1),
(2, 'Casa Umber', 'Último Hogar', 90, 1),
(3, 'Casa Bolton', 'Fuerte Terror', 30, 1),
(4, 'Casa Clegane', 'Torreón Clegane', 95, 2),
(5, 'Casa Lefford', 'Diente Dorado', 80, 2),
(6, 'Casa Royce', 'Piedra Rúnica', 88, 3),
(7, 'Casa Dayne', 'Campoestrella', 92, 4),
(8, 'Casa Tarth', 'Castillo de Tarth', 100, 5);

-- Insertar Recaudaciones
-- FKs: grandes_casas_id -> grandes_casas(id), maestres_id -> maestres(id)
-- Estado Pago: 'EN_DEMORA', 'EXIMIDO_POR_GUERRA', 'SATISFECHO'
INSERT INTO `recuadaciones` (`fecha`, `grandes_casas_id`, `maestres_id`, `importe`, `estado_pago`) VALUES
('2026-01-15', 1, 1, 15000, 'SATISFECHO'),
('2026-02-10', 2, 3, 55000, 'SATISFECHO'),
('2026-02-15', 3, 4, 8000, 'EN_DEMORA'),
('2026-03-01', 4, 5, 12000, 'EXIMIDO_POR_GUERRA'),
('2026-03-20', 5, 2, 20000, 'SATISFECHO'),
('2026-04-10', 1, 4, 14500, 'SATISFECHO'),
('2026-05-05', 2, 3, 60000, 'SATISFECHO');

-- ---------------------------------------------------------
-- 3. TABLAS DEPENDIENTES DE NIVEL 2
-- ---------------------------------------------------------

-- Insertar Regimientos
-- FKs: casas_vasallas_id -> casas_vasallas(id), fortalezas_id -> fortalezas(id)
-- Tipo Tropa: 'ARQUERIA', 'ASEDIO', 'CABALLERIA', 'INFANTERIA', 'PESADA'
INSERT INTO `regimientos` (`id`, `tipo_tropa`, `num_soldados`, `coste_mantenimiento`, `casas_vasallas_id`, `fortalezas_id`) VALUES
(1, 'INFANTERIA', 1500, 4500.50, 1, 1),
(2, 'ARQUERIA', 800, 2400.00, 2, 1),
(3, 'PESADA', 2000, 8500.75, 3, 6),
(4, 'CABALLERIA', 1200, 6000.00, 4, 2),
(5, 'INFANTERIA', 3000, 9000.00, 5, 2),
(6, 'CABALLERIA', 1500, 7200.25, 6, 3),
(7, 'ARQUERIA', 600, 1800.00, 7, 4),
(8, 'ASEDIO', 400, 5100.80, 8, 5);