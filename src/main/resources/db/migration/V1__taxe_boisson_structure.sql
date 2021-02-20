-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 20, 2021 at 02:45 PM
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
  `code` int(11) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
  PRIMARY KEY (`id`),
  KEY `FK6vhqpaq06sqym4hfckthre1i6` (`redevable`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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

-- --------------------------------------------------------

--
-- Table structure for table `taux`
--

DROP TABLE IF EXISTS `taux`;
CREATE TABLE IF NOT EXISTS `taux` (
  `id` bigint(20) NOT NULL,
  `pourcentage` int(11) NOT NULL,
  `categorie` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKvqmv9em8tkwm47fo1435gj8l` (`categorie`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
