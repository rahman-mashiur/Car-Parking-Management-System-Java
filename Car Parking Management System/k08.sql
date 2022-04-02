-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 20, 2019 at 08:29 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `k08`
--

-- --------------------------------------------------------

--
-- Table structure for table `carsinfo`
--

CREATE TABLE `carsinfo` (
  `cRegNumber` varchar(20) NOT NULL,
  `tokenNumber` int(10) NOT NULL,
  `date` varchar(10) NOT NULL,
  `time` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `carsinfo`
--

INSERT INTO `carsinfo` (`cRegNumber`, `tokenNumber`, `date`, `time`) VALUES
('10-8932', 4, '20-Aug-19', '08:00 AM - 05:00 PM'),
('11-0749', 2, '20-Aug-19', '09:30 AM - 04:00 PM'),
('11-3987', 1, '20-Aug-19', '09:00 AM - 05:00 PM'),
('12-3594', 3, '20-Aug-19', '10:00 AM - 12:00 PM '),
('15-2233', 5, '20-Aug-19', '05:00 PM - 09:30 PM');

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `eid` varchar(10) NOT NULL,
  `eName` varchar(20) NOT NULL,
  `designation` varchar(10) NOT NULL,
  `salary` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`eid`, `eName`, `designation`, `salary`) VALUES
('e001', 'Rasel', 'operator', 8000),
('e002', 'Rubel', 'security', 5500),
('e003', 'Mashrafi', 'manager', 20000),
('e004', 'Sakib', 'operator', 8300),
('e005', 'Shujon', 'security', 5000);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `uid` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`uid`, `password`, `status`) VALUES
('e001', '1111', 'operator'),
('e002', '2222', 'security'),
('e003', '3333', 'manager'),
('e004', '4444', 'operator'),
('e005', '5555', 'security');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `carsinfo`
--
ALTER TABLE `carsinfo`
  ADD PRIMARY KEY (`cRegNumber`),
  ADD UNIQUE KEY `UNIQUE` (`tokenNumber`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`eid`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD UNIQUE KEY `UNIQUE` (`uid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
