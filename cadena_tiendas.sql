-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-08-2022 a las 01:44:30
-- Versión del servidor: 8.0.30
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cadena_tiendas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `codigo_empleado` int NOT NULL,
  `nombre_empleado` varchar(50) NOT NULL,
  `telefono_empleado` int NOT NULL,
  `direccion_empleado` text NOT NULL,
  `codigo_tienda` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`codigo_empleado`, `nombre_empleado`, `telefono_empleado`, `direccion_empleado`, `codigo_tienda`) VALUES
(891, 'Richards', 2389812, 'Las palmas #128', 5612),
(2012, 'Roberto', 391823, 'Las palmas #92', 1223),
(2301, 'Rachel', 239821, 'Las martinas #23', 2819),
(2381, 'Maria', 8592031, 'Las rosas #91', 1223),
(2812, 'Franchesca', 2389123, 'San jose #230', 6421),
(3219, 'Ramon', 9238122, 'Trinidad #32', 3212),
(3821, 'Fernando', 4812392, 'Las rosas #128', 1223),
(3841, 'Luisa', 6023012, 'El grifo #22', 6421),
(3902, 'Roberto', 391823, 'El grifo #120', 6421),
(4821, 'Francisco', 4281239, 'San jose #192', 6421),
(5391, 'Robert', 391823, 'El grifo #39', 6421),
(5823, 'Smerling', 5239128, 'Trinidad #32', 3212),
(5921, 'Julieta', 4982381, 'Las martinas #23', 2819);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `codigo_producto` int NOT NULL,
  `nombre_producto` varchar(50) NOT NULL,
  `precio_act_producto` decimal(10,0) NOT NULL,
  `precio_tot_producto` decimal(10,0) NOT NULL,
  `cantidad_productos` int NOT NULL,
  `codigo_tienda` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`codigo_producto`, `nombre_producto`, `precio_act_producto`, `precio_tot_producto`, `cantidad_productos`, `codigo_tienda`) VALUES
(1232, 'Manzana', '70', '90', 200, 1223),
(1272, 'Arandano', '100', '90', 30, 2819),
(2271, 'Piña', '30', '40', 10, 3212),
(3271, 'Pera', '80', '60', 100, 1223),
(3332, 'Mango', '30', '50', 50, 3212),
(3382, 'Calabaza', '120', '100', 100, 6421),
(3821, 'Repollo', '20', '40', 50, 6421),
(4287, 'Aguacate', '40', '30', 5, 3212),
(4721, 'Puerro', '30', '50', 50, 5612),
(4722, 'Cebolla', '20', '120', 100, 5612),
(4833, 'Calabaza', '120', '100', 25, 5612),
(4872, 'Yuca', '15', '25', 20, 3212),
(5281, 'Uva', '90', '90', 200, 2819),
(5528, 'Nabo', '100', '200', 5, 5612),
(5558, 'Guineo', '10', '15', 100, 3212),
(5572, 'Pera', '70', '100', 100, 2819),
(5582, 'Tomate', '70', '50', 100, 6421),
(5655, 'Platano', '30', '25', 30, 3212),
(5721, 'Fresa', '50', '200', 50, 1223),
(5821, 'Manzana', '80', '90', 20, 2819),
(5823, 'Pimiento', '20', '30', 230, 6421),
(5831, 'Patata', '140', '120', 200, 6421),
(6661, 'Franbueza', '80', '70', 50, 2819),
(6683, 'Zanahoria', '40', '60', 200, 6421),
(6736, 'Naranja', '120', '110', 50, 1223),
(9828, 'Remolacha', '20', '40', 100, 5612);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tienda`
--

CREATE TABLE `tienda` (
  `codigo_tienda` int NOT NULL,
  `nombre_tienda` varchar(50) NOT NULL,
  `direccion_tienda` text NOT NULL,
  `estado` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `cantidad_empleado` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `tienda`
--

INSERT INTO `tienda` (`codigo_tienda`, `nombre_tienda`, `direccion_tienda`, `estado`, `cantidad_empleado`) VALUES
(1223, 'Los tres hermanos - Santo Domingo', 'Las palmas #102', 'CA', 3),
(2819, 'Los tres hermanos - La romana', 'Juan Pablo Duarte #02', 'JPD', 2),
(3212, 'Los tres hermanos - San Isidro', 'Vicente Lopez #422', 'SI', 2),
(5612, 'Los tres hermanos - Santiago', 'Maria magdalena #12', 'SA', 1),
(6421, 'Los tres hermanos - Elias Piña', 'Las rosas II #11', 'EP', 5);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`codigo_empleado`),
  ADD KEY `codigo_tienda` (`codigo_tienda`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`codigo_producto`),
  ADD KEY `codigo_tienda` (`codigo_tienda`);

--
-- Indices de la tabla `tienda`
--
ALTER TABLE `tienda`
  ADD PRIMARY KEY (`codigo_tienda`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `empleados_ibfk_1` FOREIGN KEY (`codigo_tienda`) REFERENCES `tienda` (`codigo_tienda`);

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`codigo_tienda`) REFERENCES `tienda` (`codigo_tienda`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
