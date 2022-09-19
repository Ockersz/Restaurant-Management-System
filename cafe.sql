-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 19, 2022 at 03:18 AM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cafe`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `EmpNo` int(11) NOT NULL AUTO_INCREMENT,
  `Ename` varchar(20) NOT NULL,
  `Eusername` varchar(10) NOT NULL,
  `Epassword` varchar(15) NOT NULL,
  PRIMARY KEY (`EmpNo`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EmpNo`, `Ename`, `Eusername`, `Epassword`) VALUES
(1, 'siluni', 's.enara', '123'),
(2, 'Kesara', 's.enara', '123'),
(3, 'kopera', 'kop123', '123');

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
CREATE TABLE IF NOT EXISTS `item` (
  `ItemNo` int(11) NOT NULL AUTO_INCREMENT,
  `Iname` varchar(30) NOT NULL,
  `Uprice` int(11) NOT NULL,
  `Category` varchar(10) NOT NULL,
  PRIMARY KEY (`ItemNo`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`ItemNo`, `Iname`, `Uprice`, `Category`) VALUES
(1, 'Chicken kottu', 800, 'Sri Lankan'),
(2, 'Fish and Chips', 1500, 'Western'),
(3, 'Egg Fried Rice', 650, 'Chinese'),
(4, 'Vanilla milkshake', 500, 'Beverages'),
(6, 'Chocolate milkshake', 500, 'Beverages');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
  `OrderNo` int(11) NOT NULL AUTO_INCREMENT,
  `Tprice` int(11) NOT NULL,
  `DOB` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `EmpID` int(11) NOT NULL,
  PRIMARY KEY (`OrderNo`),
  KEY `EmpID` (`EmpID`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`OrderNo`, `Tprice`, `DOB`, `EmpID`) VALUES
(1, 1800, '2022-09-17 16:30:27', 3),
(2, 1500, '2022-09-17 16:32:38', 3),
(3, 3500, '2022-09-17 16:50:51', 3);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
