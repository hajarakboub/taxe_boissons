-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 28, 2021 at 02:45 PM
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

-- --------------------------------------------------------

--
-- Table structure for table `categorie_local`
--

DROP TABLE IF EXISTS `categorie_local`;
CREATE TABLE IF NOT EXISTS `categorie_local` (
  `id` bigint(20) NOT NULL,
  `code` varchar(255) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `categorie_local`
--

INSERT INTO `categorie_local` (`id`, `code`, `libelle`) VALUES
(21, 'cafe', 'Cafe'),
(22, 'cafe-snack', 'Cafe Snack'),
(23, 'Riad', 'riad');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(24);

-- --------------------------------------------------------

--
-- Table structure for table `local`
--

DROP TABLE IF EXISTS `local`;
CREATE TABLE IF NOT EXISTS `local` (
  `id` bigint(20) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `ref` varchar(255) DEFAULT NULL,
  `redevable` bigint(20) DEFAULT NULL,
  `categorie_local` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6vhqpaq06sqym4hfckthre1i6` (`redevable`),
  KEY `FKb3nf4npmd41x751dgaxsmf6u8` (`categorie_local`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `local`
--

INSERT INTO `local` (`id`, `adresse`, `ref`, `redevable`, `categorie_local`) VALUES
(11, '5 rue de la Koutoubia, place Jemaa El Fna, Marrakech', '40000', 1, 21),
(12, '54 rue de la Koutoubia, place Jemaa El Fna, Marrakech', '41000', 2, 23),
(13, '54 rue Allal fasi, Daoudiat, Marrakech', '41200', 3, 21),
(14, '12 rue Allal fasi, Daoudiat, Marrakech', '41400', 4, 22),
(15, '90 rue Houssna, Mhamid 10, Marrakech', '41900', 5, 22),
(16, '78 rue maatalah, Mhamid 2, Marrakech', '42900', 6, 23),
(17, '97 rue cosmos, Massira, Marrakech', '47800', 7, 21),
(18, '100 rue cosmos, Massira, Marrakech', '43580', 8, 22),
(19, '45 rue ichraq, tamnsourt, Marrakech', '47600', 9, 23),
(20, '82 rue carre eden, guiliz, Marrakech', '42200', 10, 21);

-- --------------------------------------------------------

--
-- Table structure for table `redevable`
--

DROP TABLE IF EXISTS `redevable`;
CREATE TABLE IF NOT EXISTS `redevable` (
  `id` bigint(20) NOT NULL,
  `ref` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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

-- --------------------------------------------------------

--
-- Table structure for table `taux`
--

DROP TABLE IF EXISTS `taux`;
CREATE TABLE IF NOT EXISTS `taux` (
  `id` bigint(20) NOT NULL,
  `pourcentage` decimal(10,2) NOT NULL,
  `categorie_local` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKr915ibfm0gckcq5hn7vhprvi5` (`categorie_local`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `taux`
--

INSERT INTO `taux` (`id`, `pourcentage`, `categorie_local`) VALUES
(1, '0.20', 21),
(2, '0.30', 22),
(3, '0.10', 23);

-- --------------------------------------------------------

--
-- Table structure for table `taxe_boisson`
--

DROP TABLE IF EXISTS `taxe_boisson`;
CREATE TABLE IF NOT EXISTS `taxe_boisson` (
  `id` bigint(20) NOT NULL,
  `annee` int(11) DEFAULT NULL,
  `benefice` double DEFAULT NULL,
  `montant_base` double DEFAULT NULL,
  `trimestre` int(11) DEFAULT NULL,
  `local` bigint(20) DEFAULT NULL,
  `redevable` bigint(20) DEFAULT NULL,
  `taux` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjt6y5ofwk6xcfnvr664654ebb` (`local`),
  KEY `FKg92se81t30pghdfandyk7t7w8` (`redevable`),
  KEY `FKhhp7j1lf40ktqwn3sbqwy6g8a` (`taux`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
