-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 23, 2024 at 03:29 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `bikes`
--

CREATE TABLE `bikes` (
  `id` int(11) NOT NULL,
  `brandid` int(11) NOT NULL,
  `model` varchar(100) NOT NULL,
  `fuel` varchar(50) NOT NULL,
  `color` varchar(50) NOT NULL,
  `price` int(11) NOT NULL,
  `dual_abs` varchar(20) NOT NULL,
  `aerodynamics` varchar(20) NOT NULL,
  `modern_chassis` varchar(20) NOT NULL,
  `led_lights` varchar(20) NOT NULL,
  `liquid_cooling` varchar(20) NOT NULL,
  `alloy_wheels` varchar(20) NOT NULL,
  `digital_console` varchar(20) NOT NULL,
  `performance_tyres` varchar(20) NOT NULL,
  `img` varchar(1000) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bikes`
--

INSERT INTO `bikes` (`id`, `brandid`, `model`, `fuel`, `color`, `price`, `dual_abs`, `aerodynamics`, `modern_chassis`, `led_lights`, `liquid_cooling`, `alloy_wheels`, `digital_console`, `performance_tyres`, `img`) VALUES
(4, 2, 'ZX10R', 'Petrol', 'Green', 1900000, 'yes', 'no', 'yes', 'yes', 'no', 'no', 'yes', 'yes', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\zx10r.jpeg'),
(3, 2, 'H2R', 'Petrol', 'Black', 7990000, 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\h2r.jpeg'),
(1, 1, 'S1000RR', 'Petrol', 'White', 2075000, 'yes', 'no', 'yes', 'yes', 'no', 'no', 'yes', 'yes', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\s1000.jpeg'),
(2, 1, 'M1000RR', 'Petrol', 'Yellow', 4900000, 'no', 'no', 'no', 'no', 'no', 'no', 'no', 'no', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\m1000.jpeg'),
(5, 3, 'HAYABUSA', 'Petrol', 'Red', 1770000, 'yes', 'no', 'no', 'yes', 'yes', 'no', 'yes', 'yes', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\hayabusa.jpeg'),
(6, 3, 'GIXXER', 'Petrol', 'Blue', 146000, 'no', 'no', 'yes', 'yes', 'no', 'no', 'yes', 'yes', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\gixxer.png'),
(7, 4, 'RC 390', 'Petrol', 'Orange', 321000, 'yes', 'no', 'no', 'yes', 'no', 'no', 'yes', 'no', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\ktm.jpeg'),
(8, 4, 'DUKE 390', 'Petrol', 'Orange', 300000, 'yes', 'yes', 'no', 'yes', 'no', 'no', 'yes', 'yes', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\duke390.jpg'),
(9, 5, 'APACHE RR310', 'Petrol', 'Red', 288000, 'yes', 'no', 'yes', 'yes', 'no', 'yes', 'yes', 'no', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\rr310.jpeg'),
(10, 5, 'RAIDER 125', 'Petrol', 'Yellow', 108000, 'yes', 'yes', 'no', 'yes', 'no', 'no', 'no', 'yes', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\raider.jpeg');

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `id` int(5) NOT NULL,
  `name` varchar(150) NOT NULL,
  `logo` varchar(1000) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`id`, `name`, `logo`) VALUES
(5, 'TVS', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\tvs.png'),
(4, 'KTM', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\ktm.jpeg'),
(1, 'BMW', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\bmw.png'),
(2, 'NINJA', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\ninja.jpeg'),
(3, 'SUZUKI', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\suzuki.png');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(10) NOT NULL,
  `name` varchar(250) NOT NULL,
  `birthdate` date NOT NULL,
  `phone` varchar(10) NOT NULL,
  `email` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `name`, `birthdate`, `phone`, `email`, `address`) VALUES
(5, 'Michael Brown', '1978-09-30', '3334445555', 'michael.brown@example.com', '202 Birch St.'),
(4, 'Emily Davis', '1995-05-19', '2223334444', 'emily.davis@example.com', '101 Cedar St.'),
(3, 'Sam Wilson', '1982-07-11', '1112223333', 'sam.wilson@example.com', '789 Pine St.'),
(2, 'Jane Smith', '1990-03-22', '0987654321', 'jane.smith@example.com', '456 Oak St.'),
(1, 'John Doe', '1985-01-15', '1234567890', 'john.doe@example.com', '123 Maple St.'),
(6, 'Linda Taylor', '1988-11-12', '4445556666', 'linda.taylor@example.com', '303 Elm St.'),
(7, 'David Miller', '1980-02-06', '5556667777', 'david.miller@example.com', '404 Spruce St.'),
(8, 'Sarah Moore', '1993-04-25', '6667778888', 'sarah.moore@example.com', '505 Walnut St.'),
(9, 'James Johnson', '1975-08-09', '7778889999', 'james.johnson@example.com', '606 Chestnut St.'),
(10, 'Patricia Williams', '1983-12-03', '8889990000', 'patricia.williams@example.com', '707 Ash St.');

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE `location` (
  `id` int(10) NOT NULL,
  `city` varchar(30) NOT NULL,
  `address` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `location`
--

INSERT INTO `location` (`id`, `city`, `address`) VALUES
(1, 'New York', '123 Broadway Ave'),
(2, 'New York', '456 Madison Ave'),
(3, 'Los Angeles', '789 Hollywood Blvd'),
(4, 'Los Angeles', '1010 Sunset Blvd'),
(5, 'Chicago', '111 Michigan Ave'),
(6, 'Chicago', '222 Wacker Dr'),
(7, 'Houston', '333 Main St'),
(8, 'Houston', '444 Texas St'),
(9, 'Phoenix', '555 Central Ave'),
(10, 'Phoenix', '666 Camelback Rd');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `id` int(11) NOT NULL,
  `bike_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `pickup_city` varchar(100) NOT NULL,
  `pickup_address` text NOT NULL,
  `pickup_date` varchar(50) NOT NULL,
  `pickup_time` varchar(40) NOT NULL,
  `drop_city` varchar(100) NOT NULL,
  `drop_address` text NOT NULL,
  `drop_date` varchar(50) NOT NULL,
  `drop_time` varchar(40) NOT NULL,
  `total_price` int(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`id`, `bike_id`, `customer_id`, `pickup_city`, `pickup_address`, `pickup_date`, `pickup_time`, `drop_city`, `drop_address`, `drop_date`, `drop_time`, `total_price`) VALUES
(10, 3, 5, 'Chicago', '222 Wacker Dr', '2024-09-02', '02:10', 'New York', '123 Broadway Ave', '2024-09-19', '02:10', 7990000),
(11, 2, 7, 'New York', '123 Broadway Ave', '2024-09-18', '01:11', 'New York', '123 Broadway Ave', '2024-09-25', '01:11', 4900000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(10) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(1000) NOT NULL,
  `usertype` varchar(30) NOT NULL,
  `image` varchar(2000) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `email` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `fullname`, `username`, `password`, `usertype`, `image`, `phone`, `email`) VALUES
(3, 'Satish', 'satish', 'satish@123', 'User', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\icons8-admin-48.png', '8154954005', 'satish123@gmail.com'),
(2, 'Yash', 'yash', 'yash@123', 'User', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\user.png', '9824538349', 'yash187@gmail.com'),
(1, 'Admin', 'admin', 'admin', 'Admin', 'D:\\project\\bike management system\\src\\bike\\management\\system\\images\\icons8-admin-48.png', '7984613996', 'admin123@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bikes`
--
ALTER TABLE `bikes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
