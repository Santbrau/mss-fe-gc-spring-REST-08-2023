DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(30),
	trabajo varchar(30),
	sueldo int	
);

INSERT INTO empleado (nombre, trabajo, salario) VALUES ('Juan', 'CAMARERO', 1200);
INSERT INTO empleado (nombre, trabajo, salario) VALUES ('María', 'CAMARERO', 1200);
INSERT INTO empleado (nombre, trabajo, salario) VALUES ('Pablo', 'CAMARERO', 1200);
INSERT INTO empleado (nombre, trabajo, salario) VALUES ('Joel', 'CAMARERO', 1200);
INSERT INTO empleado (nombre, trabajo, salario) VALUES ('Gerardo', 'CAMARERO', 1700);
INSERT INTO empleado (nombre, trabajo, salario) VALUES ('Paula', 'COCINERO', 1700);
INSERT INTO empleado (nombre, trabajo, salario) VALUES ('Laura', 'COCINERO', 1300);
INSERT INTO empleado (nombre, trabajo, salario) VALUES ('Marc', 'PINCHE', 40000);
INSERT INTO empleado (nombre, trabajo, salario) VALUES ('Pepe', 'PINCHE', 1300);
INSERT INTO empleado (nombre, trabajo, salario) VALUES ('Fran', 'METRE', 2000);
INSERT INTO empleado (nombre, trabajo, salario) VALUES ('Jordi', 'GERENTE', 3500);