/*
SQLyog Community
MySQL - 10.4.14-MariaDB : Database - dbmhs
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `datadosen` */

CREATE TABLE `datadosen` (
  `NIDN` int(10) NOT NULL,
  `NAMA_DOSEN` varchar(50) DEFAULT NULL,
  `PRODI` varchar(10) DEFAULT NULL,
  `JENIS_KELAMIN` varchar(20) DEFAULT NULL,
  `TGL_LAHIR` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`NIDN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `datadosen` */

insert  into `datadosen`(`NIDN`,`NAMA_DOSEN`,`PRODI`,`JENIS_KELAMIN`,`TGL_LAHIR`) values (23111,'Rosita Putri','TI','P','1988-10-25');
insert  into `datadosen`(`NIDN`,`NAMA_DOSEN`,`PRODI`,`JENIS_KELAMIN`,`TGL_LAHIR`) values (23112,'Bagus Surya','SK','L','1982-02-06');

/*Table structure for table `datamatkul` */

CREATE TABLE `datamatkul` (
  `KODE` varchar(10) NOT NULL,
  `NAMA_MATKUL` varchar(50) DEFAULT NULL,
  `JURUSAN` varchar(20) DEFAULT NULL,
  `PENGAMPU` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`KODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `datamatkul` */

insert  into `datamatkul`(`KODE`,`NAMA_MATKUL`,`JURUSAN`,`PENGAMPU`) values ('m12','Pajak','KAB','Rosita Putri');
insert  into `datamatkul`(`KODE`,`NAMA_MATKUL`,`JURUSAN`,`PENGAMPU`) values ('M13','Akuntansi Biaya','KAB','Mila Andriana');

/*Table structure for table `mahasiswa` */

CREATE TABLE `mahasiswa` (
  `NIM` int(8) NOT NULL,
  `NAMA` varchar(50) DEFAULT NULL,
  `JURUSAN` varchar(20) DEFAULT NULL,
  `JK` varchar(20) DEFAULT NULL,
  `TGLLAHIR` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`NIM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `mahasiswa` */

insert  into `mahasiswa`(`NIM`,`NAMA`,`JURUSAN`,`JK`,`TGLLAHIR`) values (20103019,'Gung Bintang ','KAB','P','2001-12-29');
insert  into `mahasiswa`(`NIM`,`NAMA`,`JURUSAN`,`JK`,`TGLLAHIR`) values (20104029,'GusYoga','DGM','L','2001-07-09');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
