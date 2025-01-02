-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 02 Jan 2025 pada 07.36
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubes_pbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `makanan`
--

CREATE TABLE `makanan` (
  `id_makanan` int(10) NOT NULL,
  `nama_makanan` varchar(100) NOT NULL,
  `deskripsi_makanan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `makanan`
--

INSERT INTO `makanan` (`id_makanan`, `nama_makanan`, `deskripsi_makanan`) VALUES
(1, 'Smoothie Pisang dan Alpukat', 'Mengandung kalori sehat dan lemak baik'),
(2, 'Salmon Panggang dengan Sayuran Kukus', 'Mengandung omega-3 dan lemak sehat.'),
(3, 'Sup Brokoli dan Bayam', 'Rendah kalori dan tinggi nutrisi.'),
(4, 'Ikan Kukus dengan Bumbu Rempah', 'Kaya protein dan rendah lemak.'),
(5, 'Tempe Panggang dengan Sambal Kacang', 'Sumber protein rendah lemak. Cocok untuk mengurangi berat badan.'),
(6, 'Ikan Tuna dengan Lemon dan Lada Hitam', 'Pilihan rendah lemak. Cocok untuk mengurangi berat badan.');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `makanan`
--
ALTER TABLE `makanan`
  ADD PRIMARY KEY (`id_makanan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
