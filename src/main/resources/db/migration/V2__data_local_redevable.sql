-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 20, 2021 at 02:48 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `taxe_boisson`
--

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(21);

--
-- Dumping data for table `local`
--

INSERT INTO `local` (`id`, `adresse`, `ref`, `redevable`) VALUES
(11, '5 rue de la Koutoubia, place Jemaa El Fna, Marrakech', '40000', 1),
(12, '54 rue de la Koutoubia, place Jemaa El Fna, Marrakech', '41000', 2),
(13, '54 rue Allal fasi, Daoudiat, Marrakech', '41200', 3),
(14, '12 rue Allal fasi, Daoudiat, Marrakech', '41400', 4),
(15, '90 rue Houssna, Mhamid 10, Marrakech', '41900', 5),
(16, '78 rue maatalah, Mhamid 2, Marrakech', '42900', 6),
(17, '97 rue cosmos, Massira, Marrakech', '47800', 7),
(18, '100 rue cosmos, Massira, Marrakech', '43580', 8),
(19, '45 rue ichraq, tamnsourt, Marrakech', '47600', 9),
(20, '82 rue carre eden, guiliz, Marrakech', '42200', 10);

--
-- Dumping data for table `redevable`
--

INSERT INTO `redevable` (`id`, `ref`, `type`) VALUES
(1, 'ee26765', 'Personne physique'),
(2, 'ee26445', 'Personne physique'),
(3, 'ee15220', 'Personne morale'),
(4, 'ee15201', 'Personne morale'),
(5, 'ee26731', 'Personne physique'),
(6, 'ee26355', 'Personne physique'),
(7, 'ee26225', 'Personne physique'),
(8, 'ee15276', 'Personne morale'),
(9, 'ee26453', 'Personne physique'),
(10, 'ee15953', 'Personne morale');
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
