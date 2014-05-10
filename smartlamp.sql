-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Inang: 127.0.0.1
-- Waktu pembuatan: 10 Mei 2014 pada 14.10
-- Versi Server: 5.6.11
-- Versi PHP: 5.5.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Basis data: `smartlamp`
--
CREATE DATABASE IF NOT EXISTS `smartlamp` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `smartlamp`;

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id_admin` varchar(6) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id_admin`, `nama`, `username`, `password`) VALUES
('a001', 'ocid', 'admin', 'admin'),
('a003', 'miqdad', 'arab', 'arab'),
('a004', 'puput', 'puput', 'puput');

-- --------------------------------------------------------

--
-- Struktur dari tabel `lampu`
--

CREATE TABLE IF NOT EXISTS `lampu` (
  `id_lampu` varchar(6) NOT NULL,
  `nama` varchar(33) NOT NULL,
  `description` varchar(200) NOT NULL,
  PRIMARY KEY (`id_lampu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `lampu`
--

INSERT INTO `lampu` (`id_lampu`, `nama`, `description`) VALUES
('addd', 'ddd', 'ddd'),
('adv', 'adv', 'avd'),
('coba', 'coba', 'coba'),
('coba2', 'coba2', 'coba2'),
('iuiu', 'iuiu', 'iuiui'),
('kjnkjn', 'kjnkj', 'kjnkjnkj'),
('l001', 'General', 'lampu umum'),
('l002', 'Meeting Lamp', 'lampu yang didesain khusus untuk keperluan meeting'),
('l003', 'exLamp', 'lampu khusus untuk keperluan terlaranga'),
('pokpok', 'pokpok', 'pokpok'),
('sddssd', 'sddssd', 'sdsdsd'),
('testte', 'test', 'test'),
('zcv', 'zxcv', 'dfddf');

-- --------------------------------------------------------

--
-- Struktur dari tabel `mengatur`
--

CREATE TABLE IF NOT EXISTS `mengatur` (
  `id_mode_lampu` varchar(6) NOT NULL,
  `id_lampu` varchar(6) NOT NULL,
  `Time` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `mengatur`
--

INSERT INTO `mengatur` (`id_mode_lampu`, `id_lampu`, `Time`) VALUES
('lm001', 'l001', 7),
('lm001', 'l002', 10);

-- --------------------------------------------------------

--
-- Struktur dari tabel `mode_lampu`
--

CREATE TABLE IF NOT EXISTS `mode_lampu` (
  `id_mode_lampu` varchar(6) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `description` varchar(30) NOT NULL,
  PRIMARY KEY (`id_mode_lampu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `mode_lampu`
--

INSERT INTO `mode_lampu` (`id_mode_lampu`, `nama`, `description`) VALUES
('fdfd', 'dfdf', 'sdfsadfd'),
('lm001', 'Default', 'mode default'),
('sdsd', 'sdssd', 'saas');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ruangan`
--

CREATE TABLE IF NOT EXISTS `ruangan` (
  `id_ruangan` varchar(6) NOT NULL DEFAULT '',
  `nama` varchar(30) NOT NULL,
  `description` varchar(30) NOT NULL,
  `id_mode_lampu` varchar(6) NOT NULL,
  PRIMARY KEY (`id_ruangan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `ruangan`
--

INSERT INTO `ruangan` (`id_ruangan`, `nama`, `description`, `id_mode_lampu`) VALUES
('r001', 'Meeting room 001', 'ruangan meeting 1', 'lm001');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
