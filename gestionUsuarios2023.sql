-- --------------------------------------------------------
-- Host:                         192.168.1.107
-- Versión del servidor:         10.6.12-MariaDB-0ubuntu0.22.10.1 - Ubuntu 22.10
-- SO del servidor:              debian-linux-gnu
-- HeidiSQL Versión:             12.4.0.6659
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para gestionusuarios
CREATE DATABASE IF NOT EXISTS `gestionusuarios` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_spanish_ci */;
USE `gestionusuarios`;

-- Volcando estructura para tabla gestionusuarios.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `nombre` varchar(25) NOT NULL,
  `password` varchar(64) NOT NULL,
  `email` varchar(50) NOT NULL,
  `activo` bit(1) NOT NULL DEFAULT b'0',
  `rol` varchar(25) NOT NULL,
  `fecha_alta` date NOT NULL,
  `ultimo_acceso` timestamp NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

-- Volcando datos para la tabla gestionusuarios.usuario: ~6 rows (aproximadamente)
INSERT INTO `usuario` (`nombre`, `password`, `email`, `activo`, `rol`, `fecha_alta`, `ultimo_acceso`) VALUES
	('admin1', '4e16a11b14dab1ca39b28edb60bb3e7995c7bd72c2dca81fbb6c705d9f911e5f', 'admin1@sauces.es', b'1', 'ADMINISTRADOR', '2022-05-01', '2022-05-16 20:01:27'),
	('admin2', '48461108f81cab4c639f12893d310104ef8b5b1927d75462f473355281f17784', 'admin2@sauces.es', b'0', 'ADMINISTRADOR', '2022-05-01', '2022-05-10 16:12:39'),
	('admin3', '4e16a11b14dab1ca39b28edb60bb3e7995c7bd72c2dca81fbb6c705d9f911e5f', 'admin3@sauces.es', b'0', 'ADMINISTRADOR', '2023-05-10', '2023-05-10 13:41:28'),
	('usuario1', '17b14d8719e000481ed32a3c13cdd93171e81935aef662bbbed4b2624c8b1529', 'usuario1@sauces.es', b'1', 'REGISTRADO', '2022-04-16', '2022-05-16 20:03:08'),
	('usuario2', '8e383b4afee076e2e8d9beb3272c0825fe1ef7244f3db65b0b47337865c386d3', 'usuario2@sauces.es', b'0', 'REGISTRADO', '2022-05-16', '2023-05-10 13:31:15'),
	('usuario3', 'f5a7d77f898bf0c9143179daa00465577e2ebf05179f70c8f57b65e635f91fd0', 'usuario3@sauces.es', b'0', 'REGISTRADO', '2023-05-10', NULL);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
