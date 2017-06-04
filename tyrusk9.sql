-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 06, 2017 at 03:00 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tyrusk9`
--

-- --------------------------------------------------------

--
-- Table structure for table `aboutus`
--

CREATE TABLE `aboutus` (
  `ID_about` int(255) NOT NULL,
  `Contact` varchar(20) NOT NULL,
  `Address` varchar(500) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Facebook` varchar(500) NOT NULL,
  `CompanyName` varchar(100) NOT NULL,
  `About` varchar(500) NOT NULL,
  `GoogleMap` varchar(10) NOT NULL,
  `test` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `aboutus`
--

INSERT INTO `aboutus` (`ID_about`, `Contact`, `Address`, `Email`, `Facebook`, `CompanyName`, `About`, `GoogleMap`, `test`) VALUES
(1, '123', 'sa bahay', 'watata@email', 'watata@facebook', 'doon sa', 'taga bukid', 'asdsad', 2),
(2, '456', 'malapit', 'tempura@email', 'tempura@facebook', 'malapit', 'daw siya', 'asdasd', 3);

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `ID` int(255) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(200) NOT NULL,
  `Type` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`ID`, `Username`, `Password`, `Type`) VALUES
(1, 'Admin', 'Admin', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `customerinquiry`
--

CREATE TABLE `customerinquiry` (
  `ID` int(255) NOT NULL,
  `Name` varchar(200) NOT NULL,
  `Contact` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `Date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customerinquiry`
--

INSERT INTO `customerinquiry` (`ID`, `Name`, `Contact`, `Email`, `Date`) VALUES
(1, 'Joenel Cardinal', '09079756825', 'joeneltgs@yahoo.com', '2017-03-31 11:54:10'),
(2, 'Jet Perseveranda', '43213216546', 'persejet@yahoo.com', '2017-03-31 12:49:26');

-- --------------------------------------------------------

--
-- Table structure for table `dogs`
--

CREATE TABLE `dogs` (
  `DogID` int(255) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Breed1` varchar(50) NOT NULL,
  `Breed2` varchar(50) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `Age` int(3) NOT NULL,
  `HandlerID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `handlerinfo`
--

CREATE TABLE `handlerinfo` (
  `HandlerID` int(255) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `UserName` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `EmailAddress` varchar(100) NOT NULL,
  `Birthdate` date NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `ContactNumber` bigint(11) NOT NULL,
  `Ccode` varchar(9) NOT NULL,
  `Address` varchar(300) NOT NULL,
  `SecretQuestion` varchar(500) NOT NULL,
  `SecretAnswer` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `handlerinfo`
--

INSERT INTO `handlerinfo` (`HandlerID`, `Name`, `LastName`, `UserName`, `Password`, `EmailAddress`, `Birthdate`, `Gender`, `ContactNumber`, `Ccode`, `Address`, `SecretQuestion`, `SecretAnswer`) VALUES
(1, 'Joenel', 'Cardinal', 'sirdewong', '055452631', 'joeneltgs@yahoo.com', '1993-07-28', 'Male', 9079756825, '+63', '67 Ilocos Norte St. Bago Bantay Quezon City', 'Father''s Middle name', 'Clarianes');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aboutus`
--
ALTER TABLE `aboutus`
  ADD PRIMARY KEY (`ID_about`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `customerinquiry`
--
ALTER TABLE `customerinquiry`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `dogs`
--
ALTER TABLE `dogs`
  ADD PRIMARY KEY (`DogID`);

--
-- Indexes for table `handlerinfo`
--
ALTER TABLE `handlerinfo`
  ADD PRIMARY KEY (`HandlerID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `aboutus`
--
ALTER TABLE `aboutus`
  MODIFY `ID_about` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `customerinquiry`
--
ALTER TABLE `customerinquiry`
  MODIFY `ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `dogs`
--
ALTER TABLE `dogs`
  MODIFY `DogID` int(255) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `handlerinfo`
--
ALTER TABLE `handlerinfo`
  MODIFY `HandlerID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
