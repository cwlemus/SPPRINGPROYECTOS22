-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-03-2022 a las 16:39:35
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.3.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `spring`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `curso`
--

CREATE TABLE `curso` (
  `idcurso` int(11) NOT NULL,
  `iddocente` int(11) NOT NULL,
  `curso` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `curso`
--

INSERT INTO `curso` (`idcurso`, `iddocente`, `curso`) VALUES
(1, 1, 'JAVA SPRING MVC'),
(2, 1, 'JAVA SPRING DATA'),
(3, 3, 'NET CORE BASES'),
(4, 3, 'NET CORE WEB'),
(5, 3, 'NET CORE REST');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docente`
--

CREATE TABLE `docente` (
  `iddocente` int(11) NOT NULL,
  `docente` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `docente`
--

INSERT INTO `docente` (`iddocente`, `docente`) VALUES
(1, 'CARLOS LEMUS'),
(2, 'PERDOMO REGALADO'),
(3, 'JOSE RENDEROS'),
(4, 'PEDRO PEREZ'),
(5, 'MARIA FUENTES');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `cum` decimal(11,2) NOT NULL,
  `cuota` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`codigo`, `nombre`, `apellido`, `cum`, `cuota`) VALUES
(1, 'Carlos', 'Lemus', '10.00', '68.98'),
(2, 'Mario', 'Rugamas', '8.00', '67.89'),
(3, 'Julio', 'Alvarado', '8.90', '67.90'),
(4, 'Geraldine', 'Lopez', '9.90', '30.89'),
(5, 'Xiomara', 'Martinez', '9.80', '45.89'),
(6, 'Jairo', 'Jimenez', '8.90', '67.90'),
(7, 'Gabriela', 'Renderos', '9.00', '68.90'),
(8, 'Gabi', 'Fuentes', '10.00', '48.90'),
(9, 'Geraldine', 'Montero', '8.00', '90.90'),
(10, 'Ariana', 'Benitez', '9.40', '87.90'),
(11, 'Marina', 'Morales', '9.80', '56.90'),
(12, 'Maria', 'Serrano', '8.50', '77.90'),
(13, 'Maria', 'Serrano', '8.50', '77.90'),
(14, 'Maria', 'Serrano', '8.50', '77.90'),
(15, 'Maria', 'Serrano', '8.50', '77.90'),
(16, 'Maria', 'Serrano', '8.50', '77.90'),
(17, 'Maria', 'Serrano', '8.50', '77.90');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `numero` int(11) NOT NULL,
  `concepto` varchar(25) NOT NULL,
  `importe` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`numero`, `concepto`, `importe`) VALUES
(1, 'tablet', '391'),
(2, 'ordenador', '460');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`idcurso`),
  ADD KEY `pk_docente` (`iddocente`);

--
-- Indices de la tabla `docente`
--
ALTER TABLE `docente`
  ADD PRIMARY KEY (`iddocente`);

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`numero`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `curso`
--
ALTER TABLE `curso`
  MODIFY `idcurso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `docente`
--
ALTER TABLE `docente`
  MODIFY `iddocente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `curso`
--
ALTER TABLE `curso`
  ADD CONSTRAINT `pk_docente` FOREIGN KEY (`iddocente`) REFERENCES `docente` (`IdDocente`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
