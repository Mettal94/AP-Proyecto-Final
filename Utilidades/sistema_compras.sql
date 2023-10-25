-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-10-2023 a las 01:20:43
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema_compras`
--
CREATE DATABASE IF NOT EXISTS `sistema_compras` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `sistema_compras`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `idCompra` int(11) NOT NULL,
  `idProveedor` int(11) NOT NULL,
  `precioTotal` double NOT NULL,
  `fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`idCompra`, `idProveedor`, `precioTotal`, `fecha`) VALUES
(1, 5, 5399.9400000000005, '2023-10-25'),
(2, 4, 2949.9100000000003, '2023-10-11'),
(3, 3, 6639.81, '2023-10-01'),
(4, 2, 2859.7700000000004, '2023-10-16');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecompra`
--

CREATE TABLE `detallecompra` (
  `idDetalle` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precioCosto` double NOT NULL,
  `idCompra` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detallecompra`
--

INSERT INTO `detallecompra` (`idDetalle`, `cantidad`, `precioCosto`, `idCompra`, `idProducto`, `estado`) VALUES
(1, 6, 5399.9400000000005, 1, 2, 1),
(2, 7, 1749.95, 2, 4, 1),
(3, 2, 499.98, 2, 7, 1),
(4, 6, 3599.94, 3, 1, 1),
(5, 9, 2519.91, 3, 9, 1),
(6, 4, 519.96, 3, 6, 1),
(7, 13, 299.95, 4, 8, 1),
(8, 6, 779.94, 4, 3, 1),
(9, 3, 1049.97, 4, 4, 1),
(10, 1, 249.99, 4, 7, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `rubro` varchar(100) NOT NULL,
  `precioActual` double NOT NULL,
  `stock` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombre`, `descripcion`, `rubro`, `precioActual`, `stock`, `estado`) VALUES
(1, 'Lavadora LG', 'Lavadora de carga frontal con capacidad de 8 kg', 'Hogar', 599.99, 26, 1),
(2, 'Refrigerador Samsung', 'Refrigerador de dos puertas con dispensador de agua', 'Cocina', 899.99, 21, 1),
(3, 'Horno Microondas Panasonic', 'Horno microondas con capacidad de 1.2 cu.ft.', 'Cocina', 129.99, 31, 1),
(4, 'Aspiradora Dyson', 'Aspiradora sin cable con tecnología ciclónica', 'Pequeños Electrodomésticos', 349.99, 13, 1),
(5, 'Licuadora Oster', 'Licuadora de alto rendimiento con motor de 1000W', 'Pequeños Electrodomésticos', 79.99, 30, 0),
(6, 'Cafetera Keurig', 'Cafetera de cápsulas con función de preparación rápida', 'Hogar', 129.99, 16, 1),
(7, 'Robot de Cocina Moulinex', 'Robot de cocina multifunción con 12 programas', 'Pequeños Electrodomésticos', 249.99, 19, 1),
(8, 'Plancha de Vapor Rowenta', 'Plancha de vapor con suela de acero inoxidable', 'Hogar', 59.99, 35, 0),
(9, 'Batidora KitchenAid', 'Batidora de pie con cabezal inclinable y 10 velocidades', 'Hogar', 279.99, 24, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL,
  `razonSocial` varchar(100) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `telefono` varchar(100) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `razonSocial`, `domicilio`, `email`, `telefono`, `estado`) VALUES
(1, 'Distribuciones S.A. de C.V.', 'Avenida Corrientes 123, CABA, Buenos Aires, Argentina.', 'info@distribuciones.com.ar', '+54 11 1234 5678', 1),
(2, 'Suministros Industriales S.L.', 'Calle Florida 456, Córdoba, Argentina.', 'contacto@suministros.com.ar', '+54 351 123 4567', 1),
(3, 'Proveedora Integral S.A.', 'Avenida San Martín 78, Rosario, Santa Fe, Argentina.', 'ventas@proveedoraintegral.com.ar', '+54 341 1234 5678', 1),
(4, 'Soluciones Empresariales S.A.S.', 'Calle Mitre 789, Mendoza, Argentina.', 'info@solucionese.com.ar', '+54 261 123 4567', 1),
(5, 'Forniture Solutions Inc.', 'Avenida Belgrano 1234, Salta, Argentina.', 'sales@fornituresolutions.com.ar', '+54 387 123-4567', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`idCompra`),
  ADD KEY `idProveedor` (`idProveedor`);

--
-- Indices de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD PRIMARY KEY (`idDetalle`),
  ADD KEY `idProducto` (`idProducto`),
  ADD KEY `idCompra` (`idCompra`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idProveedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  MODIFY `idDetalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`);

--
-- Filtros para la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD CONSTRAINT `detallecompra_ibfk_1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`),
  ADD CONSTRAINT `detallecompra_ibfk_2` FOREIGN KEY (`idCompra`) REFERENCES `compra` (`idCompra`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
