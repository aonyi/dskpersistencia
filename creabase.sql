-- Creación de las tablas

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Carga los datos iniciales
INSERT INTO `cliente` (`id`,`nombre`,`apellido`)
VALUES (1,'Carlos','Gomez');

INSERT INTO `cliente` (`id`,`nombre`,`apellido`)
VALUES (2,'Ruben','Valdez');

INSERT INTO `cliente` (`id`,`nombre`,`apellido`)
VALUES (3,'Quico','Villagrán');

