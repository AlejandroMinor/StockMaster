-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-07-2022 a las 04:42:57
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.0.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `seguricam`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulo_lista`
--

CREATE TABLE `articulo_lista` (
  `idarticuloLista` int(10) NOT NULL,
  `cantidad` int(10) NOT NULL,
  `precio` float NOT NULL,
  `tipoVenta` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `item`
--

CREATE TABLE `item` (
  `iditem` int(10) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(250) NOT NULL,
  `precio_publico` float NOT NULL,
  `precio_distribuidor` float NOT NULL,
  `stock` int(10) NOT NULL,
  `foto` blob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `item`
--

INSERT INTO `item` (`iditem`, `nombre`, `descripcion`, `precio_publico`, `precio_distribuidor`, `stock`, `foto`) VALUES
(1, 'Bocina Logitech z733', 'Bocina doble', 1100, 750, 6, NULL),
(2, 'Teclado XPG K10 RGB', 'Teclado Membrana con sensación mecanica\nXPG full 100%', 650, 550, 1, NULL),
(3, 'SSD Kingston 120 gigas', 'SSD Sata', 800, 600, 18, NULL),
(4, 'Aro de luz', '30 cm', 1000, 1000, 8, NULL),
(5, 'Cargador para laptop hp', 'Cargador para laptop HP punta azul 19v 3.5a', 350, 250, 3, NULL),
(6, 'Disco duro 2.5\' 500GB WD', 'Disco Duro 500GB 2.5\' (para laptop)\nWester Digital\nSATA ', 900, 800, 3, NULL),
(7, 'Case Disco Duro Sata 2.5\' USB 2.0', 'Case conversor para disco duro de laptop a USB ', 150, 100, 7, NULL),
(8, 'SSD Kingston 240GB Sata 2.5\'', 'Unidad en estado solido Kingston \nde 240 GB 2.5\' SATA \n ', 820, 730, 3, NULL),
(9, 'Disco duro 4TB DVR 3.5\' Purple WD', 'Disco duro para grabacion DVR SATA\n7500 RPM 3.5\' Wester Digital', 2500, 2000, 2, NULL),
(10, 'SSD Kingston 1TB 2.5 SATA', 'SSD Kingston SATA III 1TB 2.5\'', 2500, 2000, 0, NULL),
(11, 'Cargador para laptop Asus 19.5v 3.5a', 'Cargador para laptop Asus 19.5v 3.5a', 320, 250, 2, NULL),
(12, 'Bateria para laptop HP hs04', 'Bateria para laptop HP hs04 ', 650, 450, 3, NULL),
(13, 'Cable Sata Datos ', 'Cable sata de datos', 50, 30, 11, NULL),
(14, 'Fuente de poder 500w Vorago', 'Fuente de poder para PC marca vorago 500w', 350, 300, 5, NULL),
(15, 'Regulador de voltaje 600VA Vorago', 'Regulador de voltaje 600VA Vorago 8 contactos Cargador USB', 400, 320, 1, NULL),
(16, 'Cable HDMI 3mts', 'Cable HDMI 3mts Reforzado version 1.4', 150, 120, 4, NULL),
(17, 'Cargador para laptop HP Punta azul 19v 3.5a', 'Cargador para laptop HP Punta azul 19v 3.5a\nPin central incluye cable de corriente', 320, 300, 5, NULL),
(18, 'Cargador para laptop HP 18.5v 3.5a pin central', 'Cargador para laptop HP \n18.5v 3.5a \nPin central Punta amplia', 320, 300, 2, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `iduser` varchar(15) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `puesto` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`iduser`, `Nombre`, `apellidos`, `puesto`, `password`) VALUES
('1', 'Jesus', 'Tello', 'Administrador', '1'),
('17', 'Victor ', 'Espinoza Gamboa', 'Administrador', '53gur1c4m'),
('17270681', 'Obed ', 'Zavaleta', 'Empleado', '17270681'),
('1993', 'Alejandro Jehosafat', 'Minor Juarez', 'Administrador', '732322'),
('2', 'Roman', 'Espino', 'Empleado', '2'),
('3', 'Abraham', 'Martines', 'Empleado', '3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `idventa` int(10) NOT NULL,
  `fecha` date NOT NULL,
  `total` float NOT NULL,
  `user_iduser` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`idventa`, `fecha`, `total`, `user_iduser`) VALUES
(20, '2022-06-06', 4000, '1'),
(21, '2022-06-12', 3310, '1'),
(22, '2022-06-12', 4230, '1'),
(23, '2022-06-12', 4320, '1'),
(24, '2022-06-20', 800, '2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta_has_item`
--

CREATE TABLE `venta_has_item` (
  `venta_idventa` int(10) NOT NULL,
  `item_iditem` int(10) NOT NULL,
  `cantidad` int(10) NOT NULL,
  `totalArticulos` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `venta_has_item`
--

INSERT INTO `venta_has_item` (`venta_idventa`, `item_iditem`, `cantidad`, `totalArticulos`) VALUES
(20, 4, 2, 4000),
(21, 9, 1, 2000),
(21, 13, 1, 30),
(21, 15, 2, 1280),
(22, 2, 2, 2200),
(22, 9, 1, 2000),
(22, 13, 1, 30),
(23, 2, 2, 2200),
(23, 9, 1, 2000),
(23, 13, 2, 120),
(24, 3, 1, 800);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulo_lista`
--
ALTER TABLE `articulo_lista`
  ADD PRIMARY KEY (`idarticuloLista`);

--
-- Indices de la tabla `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`iditem`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`iduser`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`idventa`),
  ADD KEY `user_iduser` (`user_iduser`),
  ADD KEY `user_iduser_2` (`user_iduser`);

--
-- Indices de la tabla `venta_has_item`
--
ALTER TABLE `venta_has_item`
  ADD KEY `venta_idventa` (`venta_idventa`),
  ADD KEY `item_iditem` (`item_iditem`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `item`
--
ALTER TABLE `item`
  MODIFY `iditem` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idventa` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `venta_has_item`
--
ALTER TABLE `venta_has_item`
  ADD CONSTRAINT `venta_has_item_ibfk_1` FOREIGN KEY (`item_iditem`) REFERENCES `item` (`iditem`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `venta_has_item_ibfk_2` FOREIGN KEY (`venta_idventa`) REFERENCES `venta` (`idventa`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
