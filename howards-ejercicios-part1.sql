-- 1
SELECT id, nombre FROM profesores;

-- 2
SELECT nombre, apellidos FROM alumnos
WHERE ano_nacimiento = 1980;

-- 3
SELECT nombre FROM materias;

-- 4
SELECT id, num_camas, ubicacion FROM habitaciones
WHERE num_camas > 4;

-- 5
SELECT nombre, apellidos FROM alumnos a
ORDER BY apellidos, nombre;

-- 6
SELECT COUNT(*) AS NUM_ALUMNOS FROM alumnos;

-- añadida la columna notas para seguir con los ejercicios
ALTER TABLE cursos
ADD COLUMN nota DOUBLE(3,1);

-- 7
SELECT nota FROM cursos WHERE nota >= 5;

-- 7BIS
SELECT c.nota, a.nombre, a.apellidos 
FROM cursos c, alumnos a 
WHERE c.alumnos_id = a.num_mago and c.nota >= 5;

-- 7BISBIS
SELECT c.nota, a.nombre, a.apellidos 
FROM cursos c INNER JOIN alumnos a ON c.alumnos_id = a.num_mago
WHERE c.nota >= 5;

-- 8
SELECT m.nombre, c.curso
FROM cursos c INNER JOIN materias m ON c.materias_id = m.id
WHERE c.curso = 2023
GROUP BY m.nombre;

-- 8BIS
SELECT distinct(m.nombre), c.curso
FROM cursos c INNER JOIN materias m ON c.materias_id = m.id
WHERE c.curso = 2023;

-- 9
SELECT a.nombre, a.apellidos, c.nombre
FROM alumnos a INNER JOIN casas c ON a.casas_id = c.id;

-- 10
SELECT a.nombre, a.apellidos, h.ubicacion
FROM alumnos a INNER JOIN habitaciones h ON a.habitaciones_id = h.id;