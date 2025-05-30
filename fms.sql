-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 30, 2025 at 02:53 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fms`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_logs`
--

CREATE TABLE `tbl_logs` (
  `lid` int(11) NOT NULL,
  `action` varchar(200) NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `u_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_logs`
--

INSERT INTO `tbl_logs` (`lid`, `action`, `date`, `u_id`) VALUES
(9, 'User with ID 24 logged in', '2025-05-30 11:42:31', 24),
(10, 'User with ID 24 logged out', '2025-05-30 11:42:33', 24),
(11, 'User with ID 24 logged in', '2025-05-30 11:42:54', 24),
(12, 'User with ID 24 logged out', '2025-05-30 11:43:06', 24),
(13, 'User with ID 24 logged in', '2025-05-30 11:50:32', 24),
(14, 'User with ID 24 logged out', '2025-05-30 12:02:58', 24),
(15, 'User with ID 24 logged in', '2025-05-30 12:03:23', 24),
(16, 'User with ID 24 logged in', '2025-05-30 12:11:51', 24);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_orders`
--

CREATE TABLE `tbl_orders` (
  `u_fid` int(11) NOT NULL,
  `burger_qty` int(10) NOT NULL,
  `fries_qty` int(10) NOT NULL,
  `burgersteak_qty` int(10) NOT NULL,
  `chicken_qty` int(10) NOT NULL,
  `hotdog_qty` int(10) NOT NULL,
  `taco_qty` int(10) NOT NULL,
  `pizza_qty` int(10) NOT NULL,
  `icecream_qty` int(10) NOT NULL,
  `coke_qty` int(10) NOT NULL,
  `sprite_qty` int(10) NOT NULL,
  `icedtea_qty` int(10) NOT NULL,
  `smoothie_qty` int(10) NOT NULL,
  `icedcoffee_qty` int(10) NOT NULL,
  `water_qty` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_orders`
--

INSERT INTO `tbl_orders` (`u_fid`, `burger_qty`, `fries_qty`, `burgersteak_qty`, `chicken_qty`, `hotdog_qty`, `taco_qty`, `pizza_qty`, `icecream_qty`, `coke_qty`, `sprite_qty`, `icedtea_qty`, `smoothie_qty`, `icedcoffee_qty`, `water_qty`) VALUES
(1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(5, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0),
(6, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
(7, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0),
(10, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0),
(11, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0),
(12, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_receipt`
--

CREATE TABLE `tbl_receipt` (
  `order_id` int(11) NOT NULL,
  `total_amount` double NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `u_fid` int(11) NOT NULL,
  `u_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_receipt`
--

INSERT INTO `tbl_receipt` (`order_id`, `total_amount`, `date`, `u_fid`, `u_id`) VALUES
(2, 50, '2025-05-21 16:27:32', 6, 0),
(3, 90, '2025-05-22 08:00:00', 7, 0),
(4, 70, '2025-05-22 08:27:49', 10, -2),
(5, 50, '2025-05-22 08:28:25', 11, -2),
(6, 50, '2025-05-22 08:34:57', 12, 24);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_occ` varchar(50) NOT NULL,
  `u_cn` varchar(50) NOT NULL,
  `u_em` varchar(50) NOT NULL,
  `u_user` varchar(50) NOT NULL,
  `u_pass` varchar(150) NOT NULL,
  `u_status` varchar(20) NOT NULL,
  `u_image` varchar(50) NOT NULL,
  `security_question` varchar(200) NOT NULL,
  `security_answer` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `u_occ`, `u_cn`, `u_em`, `u_user`, `u_pass`, `u_status`, `u_image`, `security_question`, `security_answer`) VALUES
(24, 'daniel', 'paparon', 'Cashier', '01236987414', 'dandan@yahoo.com', 'dandan', 'OX90AzBCZMQiAImO6Gn8KrCbnlhMSdTzsDnvSmaSIco=', 'Active', 'Null', 'What\'s the name of your first pet?', 'brownie');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD PRIMARY KEY (`lid`),
  ADD KEY `u_id` (`u_id`);

--
-- Indexes for table `tbl_orders`
--
ALTER TABLE `tbl_orders`
  ADD PRIMARY KEY (`u_fid`);

--
-- Indexes for table `tbl_receipt`
--
ALTER TABLE `tbl_receipt`
  ADD PRIMARY KEY (`order_id`),
  ADD KEY `u_fid` (`u_fid`),
  ADD KEY `u_id` (`u_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `lid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `tbl_orders`
--
ALTER TABLE `tbl_orders`
  MODIFY `u_fid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `tbl_receipt`
--
ALTER TABLE `tbl_receipt`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD CONSTRAINT `tbl_logs_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `tbl_user` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
