-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 22, 2025 at 08:13 PM
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
-- Database: `foodms`
--

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
  `u_image` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `u_occ`, `u_cn`, `u_em`, `u_user`, `u_pass`, `u_status`, `u_image`) VALUES
(5, 'dan', 'aws', 'Manager', '02345789654', 'dan@scc.com', 'daniel12', 'u1JPVA/SmxnFwFqDAIegkM0DiVHSAyUBpYUWHjdi/IY=', 'Active', ''),
(6, 'isabel', 'largo', 'Cashier', '01245698751', 'isabel08@scc.com', 'sabbingg', 'u1JPVA/SmxnFwFqDAIegkM0DiVHSAyUBpYUWHjdi/IY=', 'Active', ''),
(11, 'Daniel', 'Paparon', 'Manager', '09124425675', 'dasdaw@yahoo.com', 'awdawd', 'u1JPVA/SmxnFwFqDAIegkM0DiVHSAyUBpYUWHjdi/IY=', 'Pending', ''),
(12, 'Daniel', 'Paparon', 'Manager', '01245698721', 'dan@yahoo.com', 'daniel', 'u1JPVA/SmxnFwFqDAIegkM0DiVHSAyUBpYUWHjdi/IY=', 'Active', ''),
(13, 'Isabel', 'Largo', 'Manager', '09654123457', 'sabbingg@yahoo.com', 'nhojia08', 'u1JPVA/SmxnFwFqDAIegkM0DiVHSAyUBpYUWHjdi/IY=', 'Active', ''),
(14, 'rhexzel', 'delima', 'Cashier', '01254698741', 'rhexzel@scc.com', 'delima', 'u1JPVA/SmxnFwFqDAIegkM0DiVHSAyUBpYUWHjdi/IY=', 'Active', ''),
(15, 'hahdsad', 'awdwd', 'Manager', '12345678914', 'asw@scc.com', 'daniel123', 'MdqJXf9VR1yPJMxQTqmyzuzrTa+ERrEqLBE5MNguv2w=', 'Active', ''),
(19, 'delima', 'delima', 'Cashier', '12345678954', 'delima@scc.com', 'delima123', 'u1JPVA/SmxnFwFqDAIegkM0DiVHSAyUBpYUWHjdi/IY=', 'Pending', ''),
(20, 'anton', 'alforque', 'Cashier', '01236547895', 'anton@scc.com', 'anton123', 'yx+bYoBmKSkN+xJwlgt9l1anASwwH1IabCOk27ozkQQ=', 'Active', ''),
(21, 'daniel', 'john', 'Cashier', '02314569874', 'dandandan@gmail.com', 'dan', 'vux2J5X2kAOZI63XHbhEH9zwWhJCv1a4+28yGVYEsco=', 'Active', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
