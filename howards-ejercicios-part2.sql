-- 11
SELECT p.nombre, c.nombre
FROM profesores p INNER JOIN casas c ON p.id = c.profesores_id;

-- 12
SELECT p.nombre, m.nombre
FROM profesores p 
	INNER JOIN profesores_materias pm ON p.id = pm.profesores_id
	INNER JOIN materias m ON pm.materias_id = m.id
WHERE pm.curso = 2022;

-- 13
SELECT c.nombre, count(*)
FROM casas c INNER JOIN alumnos a ON c.id = a.casas_id
GROUP BY c.nombre;

-- 14
SELECT m.nombre, AVG(c.nota)
FROM materias m INNER JOIN cursos c ON m.id = c.materias_id
GROUP BY m.nombre;

-- 15
SELECT m.nombre, c.curso, c.nota
FROM materias m 
	INNER JOIN cursos c ON m.id = c.materias_id
	INNER JOIN alumnos a ON c.alumnos_id = a.num_mago
WHERE a.nombre = 'Harry' AND a.apellidos = 'Potter'
ORDER BY m.nombre;

-- 16
SELECT m.nombre, c.curso, AVG(c.nota)
FROM materias m INNER JOIN cursos c ON m.id = c.materias_id
WHERE m.nombre = 'Defensa Contra las Artes Oscuras' AND c.curso = 2023;

-- 17
SELECT c.nombre, AVG(cu.nota)
FROM casas c 
	INNER JOIN alumnos a ON c.id = a.casas_id
	INNER JOIN cursos cu ON a.num_mago = cu.alumnos_id
GROUP BY c.nombre;

-- 18
SELECT p.nombre, m.nombre, pm.curso
FROM profesores p 
	INNER JOIN profesores_materias pm ON p.id = pm.profesores_id
	INNER JOIN materias m ON pm.materias_id = m.id
WHERE m.nombre = 'Defensa Contra las Artes Oscuras' AND pm.curso = 2017;

-- 19
SELECT m.nombre, c.curso, AVG(c.nota) AS nota_media
FROM materias m INNER JOIN cursos c ON m.id = c.materias_id
GROUP BY m.nombre HAVING AVG(c.nota) >= 7;

-- 20
SELECT m.nombre, a.nombre, a.apellidos, c.nota AS mejor_nota
FROM alumnos a 
	INNER JOIN cursos c ON a.num_mago = c.alumnos_id
	INNER JOIN materias m ON c.materias_id = m.id
WHERE c.nota = (
	SELECT MAX(c2.nota)
	FROM cursos c2
	WHERE c2.materias_id = c.materias_id
);